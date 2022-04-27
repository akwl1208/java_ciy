package day3;

import java.util.Scanner;

public class Ex3_Scanner3 {

	public static void main(String[] args) {
		// 예제) 두 정수와 산술 연산자(+ - * / %)를 입력받아 출력하는 코드 작성

		/*<내가 푼거>
		 1. 일단 두정수와 산술 연산자를 받아야함(정수는 int, 산술연산자는 단어임)
		 2. 출력은 'num1 연산자 num2 입니다'
		 */
		
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int num2 = scan.nextInt(); 
		
		System.out.print("산술연산자를 입력하세요(+ - * / %) : ");
		char op = scan.next().charAt(0);
		
		//정수+정수+정수라서 num1 얖에 "" 추가
		//추가 안하면 산술연산자에 해당하는 유니코드 숫자로 계산됨
		System.out.println(""+ num1 + op + num2 + " 입니다");   
		
		scan.close();
		*/
		
		
		/*<선생님 풀이: 방법1 >
		 * 정수1을 입력하세요 : 1
		 * 정수2을 입력하세요 : 2
		 * 산술 연산자를 입력하세요 :+
		 * 1+2 반환
		 */
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수1를 입력하세요 : ");
		int num1 = scan.nextInt();
		
		System.out.print("정수2를 입력하세요 : ");
		int num2 = scan.nextInt(); 
		
		System.out.print("산술연산자를 입력하세요(+ - * / %) : ");
		char op = scan.next().charAt(0);
		
		System.out.println(""+ num1 + op + num2);
		
		scan.close();
		*/
		
		
		/*<선생님 풀이: 방법2>
		두 정수와 산술연산자를 입력하세요(예: 1 + 2) : 1 + 2
		1+2 반환
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 정수와 산술연산자를 입력하세요(예: 1 + 2) : ");
		int num1 = scan.nextInt();
		char op = scan.next().charAt(0);
		int num2 = scan.nextInt(); 
		
		System.out.println(""+ num1 + op + num2);
		
		scan.close();
		
	
	}

}
