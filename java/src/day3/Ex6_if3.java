package day3;

public class Ex6_if3 {

	public static void main(String[] args) {
		// 예제) 2, 3, 6의 배수 판별 예제(day2.Ex17_test5.java 참고)
		//중첩 if문 이용
		//괄호 실수 조심! 들여쓰기 잘하자
		
		int num =6;
		
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
