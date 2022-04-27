package day3;

import java.util.Scanner;

public class Ex4_if1 {

	public static void main(String[] args) {
		// 예제) 두 정수와 산술 연산자를 입력받아 연산 결과를 출력하는 코드를 작성하세시오
		
		/*<내가 푼거>
		 *
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 정수와 산술연산자를 입력하세요(예: 1 + 2) : ");
		int num1 = scan.nextInt();
		char op = scan.next().charAt(0);
		int num2 = scan.nextInt(); 
		
		if (op == '+') {
			System.out.println(""+ num1 + op + num2 + "=" +  (num1+num2));
		}
		
		else if (op == '-') {
			System.out.println(""+ num1 + op + num2 + "=" +  (num1-num2));
		}
		
		else if (op == '*') {
			System.out.println(""+ num1 + op + num2 + "=" +  (num1*num2));
		}
		
		else if (op == '/') {
			System.out.println(""+ num1 + op + num2 + "=" +  ((double)num1/num2));
		}
		
		else if (op == '%') {
			System.out.println(""+ num1 + op + num2 + "=" + (num1 % num2));
		}
		
		else {
			System.out.println("잘못된 연산자입니다");
		}
		
		/*나누기 실수
		int res = (int)(1 / 2.0) ;
		double res2 = 1 /2 ; //0.0 나옴 -> 이미 0이 나와서 0을 실수로 표현
		*/
		
		scan.close();
	}

}
