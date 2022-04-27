package day3;

import java.util.Scanner;

public class Ex2_Scaaner2 {

	public static void main(String[] args) {
		// <스캐너로 문자, 실수 받기>
		Scanner scan = new Scanner(System.in);
		
		System.out.print("실수를 입력하세요 : ");
		double num1 = scan.nextDouble(); //타입에 맞게 next~가 설정됨
		System.out.println("입력한 실수는 " + num1 +"입니다");
		
		//next() : 앞뒤 공백을 제외한 공백 전까지 단어을 읽어옴
		System.out.print("단어를 입력하세요 : ");
		String str = scan.next(); 
		System.out.println("입력한 단어는 " + str +"입니다");
		
		//scanner에는 문자를 받는 기능이 없음
		//charAt(번지): 문자열에서 번지에 해당하는 문자를 가져옴. 0번지부터 시작
		System.out.print("단어를 입력하세요 : ");
		char ch = scan.next().charAt(0); //문자열에서 첫번째 글자를 가져옴 -> 문자열에서 0번지..
		System.out.println("입력한 단어는 " + ch +"입니다");
		
		scan.close();
		
		/* 실수 입력하세요에 '123 안녕 abc"를 한꺼번에 입력하면
		 공백을 기준으로 next에 의해 차례대로 추출됨
		 입력한 실수는 123.0 입니다
		 입력한 단어는 안녕입니다
		 입력한 문자는 a입니다
		 */
		
	}

}
