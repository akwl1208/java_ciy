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
		int menu = 0, submenu = 0;
		String name;
		int amount = 0, price;
		int capacity, count;
		Review_Product_day12 list[] = new Review_Product_day12[30]; //마트에 있는 제품 목록
		int index = 0; //현재 마트에 있는 제품 개수
		Review_Product_day12 basket[] = new Review_Product_day12[30]; //장바구니에 담긴 목록
		int basketIndex = 0; //장바구니에 담긴 제품 개수
		
		//기능구현
		do {//메뉴 출력 및 선택
			System.out.println("=========메뉴=========");
			System.out.println("1. 제품 등록");
			System.out.println("2. 제품 입고");
			System.out.println("3. 제품 선택");
			System.out.println("4. 제품 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menu = scan.nextInt();
			System.out.println("====================");
			
			switch(menu) {
			case 1: //<제품 등록>
				//음료수 등록하는지 과자 등록하는지 묻기
				System.out.print("음료수(1)/과자(2) : ");
				submenu = scan.nextInt();
				//제품 정보 입력
				System.out.println("===제품 정보 입력===");
				System.out.print("제품명 : ");
				name = scan.next();
				System.out.print("수량 : ");
				amount = scan.nextInt();
				System.out.print("가격 : ");
				price = scan.nextInt();
				//음료수면 용량 입력, 과자면 박스당 개수 입력
				switch(submenu) {
				case 1: 
					System.out.print("용량 : ");
					capacity = scan.nextInt();
					//배열 저장 후, index 1 증가
					list[index++] = new Review_Drink_day12(name, amount, price, capacity);
					break;
				case 2:
					System.out.print("박스당 개수 : ");
					count = scan.nextInt();
					//배열 저장 후, index 1 증가
					list[index++] = new Review_Snack_day12(name, amount, price, count);
					break;
				default: System.out.println("잘못 선택했습니다");
				}		
				break;
				
			case 2: //<제품 입고>
				//현재 제품 목록 출력
				if(list == null || index == 0) {
					System.out.println("등록된 제품 없음");
				}
				for(int i = 0; i < index; i++) {
					System.out.print(i+1 + ". ");
					list[i].print();
				}
				//입고할 제품 선택
				System.out.print("입고할 제품 선택 : ");
				int num = scan.nextInt();
				System.out.print("입고할 수량 입력 : ");
				int addAmount = scan.nextInt();
				
				//수량 변경: 기존 수량에서 입고한 수량 더함..
				list[num - 1].setAmount(amount + addAmount);
				amount = amount + addAmount;
				break;
				
			case 3: //<제품 선택>
				//현재 제품 목록 출력
				if(list == null || index == 0) {
					System.out.println("등록된 제품 없음");
				}
				for(int i = 0; i < index; i++) {
					System.out.print(i+1 + ". ");
					list[i].print();
				}
				
				//구매할 제품 선택
				System.out.print("구매할 제품 선택 : ");
				num = scan.nextInt();
				System.out.print("구매할 수량 입력 : ");
				amount = scan.nextInt();
				
				//장바구니에 담기
				//구매할 제품의 정보를 buyProduct에 저장
				Review_Product_day12 buyProduct = list[num-1]; 
				Review_Product_day12 selectProduct = null;
				//구매할 제품이 과자인지 음료수인지에 따라 정보를 selectProduct에 저장
				if(buyProduct instanceof Review_Snack_day12) {
					selectProduct = new Review_Snack_day12((Review_Snack_day12)buyProduct);
				}else if(buyProduct instanceof Review_Drink_day12) {
					selectProduct = new Review_Drink_day12((Review_Drink_day12)buyProduct);
				}
				//장바구니에 선택한 제품을 담고
				basket[basketIndex] = selectProduct;
				//장바구니에 담긴 개수를 1 증가
				basketIndex++;
				//선택한 제품 정보에 구매할 수량으로 변경
				selectProduct.setAmount(amount);
				//마트제품목록에서 구매한 수량 빼줌
				buyProduct.setAmount(buyProduct.getAmount() - amount);
				
			 	//현재 바구니에 담긴 목록 출력
				for(int i = 0; i < basketIndex; i++) {
					System.out.print(i+1 + ". ");
					basket[i].print();
				}
				break;
				
			case 4: //제품 구매
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

}
