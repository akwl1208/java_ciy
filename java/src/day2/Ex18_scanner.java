package day2;

import java.util.Scanner;

public class Ex18_scanner {

	public static void main(String[] args) {
		//// 콘솔창에서 정수를 입력받는 예제
		//system.in: 콘솔에서 입력
		//Scanner 오류 뜨면 근처에 마우스 커서 해서 기다리면
		//import scanner(java.util) 선택해야함
		//com.sun.java_cup.internal.runtime 이거 선택해서 오류 해결 안됨
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.println("입력한 정수는 " + num1 + " 입니다.");
		scan.close();

	}

}
