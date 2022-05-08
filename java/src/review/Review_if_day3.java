package review;

public class Review_if_day3 {

	public static void main(String[] args) {
		// 예제1) num가 6의 배수인지 아닌지 판별하는 코드를 충접 if문으로 작성하세요
		// 6의 배수이면 6의 배수입니다 출력
		// 6의 배수가 아니면 6의 배수가 아닙니다 출력
		
		int num = 2;
		
		if (num % 2 == 0) {
			
			if(num % 3 == 0) {
				System.out.println(num + "은 6의 배수입니다");
			}
			else {
				System.out.println(num + "은 6의 배수가 아닙니다");
			}
		}
		
		
		// 예제2) 2, 3, 6의 배수 판별 예제(day2.Ex17_test5.java 참고)
		// 2의 배수이면 2의 배수입니다 출력
		// 3의 배수이면 3의 배수입니다 출력
		// 6의 배수이면 6의 배수입니다 출력
		// 나머지 값은 2,3,6의 배수가 아닙니다 출력
		
		if (num % 2 == 0) {
			if (num % 3 == 0) {
				System.out.println(num + "은 6의 배수입니다");
			}
			else {
			System.out.println(num + "은 2의 배수입니다");
				}
		}
	
		else if (num % 3 == 0) {
			System.out.println(num + "은 3의 배수입니다");
		}
		
		else {
			System.out.println(num + "은 2,3,6의 배수가 아닙니다");
		}
	
	}

}
