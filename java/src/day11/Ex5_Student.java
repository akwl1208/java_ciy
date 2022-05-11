package day11;

/* <Ex5 학생 관리 프로그램 예제 class 생성>
1) 필드: 학생 클래스 -> 학년, 반, 번호, 이름, 국어, 영어, 수학 성적
2) 메소드
	- 학생 정보 출력
	- 학년 반 번호가 주어졌을 때 일치하는지 확인하는 기능
	- 이름 국어 영어 수학 수정하는 기능
3) 생성자
	이름 학년 반 번호 국어 영어 수학 성적이 주어졌을 때 초기화하는 생성자
*/
public class Ex5_Student {
	//<선생님 풀이>
	private String name;
	private int grade, classNum, num;
	private double kor, eng, math;
	
	public void print() {
		System.out.println("===========================");
		System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " + name );
		System.out.println("국어 : " + kor + ", 영어 : " + eng + " , 수학 : " + math);
		System.out.println("===========================");
	}
	
	/* 기능) 학년 반 번호가 주어졌을 때 일치하는지 확인하는 기능
	 * 매개변수: 학년, 반, 번호 -> int grade, int classNum, int num
	 * 리턴타임: 일치 ->  boolean
	 * 메소드명: equal
	 */
	//나는 this 사용을 생각못함!
	public boolean equal(int grade, int classNum, int num) {
		if(this.grade != grade) {
			return false;
		}
		if(this.classNum != classNum) {
			return false;
		}
		if(this.num != num) {
			return false;
		}
		return true;
	}
	
	/* 기능) 이름 국어 영어 수학 수정하는 기능
	 * 매개변수: 학년, 반, 번호 -> String name, double kor, double eng, double math
	 * 리턴타임: 없음 -> void
	 * 메소드명: modify
	 */
	public void modify(String name, double kor, double eng, double math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Ex5_Student(String name, int grade, int classNum, int num, double kor, double eng, double math) {
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
}
//<내가 푼거>
/*
class Student{
	//필드:학년, 반, 번호, 이름, 국어, 영어, 수학 성적
	private int grade, classNum, studentNum;
	private String name;
	private int kor, eng, math;
*/	
	//메소드
	/* 기능1) 학생 정보 출력
	 * 매개변수: 없음
	 * 리턴타임: 출력 ->  void
	 * 메소드명: print
	 */
/*
	public void print() {
		System.out.println("학년 : " + grade);
		System.out.println("반  : " + classNum);
		System.out.println("번호 : " + studentNum);
		System.out.println("이름 : " + name);
		System.out.println("국어 성적 : " + kor);
		System.out.println("영어 성적 : " + eng);
		System.out.println("수학 성적 : " + math);
	}
*/	
	/* 기능2) 학년 반 번호가 주어졌을 때 일치하는지 확인하는 기능
	 * 매개변수: 학년, 반, 번호 -> int g, int c, int s
	 * 리턴타임: 일치 ->  boolean
	 * 메소드명: check
	 */
/*
	public boolean check(int g, int c, int s) {
		if( g == grade && c == classNum && s == studentNum) {
			return true;
		}
		return false;
	}
*/
	/* 기능3) 이름 국어 영어 수학 수정하는 기능
	 * 매개변수: 이름, 국어, 영어, 수학 -> String n, int k, int e, int m
	 * 리턴타임: 수정 -> void
	 * 메소드명: modification
	 */
/*
	public void modification(String n, int k , int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
*/	
	//생성자
/*
	public Student(int grade, int classNum, int studentNum, String name, int kor, int eng, int math) {
		this.grade = grade;
		this.classNum = classNum;
		this.studentNum = studentNum;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}
	*/

