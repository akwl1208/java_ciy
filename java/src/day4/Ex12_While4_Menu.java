package day4;

import java.util.Scanner;

public class Ex12_While4_Menu {

	public static void main(String[] args) {
		/* 예제) 다음과 같은 메뉴가 출력되고,
		 메뉴를 입력할 때까지 반복하는 코드를 while문으로 작성
		* 메뉴
		* 1. 학생정보 입력
		* 2. 학생정보 출력
		* 3. 학생정보 수정
		* 4. 학생정보 삭제
		* 5. 학생정보 종료
		* 메뉴를 선택하세요 :
		*/
		
		
		//<내가 푼거>
		/*힌트)
		 * 반복횟수: menu가 5가 아닐 때까지
		 * 규칙성: 메뉴를 출력하고 스캐너를 통해 메뉴를 입력받아 menu에 저장
		 */
		
		/* 어렵당..
		Scanner scan = new Scanner(System.in);
		
		int menu = 1, input=1;
		while(menu<5) {
			System.out.println("<메뉴>");
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생정보 출력");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 삭제");
			System.out.println("5. 학생정보 종료");
			System.out.print("메뉴를 선택하세요 : ");
			input = scan.nextInt();
			menu = input;
	
			System.out.println(menu);
		}
		*/
		
		
		//<선생님 풀이>
		//방법1
		Scanner scan = new Scanner(System.in);
		int menu = -1; //초기값 설정이 잘못되면 오류남
		
		while(menu != 5) {
			System.out.println("<메뉴>");
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생정보 출력");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 삭제");
			System.out.println("5. 학생정보 종료");
			System.out.print("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
		}
		
		System.out.println("방법1 종료");
		
		//방법2
		
		while(true) {
			System.out.println("<메뉴>");
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생정보 출력");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 삭제");
			System.out.println("5. 학생정보 종료");
			System.out.print("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
			if(menu == 5) {
				break;
			}
		}
		
		scan.close();
		
		
		
		
		
	}

}
