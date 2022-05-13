package day14;

import java.util.Scanner;

//가계부
public class AccountBook {
	//내역의 최대 개수
	public static final int MAX = 100; 
	//가계부에서 내역이 최대 100개 
	private Item items[] = new Item[MAX];
	private int count; //현재 기록된 내역의 개수
	
	/* 기능1) 현재까지 기록된 내역을 확인
	 * 매개변수: Item items[], int count 이라고 생각했는데 없음 -> 내꺼 읽으니까
	 * 리턴타입: void
	 * 메소드명: readItems
	 * */
	/* <내가 푼거>
	public static void readItems(Item items[], int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}
	*/
	//static을 붙이니까 count랑 item에 오류남
	public void readItems() {
		if(count == 0) {
			System.out.println("입력된 내역이 없습니다");
			return;
		}
		for(int i = 0; i < count; i++) {
			System.out.println(i+1 + ". " + items[i]);
		}
	}
	
	/* 기능2) 가게부에 새 내역을 추가하여 추가됬는지를 알려줌
	 * 매개변수: Scanner scan라고 생각했으나 Item item
	 * 리턴타입: Item라고 생각했으나 추가여부 -> boolean
	 * 메소드명: insertItem
	 * */
	/*< 내가 푼거>
	public Item insertItem(Scanner scan) {
		System.out.println("추가할 내역을 입력하세요: ");
		String date = scan.next();
		boolean imcome = scan.hasNext();
		String payment = scan.next();
		String content = scan.next();
		int price = scan.nextInt();
		
		return new Item(date, imcome, payment, content, price);	
	}
	*/
	public boolean insertItem(Item item) {
		//가계부에 쓸 공간이 없는 경우
		if(count == MAX) {
			return false;
		}
		//추가해야하는 내역이 비었을 때
		if(item ==null) {
			return false;
		}
		//item을 items에 넣고 count 1증가
		items[count++] = item;
		return true;
	}
	
	/* 기능3) 가계부에 기존 내역을 삭제하여 삭제한 내역을 알려줌
	 * 매개변수: 삭제할 내역 -> Item delItem 라고 생각했으나 삭제할 번지 -> int delIndex
	 * 리턴타입: void라고 생각했으나 삭제한 내역 -> Item
	 * 메소드명: deleteItem
	 */
	/*<내가 푼거>
	public void deleteItem(Item delItem) {
		int delCount = 0;
		for(int i = 0; i < count; i++) {
			if(items[i] == delItem) {
				delCount = i;
			}
		}
		for(int i = delCount; i < count - 1; i++) {
			items[i] = items[i+1];
		}
		count--;
	}
	*/
	public Item deleteItem(int delIndex) {
		//잘못된 번지인 경우
		if(delIndex >= count || delIndex < 0){
			return null;
		}
		//삭제할 내역을 임시저장 -> 나중에 알려줘야하기 때문에
		Item delItem = items[delIndex];
		//삭제한 위치부터 하나씩 당겨옴
		for(int i = delIndex; i < count - 1; i++) {
			items[i] = items[i+1];
		}
		//삭제 후 저장한 개수 줄임
		count--;
		//삭제한 내역을 알려줌
		return delItem;
	}
	
	/*기능4) 가계부에 기존 내역을 수정하여 수정 여부를 알려주는 메소드
	 * 매개변수: 수정할 번지 -> int modIndex라고 생각했으나 
	 	수정할 내용 -> String date, boolean income, String payment, String content, int price도 추가
	 * 리턴타입: 수정여부 -> boolean
	 * 메소드명: modifyItem
	 * */
	//<내가 푼거>
	public boolean modifyItem(int modIndex, String date, boolean income, String payment, String content, int price) {
		//잘못된 번지인 경우
		if(modIndex >= count || modIndex < 0) {
			return false;
		}
		//내역 수정
		items[modIndex].modify(date, income, payment, content, price);
		return true;
	}
	
	//기능5) 
	public Item getItem(int index) {
		if(index < 0 || index >= count) {
			return null;
		}
		return items[index].clone();
	}
	
	//기능 6)
	public void readItems(String type, String date) {
		switch(type) {
		case "date" :
			for(int i = 0; i < count; i++) {
				if(items[i].getDate().equals(date)) {
					System.out.println(i+1 + ". " + items[i]);
				}
			}
			break;
		}
		
	}
	

}
