package day2;

public class EX4_string {

	public static void main(String[] args) {
		String str ="Hello"; //String은 앞글자 대문자로
		
		//문자열 + 문자열 = 문자열
		str = str + " world";
		System.out.println(str); //Hello world
		
		//문자열 + 문자 = 문자열
		str = str + '!';
		System.out.println(str); //Hello world!
		
		//문자열 + 정수 = 문자열
		str = str + 123;
		System.out.println(str); //Hello world!123
		
		//문자열 + 실수 = 문자열
		str = str + 3.45;
		System.out.println(str); //Hello world!1233.45
		
		//문자열 + 논리형 = 문자열
		str = str + true;
		System.out.println(str); //Hello world!1233.45true
		
	}

}
