package day2;

public class Ex5_comparison {

	public static void main(String[] args) {
		/* <비교연산자>
		 * >=를 반대로 쓰면 안됨 : =>(x)
		 * <=를 반대로 쓰면 안됨 : =<(x)
		 * = 과 == 혼동하지 않기(매우 중요)
		 * 결과값이 참 또는 거짓
		 * 비교 연산자는 연산자를 기준으로 양쪽에 어떤 수가 나옴
		 */

		int score =95;
		System.out.println(score > 95); //false
		System.out.println(score >= 95); //true
		System.out.println(score < 95); //false
		System.out.println(score <= 95); //true
		System.out.println(score == 95); //true
		System.out.println(score != 95); //false
		
	}

}
