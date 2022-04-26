package day2;

public class Ex13_if3 {
	
	public static void main(String[] args) {
	 /* <else if문 활용>
	  * num이 양수면 양수라고 출력
	  * num이 음수면 음수라고 출력
	  * num이 0이면 0이라고 출력하는 코드를 if문을 이용하여 작성하시오.	
	  */
		
		//<내가 풀음>
		int num = -1;
		
		if(num > 0) {
			System.out.println("양수"); 
		}
		
		else if(num < 0) {
			System.out.println("음수"); 
		}
		
		else {
			System.out.println("0"); 
		}
		
		
		//정답!이지만 풀이 과정
		//만약 양수도 음수도 0도 아닌 수가 존재한다면 else문 사용 못함
	
		/* if문 주의사항!
		 * if는 반드시 1개
		 * else if는 0개 이상
		 * else는 0개 또는 1개
		 */
	}
}
