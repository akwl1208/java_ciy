package review;

import java.util.Scanner;

public class Review_scanner_day3 {

	public static void main(String[] args) {
		// 예제1) 한 학생의 수학 영어 국어 성적을 입력 받고, 총점과 평균을 구하세요.
		//단, 성적은 점수로 입력받고 0~100사의의 정수를 입력
		
		/*
		Scanner scan = new Scanner(System.in); //스캐너 불러오는거 생각 안남..
		System.out.print("수학 성적을 입력하세요(0~100) : ");
		int math = scan.nextInt();
		
		System.out.print("영어 성적을 입력하세요(0~100) : ");
		int eng = scan.nextInt();
		
		System.out.print("국어 성적을 입력하세요(0~100) : ");
		int kor = scan.nextInt();
		
		int sum = math + eng + kor;
		double avg = sum / 3;
		
		System.out.println("성적 총점은 " + sum + "입니다");
		System.out.println("성적 평균은 " + avg + "입니다");
		*/
		
		
		// 예제2) 두 정수와 산술 연산자(+ - * / %)를 입력받아 출력하는 코드 작성
         
		Scanner scan = new Scanner(System.in); //System 앞글자 대문자임
		
		System.out.print("정수1 연산자 정수2가 출력됩니다.(입력 예시: 1 + 2) : ");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char op = scan.next().charAt(0); //기억안남...문자열을 받아서 0번지 문자 가져옴
		
		System.out.println("" + num1 + op + num2);
		
		scan.close();
		
	}

}
