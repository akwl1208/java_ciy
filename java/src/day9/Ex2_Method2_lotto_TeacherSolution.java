package day9;

import java.util.Scanner;

public class Ex2_Method2_lotto_TeacherSolution {

	public static void main(String[] args) {
		//예제) 로또 
		Scanner scan = new Scanner(System.in);
		int n = 6;
		int min = 1, max = 45;
		
		//로또 구매: 로또 번호 입력(6자리, 1~45)
		System.out.print("로또 번호 입력("+ n+ "개) : ");
		int user[] = inputCreatArray(scan, n);
		
		//로또 당첨번호 생성(랜덤, 1~45, 중복x, 6자리)
		int lotto[] = creatRandomArray(min, max, n);
		System.out.print("로또 당첨 번호 : ");
		printArray(lotto);
		
		//로또 보너스 번호 생성
		int bonus;
		for(;;) {
			bonus = (int)(Math.random()*(max-min+1)+min);
			if(!contains(lotto, lotto.length, bonus)) {
				break;
			}		
		}
		System.out.println("보너스 번호 : " + bonus);
		
		//당첨 갯수 확인
		int count = getCount(user, lotto);
		
		//담첨 등수 출력
		printResult(count, contains(user, user.length, bonus));
		
		scan.close();

	}
	/* 로또 번호를 입력하면 배열을 만들어서 알려주는 메소드
	 * 기능: 주어진 Scanner를 이용하여 콘솔에서 정수를 n개 입력받아 배열로 반환하는 메소드 
	 * 매개변수: Scanner, 입력받을 정수 n개 -> Scanner scan, int n
	 * 리턴타입: 정수 배열 -> int[] //리턴타입이 정수 배열도 가능!
	 * 메소드명: inputCreateArray
	 */
	public static int[] inputCreatArray(Scanner scan, int n) {	
		//예외 처리 -> 배열은 1개 이상부터
		if(n <= 0) {
			return null;
		}
		//정수 입력 및 배열에 저장
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		//배열 반환
		return arr;
	}

	//배열 출력하는 메소드
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
	
	//배열 n개 중에 num이 있는지 없는지 알려주는 메소드
	public static boolean contains(int arr[], int n, int num) {
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
	
	/*min ~ max 사이의 중복되지 않은 n개의 값을 생성하여 배열에 저장하는 메소드
	 * 기능: min에서 max 사이의 중복되지 않는 n개의 정수를 만들어서 배열로 반환하는 메소드
	 * 매개변수: 최소값, 최대값, 개수 -> int min, int max, int n 
	 * 리턴타입: 중복되지 앟는 수를 저장한 배열 -> int[]
	 * 메소드명: createRandomArray
	*/
	public static int[] creatRandomArray(int min, int max, int n) {
		//예외 처리
		if(n <= 0) {
			return null;
		}
		//min과 max 값을 바꿔서 입력했을 때 값을 바꿔서 반환
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		//min=1, max=5, n=6이면 출력안됨 -> 중복된 수가 나옴
		if(max -min + 1 < n) {
			return null;
		}
		//중복되지 않으면 배열에 r 저장
		int arr[] = new int[n];
		for(int count = 0; count < n; ) {
			int r = (int)(Math.random() * (max-min+1) + min);
			if(!contains(arr,count, r)) {
				arr[count] = r;
				count++;
			}
		}
		return arr;
	}
	
	/*당첨 갯수 알려주는 메소드
	 * 기능: 두 정수 배열에서 같은 숫자의 개수를 알려주는 메소드
	 * 매개변수: 두 정수의 배열 -> int arr1[], int arr2[]
	 * 리턴타입: 같은 숫자의 개수 -> int
	 * 메소드명: getCount
	 */
	public static int getCount(int arr1[], int arr2[]) {
		//예외 처리
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		//두 배열을 비교하여 같은 숫자 갯수 반환
		int count = 0;
		for(int tmp : arr1) {
			if(contains(arr2, arr2.length, tmp)) {
				count++;
			}
		}
		return count;
	}
	
	/*당첨 등수 출력하는 메소드
	 * 기능: 일치하는 개수와 보너스가 있는지 없는지 알려주면 당첨 등수 출력하는 메소드
	 * 매개변수: 일치하는 개수, 보너스 일치 여부 -> int count, boolean bonusOk
	 * 리턴타입: 출력 -> void
	 * 메소드명: printResult
	 */
	public static void printResult(int count, boolean bonusOk) {
		//예외 처리
		if (count < 0 || count > 6) {
			System.out.println("등수를 확인할 수 없습니다");
			return;
		}
		
		//등수 출력
		switch(count) {
		case 6: System.out.println("1등 당첨"); break;
		case 5: System.out.println(bonusOk? "2등 당첨" : "3등 당첨"); break;
		case 4: System.out.println("4등 당첨"); break;
		case 3: System.out.println("5등 당첨"); break;
		default: System.out.println("꽝");
		}
	}
}
