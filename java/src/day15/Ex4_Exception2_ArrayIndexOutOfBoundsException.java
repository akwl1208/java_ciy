package day15;

public class Ex4_Exception2_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// <ArrayIndexOutOfBoundsException>
		int arr[] = {1,2,3,4,5};
		
		//흔한 실수1: 0~(크기-1)번지까지 해야야는데 실수로 0~크기 번지까지 하는 경우
		for(int i = 0; i <= arr.length;i++) {
			//System.out.println(arr[i]); //예외 발생
		} 
		
		//흔한 실수2: 변수를 이용하여 배열을 제어하는 경우 
		//변수의 값이 배열의 크기를 넒지 않도록 해야하는데 배열의 크기를 넘는 경우
		int num = 10;
		for(int i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}

	}

}
