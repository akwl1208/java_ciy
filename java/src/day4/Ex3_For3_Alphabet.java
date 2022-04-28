package day4;

public class Ex3_For3_Alphabet {

	public static void main(String[] args) {
		// 예제) 반복문을 이용하여 a부터 z까지 출력하는 코드를 작성하시오

		//<내가 푼거1>
		
		char i;
		
		for(i= 'a' ; i <= 'z' ; i++ ) {
			System.out.print(i);
		}
		
		System.out.println();
		
		//<내가 푼거2> 힌트보고 숫자로 푸는 방법도
		/* 힌트)
		 * 반복횟수 : 26번
		            1는 0부터 26보다 작을 때까지 1씩 증가
		 * 실행문 : (char)('a'+1)을 출력
		 */
		
		for(int j = 0; j < 26; j++) {
			//char 지우면 숫자로 나옴 -> 소문자 a의 유니코드 = 97
			System.out.print((char)('a'+j)); 
		}
		
		/*
		 * int num1 = ;
		 * char ch1 = 'a' + 1; //리터럴 상수 1이 char타입이라 타입변환 발생 안함
		 * char ch2 = 'a' + num1 //오류 발생-> 같은 1이지만 num1은 int값임
		 * char ch2 = (char)('a' + num1) //이렇게 강제타입변환
		 */
	}

}
