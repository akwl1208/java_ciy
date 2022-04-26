package day2;

public class Ex15_test3 {

	public static void main(String[] args) {
		/* 예제) month가 주어질 때 해당 달의 마지막 일을 출력하는 코드를 if 문으로 작성하시오.
		 * 31일: 1 3 5 7 8 10 12 월
		 * 30일: 4 6 9 11 월
		 * 28일: 2월
		 * hint) or 사용
		 */
		
		//<내가 푼거 1>문제를 잘못이해함..이렇게 하면 8월 9월 10월 11월 12월은 잘못 나옴
		//짝수 달 30일, 홀수 달 31이 아님...
		int month = 8;
		
		if(month >= 13 || month <= 0) {
			System.out.println(month+ "월은 잘못된 월입니다");
		}
		
		else if(month % 2 == 1 ) {
			System.out.println(month+ "월의 마직막 일은 31일입니다");
		}
		
		else if(month == 2) {
			System.out.println(month+ "월의 마직막 일은 28일입니다");
		}
		
		else {
			System.out.println(month+ "월의 마직막 일은 30일입니다");
		}

		
		//<내가 푼거 2>
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(month + "월의 마지막 일은 31일입니다");
		}
		
		else if(month == 4 || month == 6  || month == 9 || month ==  11) {
			System.out.println(month+ "월의 마직막 일은 30일입니다");
		}
		
		else if(month == 2) {
			System.out.println(month+ "월의 마직막 일은 28일입니다");
		}
		
		else {
			System.out.println(month+ "월은 잘못된 월입니다");
		}
		
		
		//<선생님이 푼거> 31일인 달이 많으니까 else로
		if(month < 1 || month >12) {
			System.out.println(month + "월은 잘못된 월입니다");
		}
		
		else if(month == 4 || month == 6  || month == 9 || month ==  11) {
			System.out.println(month+ "월의 마직막 일은 30일입니다");
		}
		
		else if(month == 2) {
			System.out.println(month+ "월의 마직막 일은 28일입니다");
		}
		
		else {
			System.out.println(month+ "월의 마지막 일은 31일입니다");
		}
		
	}

	
 
}
