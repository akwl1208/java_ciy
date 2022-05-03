package day7;

public class Ex3_Array3_Sort {

	public static void main(String[] args) {
		// 에제) 버블정렬을 이용한 배열 정렬
		int arr[] = {10 , 15 , 5 , 18 , 20 , 1};
		
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			//i가 0일 때 j는 4까지, i가 1일 때 j는 3까지... -> arr.length - 1 - i
			for(int j = 0 ; j < arr.length - 1 - i ; j++) {
				//앞 숫자가 크면 두 수 교환 -> 코드 기억하기
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		//정렬됬는지 출력하여 확인
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
