package day11;

import day11_1.*;

public class Ex4_Class4_AccessModifier {

	public static void main(String[] args) {
		//<접근제한자>
		//예제)Ex4_A에서 값을 가져옴
		Ex4_A t1 = new Ex4_A();
		//public은 모두 사용 가능
		System.out.println(t1.num1);
		//default는 같은 패키지내에서 사용 가능
		System.out.println(t1.num2);
		//private는 내 클래스에서만 사용 가능
		//System.out.println(t1.num3); //에러 발생
		
		//예제)Ex4_B에서 값을 가져옴
		//import 작성 전에는 오류나지만 import 작성하면 오류 사라짐
		Ex4_B t2 = new Ex4_B(); 
		//public은 모두 사용 가능
		System.out.println(t2.num1);
		//default는 같은 패키지내에서 사용 가능
		//System.out.println(t2.num2); //오류 발생 -> 다른 패키지에 있는 클래스이므로..
		//private는 내 클래스에서만 사용 가능
		//System.out.println(t2.num3); //에러 발생
		
		//지역변수에는 접근제한자를 붙일 수 없다
		//public int num = 2;	
	}
	//클래스, 필드, 메소드에만 변수에 접근제한자 붙일 수 있다
	public int num = 1;
}
