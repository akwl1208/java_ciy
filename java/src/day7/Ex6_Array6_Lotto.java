package day7;

import java.util.Scanner;

public class Ex6_Array6_Lotto {

	public static void main(String[] args) {
		// 예제) 1-45사이의 중복되지 않은 수 7개를 배열에 저장하는 코드
		//<내가 푼거>
		/*
		int lotto[] = new int[7]; //6번지가 보너스 번호
		
		int min = 1, max = 45;
		int count = 0; //배열에 저정된 중복되지 않은 숫자의 개수
		
		for(; count < 7 ;) { //7
			//int r = (int)(Math.random() * 45 + 1);
		 	int r = (int)(Math.random() * (max-min+1) + min);
		 	int i = 0;
		 	for( ; i < count ; i++){
		 		if(r == lotto[i]){
		 			break; //for문 빠져나옴
		 		}
		 	}
		 	if(i == count) {
		 		lotto[count] = r; //후위형 증감자 사용 		
		 		System.out.print(lotto[count] + " ");
		 		count++;
		 	}
		}
		System.out.println();
		*/
		
		//<선생님 풀이>
		int lotto[] = new int[7];//6번지가 보너스 번호 
		int count = 0;//배열에 저장된 중복되지 않은 숫자의 개수
		//로또 당첨번호
		for( ; count < 7 ; ) {
			int r = (int)(Math.random()*45 + 1);
			int i;
			//중복체크
			for(i=0 ;i<count ; i++ ) {
				if(r == lotto[i]) {
					break;
				}
			}
			if(i == count) {
				lotto[count++] = r;
				System.out.print(r + " ");
			}
		}
		System.out.println();
		
		
		
		//예제) 사용자 번호: 1-45사이의 정수 6개를 입력받아 user배열에 저장하는 코드 작성
		//<내가 푼거>
		/*
		Scanner scan = new Scanner(System.in);
		
		int user[] = new int[6];
		
		System.out.print("로또 번호 입력 : ");
		for(int i = 0 ; i < user.length ; i++) {
			user[i] = scan.nextInt();
		}
		*/
		
		//<선생님 풀이>
		int user[] = new int[6];
		Scanner scan = new Scanner(System.in);
		System.out.print("로또 번호 입력 : ");
		for(int i = 0; i<user.length; i++) {
			user[i] = scan.nextInt();
		}
		
		
		
		/*예제) 로또번호와 사용자 번호를 이용하여 등수를 출력하는 코드 작성
		1등: 6개 맞춤
		2등: 5개 일치 + 보너스(6번지) 번호 일치
		3등: 5개 일치 
		4등: 4개 일치
		5등: 3개 일치
		꽝 : 그외
		*/	
		//<내가 푼거>2등과 3등 문제...어려웟음
		/*
		int yes = 0;
		int bonus = 0;
		//입력한 수와 lotto 5번지까지 숫자 비교
		for(int i = 0 ; i<user.length ; i++) {
			for(int j = 0; j < lotto.length - 1; j++) {
				if(user[i] == lotto[j]){
					yes++;
				}
			}
		}
		//보너스-> 로또 6번지와 숫자 같음
		for(int i = 0 ; i<user.length ; i++) {
			if(user[i] == lotto[6]){
				bonus++;		
			}
		}
		//몇등인지 확인
		if(yes == 6) {
			System.out.println("1등");
		}
		if(yes == 5) {
			if(bonus == 1) {
				System.out.println("2등");
			}
			else {
				System.out.println("3등");
			}
		}
		if(yes == 4) {
			System.out.println("4등");
		}
		if(yes == 3) {
			System.out.println("5등");
		}
		if(yes < 3) {
			System.out.println("꽝");
		}
		*/
		
		//<선생님 풀이>
		int count2 = 0;//일치하는 번호의 갯수
		for(int i = 0; i<user.length; i++) {
			for(int j = 0; j<user.length; j++) {
				if(lotto[i] == user[j]) {
					count2++;
				}
			}
		}
		switch(count2) {
		case 6:
			System.out.println("1등");
			break;
		case 5:
			int k;
			for(k=0; k < user.length; k++) {
				if(user[k] == lotto[6]) {
					break;
				}
			}
			if(k == user.length) {
				System.out.println("3등");
			}else {
				System.out.println("2등");
			}
			break;
		case 4:
			System.out.println("4등");
			break;
		case 3:
			System.out.println("5등");
			break;
		default:
			System.out.println("꽝");
		}
		scan.close();
	}

}
