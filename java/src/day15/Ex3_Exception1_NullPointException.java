package day15;

public class Ex3_Exception1_NullPointException {

	public static void main(String[] args) {
		// <NullPointException>
		//예외 발생 X
		String str1 = "abc";
		System.out.println(str1.charAt(0));
		//예외 발생
		String str2 = null;
		//System.out.println(str2.charAt(0)); //경고 표시, 예외 발생
		
		//예외가 자주 발생하는 경우 1: 메소드를 호출하는 경우
		//메소드에서 null 처리를 안하면 발생할 수 있음
		//charAt(str2, 0); //경고 표시 X, 예외 발생
		
		//예외가 자주 발생하는 경우 2: 클래스를 이용하여 배열을 만드는 경우
		//각 값에 객체를 생성 후 기능 또는 멤버 변수를 호출해야 하는데 객체 생성을 잊고서 기능을 호출
		String arr[] = new String[10];
		for(String tmp : arr) {
			System.out.println(tmp.charAt(0));
		}
		
		
	}
	
	public static void charAt(String str, int index) {
		System.out.println(str.charAt(index));
	}

}
