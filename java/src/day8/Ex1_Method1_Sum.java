package day8;

public class Ex1_Method1_Sum {

	public static void main(String[] args) {
		// <메소드>
		//예제) 두 정수의 합을 알려주는 메소드 작성
		
		//메소드 사용하기
		//합을 계산하는 메소드 sum1	
		int num1 =  1, num2 = 2; //지역 변수 -> int num1, num2; 가능함
		int res = sum1(num1, num2); //3
		System.out.println(res); //3 -> 예) 연습장에 풀고 칠판에 옮겨쓰기
		System.out.println(sum1(1,2)); //3 ->암산으로 칠판에 쓰기
		
		//합을 같이 출력하는 메소드 sum2
		sum2(1,2);
		
		//1 + 2 = 3
		int res1 = sum1(1,2);
		int res2 = sum1(res1, 3);
		System.out.println(res2); //6
		sum2(1+2, 3); //6
		
	}
	/* 메소드 만들기1 -> 이 방법이 좋은 메소드 -> 재사용성이 높은 메소드
	 * 기능: 두 정수가 주어지면 두 정수의 합을 알려주는 메소드
	 * 매개변수: 두 정수 -> int num1, int num2 //각 변수명 앞에 타입을 따로 써야함
	 * 리턴타입: 두 정수의 합 -> 정수 -> int
	 * 메소드명: sum
	 */
	public static int sum1(int num1, int num2) {
		int res = num1 + num2;
		return res; //res 값을 돌려줌
	}
	/* 메소드 만들기2
	 * 기능: 두 정수가 주어지면 두 정수의 합을 콘솔에 출력 메소드
	 * 매개변수: 두 정수 -> int num1, int num2 
	 * 리턴타입: 없음 -> void -> return 안씀
	 * 메소드명: sum2 
	 */
	public static void sum2(int num1, int num2) {
		int res = num1 + num2; //합 기능
		System.out.println(res); //출력 기능
	}
}	
