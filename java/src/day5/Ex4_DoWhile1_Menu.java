package day5;

import java.util.Scanner;

public class Ex4_DoWhile1_Menu {

	public static void main(String[] args) {
		// <do while문>
		//메뉴 출력 예제를 do while문으로 작성
		//무조건 1번은 실행해야하는 경우 ex) 학사 프로그램
		int menu;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("<메뉴>");
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생정보 출력");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 삭제");
			System.out.println("5. 학생정보 종료");
			System.out.print("메뉴를 선택하세요 : ");
			
			menu = scan.nextInt();
		}while(menu != 5); //초기값 상관 없음 //조건문 옆에 세미콜론 필수!
		
		scan.close();
		
		
		
		

	}

}
