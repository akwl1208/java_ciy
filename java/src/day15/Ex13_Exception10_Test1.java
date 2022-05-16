package day15;

import java.util.Scanner;

public class Ex13_Exception10_Test1 {

	public static void main(String[] args) {
		/* 예제)5개짜리 정수 배열을 생성한 후,
		//정수를 입력받아 입력받은 정수를 배열에 저장하고, 출력하는 코드 작성
		//단, 중간에 잘못된 값을 입력하면 다시 입력받도록..
		*/
		Scanner scan = new Scanner(System.in);
		
		//5개짜리 배열 생성
		int arr[] = new int[5];
		int count = 0; //다른 문자가 아니라 정수를 받은 횟수
		//정수를 입력
		while(count < 5) {
			try {
				System.out.println(count+1 + "번 째 정수 입력 : ");
				arr[count] = scan.nextInt();
				count++;
			}catch(Exception e) {
				System.out.println("입력한 값이 정수가 아닙니다");
				/*정수가 아닌 것을 입력하고 엔터를 치면
				입력버퍼에 해당 값들이 여전히 남아있어 무한루프에 빠지게 됨
				남아있는 값들을 제거해서 무한루프에 빠지지 않기 위해 scan.next()로 제거
				*/
				scan.next();
			}	
		}
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		
		
		/* 정수를 입력받으면 정수를 출력하는 코드 작성. 단, 예외 처리
		 * 예외란...정수가 아닌 문자나 문자열 입력했을 때
		try {
			System.out.print("정수 입력 : ");	
			int num = scan.nextInt();
			System.out.println(num);
		}catch(Exception e) {
			System.out.println("입력한 값이 정수가 아닙니다");
		}
		*/
		System.out.print("프로그램 종료");
		scan.close();
	}

}
