package day2;

public class Ex3_arithmetic {

	public static void main(String[] args) {
		/* <산술연산자 주의사항1>: 나누기할 때 소수점 사라지는 현상 조심
		 * 정수 연산자 정수 => 정수
		  ex) 5 + 2 = 7
		      5 - 2 = 3
		      5 * 2 = 10
		      5 % 2 = 1
		      5 / 2 = 2 (2.5가 아니라 정수 2로 반환되서 나누기에선 문제가 됨)
		 * 정수 연산자 실수 => 실수
		 * 실수 연산자 실수 => 실수
		 * 결과값이 어떤 수로 반환
		 */
		
		//예제) 정수 연산자 정수는 정수로 반환되는지 확인
		System.out.println(5+2);
		System.out.println(5-2);
		System.out.println(5*2);
		System.out.println(5%2);
		System.out.println(5/2); //2
		
		//나누기할 때 실수로..
		System.out.println(5/2.0);  //2.5
		System.out.println(5/(double)2);  //2.5
		
		
		//<산술연산자 주의사항2>: 0으로 나누는 경우 예외가 발생할 수 있다
		// '정수 / 0' 과 '정수 % 0'인 경우
		System.out.println(5 / 0.0); //infinity
		System.out.println(5 % 0); //예외 발생
		System.out.println(5 / 0); //예외 발생
		System.out.println("프로그램 종료"); 
		
		
	}

}
