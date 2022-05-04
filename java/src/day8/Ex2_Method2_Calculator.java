package day8;

public class Ex2_Method2_Calculator {

	public static void main(String[] args) {
		// 예제) 두 정수와 산술연산자가 주어지면 calculator를 이용하여 계산하고 출력
		int a = 1, b = 2; //매개변수와 변수명이 같을 필요없음
		char op = '/';
		double res =calculator(a, op, b);
		System.out.println("" + a + op + b + " = " + res);

	}
	/* 메소드 만들기
	 * 기능: 두 정수와 산술연산자가 주어지면 산술연산 결과를 알려주는 메소드
	 * 매개변수: 두 정수, 산술연산자 -> int num1, char op, int num2 
	 * 리턴타입: 산술연산 결과 -> 나누기때문에 -> 실수 -> double
	 * 메소드명: calculator
	 */
	public static double calculator(int num1, char op, int num2) {
		//<내가 푼거>
		/*
		double res;
		switch(op) {
		case '+' : res = num1 + num2; 
			return res;
		case '-' : 
			res = num1 - num2; 
			return res;
		case '*' : 
			res = num1 * num2; 
			return res;
		case '/' : 
			res = num1 / num2; //강제타입변환하면 오류남.. -> res 타입이 int라서
			return res;
		case '%' : 
			res = num1 % num2; 
			return res;
		default : //여기를 모르겠음 -> 안써도 됨
			res = 
		}
		*/
		//<선생님 풀이>
		double res = 0;
		switch(op) {
		case '+' : res = num1 + num2; break;	
		case '-' : res = num1 - num2; break;
		case '*' : res = num1 * num2; break; 
		case '/' : res = num1 / (double)num2; break;
		case '%' : res = num1 % num2; break;
		}
		return res;
	}
}
