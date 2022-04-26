package day2;

public class Ex10_test1 {

	public static void main(String[] args) {
		// <연습문제>
		
		//예제) num이 짝수인지 아닌지 확인하는 코드를 작성하시오
		//hint) A성적 출력하는 예제 활용
		
		//<내가 풀음>
		//짝수는 나눴을 때 나머지가 0 -> %
		int num1 = 4;
		String isEven1 = (num1 % 2 == 0)? "짝수" : "짝수 아님";
		System.out.println(num1 + "는 짝수인가?" + isEven1); //짝수
		
		//<해답>
		//num % 2 == 0
		int num2 = 4;
		System.out.println(num2 + "는 짝수인가?" + (num2 % 2 == 0)); //true
		//문제를 잘못이해함..
		//처음에 string 변수명을 true라고 해서 오류 생겼음..true는 변수명으로 사용 못하는 듯
	
		
		
		//예제) num이 짝수이면 짝수라고 출력하고,
		//짝수가 아니면 홀수라고 출력하는 코드 작성하시오
		
		//<내가 풀음>
		int num3 = 4;
		String isEven2 = (num3 % 2 == 0)? "짝수" : "짝수 아님";
		System.out.println(num3 + "는 짝수인가?" + isEven2); //짝수
		
		//<해답>
		String isEven3 = (num3 % 2 == 0)? "짝수" : "짝수 아님";
		System.out.println(num3 + "는 짝수인가?" + isEven3); //짝수
	}

}
