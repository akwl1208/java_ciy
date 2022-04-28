package day4;

public class Ex6_Break3_LCM {

	public static void main(String[] args) {
		/* 예제) 두 정수의 최소 공배수를 구하는 예제
		 * 공배수: 두 배수의 공통으로 있는 배수
		 * 최소공배수 : 두 정수의 공배수의 최소값
		 */
		

		/*<내가 푼거> 힌트1)보고
		 * 반복횟수: i는 1부터 num1*num2까지 1씩 증가
		 * 규칙성: i가 num1의 배수이고 i가 num2의 배수이면 i를 출력하고 반복문 종료
		 *        i를 num1으로 나눴을 때 나머지가 0과 같고 i를 num2로 나누었을 때 0과 같을 때 
		 *        i를 출력하고 반복문 종료
		 */
		/*
		int num1=10, num2=15;
		
		for(int i=1 ;i <= num1*num2 ; i++) {
			if(i%num1 == 0 && i%num2 == 0) { 
				System.out.println(num1+ "과" + num2 + "의 최소공배수 : " + i);
				break;
			}
		}
		*/
		
		
		
		/*<내가 푼거2> 힌트2)보고 /
		 * 반복횟수: i는 num1부터 num1*num2까지 num1씩 증가
		 * 규칙성: i가 num1의 배수이고 i가 num2의 배수이면 i를 출력하고 반복문 종료
		 *        i를 num1으로 나눴을 때 나머지가 0과 같고 i를 num2로 나누었을 때 0과 같을 때 
		 *        i를 출력하고 반복문 종료
		 *        반복횟수를 조절해서 효율적인 코드 
		 */
		
		//증감식 num1씩 증가 모르겠음 -> i += num1
		
		int num1=10, num2=15;
		
		for(int i=num1 ; i <= num1*num2 ; i += num1) {
			if(i%num1 == 0 && i%num2 == 0) { 
				System.out.println(i);
				break;
			}
		}
	}
}

