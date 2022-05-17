package day15;

public class Ex17_Exception12_Test3 {

	public static void main(String[] args) {
		// 예제) 중복되지 않은 1~9 사이의 세 정수를 랜덤으로 생성하여 배열에 저장하고 출력하는 코드 작성
		//단, 중복되지 않은 1~9 사이의 세 정수를 랜덤으로생성하여 배열에 저장하는 메소드 활용
		//예외 처리
		int arr[];
		int min = 1, max = 9;
		int n = 3;
		try {
			arr = createRandomArray(min, max, n);
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
		} catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	//기능1) 배열 arr에 n의 요소 중에서 num이 일치하는지..
	public static boolean contains(int arr[], int n, int num) throws Exception{
		//예외 처리1)
		if(arr == null) {
			throw new Exception("배열이 비어있습니다");
		}
		//예외 처리2)
		if(arr.length < n) {
			n = arr.length;
		}
		for(int i = 0; i < n; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		
		return false;
	}
	
	//기능2) 중복되지 않으면 랜덤한 수를 배열에 저장
	public static int[] createRandomArray(int min, int max, int n) throws Exception {
		//예외 처리1)
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		
		//예외 처리2)
		if(max - min + 1 < n) {
			throw new Exception(min + "과 " + max + "사이에서 " + n + "개의 중복되지 않은 배열을 만들 수 없습니다");
		}
		//예외 처리3)
		if(n <= 0) {
			throw new Exception(n + "개의 배열은 만들 수 없습니다");
		}
		int arr[] = new int[n];
		int count = 0;
		
		while(count < n) {
			//랜덤한 수 생성
			int r = (int)(Math.random() + (max + min - 1) + min);
			
			//중복체크하고..
			if(!contains(arr, count, r)) {
				//중복되지 않으면 배열에 저장
				arr[count++] = r;	
			}
		}
		//배열 돌려줌	
		return arr;
	}
	
}
