package day4;

import java.util.Scanner;

public class Ex5_Break2 {

	public static void main(String[] args) {
		// 예제) 양의 정수를 5번 입력하고, 입력한 정수를 콘솔에 출력하는 코드를 작성하세요
		Scanner scan = new Scanner(System.in);
		
		//<내가 풀음>
		/*
		int i , num;
		
		for(i=1;i<=5;i++) {
			System.out.print(i + "번 째 양의 정수를 입력하시오 :");
			
			num = scan.nextInt();
			
			System.out.println(num);
		}
		
		scan.close();
		*/
		
		
		
		//예제) 정수를 입력받아 양수이면 값 출력/ 음수이면 값을 출력하지 않고 반복문 빠져나옴
		//무한루프 어떻게 하는지 -> for( ; ; )
		
		//<내가 풀음> 
		int num;
		
		for( ; ; ) {
			System.out.print("양의 정수를 입력하시오 :");
			
			num = scan.nextInt();
								
			if(num < 0) {
				break;			
			}
			//else 생략 가능 -> if문에 break가 있기 때문에 
			//-> break는 for문을 빠져나가기 때문에 아래 코드 무시
			System.out.println(num);		
		}
		
		scan.close();
		
	}

}
