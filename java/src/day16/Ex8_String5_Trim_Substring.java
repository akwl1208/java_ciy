package day16;

public class Ex8_String5_Trim_Substring {

	public static void main(String[] args) {
		// <String_Trim_Substring>
		String str = "\t\t\n\nabcdefg\n\n";
		System.out.println(str);
		System.out.println("------------------");
		
		//trim: 공백 제거
		str = str.trim();
		System.out.println(str);
		System.out.println("------------------");
		
		//substring: 부분 문자열 추출
		str = str.substring(1); //1번지부터 끝까지 부분 분자열 리턴
		System.out.println(str);
		str = str.substring(1,3); //1번지부터 3번지 전까지(2번지까지)
		System.out.println(str);
	}

}
