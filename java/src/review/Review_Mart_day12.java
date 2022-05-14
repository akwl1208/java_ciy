package review;

import java.util.Scanner;

import day12.Drink_Product;
import day12.Product_Mart;
import day12.SnackBox_Product;

public class Review_Mart_day12 {
	/* 음료수/박스과자를 관리하는 마트(종류는 최대 30개 = 음료수 + 박스과자
	 * 1. 제품 등록(신규 제품)
	 * 2. 제품 입고
	 * 3. 제품 선택
	 * 4. 제품 구매
	 * 5. 프로그램 종료
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//변수 선언
		int menu = 0, subMenu = 0;
		String name;
		int amount = 0, price;
		int capacity, count;
		Review_Product_day12 list[] = new Review_Product_day12[30]; //마트에 있는 제품 목록
		int index = 0; //현재 마트에 있는 제품 개수
		Review_Product_day12 basket[] = new Review_Product_day12[30]; //장바구니에 담긴 목록
		int basketIndex = 0; //장바구니에 담긴 제품 개수
		
		//기능구현
		do {//메뉴 출력 및 선택
			menu = printMenu(scan);
			
			switch(menu) {
			case 1: //<제품 등록>
				//음료수 등록하는지 과자 등록하는지 묻기
				subMenu = printSubMenu(scan);
				//제품 정보 입력하면 배열에 저장 후, 1 증가
				switch(subMenu) {
				case 1, 2: 
					list[index++] = stockedProduct(scan, subMenu);
					break;
				default: System.out.println("잘못 선택했습니다");
				}		
				break;
				
			case 2: //<제품 입고>
				//현재 제품 목록 출력
				printList(list, index);
				//입고할 제품 
				if(addProduct(scan, list, index)) {
					System.out.println("입고 성공");
				}else {
					System.out.println("입고 실패");
				}
				break;
				
			case 3: //<제품 선택>
				//현재 제품 목록 출력
				printList(list, index);
				
				//제품 선택 후 수량 선택
				Review_Product_day12 selectProduct = selectProduct(scan, list, index);
				//선택한 제품이 있으면
				if(selectProduct != null) {
					//장바구니에 선택한 제품을 담고
					basket[basketIndex] = selectProduct;
					//장바구니에 담긴 개수를 1 증가
					basketIndex++;
					//장바구니에 담긴 목록 출력
					printList(basket, basketIndex);
				}else {
					System.out.println("선택된 제품이 없습니다");
				}
				break;
				
			case 4: //제품 구매
				//장바구니 목록 출력
				System.out.println("=====장바구니 목록=====");
				printList(basket, basketIndex);
				
				//가격 합계 출력
				int sum = sumPrice(scan, basket, basketIndex);
				System.out.println("총 금액 : " + sum);
				System.out.println("=====================");
				
				//구매 금액 입력
				System.out.print("구매 금액 입력 : ");
				int money = scan.nextInt();
				
				//결제 진행 -> 입력한 금액이 총 금액보다 작으면 구매를 취소할건지 묻기	
				if(money < sum) {
					System.out.print("구매 취소?[y(1)/n(2)] : ");
					int cancel = scan.nextInt();
					//취소하면 장바구니 목록을 다시 마트 목록에 돌려줌
					if(cancel == 1) {
						returnProduct(list, index, basket, basketIndex);
						basketIndex = 0;
					}
				//결제에 성공하면 거스름돈을 돌려줌
				} else {
					System.out.println("구매 완료. 거스름돈 반환");
					System.out.println("거스름돈 : " + (money - sum) + "원");
					//장바구니 비움 -> baksetindex를 0으로 하면 나중에 다시 0부터 정보 덮어씌움
					basketIndex = 0;
				}

				break;
			case 5: 
				break;
			default: 
				System.out.println("잘못 선택했습니다");
			}
			
		}while(menu != 5);
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
	/*기능1) 메뉴 출력
	 * 매개변수: Scanner scan
	 * 리턴타입: 메뉴 -> int
	 */
	public static int printMenu(Scanner scan) {
		System.out.println("=========메뉴=========");
		System.out.println("1. 제품 등록");
		System.out.println("2. 제품 입고");
		System.out.println("3. 제품 선택");
		System.out.println("4. 제품 구매");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int menu = scan.nextInt();
		System.out.println("====================");
		
		return menu;
	}
	
	/*기능2) 서브 메뉴 출력
	 * 매개변수: Scanner scan
	 * 리턴타입: 서브메뉴 -> int
	 */
	public static int printSubMenu(Scanner scan) {
		System.out.print("음료수(1)/과자(2) : ");
		int subMenu = scan.nextInt();
		
		return subMenu;
	}
	
	/*기능3) 입력받은 제품 정보를 배열 저장
	 * 매개변수: Scanner scan,int subMenu
	 * 리턴타입: Review_Product_day12
	 */
	public static Review_Product_day12 stockedProduct(Scanner scan, int subMenu) {
		//제품 정보 입력
		System.out.println("===제품 정보 입력===");
		System.out.print("제품명 : ");
		String name = scan.next();
		System.out.print("수량 : ");
		int amount = scan.nextInt();
		System.out.print("가격 : ");
		int price = scan.nextInt();
		//음료수면 용량 입력, 과자면 박스당 개수 입력
		switch(subMenu) {
		case 1: 
			System.out.print("용량 : ");
			int capacity = scan.nextInt();
			//배열 저장
			//list[index] = new Review_Drink_day12(name, amount, price, capacity); 
			return new Review_Drink_day12(name, amount, price, capacity);
			
		case 2:
			System.out.print("박스당 개수 : ");
			int count = scan.nextInt();
			//배열 저장
			return new Review_Snack_day12(name, amount, price, count);
		
		default: return null;
		}	
	}
	
