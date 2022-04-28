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

		/*
		int i = 1;
		int num1 = 12;
		int num2 = 18;
		int gcd;
		
		for(i=1 ; i<=num1 ; i++) {
			int gcd = i;
			if(num1 % i == 0 && num2 % i ==0) {
			}		
		}
		System.out.println(gcd);
		*/
		
		
		
		//<내가 푼거3>: 과정 풀어서
		/*
		//변수 선언: num1, num2 -> 두 수는 정수 -> int
		int num1 = 12;
		int num2 = 18;
		
		//num1의 약수 -> num1%i == 0
		//num2의 약수 -> num2%i == 0
		//그리고 두 수의 공약수 구하기 -> num1의 약수와 num2의 약수가 같다면 i 출력
		int i = 1;
		
		for(i=1 ; i<=num1 ; i++) {
			if(num1%i == 0 && num2%i == 0) {	        		        
		          int gcd = i;
			}
		}
		
		//num1과 num2의 최대공약수 gcd는 두 수의 공약수 중 가장 큰 값 출력
		//공약수까진 출력했는데 최대공약수를 어떻게 하는지 모르겠다
		//gcd를 for문 안에서 선언하는건가? 아님 밖에?
		//1. for문 안에만 선언하니까 오류
		//2. for문 안과 밖에 선언하니까 13이 나오는디...
		//3. for문에서 조건식을 'i<=num1'에서 'i<num1'로 바꾸니까 12 나옴
		//4. 6이 나와야하는디...
		int gcd = i;
		
		System.out.println(gcd);
		*/
		
		
		
		
		//<선생님 풀이>
		
		int num1 = 12, num2 = 18, gcd = 1; //변수 한번에 선언 가능
		
		for(int i = 1 ; i<=num1 ; i++) {
			if(num1%i == 0 && num2%i == 0) {
			
				gcd = i; //gcd에 i를 저장
				
			}
		}
		//gcd를 초기화 안하면 오류남 ex) int gcd; -> int gcd = 1;
		System.out.println(num1 + "과" + num2 +"의 최대 공약수 : "+ gcd); 
		
		
		
		/*<선생님 풀이 코드 해석> 왜 gcd가 초기화값 1로 나오지 않는지
		 1. i = 1 -> 1은 12보다 작다 -> 12를 1로 나누면 나머지 0 -> 18을 1로 나누면 0 
		   -> 둘 다 참이므로 gcd에 1로 수정 -> 증감식 +1
		 2. i = 2 -> 2은 12보다 작다 -> 12를 2로 나누면 나머지 0 -> 18을 2로 나누면 0 
		   -> 둘 다 참이므로 gcd에 2로 수정 -> 증감식 +1
		 3. i = 3 -> 3은 12보다 작다 -> 12를 3로 나누면 나머지 0 -> 18을 3로 나누면 0 
		   -> 둘 다 참이므로 gcd에 3로 수정 -> 증감식 +1
		 4. i = 4 -> 4는 12보다 작다 -> 12를 4로 나누면 나머지 0 -> 18을 4로 나누면 2 
		   -> 12는 참이지만 18은 거짓이므로 이전 값 유지 -> 증감식 +1
		 ....
		 5. i = 12 -> 12는 12와 같다 -> 12를 12로 나누면 나머지 0 -> 18을 12로 나누면 6 
		   -> 12는 참이지만 18은 거짓이므로 이전 값 유지 -> 증감식 +1
		 6. i = 13 -> 13은 12보다 크다 -> 조건식에 맞지 않으므로 for문 빠져나옴     
		 */
		
		
		
		/*<내 풀이3이랑 선생님 풀이 차이>
		 1. 변수 선언 위치도 중요
		 선생님 풀이에서 int gcd를 for문 끝나고 선언 -> for문 안에 있는 gcd가 오류
		
		for(i=1 ; i<num1 ; i++) {
			if(num1%i == 0 && num2%i == 0) {	        		        
		          gcd = i; //여기가 오류
			}
		}
		
		int gcd = 1;
		
		2. 선생님 풀이를  gcd를 i로 초기화	
		int gcd = i; //여기서 오류(i cannot be resolved to a variable 오류)
		
		for(i=1 ; i<num1 ; i++) {
			if(num1%i == 0 && num2%i == 0) {	        		        
		          gcd = i; //여기가 오류
			}
		}
		
		3. 나는 gcd를 2번 선언..선생님 풀이에서는 두 번 선언하면 변수 중복 오류 발생 
		int gcd = i;
		
		for(i=1 ; i<num1 ; i++) {
			if(num1%i == 0 && num2%i == 0) {	        		        
		          int gcd = i; //여기가 오류, 변수 중복 선언
			}
		}
		*/
	}		
}


