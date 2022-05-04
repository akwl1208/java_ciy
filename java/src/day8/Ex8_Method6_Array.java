package day8;

public class Ex8_Method6_Array {

	public static void main(String[] args) {
		//예제1)test
		int arr1[] = {1,2,3,4,89,1};
		printArray(arr1);
		int arr2[] = null;
		printArray(arr2);
		int arr3[] = new int[0];
		printArray(arr3);
		
		System.out.println("---------------------------");//구분선
		
		//예제2)test
		int num1 = 3;
		System.out.println(contains(arr1, num1)); //true
		int num2 = 5;
		System.out.println(contains(arr1, num2)); //false 
		System.out.println("---------------------------");//구분선
		
		//예제3)test
		int num3 = 89;
		int n1 = 4, n2 = 5 ;
		System.out.println(contains(arr1, num3, n1));
		System.out.println(contains(arr1, num3, n2));
	}

	/* 예제1)
	 * 기능 : 정수형 배열이 주어졌을 때, 주어진 배열의 값을 콘솔에 출력하는 메소드
	 * 매개변수 : 정수형 배열 -> int num[]
	 * 리턴타입 : 출력 -> void
	 * 메소드명 : printArray
	 */
	public static void printArray(int num[]) {
		//<내가 푼거>
		/*
		//정수형 배열이 주어졌을 때
		int arr[] = null;
		//주어진 배열의 값을 콘솔에 출력
		System.out.println(arr);
		*/
		
		//<선생님 풀이>
		//예외 처리
		if(num == null || num.length == 0) {
			System.out.println("출력할 배열이 없습니다");
			return;
		}
		for(int i = 0 ; i< num.length ; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	
	/* 예제2)
	 * 기능 : 정수형 배열에 정수 num이 있는지 없는지 알려주는 메소드
	 * 매개변수 : 정수형 배열과 정수 num -> int arr[], int num
	 * 리턴타입 : 있는지 없는지 -> 참/거짓 -> boolean
	 * 메소드명 : contains
	 */
	//<내가 푼거> 있는지 없는지 알려주는걸 모르겠음
	public static boolean contains (int arr[], int num) {
		/*
		//<시도1> 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				boolean istrue = true;
			}
		}
		//<시도2>
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				count++;
			}
		}
		*/
		
		//<선생님 풀이1>
		/*
		if(arr == null || arr.length == 0) {
			return false;
		}
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				count++;
			}
		}
		if(count == 0) {
			return false;
		}else {
			return true;
		}
		*/
		
		//<선생님 풀이2>좀더 간단한 코드-> 향상된 for문 이용
		if(arr == null || arr.length == 0) {
			return false;
		}
		for(int tmp : arr ) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	
	
	/*예제3)
	 * 기능 : 정수형 배열에 처음부터 n개 중에서 정수 num이 있는지 없는지
	 * 매개변수 : 정수형 배열과 정수 num , n개 -> int arr[], int num, int n
	 * 리턴타입 : 있는지 없는지 -> 참/거짓 -> boolean
	 * 메소드명 : contains
	 */

	 public static boolean contains(int arr[], int num, int n) {
		//배열이 잘못되거나 비교 개수가 잘못되서 비교할 필요가 없는 경우	
		if(arr == null || arr.length == 0 || n <= 0) {
			return false;
		}
		//<내가 푼거>
		/*
		int count = 0;
		for(int i = 0; i < n ; i++) {
			if(arr[i] == num) {
				count++;
			}
		}
		if(count == 0) {
			return false;
		}else {
			return true;
		}
		*/
		
		//<선생님 풀이>
		//자리수가 넘어가면 오류 발생 방지
		if(arr.length < n) {
			n = arr.length;
		}
		for(int i = 0; i < n ; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	 }
	 
}