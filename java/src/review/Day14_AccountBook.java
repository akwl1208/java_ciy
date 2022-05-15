package review;

import java.util.Scanner;

public class Day14_AccountBook {
	//내역 최대 개수
	public static final int MAX = 100;
	//가계부
	private Day14_Category records[] = new Day14_Category[MAX];
	//현재 기록된 내역 개수
	private int index;
	
	/*기능1) 기록된 내역 출력
	 * 매개변수: 없음
	 * 리턴타입: void
	 */
	public void printRecords() {
		if(index == 0) {
			System.out.println("기록된 내역 없음");
			return;
		}
		for(int i = 0; i < index; i++) {
			System.out.println(i+1 +". " + records[i]);
		}
	}
	
	//기능2)
	public void printRecords(String type, String date) {
		if(type == "date") {
			for(int i = 0; i < index; i++) {
				if(records[i].getDate().equals(date)) {
					System.out.println(i+1 + ". " + records[i]);
				}
			}
		}
		
	}
	
	/*기능3)새 내역을 추가해서 추기됬는지
	 * 매개변수: Day14_Category record
	 * 리턴타입: 여부 -> boolean
	 */
	public boolean insertItem(Day14_Category record) {
		//예외 처리 -> 가계부가 꽉 찬 경우 또는 내역이 없을 때
		if(index == MAX || record == null) {
			return false;
		}
		records[index++] = record;
		return true;
	}
	
	/*기능4) 기록을 가져옴
	 * 매개변수: 번지 -> int index
	 * 리턴타입: 카테고리 -> Day14_Category
	 */
	public Day14_Category loadRecord(int loadIndex) {
		if(loadIndex < 0 || loadIndex >= index) {
			return null;
		}
		return records[loadIndex].clone();
	}
	
	/*기능5) 기록을 수정
	 * 매개변수: 수정할 내용
	 * 리턴타입: Day14_Category
	 */
	public boolean modifyRecord(int modIndex, String date, String status, String payment, String item, int price) {
		//예외 처리 -> 잘못된 번지인 경우
		if(modIndex >= index || modIndex < 0) {
			return false;
		}
		//내역 수정
		records[modIndex].modify(date, status, payment, item, price);
		return true;
	}
	
	/*기능6) 기록 삭제
	 * 매개변수: 삭제할 내역
	 * 리턴타입: Day14_Category
	 */	
	public boolean deleteRecord(int delIndex) {
		//예외처리 -> 잘못된 번지인 경우
		if(delIndex >= index || delIndex < 0){
			return false;
		}
		//삭제할 내역을 임시저장 -> 나중에 알려줘야하기 때문에
		Day14_Category delRecord = records[delIndex];
		//삭제한 위치부터 하나씩 당겨옴
		for(int i = delIndex; i < index - 1; i++) {
			records[i] = records[i+1];
		}
		//삭제 후 저장한 개수 줄임
		index--;
		
		return true;
	}
	
}
	
	