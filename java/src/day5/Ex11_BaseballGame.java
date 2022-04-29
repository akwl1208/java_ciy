package day5;

import java.util.Scanner;

public class Ex11_BaseballGame {

	public static void main(String[] args) {
		/* 예제) 숫자 야구 게임 작성
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
		/*힌트)
		 * 반복횟수: s가 3보다 작을 때까지 반복
		 * 규칙성 : 
		 * 1. 정수 3개를 입력 받음 
		 * 2. com1과 user1이 같으면 S를 1증가
		 * 3. com2과 user2이 같으면 S를 1증가
		 * 4. com3과 user3이 같으면 S를 1증가
		 * 5. com1과 user2과 같거나 com1과 user3이 같으면 b를 1증가
		 * 6. com2과 user1과 같거나 com2과 user3이 같으면 b를 1증가
		 * 7. com3과 user1과 같거나 com1과 user2이 같으면 b를 1증가
		 * s가 0이 아니면 XS를 출력
		 * b가 0이 아니면 YB를 출력
		 * s가 0이고 b가 0이면 O를 출력
		 * 엔터
		 */
		
		//<내가 푼거> 힌트보고
		int com1 = 3, com2 = 8, com3 = 9;
		int user1, user2, user3;
		int s = 0, b; 
		
		Scanner scan = new Scanner(System.in);
		
		for( ;s < 3;) {	//while(s<3)		
			System.out.print("세 정수를 입력하세요(1~9)(예: 1 2 3) :  ");
			user1 = scan.nextInt();
			user2 = scan.nextInt();
			user3 = scan.nextInt();
			
			//s, b 초기화
			s = 0;
			b = 0;
			//com1과 user1이 같으면 S를 1증가
			if(com1 == user1) {
				s++;
			}
			 //com2과 user2이 같으면 S를 1증가
			if(com2 == user2) {
				s++;
			}
			 //com3과 user3이 같으면 S를 1증가
			if(com3 == user3) {
				s++;
			}
			 //com1과 user2과 같거나 com1과 user3이 같으면 b를 1증가
			if(com1 == user2 ||com1 == user3) {
				b++;
			}
			 //com2과 user1과 같거나 com2과 user3이 같으면 b를 1증가
			if(com2 == user1 ||com2 == user3) {
				b++;
			}
			 //com3과 user1과 같거나 com3과 user2이 같으면 b를 1증가
			if(com3 == user1 ||com3 == user2) {
				b++;
			}
			 //s가 0이 아니면 sS를 출력			
			if(s != 0) {
				System.out.println(s + "S");
			}
			 //b가 0이 아니면 bB를 출력
			if(b != 0) {
				System.out.println(b + "B");
				
			}
			 //s가 0이고 b가 0이면 O를 출력
			if(s == 0 && b == 0) {
				System.out.println("O");
			}
			
			System.out.println();
		}
		
		scan.close();
		
		
		
	}

}
