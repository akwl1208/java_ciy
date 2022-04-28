package day4;

public class Ex9_While1_Hello {

	public static void main(String[] args) {
		// <While문>
		//Hello를 5번 출력하는 예제
		
		int i = 1;
		
		while(i<=5) {
			System.out.print("Hello ");
			i++;
		}
		
		System.out.println(); //줄바꿈
		
		//실행문에 증감식이 필요없음 
		i=5;
		while(i-- > 0) {
			System.out.print("Hi ");
		}
		
	}
}
