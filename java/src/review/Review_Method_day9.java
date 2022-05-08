package review;

import java.util.Scanner;

public class Review_Method_day9 {

	public static void main(String[] args) {
		

	}
	/*예제1) 
	* 기능: 정수형 배열에 처음부터 n개 중에서 정수 num이 있는지 없는지
	* 매개변수: 정수형 배열, n개, 정수 num -> int arr[], int n, int num
	* 리턴타입: 있는지 없는지 -> boolean
	* 메소드명: contains
	*/
	public static boolean contains(int arr[], int n, int num) {
		//배열이 null이거나 n이 0보다 작을 때 예외 처리
		if(arr == null || n < 0) {
			return false;
		}
		//배열의 길이가 n보다 작을 때 예외 처리
		if(arr.length < n) {
			n = arr.length;
		}
		//배열에서 num과 비교
		for(int i = 0; i < n; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	/* 예제2)
	 * 기능: 정수형 배열이 주어졌을 때, 주어진 배열의 값을 콘솔에 출력
	 * 매개변수: 정수형 배열 -> int arr[]
	 * 리턴타입:  출력 -> void
	 * 메소드명: printArray
	 */
	public static void printArray(int arr[]) {
		//배열이 null일 때 예외 처리
		if(arr == null || arr.length == 0) {
			return; 
		}
		//배열 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	
	 /* 예제3)
	  * 기능 : 정수형 배열 2개가 주어지면 스트라이크 갯수(같은 자리에서 일차하는 숫자의 갯수)를 알려주는 메소드
	  * 매개변수 : 랜덤한 정수형 배열과 사용자가 입력한 정수형 배열 -> int arr1[], int arr2[]
	  * 리턴타입 : 스트라이크 갯수 ->  정수 -> int
	  * 메소드명 : getStrike
	  */
	public static int getStrike(int arr1[], int arr2[]) {
		//예외 처리
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		//업그레이드 -> 혹시 배열의 크기가 다른 경우
		int count = arr1.length > arr2.length ? arr2.length : arr1.length;
		//같은 자리에서 일치하는 숫자의 갯수
		int strike = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == arr2[i]) {
				strike++;
			}
		}
		return strike;
	}
	
	 /* 예제4)
	  * 기능 : 정수형 배열 2개가 주어지면 볼 갯수(다른 자리에서 일차하는 숫자의 갯수)를 알려주는 메소드
	  * 매개변수 : 랜덤한 정수형 배열과 사용자가 입력한 정수형 배열 -> int arr1[], int arr2[]
	  * 리턴타입 : 볼 갯수 ->  정수 -> int
	  * 메소드명 : getBall
	  */
	public static int getBall(int arr1[], int arr2[]) {
		//예외 처리
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		//다른 자리에서 일차하는 숫자의 갯수
		int all = 0;
		for(int tmp: arr1) {
			if(contains(arr2, arr2.length,tmp)) {
				all++;
			}
		}
		//볼 개수 = 전체 - 스트라이크
		return all - getStrike(arr1, arr2);
	}
	
	/* 예제5)
	 * 기능: 주어진 Scanner를 이용하여 콘솔에서 정수를 n개 입력받아 배열로 반환하는 메소드 
	 * 매개변수: Scanner, 입력받을 정수 n개 -> Scanner scan, int n
	 * 리턴타입: 정수 배열 -> int[] //리턴타입이 정수 배열도 가능!
	 * 메소드명: inputCreatArray
	 */
	public static int[] inputCreateArray(Scanner scan, int n) {
		//예외 처리
		if(n < 0) {
			return null;
		}
		//입력한 정수를 배열에 저장
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt(); 
		}
		return arr;
	}
	
	/* 예제6)
	 * 기능: min에서 max 사이의 중복되지 않는 n개의 정수를 만들어서 배열로 반환하는 메소드
	 * 매개변수: 최소값, 최대값, 개수 -> int min, int max, int n 
	 * 리턴타입: 중복되지 앟는 수를 저장한 배열 -> int[]
	 * 메소드명: createRandomArray
	*/
	public static int[] createRandomArray(int min, int max, int n) {
		//예외 처리
		if(n < 0) {
			return null;
		}
		//중복되지 않으면 배열에 r 저장
		int arr[] = new int[n];
		for(int count = 0; count < n; ) {
			int r = (int)(Math.random() * (max-min+1) + min);
			if(!contains(arr,count, r)) {
				arr[count] = r;
				count++;
			}
		}
		return arr;
	}
	
	
}
