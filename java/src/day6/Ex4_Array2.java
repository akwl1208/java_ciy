package day6;

public class Ex4_Array2 {

	public static void main(String[] args) {
		//예제) 배열
		int [] arr = new int[5];
		//arr 0번지에 1을 저장
		arr[0] = 1;
		//System.out.println(arr[0]); //1
		
		arr[1] =2;
		//System.out.println(arr[1]); //2
		
		/*5개까지 배열을 5번지까지 접근 불가 -> 0~4번지까지 있음 -> 범위 실수 주의
		arr[5] = 6;
		System.out.println(arr[5]); //오류(예외): 배열의 범위가 넘어감 
		 */
		
		//반복문 없이 출력 -> 반복문 사용 가능
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]); //초기값없으면 0으로 초기값
		System.out.println(arr[3]);
		System.out.println(arr[4]);		
		System.out.println("-----------------------------"); //구분선
		
		//반복문 사용 불가능
		//System.out.println(num1); //변수명
		
		//반복문 사용
		for(int i = 0 ; i<=4 ; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------"); //구분선
		//조건식에 5를 쓰는게 배열의 크기를 표현할 수 있어서 좋음
		for(int i = 0 ; i<5 ; i++) {
			System.out.println(arr[i]);
		}
		
		//조건식에 arr.length 사용
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}

}
