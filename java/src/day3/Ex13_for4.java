package day3;

public class Ex13_for4 {

	public static void main(String[] args) {
		//예제) 1부터 5까지 합을 구하는 코드를 작성
		
		//<내가 푼거>
		/* 합을 출력하는게 어렵넹..
		 * i+i도 아니고 //2 4 6 8 10
		 * i++도 아니고 //1 3 5 
		 * 1 + 2 + 3 + 4 + 5 = 15
		 * 증감식에 i = i + i 도 아니고.. //1,2,4
		 * 힌트) sum 변수 추가 하기!
		 *     sum = 0
		 * i=1 sum = 0 + 1   
		 * i=2 sum = 0 + 1 + 2
		 * i=3 sum = 0 + 1 + 2 + 3 
		 * i=4 sum = 0 + 1 + 2 + 3 + 4
		 * i=5 sum = 0 + 1 + 2 + 3 + 4 + 5    
		 */
		int i;   //int i = 1;
		int sum = 0;
		
		/* 이렇게 하면 1 3 6 10 15 나옴..원하는건 15 하나....
		for (i=1 ; i<=5 ; i++) {
			System.out.println(sum = sum + i);
		}
		*/
		
		/* 오류나네...아 이건 실행문 안에 ; 안해서 오류난거구낭...
		for (i=1 ; i<=5; i++) {
			sum = sum + i
		}
		System.out.println(sum);
		*/
		
		
		//<선생님 풀이>
		for (i=1 ; i<=5 ; i++) {
			sum += i; //sum = sum + i
		}
		System.out.println("1부터 5까지 합 : " + sum);
		
	

	}

}
