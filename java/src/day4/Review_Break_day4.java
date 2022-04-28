package day4;

import java.util.Scanner;

public class Review_Break_day4 {

	public static void main(String[] args) {
		//예제1) 양의 정수를 5번 입력받아
		//정수를 입력받아 양수이면 값 출력/ 음수이면 값을 출력하지 않고 반복문 빠져나옴
		Scanner scan = new Scanner(System.in);
		/*
		for(;;) {
			System.out.print("양의 정수를 입력하세요 : ");
			int num = scan.nextInt();
			
			if(num < 0) {
				break;
			}
			System.out.println(num);
		}
		*/
		
		
		
		/* 예제2) 두 정수의 최소 공배수를 구하는 예제
		 * 공배수: 두 배수의 공통으로 있는 배수
		 * 최소공배수 : 두 정수의 공배수의 최소값
		 */
		
		int i, num1 = 10, num2 = 15;
		for(i = num1; i<=num1*num2; i += num1 ) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println(i);
				break;
			}
		}
		
	}
}
