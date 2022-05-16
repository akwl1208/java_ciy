package day15;

public class Ex10_Exception8_Throw1 {

	public static void main(String[] args) {
		// <throw>
		try {
			int num = 10;
			System.out.println("프로그램 시작");
			if(num % 2 == 0) {
				//객체 생성
				throw new ArithmeticException("예외"); //throw를 만나면 catch로 감
			}
			System.out.println("프로그램 동작");
		} catch (ArithmeticException e) {
			System.out.println("산술 예외 발생");
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
		System.out.println("프로그램 종료");
	}

}
