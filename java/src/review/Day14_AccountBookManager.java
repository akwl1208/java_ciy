package review;

import java.util.Scanner;

public class Day14_AccountBookManager implements Day14_ConsoleProgram{
	//필드
	private Scanner scan;
	private final int exitMenu = 5; //종료 메뉴 번호
	private Day14_AccountBook abook; //가계부
	
	//생성자
	public Day14_AccountBookManager(Scanner scan) {
		this.scan = scan;
		abook = new Day14_AccountBook();
		//테스트용
		Day14_Category record1 = new Day14_Category("2022-05-13", "지출", "신용카드", "점심", 7000);
		abook.insertItem(record1);
		Day14_Category record2 = new Day14_Category("2022-05-14", "지출", "신용카드", "간식", 5000);
		abook.insertItem(record2);
		
	}

	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("========메뉴========");
		System.out.println("1. 가계부 확인");
		System.out.println("2. 가계부 추가");
		System.out.println("3. 가계부 수정");
		System.out.println("4. 가계부 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int menu = scan.nextInt();
		System.out.println("==================");
		return menu;
	}

	@Override
	public void excute(int menu) {
		switch(menu) {
		case 1: //가계부 확인 -> 전체 확인, 날짜 확인
			printAccountBook();
			break;
		case 2: //가계부 추가
			if(insertAccountBook()) {
				//전체내역 출력
				System.out.println("======내역 추가======");
				abook.printRecords();
				System.out.println("==================");
			}else {
				System.out.println("내역 추가 실패");
				
			}
			break;	
		case 3: //가계부 수정		
			if(modifyAccountBook()) {
				System.out.println("======내역 수정======");
				abook.printRecords();
				System.out.println("==================");	
			}else {
				System.out.println("내역 수정 실패");
			}
			break;
		case 4: //가계부 삭제
			if(deleteAccountBook()) {
				System.out.println("======내역 삭제======");
				abook.printRecords();
				System.out.println("==================");	
			}else {
				System.out.println("내역 삭제 실패");
			}
			
			break;
		case 5: //프로그램 종료
			break;
		default: 
			System.out.println("잘못 입력했습니다");
		}
		
	}

	@Override
	public void run() {
		int menu;
		do {
			menu = selectMenu(scan);
			excute(menu);
		}while(menu != exitMenu);
		System.out.println("가계부 종료");	
	}

	//기능1) 가계부 출력
	public void printAccountBook() {
		System.out.print("전체 확인(1)/날짜별 확인(2) : ");
		int subMenu = scan.nextInt();
		
		switch(subMenu) {
		case 1: //전체 확인
			abook.printRecords();
			break;
		case 2:
			System.out.print("날짜 입력[예: 2022-05-14] : ");
			String date = scan.next();
			abook.printRecords("date", date);
			break;
		default:
			System.out.println("잘못된 선택");
		}
		System.out.println("=========================");
	}
	
	//기능2) 가계부 내역 추가
	public boolean insertAccountBook() {
		System.out.println("내역을 입력하세요");
		System.out.print("날짜 : ");
		String date = scan.next();
		System.out.print("수입/지출 : ");
		String status = scan.next();
		System.out.print("결제방식 : ");
		String payment = scan.next();
		System.out.print("항목 : ");
		String item = scan.next();
		System.out.print("금액 : ");
		int price = scan.nextInt();
		
		//내역 기록하기
		Day14_Category record = new Day14_Category(date, status, payment, item, price);
		return abook.insertItem(record);
	}
	
	//기능3)가계부 수정
	public boolean modifyAccountBook() {
		//현재 기록된 내역 출력
		abook.printRecords();
		
		//수정할 항목 선택
		System.out.print("수정할 항목 : ");
		int modIndex = scan.nextInt();
		System.out.println("===================");
		
		//수정할 항목 불러옴
		Day14_Category modRecord = abook.loadRecord(modIndex-1);
		//수정할 항목 출력
		if(modRecord != null) {
			System.out.println(modIndex + ". " + modRecord);
		}else {
			return false;
		}
		System.out.println("=========================");
		
		//수정할건지 묻기
		System.out.print("다음 항목을 수정하겠습니까? yes(1)/no(2)");
		int option = scan.nextInt();
		
		if(option == 2) {
			return false;
		}
		//수정할 항목 입력
		if(option == 1) {	
			System.out.print("수입/지출 : ");
			String status2 = scan.next();
			
			System.out.print("날짜를 수정하겠습니까?[yes(1)/no(2)] : ");
			option = scan.nextInt();
			String date2 = null;
			if(option == 1) {
				System.out.print("날짜 : ");
				date2 = scan.next();
			}
			
			System.out.print("결제 방식을 수정하겠습니까?[yes(1)/no(2)] : ");
			option = scan.nextInt();
			String payment2 = null;
			if(option == 1) {
				System.out.print("결제방식 : ");
				payment2 = scan.next();
			}
			
			System.out.print("항목을 수정하겠습니까?[yes(1)/no(2)] : ");
			option = scan.nextInt();
			String item2 = null;
			if(option == 1) {
				System.out.print("항목 : ");
				item2 = scan.next();
			}
			
			System.out.print("금액을 수정하겠습니까?[yes(1)/no(2)] : ");
			option = scan.nextInt();
			int price2 = -1;
			if(option == 1) {
				System.out.print("금액 : ");
				price2 = scan.nextInt();
			}
			
			return abook.modifyRecord(modIndex - 1, date2, status2, payment2, item2, price2);
		}
		return false;
	}
	
	//기능4) 가계부 삭제
	public boolean deleteAccountBook() {
		//가계부 기록 출력
		abook.printRecords();
		
		//삭제할 항목 묻기
		System.out.print("삭제할 항목 : ");
		int delIndex = scan.nextInt();
		
		//삭제할 항목이 맞는지 항목 출력
		Day14_Category tmp = abook.loadRecord(delIndex - 1);
		if(tmp != null) {
			System.out.println(delIndex + ". " + tmp);
		} else {
			return false;
		}
		
		//삭제할건지 묻기
		System.out.print("다음 항목을 삭제하겠습니까? yes(1)/no(2)");
		int option = scan.nextInt();
		//항목 삭제하기
		if(option == 1) {
			return abook.deleteRecord(delIndex-1);
		}
		
		return false;
	}
}
