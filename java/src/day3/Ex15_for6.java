package day3;

public class Ex15_for6 {

	public static void main(String[] args) {
		/* 예제) 두 정수의 최대 공약수를 구하는 코드를 작성
		 * 공약수 : 공통으로 있는 약수
		 * 최대공약수 : 공약수 중 가장 큰 수
		 */
		
		/* 같은 타입의 변수를 여러 개 선언하는 경우
		 * 기존) 타입 변수명1; 
		 *      타입 변수명2;
		 * 타입 변수명3, 변수명4; 로 여러 개 변수 선언 가능     
		 */
		
		/* 변수의 사용 범위
		 선언된 위치에 따라 사용 범위가 다름
		 int i;
		 for(i = 0 ; i<=5 ; i++);
		 for(int j = 1; j<=5 ; j++); //j는 for문 안에서만 사용 가능
		*/
		
		/*<내가 푼거1>
		 1. 일단 숫자의 약수를 구해햐함
		 2. 공약수 중 같은 걸 고름
		 3. 그 중 가장 큰 걸 출력
		 */
		/*
		int i = 1;
		int num1 = 12;
		int num2 = 18;
		
		
		for(i=1 ; i<=num2 ; i++) {
			if(num1 % i == 0 && num2 % i ==0) {
				//여기를 모르겠다..
			}	
			System.out.println(i);
			
		}
		*/
		
		/*<내가 푼거2> 힌트보고
		힌트)
		반복횟수: 1부터 num1까지
		규칙성: i가 num1의 약수이자 num2의 약수이면 i를 gcd라는 변수에 저장
		박복문 종료 후 : gcd 출력
		*/  

		//
		int i = 1;
		int num1 = 12;
		int num2 = 18;
		int gcd;
		
		for(i=1 ; i<=num1 ; i++) {
			gcd = i;
			if(num1 % i == 0 && num2 % i ==0) {
			}		
		}
		System.out.println(gcd);
		
	}

}
