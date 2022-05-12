package day12;

import java.util.Scanner;

public class Ex7_Mart {
	/* 음료수/박스과자를 관리하는 마트(종류는 최대 30개 = 음료수 + 박스과자
	 * 1. 제품 등록(신규 제품)
	 * 2. 제품 입고
	 * 3. 제품 선택
	 * 4. 제품 구매
	 * 5. 프로그램 종료
	 */
	public static void main(String[] args) {
		//제품을 관리하기 위한 배열 -> 마트에서 판매하는 제품 목록(음료수+박스과자)
		Product_Mart list[] = new Product_Mart[30];
		//장바구니 생성, 종류는 최대 30개
		Product_Mart basket[] = new Product_Mart[30];
		
		//변수 선언
		int listCount = 0; //저장된 판매 제품 갯수
		int basketCount = 0; //장바구니에 담긴 제품의 갯수
		int menu,subMenu;
		//코드 간편화 과정에서 필요없어진 변수
		//String name; int price, amount, capacity, count;
		
		//기능 구현
		Scanner scan = new Scanner(System.in);
		do {//메뉴 출력 및 선택
			menu = selectMenu(scan);
			//메뉴에 따른 기능
			switch(menu) {
			case 1: /*제품 등록
				 1. 음료수인지 박스과자인지 선택
				 2. 제품명, 가격, 수량, 입력, 박스과자면 1박스당 개수, 음료수면 용량
				 3. 입력한 값을 이용하여 객체로 생성한 후, 판매 목록에 추간
				 4. 순서대로 등록하기 위해 다음 배열로 넘어감..
				 */
				//서브메뉴 출력 및 서브메뉴 선택
				subMenu = selectSubMenu(scan);
				//제품 입력 및 저장
				switch(subMenu) {
				//올바른 서브메뉴 선택
				case 1: case 2:
					//제품 정보를 입력받아서 제품리스트에 추가
					list[listCount] = createProduct(subMenu, scan);
					//판매 제품 갯수 증가
					listCount++;
					break;
				//잘못된 서브메뉴 선택
				default:		
					System.out.println("선택할 수 없는 종류입니다.");	
				}
				break;
				
			case 2: //제품 입고
				//입고 가능한 제품 출력
				printProductList(list, listCount);
				//제품을 선택하고 입고할 수량을 선택하면 판매제품리스트에 제품이 입고되면
				if(addAmountProductList(scan, list, listCount)) {
					System.out.println("입고가 완료되었습니다");
				}else {
					System.out.println("입고에 실패했습니다");
				}
				break;
				
			case 3: /*제품 선택
				<내 생각>
				1. 제품 선택 및 수량 입력
				2. 장바구니 담기
				<선생님 생각>
			 	1. 제품 선택
			 	2. 수량 입력
			 	3. 바구니에 담기
			 	4. 제품 재고량에서 수량만큼 뺌
			 	5. 현재 바구니에 담긴 목록 출력
			 	*/
				//판매제품리스트 출력
				printProductList(list, listCount);
				//제품 선택 후 수량 선택
				Product_Mart selectProduct = selectProduct(scan, list, listCount);
				//선택한 제품이 있으면
				if(selectProduct != null) {
					//장바구니에 선택한 제품을 담고
					basket[basketCount] = selectProduct;
					//장바구니에 담긴 개수를 1 증가
					basketCount++;
					//장바구니에 담긴 목록 출력
					printProductList(basket, basketCount);
				}else {
					System.out.println("선택된 제품이 없습니다");
				}
				/*<기존 코드>
				//수량 바꾸기
				basket[basketCount].setAmount(amount);
				basketCount++;
				//마트 재고량 수정
				buyProduct.setAmount(buyProduct.getAmount() - amount);
				//오류 확인하기(The method sumAmount(int) is undefined for the type Product_Mart)
				//buyProduct.sumAmount(-amount); 
				//장바구니에 담긴 제품 출력
				printProductList(basket, basketCount);
				*/
				break;
				
			case 4: /* 제품구매
					<내 생각>
					1. 현재 바구니에 담긴 목록 및 제품마다 가격 출력
					2. 총 가격 출력
					3. 구매 -> list에서 구매한 제품 수량만큼 수량이 감소됨
					4. 구매 완료라는 문구 출력
					<선생님 생각>
					1. 현재 바구니에 담긴 목록 출력
					2. 최종 합계률 출력
					3. 결제 금액 입력
					4. 결제 진행 -> 금액이 부족하면 결제 취소할지 묻기
						-> 취소하면 장바구니 비우기
					 	-> 결제를 취소하지 않으면 장바구니 보관
				 	5. 결제가 완료되면 거스름돈을 출력 후,
				 	6. 장바구니 비움
			 		*/
				//장바구니에 담긴 제품 출력
				printProductList(basket, basketCount);
				//총 가격 합계 출력
				/* <기존에 작성한 코드>
				int sum = 0;
				//장바구니에 있는 제품 정보들을 하나씩 확인하여 가격*수량을 누적
				for(int i = 0; i <basketCount; i++) {
					Product_Mart tmp = basket[i];
					sum += tmp.getPrice() * tmp.getAmount();
				}
				*/
				int sum = sumProductList(basket, basketCount);
				System.out.println("구매 총 금액 : " + sum);
				
				//결제 금액 입력
				System.out.println("금액을 입력하세요 : ");
				int buyPrice = scan.nextInt();
				
				//결제 진행
				//금액이 부족하면 결제 취소할지 묻기
				if(sum > buyPrice) {
					System.out.println("결제를 취소하겠습니까?(취소시 장바구니는 비워집니다. y/n) : ");
					char cancel = scan.next().charAt(0);
					//취소하면
					if(cancel == 'Y' || cancel == 'y') {
						
						//장바구니에 담긴 제품들을 마트에 돌려줌
						returnProductList(list, listCount, basket, basketCount);
						//장바구니 비우기
						basketCount = 0;
					}
				}
				//결제가 정상적으로 완료되면
				else {
					//거스름돈 출력
					System.out.println("거스름돈 : " + (buyPrice - sum) + "원");
					//바구니 비움
					basketCount = 0;
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다");
				break;
			default: 
				System.out.println("잘못된 메뉴 선택입니다");
			}
		}while(menu != 5);
		scan.close();
	}

	/* 메소드1) 
	 * 기능: 메뉴를 출력하고 스캐너를 통해 메뉴를 입력받은 메뉴를 알려줌
	 * 매개변수: Scanner scan
	 * 리턴타입: int
	 * 메소드명: selectMenu
	 */
	public static int selectMenu(Scanner scan) {
		System.out.println("=======메뉴=======");
		System.out.println("1. 제품 등록(관리자)");
		System.out.println("2. 제품 입고(관리자)");
		System.out.println("3. 제품 선택(고객)");
		System.out.println("4. 제품 구매(고객)");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		
		int menu = scan.nextInt();
		System.out.println("=================");
		
		return menu;
	}
	
	/* 메소드2)
	 * 기능: 제품등록에 대한 서브 메뉴를 출력하고 스캐너를 통해 메뉴 입력
	 * 매개변수: Scanner scan
	 * 리턴타입: int
	 * 메소드명: selectSubMenu
	 */
	public static int selectSubMenu(Scanner scan) {
		System.out.println("1. 음료수등룍");
		System.out.println("2. 박스과자 등록");
		System.out.print("종류 선택 : ");
		
		return scan.nextInt();
	}
	
	/* 메소드3)
	 * 기능: 선택한 서브 메뉴에 맞는 제품 정보를 스캐너를 통해 입력 받아 제품 객체를 생성한 후
	 		생성한 제품을 알려주는 메소드
	 * 매개변수: int subMenu, Scanner scan, 
	 * 리턴타입: 제품 객체 -> Product_Mart //다형성 활용
	 * 메소드명: createProduct
	 */
	public static Product_Mart createProduct(int subMenu, Scanner scan) {
		//등록하기 위한 공통된 제품 정보 입력
		System.out.print("제품명 : ");
		String name = scan.next();
		System.out.print("가격  : ");
		int price = scan.nextInt();
		System.out.print("수량 : ");
		int amount = scan.nextInt();
		
		//선택한 종류에 따른 추가 정보 입력
		switch(subMenu) {
		case 1: 
			System.out.print("음료수 용량 : ");
			int capacity = scan.nextInt();
			//입력된 정보를 이용하여 음료수를 생성하여 돌려줌
			return  new Drink_Product(name, price, amount, capacity);
		case 2: 
			System.out.print("박스당 개수 : ");
			int count = scan.nextInt();
			//입력된 정보를 이용하여 박스과자를 생성하여 돌려줌
			return new SnackBox_Product(name, price, amount, count); 
		//잘못된 정보를 선택하면 없다라고 알려줌
		default: 
			return null;
		}
	}
	
	/* 메소드4)
	 * 기능: 제품목록을 출력
	 * 매개변수: 제품목록 -> Product productList[], int listCount
	 * 리턴타입: 출력 -> void
	 * 메소드명: printProductList
	 */
	public static void printProductList(Product_Mart productList[], int listCount) {
		if(productList == null || listCount == 0) {
			System.out.println("등록된 제품이 없습니다");
			return;
		}
		for(int i = 0; i < listCount; i++) {
			System.out.print(i + 1 +".");
			productList[i].print();
		}
	}
	
	/*메소드5)
	 * 기능: 스캐너를 통해 제품 목록에서 제품과 수량을 입력하여 수량을 추가
	 * 매개변수: Scanner scan, Product_Mart list[], int listCount
	 * 리턴타입: 입고 성공 여부 -> boolean
	 * 메소드명: addAmountProductList
	 */
	public static boolean addAmountProductList(Scanner scan, Product_Mart list[], int listCount) {
		//예외 처리
		if(list == null || listCount == 0) {
			return false;
		}
		
		//입고할 제품 선택 및 수량 입력
		System.out.print("입고할 제품을 선택하세요 : ");
		int num = scan.nextInt();
		System.out.print("입고할 제품의 수량을 입력하세요 : ");
		int amount = scan.nextInt();
		
		//제품 선택을 잘못하거나 수량을 잘못 선택한 경우
		if(num < 1 || num > listCount || amount <= 0) {
			return false;
		}else {
			System.out.println("제품을 잘못 선택했습니다");
		}
		
		//해당 제품의 수량을 변경
		//입고 전 수량
		//int preAmount = list[num-1].getAmount();
		//list[num-1].setAmount(preAmount + amount);
		list[num-1].sumAmount(amount);
		//입고가 완료됬다고 알려줌
		return true;
	}
	
	/*메소드6)
	 * 기능: 스캐너를 이용하여 제품과 수량을 선택하면 
	  		제품리스트에서 해당 제품을 꺼내서 제품을 돌려주는 메소드
	 * 매개변수: Scanner scan, 제품리스트(마트) -> Product_Mart list[], int listCount 
	 * 리턴타입: 선택된 제품(입력한 수량으로) -> Product_Mart
	 * 메소드명: selectProduct
	 * */
	public static Product_Mart selectProduct(Scanner scan, Product_Mart list[], int listCount) {
		//구매할 제품 선택
		System.out.print("구매할 제품을 선택하세요 : ");
		int num = scan.nextInt();
		//잘못된 제품을 선택하면 제품이 없다고 알려줌
		if(num > listCount) {
			return null;
		}
		//제품이 있으면 구매할 수량 입력
		System.out.print("구매할 제품의 수량을 입력하세요 : ");
		int amount = scan.nextInt();
		
		//장바구니 담기
		//구매한 제품을 선택해서 가져옴
		Product_Mart buyProduct = list[num-1];	
		Product_Mart selectProduct = null;
		//선택할 제품을 복사해서 가져옴
		//basket[0] = buyProduct; //요렇게 하면 안됨 -> 제품 목록과 장바구니가 같이 공유됨
		if(buyProduct instanceof SnackBox_Product) {
			//강제타입변환해줘야함..
			selectProduct = new SnackBox_Product((SnackBox_Product)buyProduct);
		}else if(buyProduct instanceof Drink_Product) {
			selectProduct = new Drink_Product((Drink_Product)buyProduct);
		}else {
			return null;
		}
		
		//재고량보다 많은 수량을 입력한 경우
		if(buyProduct.getAmount() < amount) {
			//수량을 재고량으로 수정
			amount = buyProduct.getAmount();
		}
		
		//선택한 제품 정보에 선택한 수량으로 변경
		selectProduct.setAmount(amount);
		//판매제품리스트에서 수량 변경
		//buyProduct.setAmount(buyProduct.getAmount() - amount);
		buyProduct.sumAmount(-amount);
		//선택한 제품을 알려줌
		return selectProduct;
	}
	
	/* 메소드7)
	 * 기능: 제품 리스트가 주어지면 해당 제품 리스트의 합계를 구하여 알려주는 메소드
	 * 매개변수: Product_Mart list[], int listCount
	 * 리턴타입: 합계 ->  int
	 * 메소드명: sumProductList
	 */
	public static int sumProductList(Product_Mart list[], int listCount) {
		int sum = 0;
		for(int i = 0; i < listCount; i++) {
			sum += list[i].getPrice() * list[i].getAmount();
		}
		
		return sum;
	}
	
	/* 메소드8)
	 * 기능: 장바구니에 담긴 제품들을 마켓에 돌려주는 메소드
	 * 매개변수: 마켓제품리스트, 장바구니리스트
	 		-> Product_Mart list[], int listCount, Product_Mart basket[], int basketList
	 * 리턴타입: void
	 * 메소드명: returnProductList
	 */
	public static void returnProductList(Product_Mart list[], int listCount, Product_Mart basket[], int basketCount) {
		if(list == null || basket == null) {
			return;
		}
		//판매 제품 목록과 장바구니 목록을 하나씩 비교하여 제자리에 가져다 놓음
		for(int i = 0; i < listCount; i++) {
			for(int j = 0; j < basketCount; j++) {
				Product_Mart pi = list[i]; //판매 제품
				Product_Mart pj = basket[i]; //장바구니 제품
				//판매 제품과 장바구니 제품 이름이 같으면
				if(pi.getName().equals(pj.getName())) {
					//재고량 = 현재 재고량 + 장바구니 수량
					//장바구니에 있는 제품을 마트로 다시 가져다 놓음
					//pi.setAmount(pi.getAmount() + pj.getAmount());
					pi.sumAmount(pj.getAmount());
				}
			}
		}	
	}
}
