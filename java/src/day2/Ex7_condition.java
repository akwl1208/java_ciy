package day2;

public class Ex7_condition {

	public static void main(String[] args) {
		/* <조건 선택 연산자>
		 * (조건식) ?  참일 때 값 : 거짓일 때 값
		 */
		
		//예제) 성적이 A학점이면 A학점으로 축력하고, 아니면 A학점이 아님으로 출력
		int score1 = 90;
		String isA1 = (score1 >= 90 && score1 <= 100)? "A학점" : "A학점이 아님";
		System.out.println(score1 + "점은 " + isA1); //A학점
		
		int score2 = 50;
		String isA2 = (score2 >= 90 && score2 <= 100)? "A학점" : "A학점이 아님";
		System.out.println(score2 + "점은 " + isA2); //A학점이 아님
	}

}
