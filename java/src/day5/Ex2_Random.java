package day5;

public class Ex2_Random {

	public static void main(String[] args) {
		// <Random>
		
		//Math.random 범위: 0보다 크고 1보다 작은 실수 
		//System.out.println(Math.random());

		//정수 범위로 표현하기
		//random 필요할 때 공식처럼 사용

		int min = 1, max = 10;		
		int r= (int)(Math.random() * (max-min+1) + min);
		
		 for(int i = 1 ; i <=10 ; i++) {
			r = (int)(Math.random() * (max-min+1) + min);
			 System.out.print(r + " ");
		 }
	}

}
