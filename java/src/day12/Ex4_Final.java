package day12;

public class Ex4_Final {

	public static void main(String[] args) {
		//<파이널 클래스와 파이널 메소드>
		FinalTest ft = new FinalTest();
		ft.print(); //30
	}

}
//String은 final 클래스임 -> 상속 불가능 -> 자속클래스 못만듬
//class KoreanString extends String{}

class FinalTest{
	private final int max = 30;
	public final void print() {
		//max = 20; //오류 -> max에 final이 붙어 있어 수정 불가
		System.out.println(max);
	}
}

class FinalTestChild extends FinalTest{
	//print()를 오버라이드 불가 -> 부모클래스의 print()에 final이 붙어서
	//public final void print() {} //오류 발생
}