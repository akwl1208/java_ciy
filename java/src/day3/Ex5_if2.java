package day3;

public class Ex5_if2 {

	public static void main(String[] args) {
		/* <중첩 if문>
		 * num가 6의 배수인지 아닌지 판별하는 코드를 충접 if문으로 작성하세요
		 * num가 6의 배수이다 -> num은 2의 배수이자 3의 배수이다
		 * num % 2 == 0 -> num % 3 == 0 
		 */
		
		int num = 12;
		
		if(num % 2 == 0) {
			if(num % 3 == 0) {
				System.out.println(num + "은 6의 배수");
			}
			else {
				System.out.println(num + "은 6의 배수 아님");
				}
		}
		
	}

}
