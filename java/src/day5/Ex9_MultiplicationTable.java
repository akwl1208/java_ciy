package day5;

public class Ex9_MultiplicationTable {

	public static void main(String[] args) {
		// 예제) 구구단 7단을 출력하는 코드를 작성
		//<내가 푼거>
	   	for(int i = 1 ; i <= 9; i++) {
	         int num = 7;
	         System.out.println(num + " * " + i + " = " + (num * i));
	      }
		
	   	System.out.println(); //줄바꿈
	   	
	   	
		//예제) 구구단 2단부터 9단까지 출력
	   	//<내가 푼거>
		for(int num = 2; num <= 9; num++) {
			System.out.println("< " + num + "단 >");
			
			for(int i = 1 ; i <= 9; i++) {				
				System.out.println(num + " * " + i + " = " + (num * i));
			}
			
			System.out.println();	
		}
		
	}

}
