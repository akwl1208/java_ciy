package day14;

import java.util.Scanner;
//프로그램
public class AccountBookManager implements ConsoleProgram {
	//필드
	private Scanner scan;
	private AccountBook abook; //가계부
	private final int exitMenu = 5; //종료 메뉴 번호
	
	//생성자
	public AccountBookManager(Scanner scan) {
		this.scan = scan;
		abook = new AccountBook();
		//테스트용 샘플 데이터
		Item item = new Item("2022-05-13", false, "신용카드", "점심", 7000);
		abook.insertItem(item);
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
		case 1:
			readAccountBook();
			break;
		case 2: 
			if(insertAccountBook()) {
				System.out.println("내역을 추가했습니다");
			}else {
				System.out.println("내역 추가에 실패했습니다");
			}
			System.out.println("===================");
				
			break;
		case 3: 
			if(modifyAccountBook()) {
				System.out.println("수정에 성공했습니다");
			}else {
				System.out.println("수정에 실패했습니다");
			}
			System.out.println("===================");
			
			break;
		case 4:
			Item delItem = deleteAccountBook();
			if(delItem != null) {
				System.out.println(delItem);
				System.out.println("위 항목이 삭제되었습니다");
			}else {
				System.out.println("삭제에 실패했습니다");			
			}
			System.out.println("===================");
			break;
		case 5: break;
		default:
			System.out.println("잘못된 메뉴입니다");
			System.out.println("==================");
			
		}
	}

	@Override
	public void run() {
		//메뉴 출력 및 선택
		int menu;
		do{
			menu = selectMenu(scan);
			excute(menu);
		}while(menu != exitMenu);
		System.out.println("가계부가 종료되었습니다");
		System.out.println("==================");
	}
	
	//기능1)
	public void readAccountBook() {
		System.out.print("전체확인(1)/날짜확인(2) : ");
		int submenu = scan.nextInt();
		
		switch(submenu) {
		case 1:
			abook.readItems();
			break;
		case 2: 
			System.out.print("날짜입력[예:2022-05-13] : ");
			String date = scan.next();
			abook.readItems("date", date);
			break;
		default: 
			System.out.println("잘못된 메뉴 선택입니다");
		}
		
		System.out.println("==================");
	}
	
	//기능2)
	public boolean insertAccountBook() {
		System.out.print("날짜 : ");
		String date = scan.next();
		System.out.print("수입(true)/지출(false) : ");
		boolean income = scan.nextBoolean();
		System.out.print("결제방식 : ");
		String payment = scan.next();
		System.out.print("항목 : ");
		String content = scan.next();
		System.out.print("금액 : ");
		int price = scan.nextInt();
		
		Item item = new Item(date, income, payment, content, price);
		return abook.insertItem(item);
	}
	
	//기능3)
	public boolean modifyAccountBook() {
		abook.readItems();
		//수정할 항목 선택
		System.out.print("수정할 항목(정수) : ");
		int modIndex = scan.nextInt();
		System.out.println("===================");
		//수정할 항목이 맞는지 항목 출력
		//가계부에서 배열 불러오는거 모르겠다..
		Item tmp = abook.getItem(modIndex - 1);
		if(tmp != null) {
			System.out.println(modIndex-1 + ". " + tmp);
		} else {
			return false;
		}
		System.out.println("===================");
		//수정할건지 안내문구
		System.out.println("선택한 항목은 위와 같습니다. 수정하시겠습니까?[예: true/아니오: false]");
		boolean ok = scan.nextBoolean();
		//false이면 수정 안함
		if(!ok) {
			return false;
		}
		//수정하는 문구와 기능
		System.out.print("수입(true)/지출(false)[필수] : ");
		boolean income2 = scan.nextBoolean();
		
		System.out.print("날짜를 수정하겠습니까?[예: true/아니오: false] : ");
		ok = scan.nextBoolean();
		String date2 = null;
		if(ok) {
			System.out.print("날짜 : ");
			date2 = scan.next();
		}
		
		System.out.print("결제 방식을 수정하겠습니까?[예: true/아니오: false] : ");
		ok = scan.nextBoolean();
		String payment2 = null;
		if(ok) {
			System.out.print("결제방식 : ");
			payment2 = scan.next();
		}
		
		System.out.print("항목을 수정하겠습니까?[예: true/아니오: false] : ");
		ok = scan.nextBoolean();
		String content2 = null;
		if(ok) {
			System.out.print("항목 : ");
			content2 = scan.next();
		}
		
		System.out.print("금액을 수정하겠습니까?[예: true/아니오: false] : ");
		ok = scan.nextBoolean();
		int price2 = -1;
		if(ok) {
			System.out.print("금액 : ");
			price2 = scan.nextInt();
		}	
		return abook.modifyItem(modIndex - 1, date2, income2, payment2, content2, price2);
	}
	
	//기능4)
	public Item deleteAccountBook() {
		abook.readItems();
		
		System.out.print("삭제할 항목(정수) : ");
		int delIndex = scan.nextInt();
		
		//삭제할 항목이 맞는지 항목 출력
		Item tmp = abook.getItem(delIndex - 1);
		if(tmp != null) {
			System.out.println(delIndex-1 + ". " + tmp);
		} else {
			return null;
		}
		System.out.println("===================");
		//삭제할건지 안내문구
		System.out.println("선택한 항목은 위와 같습니다. 삭제하시겠습니까?[예: true/아니오: false]");
		boolean ok = scan.nextBoolean();
		//false이면 수정 안함
		if(!ok) {
			return null;
		}
		return abook.deleteItem(delIndex - 1);
	}
}
