package day5;

public class Ex6_NestedLoop1 {

	public static void main(String[] args) {
		// <중첩 반복문>
		/* 출력 모양
		 *****
		 *****
		 *****
		 */
		for(int i=1 ; i<=3; i++) {
			//* 5개 출력하는 코드
			//System.out.println("*****")
			
			//* 10개를 출력하고 엔터치는 반복문 코드로 수정
			//*을 10개 반복문으로 한줄에 출력
			for(int j=1 ; j<=5 ; j++) {
				System.out.print("*");
			}
		 	System.out.println();
		}
		
	}
}

