package day7;

import java.util.Scanner;

public class Review_Array_day7 {

	public static void main(String[] args) {
		// 예제1) 정수 num을 입력받고, 입력받은 정수가 배열에 있는지 없는지 확인하는 코드 작성
		/*
		Scanner scan = new Scanner(System.in);
		//정수 num 입력받기
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		//비교해야할 배열
		int arr1[] = {1,2,3};
		//입력받은 정수가 배열에 있으면,,,
		int count = 0;
		int i;
		//<풀이1> count 없이 
		for(i = 0 ; i < arr.length ; i++) {
			if(num == arr[i]) {
				break;
			} 
		}
		//<풀이2> count 활용
		for(int j = 0 ; j < arr.length ; j++) {
			if(num == arr[j]) {
				count++;
			} 
		}
		//배열에 있는지 출력
		//<풀이1> 출력
		if(i < arr.length) {
			System.out.println("있음");
		}
		else {
			System.out.println("없음");
		}
		//<풀이2> 출력
		if(count == 1) {
			System.out.println("있음");
		}
		else {
			System.out.println("없음");
		}
		*/
		
		
		
		//에제2) 버블정렬을 이용한 배열 정렬
		/*
		int arr[] = {10 , 15 , 5 , 18 , 20 , 1};
		
		for(int i = 0 ; i < arr.length -  1 ; i++) {
			//옆의 수와 비교 코드
			for(int j = 0 ; j < arr.length - 1 - i ; j++) {
				//앞의 번지의 수가 바로 뒤 번지의 수보다 크면 교환
				if(arr[j] > arr[j+1]) {
					//tmp를 만들어서 값을 임시 저장
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		*/
		
		
		
		//예제3)숫자 야구 게임
		//사용자가 정수(1-9) 3개를 입력하여 랜덤한 수를 맞춰 3S가 될 때까지 게임을 진행
		/*
		//배열 생성
		int com[] = new int[3];
		int count = 0;
		while(count < com.length) {
			//랜덤한 수(1-9) 생성
			int min = 1, max = 9;
			int r = (int)(Math.random() * (max-min+1) + min);
			//랜덤으로 생성한 수와 배열값 비교
			int i = 0;
			for(;i < count ; i++) {
				//r과 배열 중 같은 수가 있다면 for문 빠져나옴
				//break를 만나면 다시 r 생성
				if(r == com[i]) {
					break;
				}
			}
			//같은 수가 없다는 걸 확인한 후, i가 count와 같다면 중복된 수가 없다는 걸 의미
			if(i == count) {
				//com 자리에 랜덤한 수 저장
				com[count] = r;
				System.out.print(com[count] + " ");
				//다음 배열에 저장을 위해 count 1 증가
				count++;
			}
		}
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		//사용자가 정수(1-9) 입력한 후, 저장
		//배열 생성
		int user[] = new int[3];
		int s, b;
		do {
			//사용자가 정수 입력하면 배열에 저장
			System.out.print("세 개의 정수 입력 : ");
			for(int i = 0 ; i < user.length ; i++) {
				user[i] = scan.nextInt();
			}
			//스트라이크, 볼 초기화
			s = 0; b = 0;
			//스트라이크, 볼 
			for(int i = 0 ; i < com.length ; i++) {
				for(int j = 0 ; j < user.length ; j++) {
					//값 비교
					if(com[i] == user[j]) {
						//자리 비교
						if(i == j) {
							s++; //스트라이크 -> 자리와 숫자 모두 동일
						}
						else {
							b++; //볼 -> 자리는 다르고 숫자는 있음
						}
					}
				}
			}
			//값 출력
			//s가 0이 아니면 S출력
			if(s != 0) {
				System.out.println(s + "S");
			}
			//b가 0이 아니면 b출력
			if(b != 0) {
				System.out.println(b + "B");
			}
			//s와 b 둘다 0이면 O 출력
			if(s == 0 && b == 0) {
				System.out.println("O");
			}
		}while(s < 3); //s가 3이면 게임 끝
		
		scan.close();
		*/
		
		
		
		//예제4)로또 게임
		//로또 숫자와 사용자가 입력한 숫자가 똑같은 개수에 따라 등수가 다름
		
		//로도 배열 선언
		int lotto[] = new int[7]; //6번지는 보너스 번호
		//1~45까지 랜덤한 수 7개 생성
		int count = 0;
		while(count < lotto.length) {
			//랜덤한 수 생성
			//int r = (int)(Math.random() * (max-min+1) + min
			int r = (int)(Math.random() * 45 + 1);
			//랜덤한 수와 배열값 비교
			int i = 0;
			for(;i < count ; i++) {
				if(r == lotto[i]) {
					break;
				}
			}
			//로또 배열에 랜덤한 수 저장
			if(i == count) {
				lotto[count++] = r;
				System.out.print(r + " ");
			}
		}
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		//사용자 배열 생성
		int user[] = new int[6];
		//사용자가 6개 번호 입력
		System.out.print("6개 번호 입력 : ");
		for(int i = 0 ; i < user.length ; i++) {
			user[i] = scan.nextInt();
		}
		
		/*등수를 출력
		1등: 6개 맞춤
		2등: 5개 일치 + 보너스(6번지) 번호 일치
		3등: 5개 일치 
		4등: 4개 일치
		5등: 3개 일치
		꽝 : 그외
		*/	
		//로또 번호와 일치하는 개수 구하기(보너스 번호 제외)
		int count2 = 0;
		for(int i = 0; i < user.length ; i++) {
			for(int j = 0 ; j < user.length ; j++) {
				if(lotto[i] == user[j]) {
					count2++;
				}
			}
		}
		//등수 출력
		switch(count2) {
		case 6: System.out.println("1등"); break;
		case 5: 
			int k;
			//보너스 번호는 lotto[6]
			for(k = 0; k < user.length; k++) {
				if(user[k] == lotto[6]) {
					break;
				}
			}
			//보너스 번호와 같은 값이 없으면 k = 6
			if(k == user.length) {
				System.out.println("3등");
			}
			else {
				System.out.println("2등");
			}
			break;
		case 4: System.out.println("4등"); break;
		case 3: System.out.println("5등"); break;
		default: System.out.println("꽝");		
		}
		
	}
}
