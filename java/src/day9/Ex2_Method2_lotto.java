package day9;

import java.util.Scanner;

public class Ex2_Method2_lotto {

	public static void main(String[] args) {
		// 예제) 로또
		//<내가 푼거>
		//로또 배열 생성
		int lotto[] = new int[7];
		//랜덤한 수 생성 
		int min = 1, max = 45;
		for(int count = 0; count < 7; ) {
			int r = (int)(Math.random() * (max -  min + 1) + min);
			if(!contains(lotto, r, count) ) {
				lotto[count] = r;
				count++;
			}
		}
		//배열 출력
		printArray(lotto);
		
		// 사용자가 1-45사이의 정수 6개를 입력
		int user[] = new int[6];
		Scanner scan = new Scanner(System.in);
		System.out.print("로또 번호 입력 : ");
		for(int i = 0; i<user.length; i++) {
			user[i] = scan.nextInt();
		}
		
		int count = 0;
		int bonus = 0;
		//맞은 갯수 확인
		count = getCount(lotto, user);
		//보너스 갯수 확인
		bonus = getBonus(lotto, user);
		//등수 출력
		printResult(count, bonus);
		
		scan.close();
	}		
		
	// 정수형 배열에 처음부터 n개 중에서 정수 num이 있는지 없는지
	public static boolean contains(int arr[], int num, int n) {
		if(arr == null || arr.length == 0 || n <= 0) {
		return false;
		}
		if(arr.length < n) {
			n = arr.length;
		}
		for(int i = 0; i < n ; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}

	// 정수형 배열이 주어졌을 때, 주어진 배열의 값을 콘솔에 출력하는 메소드
	public static void printArray(int num[]) {
		if(num == null || num.length == 0) {
			System.out.println("출력할 배열이 없습니다");
			return;
		}
		for(int i = 0 ; i< num.length ; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	/* 기능 : 정수형 배열 2개를 비교하여 일치하는 갯수 알려주는 메소드
	 * 매개변수 : 로또 배열과 사용자가 입력한 정수형 배열 -> int arr1[], int arr2[]
	 * 리턴타입 : 일치하는 번호의 갯수 ->  정수 -> int
	 * 메소드명 : getCount
	 */
	public static int getCount(int arr1[], int arr2[]) {
		int count = 0;
		for(int i = 0; i<arr2.length; i++) {
			for(int j = 0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	/* 기능 : 로또 배열 6번지 보너스 숫자와 배열을 비교하여 일치하는지 알려주는 메소드
	 * 매개변수 : 로또 배열과 사용자가 입력한 정수형 배열 -> int arr1[], int arr2[]
	 * 리턴타입 : 맞은 개수 -> int 
	 * 메소드명 : getBonus
	 */
	public static int getBonus(int arr1[], int arr2[]) {
		int bonus = 0;
		for(int i = 0 ; i<arr2.length ; i++) {
			if(arr2[i] == arr1[6]){
				bonus++;
			}
		}
		return bonus;
	}
	
	/* 기능 : 맞은 개수와 보너스 번호를 비교하여 등수를 출력하는 메소드
	 * 매개변수 : 맞은 개수와 보너스 번호 -> int count, int bonus 
	 * 리턴타입 : 출력 -> void
	 * 메소드명 : printResult
	 */
	public static void printResult(int count, int bonus) {
		switch(count) {
		case 6: System.out.println("1등"); break;
		case 5:
			if(bonus == 1 ) {
				System.out.println("2등");
			}else {
				System.out.println("3등");
			}
			break;
		case 4: System.out.println("4등"); break;
		case 3: System.out.println("5등"); break;
		default: System.out.println("꽝");
		}
	}
}
