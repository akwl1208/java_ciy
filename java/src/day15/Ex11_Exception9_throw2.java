package day15;

public class Ex11_Exception9_throw2 {
	

	public static void main(String[] args) {		
		//<throws>
		try {
			throwException2();
		} catch (RuntimeException e) {
			System.out.println("런타임 예외");
		} catch (Exception e) {
			System.out.println("예외");
		}
				
	}
	
	public static void throwException() throws Exception{
		//예외(Exception)클래스는 런타입 예외 클래스의 부모 클래스임
		//자식 클래스가 아니기 때문에 런타임 예외 클래스가 아님
		//런타임 예외가 아니기 때문에 throws에 적어줘야함 
		throw new Exception();
	}
	
	public static void throwException2() {
		//런타임 예외이기 때문에 throw를 적어도 되고 안적어도 됨
		throw new RuntimeException();
	}
}

