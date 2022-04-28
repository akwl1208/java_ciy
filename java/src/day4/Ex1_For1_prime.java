package day4;

public class Ex1_For1_prime {

	public static void main(String[] args) {
		/* 예제) 정수가 num가 소수인지 아닌지 판별하는 코드 작성
		 * 소수 : 약수가 1과 자기 자신인 수. 약수의 개수가 2개인 수 ex)17
		 * 1는 소수가 아님
		 * 2는 소수
		 */
		
		//<내가 푼거>
		
		
		//숫자 선언하기
		int num = 131;
		
		//반복횟수: 1부터 num까지 1씩 증가
		//규칙성: 약수가 개수가 2개이면 소수이다
		//약수는 num%i == 0
		//약수 갯수...모르겠어
		
		/*hint) 규칙성: i가 num의 약수이면 약수의 개수를 하나 증가
		             -> num1을 1로 나누면 나머지가 0과 같다면 count를 1증가
		
		        반복문 종료 후: 약수의 개수가 2이면 소수라고 출력하고, 아니면 소수가 아님이라고 출력
		*/
		
		int count = 0; //일반적으로 0으로 초기화
		
		for(int i=1 ; i <= num ; i++) {
			if(num % i == 0 ) {
				count = count + 1;
			}			
		}
		
		if(count == 2) {
			System.out.println(num + "는 소수입니다");
		}
		else {
			System.out.println(num + "는 소수가 아닙니다");
		}
		
	
		
		//<선생님 풀이> 
		int num1 = 131, j, count1;
		
		//초기값에 변수 2개를 초기화할 수 있다는 것을 보여주기 위해
		for(j = 1, count1 = 0 ; j <= num1 ; j++) { 
			if(num1 % j == 0 ) {
				count1++;  //count1 = count1 + 1; //count1 += 1; //++count;
			}			
		}
		
		if(count1 == 2) {
			System.out.println(num1 + "는 소수입니다");
		}
		else {
			System.out.println(num1 + "는 소수가 아닙니다");
		}
	}

}
