package day8;

public class Ex7_Method5_Overloading {

	public static void main(String[] args) {
		//<메소드 오버로딩>
		//동일한 기능인데 매개변수만 다른 경우 편리하게 이용 가능
		System.out.println(sum(1, 2));
		//메소드 오버로딩으로 실수값 계산
		System.out.println(sum(1.2, 2.3));
		//float는 double로 자동 타입 변환됨
		System.out.println(sum(1.2f, 2.3));
		//실수 + 정수는 없지만 계산 가능
		System.out.println(sum(1.2, 3));
	}
	/* 매개변수가 달라야함 -> 타입이 하나라도 다르거나 갯수가 다름
	 * int sum(int num1, int num2){}
	 * double sum(int num1, int num2){} //불가능 -> 타입이 달라야함
	 * int sum(int num2, int num3){} //불가능 -> 타입이 같음
	 * int sum(int num2, int num3, int num4){} //가능 -> 갯수가 다름
	 */
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	//메소드 오버로딩
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
}
