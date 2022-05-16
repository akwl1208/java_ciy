package day15;

public class Ex2_Anonymous {

	public static void main(String[] args) {
		// <익명 객체>
		//TestA 객체 생성
		Test test = new TestA();
		test.test();
		
		//익명 객체 -> 구현 클래스 생성없이 이름 없는 클래스를 바로 만들어서 객체 생성
		Test test2 = new Test() {
			@Override
			public void test() {
				System.out.println("테스트");
			}
		};
		test2.test();
	}

}

interface Test {
	void test();
}

//정석적인 방법 -> 구현클래스 생성
class TestA implements Test{
	@Override
	public void test() {
		System.out.println("테스트");
	}
}