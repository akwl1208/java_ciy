package review;

import java.util.Scanner;

public class Review_Student_Day11 {
	//필드: 학년 반 번호 이름 국어
	int grade, classNum, num;
	String name;
	double kor;
	
	//메소드
	//기능1) 학생 정보 출력
	public void print() {
		System.out.println("-------------------------");
		System.out.println(grade + "학년 " + classNum + "반 " + num + "번호 " + name);
		System.out.println("국어 성적: " + kor);
		System.out.println("-------------------------");
	}
		
	/* 기능2)학생 정보 비교
	 * 매개변수: 학번 반 번호
	 * 리턴타입: 인지 아닌지 -> boolean
	 */
	public boolean equal(int grade, int classNum, int num) {
	
		if(this.grade == grade && this.classNum == classNum && this.num == num) {
			return true;
		}
		return false;
	}
	
	//기능3) 학생 정보 수정
	public void modify(String name, double kor) {
		this.name = name;
		this.kor = kor;
	}
	
	//생성자
	public Review_Student_Day11(int grade, int classNum, int num, String name, double kor) {
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
		this.kor = kor;
	}

	 
}

