package day2;

public class Ex6_logic {

	public static void main(String[] args) {
		/* <논리연산자>
		 * AND: &&, ~하고, ~이고, 둘 다 참이면 참, 하나라도 거짓이면 거짓
		 * OR: ||, ~하거나, ~이거나, 둘 다 거짓이면 거짓, 하나라도 참이면 참
		 * XOR: ^, 둘 다 같으면 거짓, 다르면 참
		 * NOT: !, 참은 거짓, 거짓은 참
		 */
		
		
		//예제) 성적이 A학점인가? A학점의 기준은 90점 이상이고 100점 이하
		
		int score1 =89;
		System.out.println(score1 + "점은 A학점인가?" + (score1 >= 90 && score1 <= 100)); //false
		
		int score2 =95;
		System.out.println(score2 + "점은 A학점인가?" + (score2 >= 90 && score2 <= 100)); //true
		
  
		//예제) 잘못된 성적인가? 유효한 성적은 성적이 0점 이상 100점 이하
		/*<풀이과정>
		 * 잘못된 성적: 성적이 0점 미만이거나 100점 초과
		 */
		int score3 =95;
		System.out.println(score3 + "점은 잘못된 성적인가?" + (score3 < 0 || score3 > 100)); //false
		
		int score4 =105;
		System.out.println(score4 + "점은 잘못된 성적인가?" + (score4 < 0 || score4 > 100)); //true
	
	
	    //예제) 유효한 성적인가?
		//not 연산자 활용
		int score5 =95;
		System.out.println(score5 + "점은 유효한 성적인가?" + !(score5 < 0 || score5 > 100)); //true
		
		int score6 =105;
		System.out.println(score6 + "점은 유효한 성적인가?" + !(score6 < 0 || score6 > 100)); //false
	
	}

}
