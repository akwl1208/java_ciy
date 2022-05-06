package day9;

import java.util.Scanner;

public class Ex1_Method1_Baseballgame {

	public static void main(String[] args) {
		//예제) 숫자야구게임
		//예제)1~4사이의 중복되지 않은 3개의 수를 생성하여 저장하는 출력 코드 작성
		//contains와 printArray 활용
		
		/*<내가 푼거>
		 * 일단 contains와 printArray를 활용하지 않고 예제를 풀었다
		 * 그리고 contains와 printArray의 기능을 확인하고
		 * 기능에 해당하는 부분에 각 메소드를 대입했다
		 */
		/*
		int arr[] = new int[3];
		int count = 0;
		
		for(; count < arr.length;) {
			//우선 랜덤숫자 생성
			int min = 1, max = 4;
			int r = (int)(Math.random() * (max - min + 1) + min);

			//랜덤한 숫자가 배열에 있는지 확인하고 없으면 저장
			if(contains(arr, r, count) == false) {
				arr[count] = r;
				count++; 
			}		
		}
		printArray(arr);
		*/
		
		//<선생님 풀이>
		int com[] = new int[3];
		int min = 1, max = 6;
		
		for(int count = 0; count < 3; ) {
			//1~4사이의 랜덤한 수 생성
			int r = (int)(Math.random() * (max -  min + 1) + min);
			//배열에 count개만큼 랜덤한 수와 비교하여 있는지 확인하고 없으면 
			if(!contains(com, r, count) ) { //false를 낫연산자(!) 활용 -> true의 반대는 false
				//배열 count번지에 랜던한 수 저장
				com[count] = r;
				//count 1증가
				count++;
			}
		}
		//배열 출력
		printArray(com);
		
		//사용자가 1-9사이의 정수 3개를 입력
		int user[] = new int[3];
		int strike = 0, ball =0;
		Scanner scan = new Scanner(System.in);
		do {
			strike = 0;
			ball = 0;
			//사용자가 1~9 사이의 정수 3개 입력
			System.out.print("입력 : ");
			for(int i = 0; i < user.length; i++) {
				user[i] = scan.nextInt();
			}
			//스트라이크 갯수 확인
			strike = getStrike(com, user);
			//볼 갯수 확인
			ball = getBall(com, user);
			//값 출력
			printResult(strike, ball);
		}while(strike < 3);
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
	
	 /* 기능 : 정수형 배열 2개가 주어지면 스트라이크 갯수(같은 자리에서 일차하는 숫자의 갯수)를 알려주는 메소드
	  * 매개변수 : 랜덤한 정수형 배열과 사용자가 입력한 정수형 배열 -> int com[], int user[]
	  * 리턴타입 : 스트라이크 갯수 ->  정수 -> int
	  * 메소드명 : getStrike
	  */
	
	public static int getStrike(int com[], int user[]) {
		//<내가 푼거>
		/*
		int s = 0;
		for(int i = 0; i < user.length; i++) {
			if(com[i] == user[i]) {
				s++;
			}
		}
		return s;
		*/
		
		//<선생님 풀이>
		//예외 처리 -> 요거 까먹었음
		if(com == null || user == null) {
			return 0;
		}
		int strike = 0;
		//업그레이드 -> 혹시 배열의 크기가 다른 경우
		int count = com.length > user.length ? user.length : com.length;
		for(int i = 0; i < count; i++) {
			if(com[i] == user[i]) {
				strike++;
			}
		}
		return strike;	
	}
	 /* 기능 : 정수형 배열 2개가 주어지면 볼 갯수(다른 자리에서 일차하는 숫자의 갯수)를 알려주는 메소드
	  * 매개변수 : 랜덤한 정수형 배열과 사용자가 입력한 정수형 배열 -> int com[], int user[]
	  * 리턴타입 : 볼 갯수 ->  정수 -> int
	  * 메소드명 : getBall
	  */
	
	public static int getBall(int com[], int user[]) {
		//<내가 푼거>
		/*
		int b = 0;	
		for(int i = 0; i < com.length; i++) {
			for(int j = 0; j < user.length; j++)
			if(com[i] == user[j]) {
				if(i != j) {
					b++;
				}
			}
		}
		return b;
		*/
		
		//<선생님 풀이>
		//예외 처리 -> 요거 까먹었음
		if(com == null || user == null) {
			return 0;
		}
		int all = 0;
		//볼 + 스트라이크 갯수 
		for(int tmp : com) {
			if(contains(user, tmp, user.length)){
				all++;
			}
		}
		//볼의 갯수 = 전체 일치하는 갯수 - 스트라이크 갯수
		return all - getStrike(com, user);
	}

	 /* 기능 : 스트라이크와 볼의 갯수가 주어지면 결과를 콘솔에 출력하는 메소드
	  * 매개변수 : 스트라이크와 볼의 갯수 -> getStrike, getBall -> 두 배열 -> com[], user[]
	  * 리턴타입 : 출력 -> void
	  * 메소드명 : printResult
	  */
	//<내가 푼거>
	/*
	public static void printResult(int com[], int user[]) {		
		if(getStrike(com, user) != 0 || getBall(com, user) != 0) {
			System.out.println("strike의 갯수 : " + getStrike(com, user));
			System.out.println("ball의 갯수 : " + getBall(com, user));
		}else{
			System.out.println("O");
		}
	}
	*/
	//<선생님 풀이>
	public static void printResult(int strike, int ball) {		
		if(strike != 0) {
			System.out.println(strike + "S");
		}
		if(ball != 0) {
			System.out.println(ball + "B");
		}
		if(strike == 0 && ball == 0) {
			System.out.println("O");
		}
	}	
}

