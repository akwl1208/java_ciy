package day16;

public class Ex4_String1_Constructor {

	public static void main(String[] args) {
		// <String>
		/* 문자열을 리터럴 문자열로 초기화하면 
		   같은 리터럴 문자열로 초기화한 다른 문자열과 공유
		 * 생성자를 이용하면 같은 내용의 문자열이더라도 다른 주소에 할당
		 */
		String str1 = "abc";
		String str2 = new String("abc"); //생성자를 통해서 만듬
		String str3 = "abc";
		
		//str1과 str2는 다른 주소
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 주소");
		} else {
			System.out.println("str1과 str2는 다른 주소");
		}
		
		//str1과 st3는 같은 주소
		if(str1 == str3) {
			System.out.println("str1과 str2는 같은 주소");
		} else {
			System.out.println("str1과 str2는 다른 주소");
		}
	}

}
