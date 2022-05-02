package day6;

import java.util.Scanner;

public class Ex1_Calculator {

	public static void main(String[] args) {
		/*예제)문자를 입력받아 문자를 출력하는 코드를 작성
		q가 입력될 때까지 입력을 계속 받음
		q를 입력받으면 q를 출력하고 종료
		메뉴를 선택하면 정수 두 개를 입력받아 입력받은 값에 맞는 산술 연산 결과 출력
		
		* 산술 연산자 메뉴
		1. 더하기
		2. 빼기
		3. 곱하기
		4. 나누기
		5. 나머지
		q. 종료
		*/
		
		Scanner scan = new Scanner(System.in);
		
		//<내가 푼거>
		/*
		for(;;) {
			System.out.println("< 산술 연산자 메뉴 >");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("5. 나머지");
			System.out.println("q. 종료");
			System.out.print("메뉴 입력 : ");
			char ch = scan.next().charAt(0);
			
			System.out.println();
			
			if(ch == 'q') {
				System.out.println("종료합니다");
				break;
			}
			
			if(ch < '1' || ch > '5') {
				System.out.println("없는 연산자 메뉴 입니다");
				System.out.println();
				continue;
			}
			
			System.out.print("두 개의 정수를 입력하세요 :" );
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			if(ch == '1') {				
				System.out.println("" + num1 + "+" + num2 + "=" + (num1+num2));
				System.out.println();
			}
			
			if(ch == '2') {				
				System.out.println("" + num1 + "-" + num2 + "=" + (num1-num2));	
				System.out.println();
			}
			
			if(ch == '3') {
				System.out.println("" + num1 + "*" + num2 + "=" + (num1*num2));				
				System.out.println();
			}
			
			if(ch == '4') {
				System.out.println("" + num1 + "/" + num2 + "=" + ((double)num1/num2));				
				System.out.println();
			}
			
			if(ch == '5') {
				System.out.println("" + num1 + "%" + num2 + "=" + (num1%num2));				
				System.out.println();
			}	
		}
		*/
		
		//<선생님 풀이> switch문 활용
		for(;;) {
			System.out.println("< 산술 연산자 메뉴 >");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("5. 나머지");
			System.out.println("q. 종료");
			System.out.print("메뉴 입력 : ");
			char ch = scan.next().charAt(0);
			
			System.out.println();
			
			if(ch == 'q') {
				System.out.println("종료합니다");
				break;
			}
			
			if(ch < '1' || ch > '5') {
				System.out.println("없는 연산자 메뉴 입니다");
				System.out.println();
				continue;
			}
			
			System.out.print("두 개의 정수를 입력하세요 :" );
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			double res = 0.0;
			
			switch(ch) {
			case '1':
				res = num1 + num2;		
				System.out.println("" + num1 + "+" + num2 + "=" + res);
				System.out.println();
				break;
			case '2':
				res = num1 - num2;		
				System.out.println("" + num1 + "-" + num2 + "=" + res);
				System.out.println();
				break;
			case '3':
				res = num1 * num2;		
				System.out.println("" + num1 + "*" + num2 + "=" + res);
				System.out.println();
				break;
			case '4':
				res = num1 / (double)num2;		
				System.out.println("" + num1 + "/" + num2 + "=" + res);
				System.out.println();
				break;
			case '5':
				res = num1 % num2;		
				System.out.println("" + num1 + "%" + num2 + "=" + res);
				System.out.println();
				break;	
			
			}
		}
		
		
		//<선생님 풀이>: 다른 방법 초기화하는 경우
		/*
		char ch;
		for(ch = 'a' ;ch != 'q';) { //초기화 문자 아무거나 가능(q빼고)
			System.out.print("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
	
			System.out.println(ch);
		}
		*/
		
		
		//<선생님 풀이2>: do-while문 활용
		/*
		char ch;
		do{
			System.out.print("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
	
			System.out.println(ch);
		}while(ch != 'q');
		*/
		scan.close();
	}

}
