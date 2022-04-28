package day4;

public class Ex4_Break1 {

	public static void main(String[] args) {
		// <break>
		//if문 없이 break 사용
		for(int i = 1 ; i<=5 ; i++) {
			System.out.print("Hello ");
			break; //Hello 하나 출력
		}
 
		System.out.println(); //줄바꿈
		
		//if문과 함께 break 사용
		for(int i = 1 ; i<=5 ; i++) {
			System.out.print("Hello ");
			if(i==3) {
			break; //Hello Hello Hello 출력
			}
			
		}
	}

}
