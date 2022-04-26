package day2;

public class Ex11_if1 {

	public static void main(String[] args) {
		//<if문>
		//참일 때만 실행 
		if(true) {
			System.out.println("참입니다"); //참입니다
		} 
		
		
		//거짓일 땐 실행 안됨
		if(false) {
			System.out.println("거짓입니다"); //출력 안됨
		}
		
		
		// 예제) num가 짝수이면 짝수라고 출력하는 코드를 if문을 이용하여 작성하세요.
		 
		int num = 4;
		
		if(num % 2 == 0) {
			System.out.println(num + "는 짝수입니다"); //4는 짝수입니다
		}
		
		
		//예제) score가 90점 이상이고, 100점 이하이면 A학점이라고 출력하는 코드를 if문을 이용하여 작성하세요
		
		//<내가 푼거>
		int score = 95;
		
		if(score>=90 && score<=100) {
			System.out.println("A학점입니다"); //A학점입니다
		}
		
		/* 정답! 하지만 풀어보는 과정 연습~
		 1. ~면(조건문) ~이다(실행문)
		 2. if(score가 90점 이상이고 score가 100점 이하이다) {
		    A학점이라고 출력
		    }
		 3. if(score가 90보다 크거나 같다 && score가 100보다 작거나 같다) {
		    A학점이라고 출력
		    }
		 !!중괄호 갯수 주의주의!!
		 */
		
		
		


	}

}
