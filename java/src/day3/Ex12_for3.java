package day3;

public class Ex12_for3 {

	public static void main(String[] args) {
		// 예제) 1부터 10사이의 짝수를 출력하는 코드 작성 
		
		//<내가 푼거1>
		/* 출력
		 * 2
		 * 4
		 * 6
		 * 8
		 * 10
		 * 2부터 시작해서 2씩 증가하면...
		 */
		
		int i = 2;
		
		for(i=2 ; i<=10 ; i+=2) { //i = i + 2
			System.out.println(i);
		}
		
		
		/*<내가 푼거2>
		 * 짝수니까 2를 곱해주면 됨!
		 * 2 = 1 * 2
		 * 4 = 2 * 2
		 * 6 = 3 * 2
		 * 8 = 4 * 2
		 * 10= 5 * 2
		 */
		
		int j = 1;
		
		for(j=1 ; j<=5 ; j++) {
			System.out.println(j*2);
		}
		
		//<내가 푼거3>:힌트 참고~
		//1~10 사이에 짝수이면 반환
		//짝수는 2로 나누면 나머지가 0임!
		//실행문에 if문 참고
		int k = 1;
		
		for(k=1 ; k<=10; k++) {
			if(k % 2 == 0) {
				System.out.println(k);
			}
		}
			
	
	}

}
