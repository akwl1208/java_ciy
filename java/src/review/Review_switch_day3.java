package review;

public class Review_switch_day3 {

	public static void main(String[] args) {
		// 예제1) 홀수 짝수 판별하는 switch문 만들기
		// 짝수이면 짝수 출력
		// 홀수이면 홀수 출력
		
		int num = 3;
		
		switch(num % 2) {
		case 0:
			System.out.println("짝수");
			break;
			
		case 1:
			System.out.println("홀수");
			break;
		}

		
		
		/* 예제2) 월이 주어졌을 때 주어진 월의 마지막일을 출력하는 코드를 작성하시오(switch문)
		 * 31 : 1 3 5 7 8 10 12 -> ㅇㅇ월의 마지막 일은 31일 입니다 출력
		 * 30 : 4 6 9 11        -> ㅇㅇ월의 마지막 일은 30일 입니다 출력
		 * 28 : 2               -> ㅇㅇ월의 마지막 일은 28일 입니다 출력
		 * 이외는 ㅇㅇ월은 없는 달입니다 출력
		 */
		
		int month = 13;
		
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println(month + "월의 마지막 일은 31일 입니다");
		    break;
		    
		case 4, 6, 9, 11 :
			System.out.println(month + "월의 마지막 일은 30일 입니다");
	    	break;
	    	
		case 2 :
			System.out.println(month + "월의 마지막 일은 28일 입니다");
	    	break;	
	    
		default:
		System.out.println(month + "월은 없는 달입니다");
			
		}
	}

}
