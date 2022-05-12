package review;

import java.util.Scanner;

public class Review_program_Student_day11 {
	//예제) 학생 정보(이름, 학년, 반, 번호, 국어, 영어, 수학 성적)을 관리하는 프로그램 작성
	/* <어떻게 만들지 생각해보기>
	 *  메뉴
	 	1. 학생 정보 입력: 학생 정보를 입력하면 저장
	 	2. 학생 정보 출력: 전체 학생의 학생 정보를 출력
	 	3. 학생 정보 수정: 학년 반 번호를 입력하면 해당하는 학생의 이름 국어 성적 수정
	 	4. 학생 정보 삭제: 학년 반 번호를 입력하면 해당하는 학생 삭제
	 	5. 프로그램 종료: 프로그램이 종료되었습니다 출력하고 종료
	 * 필요한 기능
	  1. 학생 정보 입력 
	  2. 학생 정보 출력
	  3. 학생 정보 수정
	  4. 학생 정보 삭제
	  5. 학생 정보 비교
	  6. 메뉴 출력 및 선택
	 * */
	
	public static void main(String[] args) {
	//필요한 클래스 호출
	Scanner scan = new Scanner(System.in);
	Review_Student_Day11 st = new Review_Student_Day11(1, 1, 1,"", 0);
	
	//변수 선언
	int grade, classNum, num;
	String name;
	double kor;
	int menu = 0;
	final int max = 30;
	Review_Student_Day11 std[] = new Review_Student_Day11[max];
	int index = 0;
	
	while(menu != 5) {
		//메뉴 출력 및 선택
		menu = selectMenu(scan);
		//기능 구현
		switch(menu) {
		//학생정보 입력
		case 1: 
			/*
			//학생정보 입력
			System.out.println("학생 정보 입력(예: 학년 반 번호 이름 국어성적) : ");
			grade = scan.nextInt();
			classNum = scan.nextInt();
			num = scan.nextInt();
			name = scan.next();
			kor = scan.nextDouble();
			//배열에 입력한 정보 저장
			std[index] = new Review_Student_Day11(grade, classNum, num, name, kor);
			*/
			std[index] = inputStudent(scan, std, index);
			//다음 배열에 저장을 위해 index 1 증가
			index++;
			break;
		//전체 학생 정보 출력
		case 2: 
			for(int i = 0; i < index; i++) {
				std[i].print();
			}
			break;
		//학생 정보 수정
		case 3: 
			//수정할 학생 정보 입력
			System.out.println("수정할 학생 정보 입력(예: 학년 반 번호) : ");
			grade = scan.nextInt();
			classNum = scan.nextInt();
			num = scan.nextInt();
			/*
			for(int i = 0; i < index; i++) {
				//배열에서 입력한 학년,반,번호와 같은 배열을 찾으면
				if(std[i].equal(grade, classNum, num)) {
					//수정할 정보 입력
					System.out.println("수정할 정보 입력(예: 이름 국어) : ");
					name = scan.next();
					kor = scan.nextDouble();
					//정보 수정
					std[i].modify(name, kor);
					break;
				}
			}
			*/
			modifyStudent(scan, std, index);
			break;
		//학생 정보 삭제
		case 4: 
			//삭제할 학생 정보 입력
			System.out.println("수정할 학생 정보 입력(예: 학년 반 번호) : ");
			grade = scan.nextInt();
			classNum = scan.nextInt();
			num = scan.nextInt();
			/*
			//배열에서 입력한 학년,반,번호와 같은 배열을 찾으면
			int delIndex = 0;
			for(int i = 0; i < index; i++) {
				if(std[i].equal(grade, classNum, num)) {
					//해당 번지 수를 따로 저장
					delIndex = i;
				}
			}
			//해당번지수부터 index-1까지 다음 배열의 값으로 덮어씌우기
			for(int i = delIndex; i< index - 1; i++) {
				std[i] = std[i+1];
			}
			*/
			deleteStudent(scan, std, index);
			//index 1감소 -> 삭제됬으니까
			index--;
			break;
		case 5: System.out.println("프로그램 종료");break;
		default: System.out.println("잘못된 메뉴 선택");
		}
	}

	
	}
	
	//메소드
	//기능1) 메뉴를 출력하고 선택
	public static int selectMenu(Scanner scan) {
		System.out.println("------------메뉴-----------");
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 출력");
		System.out.println("3. 학생정보 수정");
		System.out.println("4. 학생정보 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 : ");
		
		int menu = scan.nextInt();
		System.out.println("-----------------------");
		
		return menu;
	}
	
	//기능2) 학생정보를 입력하면 정보를 배열에 저장
	public static Review_Student_Day11 inputStudent(Scanner scan, Review_Student_Day11 std[], int index) {
		System.out.println("학생 정보 입력(예: 학년 반 번호 이름 국어성적) : ");
		int grade = scan.nextInt();
		int classNum = scan.nextInt();
		int num = scan.nextInt();
		String name = scan.next();
		double kor = scan.nextDouble();
		
		return new Review_Student_Day11(grade, classNum, num, name, kor);	
	}
	
	//기능3) 학년 번호를 입력받은 값으로 일치하는 학생을 찾고 입력한 값으로 수정
	public static void modifyStudent(Scanner scan, Review_Student_Day11 std[], int index) {
		int grade = 1, classNum = 1 , num = 1;
		for(int i = 0; i < index; i++) {
			if(std[i].equal(grade, classNum, num)) {
				System.out.println("수정할 정보 입력(예: 이름 국어) : ");
				String name = scan.next();
				double kor = scan.nextDouble();
				std[i].modify(name, kor);
				break;
			}
		}
	}
	
	//기능4)  학년 번호를 입력받은 값으로 일치하는 학생을 찾고 값 삭제
	public static void deleteStudent(Scanner scan, Review_Student_Day11 std[], int index) {
		int grade = 1, classNum = 1 , num = 1;
		int delIndex = 0;
		for(int i = 0; i < index; i++) {
			if(std[i].equal(grade, classNum, num)) {
				delIndex = i;
			}
		}
		for(int i = delIndex; i< index - 1; i++) {
			std[i] = std[i+1];
		}
	}
}
