package day7;

import java.util.Scanner;

public class Ex5_Array5_Baseball {

	public static void main(String[] args) {
		/* 예제) 점수 3개짜리 배열 com을 생성한 후 랜덤으로 1-9사이의 세 정수를 만들어
		 * 배열에 저장하는 코드 작성(중복 가능)
		 */
		
		//<내가 푼거>
		//배열 생성
		int com[] = new int[3];
		//랜덤한 세 정수 생성 후, 저장 -> 중복 가능
		int min = 1, max = 9;
		/*
		for(int i = 0; i< com.length ; i++) {
		 com[i] = (int)(Math.random() * (max-min+1) + min);
		 System.out.print(com[i] + " ");
		}		
		System.out.println();
		*/
		
		
		//예제) 중복되지 않은 랜덤한 숫자 생성	
		int count = 0;
		for(; count < 3 ;) {
			//랜덤한 수 생성
		 	int r = (int)(Math.random() * (max-min+1) + min);
		 	//랜덤한 수와 배열값을 비교하여 중복이 안되면 저장
		 	int i = 0;
		 	for( ; i < count ; i++){
		 		if(r == com[i]){
		 			break;
		 		}
		 	}
		 	//반복문 종료 후 i가 count와 같다는 의미는 중복된 수가 없다는 의미
		 	if(i == count) {
		 		com[count] = r;		 		
		 		System.out.print(com[count] + " ");
		 		count++;
		 	}
		}
		System.out.println();
		
		
		//예제) 사용자가 정수 3개를 입력하여 3S가 될 때까지 게임을 진행하도록 코드 작성
		//단, 사용자가 입력한 정수도 배열에 저장
		
		//<내가 푼거>
		Scanner scan = new Scanner(System.in);
		/*
		int user[] = new int[3];
		int s = 0, b; 

		do {
			//정수 입력 및 저장
			System.out.print("세 정수를 입력하세요(1~9)(예: 1 2 3) :  ");
			for(int i = 0 ; i < user.length ; i++) {
				user[i] = scan.nextInt();
			}		
					
			//s, b 초기화
			s = 0; b = 0;	
					
			//s값 저장
			for(int i = 0 ; i < user.length ; i++) {
				if(com[i] == user[i]) {
					s++;
				}	
			}	
				
			//b값 저장 -> 요거 반복문을 모르겠넹
			for(int i = 0 ; i < user.length ; i++){
				for(int j = 0 ; j < user.length - i - 1 ; j++) {
					if(com[i] != user[j]) {
						b++;			
					}
				}
			}		
				
			 //s가 0이 아니면 sS를 출력			
			if(s != 0) {
				System.out.println(s + "S");
			}
			
			 //b가 0이 아니면 bB를 출력
			if(b != 0) {
				System.out.println(b + "B");
				
			}
			
			 //s가 0이고 b가 0이면 O를 출력
			if(s == 0 && b == 0) {
				System.out.println("O");
			}
		}while(s<3);
		 */
				
		//<선생님 풀이>
		int user[] = new int[3];
		int s, b; 
		
		do {
			//s, b 초기화
			s = 0; b = 0;
			
			//정수 입력 및 저장
			System.out.print("세 정수를 입력하세요(1~9)(예: 1 2 3) :  ");
			for(int i = 0 ; i < user.length ; i++) {
				user[i] = scan.nextInt();
			}		
			
			/* 스트라이크, 볼 따로 구하기
			//스트라이크 갯수 확인
			for(int i = 0 ; i < com.length ; i++) {
				if(com[i] == user[i]) {
					s++;
				}	
			}
			
			//볼 갯수 확인 -> 내가 이 부분을 못함
			//0, 1, 2를 다 비교하지만 i와 같은 경우 비교 안함
			for(int i = 0 ; i < com.length ; i++){
				for(int j = 0 ; j < user.length ; j++) {
					if(i == j) {
						continue;			
					}
					if(com[i] == user[j]) {
						b++;
					}
				}
			}	
			*/
			
			//<다른 방법>s,b 갯수 같이 확인
			 for(int i = 0 ; i < com.length ; i++){
			 	for(int j = 0 ; j < user.length ; j++){
			 		if(com[i] == user[j]){
			 			if(i == j){
			 				s++;
		 				}
		 				else{
			 				b++;
			 			}
			 		}
			 	}
		 	}
			
			 //s가 0이 아니면 sS를 출력			
			if(s != 0) {
				System.out.println(s + "S");
			}
			
			 //b가 0이 아니면 bB를 출력
			if(b != 0) {
				System.out.println(b + "B");		
			}
			
			 //s가 0이고 b가 0이면 O를 출력
			if(s == 0 && b == 0) {
				System.out.println("O");
			}
		}while(s<3);
		
		scan.close();

	}
}
