package review;

public class Review_Method_Day8 {

	public static void main(String[] args) {
		//예제1) 두 정수의 합을 알려주는 메소드 작성
		int num1 = 10, num2 = 15;
		System.out.println("예제1 : " + sum(num1, num2)); //25
		
		System.out.println("--------------------------------"); //구분선
		
		//예제2) 두 정수와 산술연산자가 주어지면 계산하는 메소드 작성
		char op = '+';
		System.out.println("예제2 : " + calculator(num1, op, num2)); //25.0
		
		System.out.println("--------------------------------"); //구분선
		
		//예제3) 두 정수의 최대공약수를 계산하는 메소드 작성
		System.out.println("예제3 : " + gcd(num1, num2)); //5
		
		System.out.println("--------------------------------"); //구분선
		
		//예제4) 두 정수의 최소공배수를 계산하는 메소드 작성
		System.out.println("예제4 : " + lcm(num1, num2)); //30
		
		System.out.println("--------------------------------"); //구분선
		
		//예제5) 정수형 배열이 주어졌을 때, 주어진 배열의 값을 콘솔에 출력하는 메소드
		int arr[] = {1,4,7,9,13,15,66};
		System.out.print("예제5 : ");
		printArray(arr);
		
		System.out.println();
		System.out.println("--------------------------------"); //구분선
		
		//에제6) 정수형 배열에 정수 num이 있는지 없는지 알려주는 메소드
		int num = 15;
		System.out.println("예제6 : " + contains(arr, num));
		
		System.out.println("--------------------------------"); //구분선
		
		//예제7)
		int n = 5;
		System.out.println("예제7 : " + contains(arr, n, num));
		
	}
	/*예제1)
	 *기능: 두 정수가 주어지면 두 정수의 합을 알려주는 메소드
	 * 매개변수: 두 정수 -> int num1, int num2 //각 변수명 앞에 타입을 따로 써야함
	 * 리턴타입: 두 정수의 합 -> 정수 -> int
	 * 메소드명: sum
	 */
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	/* 예제2)
	 * 기능: 두 정수와 산술연산자가 주어지면 산술연산 결과를 알려주는 메소드
	 * 매개변수: 두 정수, 산술연산자 -> int num1, char op, int num2 
	 * 리턴타입: 산술연산 결과 -> 나누기때문에 -> 실수 -> double
	 * 메소드명: calculator
	 */
	public static double calculator(int num1, char op, int num2) {
		double res = 0;
		switch(op) {
		case '+' : res = num1 + num2 ; break;
		case '-' : res = num1 - num2 ; break;
		case '*' : res = num1 * num2 ; break;
		case '/' : res = num1 / (double)num2 ; break;
		case '%' : res = num1 % num2 ; break;
		}
		return res;
	}
	
	/* 예제3)
	 * 기능: 두 정수가 주어지면 두 정수의 최대공약수를 알려주는 메소드
	 * 매개변수: 두 정수 -> int num1, int num2 
	 * 리턴타입: 최대공약수 -> int
	 * 메소드명: gcd
	 */
	public static int gcd(int num1, int num2) {
		int gcd = 1;
		for(int i = 1; i<=num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	/* 예제4)
	 * 기능: 두 정수가 주어지면 두 정수의 최소공배수를 알려주는 메소드
	 * 매개변수: 두 정수 -> int num1, int num2
	 * 리턴타입: 최소공배수 -> 정수 -> int
	 * 메소드명: lcm
	 */
	public static int lcm(int num1, int num2) {
		int lcm = 1;
		for(int i = 1; i <= num1*num2; i++) {
			if(i%num1 == 0 && i%num2 == 0) {
				lcm = i;
				break;
			}
		}
		return lcm;
	}
	
	/* 예제5)
	 * 기능 : 정수형 배열이 주어졌을 때, 주어진 배열의 값을 콘솔에 출력하는 메소드
	 * 매개변수 : 정수형 배열 -> int num[]
	 * 리턴타입 : 출력 -> void
	 * 메소드명 : printArray
	 */
	 public static void printArray(int num[]) {
		if(num == null || num.length == 0) {
			System.out.println("출력할 배열이 없습니다");
			return;
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	 }
	 
	/* 예제6)
	 * 기능 : 정수형 배열에 정수 num이 있는지 없는지 알려주는 메소드
	 * 매개변수 : 정수형 배열과 정수 num -> int arr[], int num
	 * 리턴타입 : 있는지 없는지 -> 참/거짓 -> boolean
	 * 메소드명 : contains
	 */
	 public static boolean contains(int arr[], int num) {
		if(arr == null || arr.length == 0) {
			System.out.println("출력할 배열이 없습니다");
			return false;
		} 
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(num == arr[i]) {
				count++;
			}
		}
		
		if(count == 1) {
			return true;
		}else {
			return false;
		}
	 }
	 
	/*예제3)
	 * 기능 : 정수형 배열에 처음부터 n개 중에서 정수 num이 있는지 없는지
	 * 매개변수 : 정수형 배열과 정수 num , n개 -> int arr[], int num, int n
	 * 리턴타입 : 있는지 없는지 -> 참/거짓 -> boolean
	 * 메소드명 : contains
	 */
	 public static boolean contains(int arr[], int n, int num) {
		if(arr == null || arr.length == 0 || n <= 0) {
			 return false;
		 }
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
