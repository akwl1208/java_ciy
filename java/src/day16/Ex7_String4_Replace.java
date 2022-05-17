package day16;

public class Ex7_String4_Replace {

	public static void main(String[] args) {
		//<String: Replace>
		String str = "I love C";
		System.out.println(str);
		str = str.replace("C", "JAVA");
		System.out.println(str);
		
		str = str + ". JAVA is programing language";
		System.out.println(str);
		str = str.replace("JAVA", "C");
		System.out.println(str);
	}

}
