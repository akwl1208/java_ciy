package day15;

public class Ex7_Exception5_TryCatchFinally {

	public static void main(String[] args) {
		// <예외처리: TryCatchFinally>
		int num1 = 1, num2 = 0;
		int res = 0;
		
		/* 1)
		 * 예외가 발생했을 때 예외 처리를 안하면 프로그램이 중단되지만
			예외처리를 하면 프로그램이 중단되지 않고 예외처리한 후, 이어서 시작
		 * 예외가 발생하면 밑의 코드 유무의 상관없이 예외를 처리할 수 있는 catch로 이동해서 예외처리
		 */
		try {
			//예외 발생 가능 코드
			res = num1 % num2;
			System.out.println(res);
		}catch (ArithmeticException e) {
			//예외 처리
			System.out.println("0으로 나눌 수 없습니다");
		}
		
		//trycatch 밖에 예외 발생 가능코드를 작성하면 예외 발생으로 
		//프로그램이 중단되어 프로그램 종료가 출력 안됨
		//trycatch를 하면 예외 처리되어 프로그램 종료 출력
		System.out.println("프로그램 종료");
		System.out.println("========================");
		
		
		/* 2)
		 * ArrayIndexOutOfBoundsException를 입력하면
		   다른 예외라서 처리할 수 없어 프로그램 중단..
		   (예외를 처리할 수 있는 catch가 없는 경우 처리할 수 없어서 프로그램 중단)
		 */
		try {
			//예외 발생 가능 코드
			res = num1 % num2;
			System.out.println(res);
		}catch (ArrayIndexOutOfBoundsException e) {
			//예외 처리
			System.out.println("0으로 나눌 수 없습니다");
		}
		System.out.println("========================");
		
		
		/* 3)
		 * catch는 여러 개(1개 이상) 붙일 수 있다
		 * Exception을 사용하는 경우 무조건 마지막 catch에 배치
		 * */
		try {
			//예외 발생 가능 코드
			res = num1 % num2;
			System.out.println(res);
		}catch (Exception e) {
			System.out.println("예외 발생");
		}
		//위의 Exception e때문에 ArithmeticException까지 올 일이 절대 없기 때문
		//catch (ArithmeticException e) {} //오류 발생
		System.out.println("========================");
		
		
		/* 4)
		 * RuntimeExceptiond을 ArrayIndexOutOfBoundsException 위에 추가하면 오류 발생
		 * ArrayIndexOutOfBoundsException가 발생해도 RuntimeExceptiond에 걸리기 때문에
		 * ArrayIndexOutOfBoundsException이 올 일이 없기 때문
		 */	
		try {
			//예외 발생 가능 코드
			res = num1 % num2;
			System.out.println(res);
		}
		//catch (RuntimeException e) {}
		catch (ArrayIndexOutOfBoundsException e) {
			//예외 처리
			System.out.println("0으로 나눌 수 없습니다");
		}
		System.out.println("========================");
		
		
		/* 5)
		 * 예외처리 후 메소드가 종료되어도 무조건 finally는 실행된다
		 */
		try {
			//예외 발생 가능 코드
			res = num1 % num2;
			System.out.println(res);
		}catch (ArrayIndexOutOfBoundsException e) {
			//예외 처리
			System.out.println("0으로 나눌 수 없습니다");
		}catch (Exception e) {
			System.out.println("예외 발생");
		}finally {
			System.out.println("finally입니다");
		}
	}

}
