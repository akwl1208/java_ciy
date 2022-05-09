package day10;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/* TEST)다음 조건을 만족하는 학생 관리 프로그램을 작성
		 * 조건1 > 학생(Student) 클래스
 			- 학생 이름, 학년, 반, 번호를 필드로 가짐
 			- 학생 정보를 출력하는 메소드를 가짐(print)
 			- 학생 이름, 학년, 반, 번호를 이용하여 필드를 초기화하는 생성자를 가짐
		 * 조건2 > 메뉴
 			1. 학생 정보 입력
 			2. 학생 정보 출력
 			3. 프로그램 종료
		 */
		Scanner scan = new Scanner(System.in);
		Student std = new Student("홍길동", 1, 1, 1);
		
		int menu = 0;
		while(menu != 3) {
			//메뉴 출력
			System.out.println("메뉴");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 출력");
			System.out.println("3. 프로그램 종료");
			System.out.print("메뉴를 입력하세요 : ");
			
			//메뉴 입력
			menu = scan.nextInt();
						
			//기능 구현
			switch(menu) {
			case 1: 
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("학년 : ");
				int grade = scan.nextInt();
				System.out.print("반  : ");
				int classNumber = scan.nextInt();
				System.out.print("번호 : ");
				int studentNumber = scan.nextInt();
				std = new Student(name, grade, classNumber, studentNumber);
				break;
			
			case 2: std.print(); break;
			case 3: System.out.println("프로그램을 종료합니다."); break;
			default: System.out.println("잘못된 메뉴입니다.");
			
			}
			//구분선
			System.out.println();
			System.out.println("----------------------------");
		
		}

	}

}
class Student{
	//필드: 학생 이름, 학년, 반, 번호
	String name;
	int grade;
	int classNumber;
	int studentNumber;
	
	//메소드 : 1학년 1반 1번 홍길동
	void print() {
		System.out.println(grade + "학년 " + classNumber + "반 " + studentNumber + "번 " + name);
	}
	
	//생성자
	public Student(String name, int grade, int classNumber, int studentNumber) {
		this.name = name;
		this.grade = grade;
		this.classNumber = classNumber;
		this.studentNumber = studentNumber;
	}
	
}