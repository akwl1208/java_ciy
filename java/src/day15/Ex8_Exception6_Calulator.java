package day15;

public class Ex8_Exception6_Calulator {

	public static void main(String[] args) {
		//예제) 두 정수와 산술 연산자가 주어졌을 때 산술 연산결과를 출력하는 코드 작성
		//단, 에외처리 필수
		
		try {
			int num1 = 1, num2 = 0;
			char op = '/';
			
			switch(op) {
			case '+' :
				System.out.println("" + num1 + op + num2 + " = " + (num1 + num2));
				break;
			case '-' : 
				System.out.println("" + num1 + op + num2 + " = " + (num1 - num2)); 
				break;
			case '*' :
				System.out.println("" + num1 + op + num2 + " = " + (num1 * num2));
				break;
			case '/' : 
				//res로 예외 catch -> 0으로 나눌 때 예외 발생시키기 위한 코드
				int res = num1 / num2;
				System.out.println("" + num1 + op + num2 + " = " + ((double)num1 / num2));
				break;
			case '%' : 
				System.out.println("" + num1 + op + num2 + " = " + (num1 % num2));
				break;
			default: System.out.println("잘못된 연산자입니다");
			}
		} catch (ArithmeticException e) {	
			System.out.println("0으로 나눌 수 없습니다");
		}
		
	}

}
