package day2;

public class Ex16_test4 {

	public static void main(String[] args) {
		/* 예제) num1과 num2가 주어지고 산술연산자 op가 주어졌을 때 
		산술 연산자(+, -, *, /, %)에 맞는 결과가 출력되는 코드를 작성하시오
		* 연산자가 아니면 잘못된 연산자라고 출력
		*/
		
		int num1 = 1;
		int num2 = 2;
		char op = '+';
				
		System.out.println(num1 + " + " + num2 + " = " + 3);

		//<내가 푼거>
		//문제랑 조건 잘 확인하고 풀기!!
		//나누기 실수로 반환하는거 모르겠당...
		//double(num1 / num2) 도 아니고..
		//double(num1) / double(num2) 도 아니고..
		//(double)num1 / num2 이다!!!!!!
		//나누기는 실수로도 나오니까 항상 조심!!!
		//double은 한쪽만 강제타입변환 시켜줘도 됨
		
		if (op == '+') {
			System.out.println(num1 + num2);	
		}
		
		else if (op == '-') {
			System.out.println(num1 - num2);
		}
		
		else if (op == '*') {
			System.out.println(num1 * num2);
		}
		
		else if (op == '/') {
			System.out.println((double)num1 / num2);
		}
		
		else if (op == '%') {
			System.out.println(num1 % num2);
		}
		
		else {
			System.out.println("잘못된 연산자");
		}
		
		
		//선생님 풀이~
		
		//1+2인데 3이 아니라 
		System.out.println(num1 + op + num2 + "=" + 3); //46=3(연산자가 +일때)
		//앞에 "" 넣어주면 원하는 결과 나옴
		System.out.println("" + num1 + op + num2 + "=" + 3);
		
		//찐 풀이~
		if (op == '+') {
			System.out.println("" + num1 + op + num2 + "=" + (num1 + num2));	
		}
		
		else if (op == '-') {
			System.out.println("" + num1 + op + num2 + "=" + (num1 - num2));
		}
		
		else if (op == '*') {
			System.out.println("" + num1 + op + num2 + "=" + (num1 * num2));
		}
		
		else if (op == '/') {
			System.out.println("" + num1 + op + num2 + "=" + ((double)num1 / num2));
		}
		
		else if (op == '%') {
			System.out.println("" + num1 + op + num2 + "=" + (num1 % num2));
		}
		
		else {
			System.out.println(op + "는 산술 연산자가 아닙니다");
		}
		
	}

}
