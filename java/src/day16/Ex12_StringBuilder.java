package day16;

public class Ex12_StringBuilder {

	public static void main(String[] args) {
		//<StringBuilder>
		StringBuilder sb1 = new StringBuilder(); //빈 문자열
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Hello World");
		System.out.println(sb2);

		//마지막에 ! 추가
		sb2.append("!");
		System.out.println(sb2);
		
		//0번지에 hi 추가
		sb2.insert(0, "Hi. "); 
		System.out.println(sb2);
		
		//insert를 이용하여 append 기능 구현
		sb2.insert(sb2.length(), "??"); 
		System.out.println(sb2);
		
		//0번지부터 2번지전까지 삭제
		sb2.delete(0, 2); 
		System.out.println(sb2);
		
		//0번지에 추가. replace를 이용하여 insert 기능 구현
		sb2.replace(0, 0, "Hello"); 
		System.out.println(sb2);
		
		//문자열을 거꾸로...
		System.out.println(sb2.reverse());
	}

}
