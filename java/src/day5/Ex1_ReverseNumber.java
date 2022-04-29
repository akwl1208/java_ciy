package day5;

import java.util.Scanner;

public class Ex1_ReverseNumber {

	public static void main(String[] args) {
		/* 예제) 정수를 입력받아 입력받은 정수를 역으로 출력하는 코드
		//예) 1230 -> 0321
		
		/*힌트)
		 * 1230 -> 0을 출력, 1230 -> 123
		 * 123 -> 3을 출력, 123 -> 12
		 * 12 -> 2를 출력, 12 -> 1
		 * 1 -> 1을 출력, 1 -> 0
		 * 0이 되면 반복문 종료
		 * 반복횟수 : num이 0이 아닐 때까지
		 * 규칙성: num의 일의 자리를 출력한 후, num을 10으로 나눈 몫을 num에 저장
		 */
		
		//<내가 푼거>
		//for문 알파벳 출력 문제 참고해서 해결!!
		//조건문에 꼭 i가 안들어가도 됨!!
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = scan.nextInt();
		
		for(int i = 1 ; num != 0 ;) {			
			if(num == 0) {
				break;
			}
			//num의 일의 자리를 출력한 후,
			i = num-(num/10*10);
			System.out.print(i);
			//num을 10으로 나눈 몫을 num에 저장
			num = num/10;
		}
		
		scan.close();
		*/
		
		
		
		//<선생님 풀이> 좀 더 간단하게 풀이 가능
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = scan.nextInt();
		//거꾸로한 정수를 저장 후 출력하기 위해 
		int revNum = 0;
		int tmpNum = num; //초기의 num 기억하기 위해 
		
		while(num != 0) {
			//일의 자리 출력
			System.out.print(num%10);
			revNum = 10*revNum + num % 10;
			num = num / 10;
		}
		//거꾸로한 정수를 저장 후 출력하기 위해
		System.out.println();
		System.out.println(tmpNum + "를 거꾸로한 정수 : " + revNum);
		
		scan.close();
	}

}
