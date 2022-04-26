package day2;

public class Ex12_if2 {

	public static void main(String[] args) {
		// 예제) num이 짝수면 짝수라고 출력하고, 짝수가 아니면 홀수라고 출력하는 코드를 if문을 이용하여 작성하시오.
		
		int num = 4;
	    //if문 두개로 짝수, 홀수 구분
		//num이 홀수/짝수에 상관없이 무조건 2번 비교 -> 약간 비효율적
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수"); 
		}
		
		if(num % 2 != 0) {
			System.out.println(num + "는 홀수"); 
		}
		
		//if-else 구문으로 해결
		//num이 짝수면 1번 비교하고, 홀수이면 2번 비교
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수"); 
		}
		
		else {
			System.out.println(num + "는 홀수"); 
		}
		
	}

}
