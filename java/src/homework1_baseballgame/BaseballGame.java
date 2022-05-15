package homework1_baseballgame;

import java.util.Scanner;

public class BaseballGame implements ConsoleProgram{

	Scanner scan;
	private final int exitMenu = 3;
	private int com[] = new int[3];
	private int user[] = new int[3];
	private BaseballGameRecords records[] = new BaseballGameRecords[10]; //기록 저장
	private int recordIndex = 0; //기록에 등록된 개수
	private int min = 1;
	private int max = 9;
	private int strike = 0;
	private int ball = 0;
	private int score = 0; //게임 시도 횟수가 점수임..score가 적을수록 좋은거
	
	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("=======메뉴======");
		System.out.println("1. 플레이");
		System.out.println("2. 기록확인");
		System.out.println("3. 프로그램 종료");
		System.out.println("=================");
		System.out.print("메뉴 선택 : ");
		int menu = scan.nextInt();
		System.out.println("=================");
		return menu;
	}

	@Override
	public void excute(int menu) {
		switch(menu) {
		case 1:
			//< 컴퓨터 랜덤수 생성 > -> 1~9 사이의 정수
			createComRandom();
			//반복 -> strike가 3개 될 때까지
			do {//< 사용자 숫자 입력 >-> 1~9 사이의 수 3개
				System.out.println("1~9 사이의 세 개의 정수 입력[예: 1 2 3] :");
				for(int i = 0; i < user.length; i++) {
					user[i] = scan.nextInt();
				}
				
				//< S B O 판별 > 
				//strike, ball값 초기화
				strike = 0; ball = 0;
				//Strike랑 ball 판별 -> strike(숫자랑 자리도 똑같), ball(숫자만 똑같고, 자리는 다름)
				for(int i = 0; i < com.length; i++) {
					for(int j = 0; j < user.length; j++) {
						//컴퓨터랑 사용자가 입력한 숫자가 같을 때,
						if(com[i] == user[j]) {
							//자리가 같으면 strike
							if(i == j) {
								strike++;
							}
							//자리가 다르면 ball
							else {
								ball++;
							}
						}
					}
				}
				
				//< 결과 출력 >
				//strike가 0이 아니면 stirke 개수 출력
				System.out.println("=======맞춘 개수=======");
				if(strike != 0) {
					System.out.println(strike + "S");
				}
				//ball이 0이 아니면 ball 개수 출력
				if(ball != 0) {
					System.out.println(ball + "B");
				}
				//strike랑 ball 둘다 0이면 OUT 출력
				if(strike == 0 && ball ==0) {
					System.out.println("OUT!");
				}
				System.out.println("===================");
				//기록 등록을 위해 점수 1증가
				score++;
			}while(strike != 3);	
			
			//<기록 저장> -> 기록 저장을 원하면 기록 저장
			//기록 저장할건지 묻기
			System.out.println("**점수 : " + score + "점**");
			System.out.print("기록을 저장하시겠습니까?[예(1)/아니오(2)] : ");
			int option = scan.nextInt();
			System.out.println("*************************");
			//저장을 원하면 플레이어 이름과 날짜 입력하도록..
			switch(option) {
			case 1: 
				System.out.println("플레이어의 이름을 입력하세요 : ");
				String name = scan.next();
				System.out.println("플레이 날짜를 입력하세요 : ");
				String date = scan.next();
				
				//기록을 배열에 저장하고, recordIndex 1증가
				BaseballGameRecords record = new BaseballGameRecords(name, date, score);
				records[recordIndex++] = record;
				//다음 기록을 위해 점수 초기화...
				score = 0;
				break;
				
			case 2:
				score = 0;
			}
			break;
			
		case 2: //기록 출력
			//<배열 정렬> -> 버블 정렬
			//기록이 2개 이상이면 배열 정렬		
			if(recordIndex >= 2) {
				for(int i = 0; i < records.length - 1; i++) {
					for(int j = 0; j < records.length - 1 - i; j++) {
						if(records[j].getScore() > records[j+1].getScore()) {
							BaseballGameRecords tmp = records[j];
							records[j] = records[j+1];
							records[j+1] = tmp;
						}
					}
				}
			}
					
			//<등수 출력>
			//기록된 만큼 등수 출력
			for(int i = 0; i < recordIndex; i++) {	
				System.out.println(i+1 + "등 : " + records[i].getPlayername() + " - " + records[i].getScore() + "점");
				
			}
			//기록되지 않는 등수는 기록없음 출력
			for(int i = recordIndex; i < records.length; i++) {
				System.out.println(i+1 + "등 : 기록 없음");
			}
			break;
		case 3:
			break;
		default:
			System.out.println("잘못된 메뉴를 선택했습니다");
			System.out.println("=================");
		}
	}

	@Override
	public void run() {
		int menu;
		do {
			menu = selectMenu(scan);
			excute(menu);
		}while(menu != exitMenu);
		System.out.println("게임을 종료합니다");
		System.out.println("==============");
	}
	
	//생성자
	public BaseballGame(Scanner scan) {
		this.scan = scan;
		//테스트용...
		BaseballGameRecords record1 = new BaseballGameRecords("아지짱짱", "2022-05-15", 3);
		recordScore(record1);
		BaseballGameRecords record2 = new BaseballGameRecords("짱짱아지", "2022-05-16", 1);
		recordScore(record2);
	}
	
	//기능1) 컴퓨터의 랜덤한 수 만들기
	public void createComRandom() {
		int count = 0;
		while(count < com.length) {
			//랜덤수 생성
			int r = random(min, max);
			//중복체크
			//중복이 아니면 저장 후, count 증가
			if(IndexOf(com, count, r) == -1) {
				com[count++] = r;
				System.out.print(r + " ");
			}
		}
		System.out.println();
	}
	
	//기능2) 랜덤 수 생성
	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1) + min);
	}
	
	//기능3) 중복체크
	public static int IndexOf(int arr[], int size, int num) {
		if(size == 0) {
			return -1;
		}
		if(arr.length < size) {
			size = arr.length;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	/*기능4) 기록을 배열에 저장
	 * 매개변수: 기록 -> BaseballGameRecords record 
	 * 리턴타입: 저장 -> void
	 * 메소트명: recordScore
	 */
	public void recordScore(BaseballGameRecords record) {
		//예외 처리
		if(record == null) {
			return;
		}
		//배열에 저장하고 recordIndex 증가
		records[recordIndex++] = record;
	}
	
	
}
