package review;

import java.util.Scanner;

public class Review_for_day5 {

	public static void main(String[] args) {
		//예제1) 정수를 입력받아 입력받은 정수를 역으로 출력하는 코드
		//예) 1230 -> 0321
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = scan.nextInt();
			
		for(;num != 0;) {
			System.out.print(num%10);
			
			num = num / 10;
		}
		
		scan.close();
		*/
		
		
		/* 예제2) 램덤으로 생성한 수(1-100)를 맞추는 게임을 작성
		 * 정수를 입력하고 입력한 정수보다 램덤으로 생성된 수가 크면 up, 작으면 down 표시
		 * 맞으면 맞췄습니다 표시
		 * 예시) 램덤으로 생성한 수 : 40
		 * 입력 100 -> down
		 * 입력 30 -> up
		 */
		/*
		int min = 1, max = 100, num = 0;		
		int r= (int)(Math.random() * (max-min+1) + min);
		
		Scanner scan = new Scanner(System.in);
		
		while(num != r) {
			System.out.print("정수를 입력하시오(1-100) : ");
			num = scan.nextInt();
			
			if(num > r) {
				System.out.println("Down");
			}
			
			else if(num < r){
				System.out.println("Up");
			}
			
			else {
				System.out.println("정답");
			}
		}
		
		scan.close();
		*/
		
		
		/* 예제3) 출력 모양
		 *****
		 *****
		 *****
		 */
		for(int i = 1 ; i <= 3 ;i++) {
			for(int j = 1; j <= 5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println(); //줄바꿈
		
		/* 예제4) 아래와 같이 출력되도록 코드를 작성
		 *
		 **
		 ***
		 ****
		 *****
		 */
		for(int i = 1; i <= 5 ; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/* 예제5)
		    *
		   **
		  ***
		 ****
		*****      
	 	*/
		
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= 5 - i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*예제6)
		   *
		  ***
		 *****
		*******
	   ********* 
		 */
		
		for(int i = 1 ; i <= 5 ; i++) {		
			for(int j = 1; j <= 5 - i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i - 1 ; j++ ) {			
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 예제7) 1부터 100 사이의 모든 소수를 출력하는 코드 작성
		/*힌트)
		 * 1부터 100사이의 정수를 차례대로 num에 저장하여 출력
		 * num가 소수인지 아닌지 판별
		 */		
		//어려워....이전꺼 참고함..
		for(int num = 1; num <= 100 ; num++) {
			int count = 0;
			
			for(int i = 1 ; i <= num ; i++) {			
				if(num%i==0) {
					count++;
				}				
			}
			
			if(count == 2) {
				System.out.print(num + " ");
			}
		}
		
		System.out.println();
		
		//예제8) 구구단 2단부터 9단까지 출력
		for(int i = 2 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
		
		/* 예제9)
		 * a
		 * ab
		 * abc
		 * ...
		 * abcd...xyz
		 */
		for(char i = 'a' ; i <= 'z' ; i++ ) {
			for(char j = 'a' ; j <= i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		/* 예제10) 숫자 야구 게임 작성
		 * 중복되지 않은 1~9 사이의 세 정수(3, 8, 9)를 입력 받아 맞추는 게임
		 * 예시) 입력 : 1 2 3
		 * 1 ball(3이 있지만 3이 자리가 다름)
		 * 입력: 4 5 6
		 *  O
		 * 입력 : 7 8 9
		 * 2 Strike
		 * 입력 8 3 9
		 * 1S 2B
		 * 입력: 3 8 9
		 * 3S
		 * 프로그램 종료
		 */
		int com1 = 3, com2 = 8 , com3 = 9;
		int num1, num2, num3;
		int s=0, b=0;
		
		Scanner scan = new Scanner(System.in);
		
		while(s != 3) {
			System.out.print("세 정수를 입력하세요(1-9) : ");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			num3 = scan.nextInt();
			
			s=0; b=0;
			
			if(num1 == com1) {
				s++;
			}
			
			if(num2 == com2) {
				s++;
			}
			
			if(num3 == com3) {
				s++;
			}
			
			if(num1 == com2 || num1 == com3) {
				b++;
			}
			
			if(num2 == com1 || num2 == com3) {
				b++;
			}
			
			if(num3 == com1 || num3 == com2) {
				b++;
			}
			
			if(s != 0) {
			System.out.println(s + "S");
			}
			
			if(b != 0) {
			System.out.println(b + "B");
			}
			
			if (s == 0 && b == 0) {
				System.out.println("O");
			}
			if(s == 3) {
				System.out.println("정답입니다");
			}
		}
		
	}

}