	/*기능4) 제품 목록 출력
	 * 매개변수: Review_Product_day12 list[], int index
	 * 리턴타입: 출력 -> void
	 */
	public static void printList(Review_Product_day12 list[], int index) {
		//예외 처리
		if(list == null || index == 0) {
			System.out.println("등록된 제품 없음");
			return;
		}
		for(int i = 0; i < index; i++) {
			System.out.print(i+1 + ". ");
			list[i].print();
		}
	}
	
	/*기능5) 입고할 제품을 선택하고, 수량을 입력하면 해당 제품의 수량 증가
	 * 매개변수 : Scanner scan, Review_Product_day12 list[], int index
	 * 리턴타입 : 입고 성공 여부 ->  boolean
	 */
	public static boolean addProduct(Scanner scan, Review_Product_day12 list[], int index) {
		//예외 처리
		if(list == null || index == 0) {
			System.out.println("등록된 제품 없음");
			return false;
		}
		//입고할 제품 및 수량 입력
		System.out.print("입고할 제품 선택 : ");
		int num = scan.nextInt();
		System.out.print("입고할 수량 입력 : ");
		int amount = scan.nextInt();
		
		//예외 처리
		if(num < 0 || num > index || amount <= 0) {
			System.out.println("잘못된 입력(입력한 제품 번호 또는 제품 재고 확인");
			return false;
		}
		
		//수량 변경: 기존 수량에서 입고한 수량 더함..
		//int preAmount = list[num-1].getAmount();
		//list[num-1].setAmount(preAmount + amount);
		list[num-1].sumAmount(amount);
		return true;
	}
	
	/* 기능6) 제품과 수량을 입력하면 선택한 제품을 저장?
	 * 매개변수: Scanner scan, Review_Product_day12 list[], int index 
	 * 리턴타입: Review_Product_day12
	 * 메소드명: selectProduct
	 * */
	public static Review_Product_day12 selectProduct(Scanner scan, Review_Product_day12 list[], int index) {
		//구매할 제품 선택
		System.out.print("구매할 제품 선택 : ");
		int num = scan.nextInt();
		
		//예외 처리
		if(num < 0 || num > index) {
			return null;
		}
		
		//구매할 수량 입력
		System.out.print("구매할 수량 입력 : ");
		int amount = scan.nextInt();
		
		//장바구니에 담기
		//구매할 제품의 정보를 buyProduct에 저장
		Review_Product_day12 buyProduct = list[num-1]; 
		Review_Product_day12 selectProduct = null;
		//구매할 제품이 과자인지 음료수인지에 따라 정보를 selectProduct에 저장
		if(buyProduct instanceof Review_Snack_day12) {
			selectProduct = new Review_Snack_day12((Review_Snack_day12)buyProduct);
		}else if(buyProduct instanceof Review_Drink_day12) {
			selectProduct = new Review_Drink_day12((Review_Drink_day12)buyProduct);
		}else {
			return null;
		}
		
		//예외 처리-> 재고량보다 많은 수량을 입력
		if(buyProduct.getAmount() < amount) {
			//수량을 재고량으로 수정
			amount = buyProduct.getAmount();
		}
		
		//선택한 제품 정보에 구매할 수량으로 변경
		selectProduct.setAmount(amount);
		//마트제품목록에서 구매한 수량 빼줌
		//buyProduct.setAmount(buyProduct.getAmount() - amount);
		buyProduct.sumAmount(-amount);
		
		return selectProduct;
	}
	
	/* 기능7) 장바구니에 담긴 제품들의 가격 합계
	 * 매개변수: Scanner scan, Review_Product_day12 basket[], int basketindex
	 * 리턴타입: 금액 합계 -> int
	 */
	public static int sumPrice(Scanner scan, Review_Product_day12 basket[], int basketIndex) {
		int sum = 0;
		for(int i = 0; i < basketIndex; i++) {
			Review_Product_day12 tmp = basket[i];
			sum += tmp.getPrice() * tmp.getAmount();
		}
		return sum;
	}
	
	/* 기능8) 장바구니에 담긴 제품들을 마켓에 돌려주는 메소드
	 * 매개변수: Review_Product_day12 list[], int index, Review_Product_day12 basket[], int basketIndex
	 * 리턴타입: void
	 * 메소드명: returnProduct
	 */
	public static void returnProduct(Review_Product_day12 list[], int index, Review_Product_day12 basket[], int basketIndex) {
		//예외 처리
		if(list == null || basket == null) {
			return;
		}
		//판매 제품 목록과 장바구니 목록을 하나씩 비교하여 제자리에 가져다 놓음
		for(int i = 0; i < index; i++) {
			for(int j = 0; j < basketIndex; j++) {
				Review_Product_day12 pi = list[i]; //판매 제품
				Review_Product_day12 pj = basket[i]; //장바구니 제품
				//판매 제품과 장바구니 제품 이름이 같으면
				if(pi.getName().equals(pj.getName())) {
					//장바구니에 있는 제품을 마트로 다시 가져다 놓음
					pi.setAmount(pi.getAmount() + pj.getAmount());
				}
			}
		}	
	}
}
