package day12;

public class Ex2_Inheritance2 {

	public static void main(String[] args) {
		// <상속>
		//클래스에서 자식 클래스는 부모클래스 하나만
		//하지만 인터페이스에서는 부모 여러개 가능
		//C c = new C();
		//c.print(); 

	}
}

class A{
	public void print() {
		System.out.println("Hello");
	}
}

class B{
	public void print() {
		System.out.println("Hi");
	}
}
/* 클래스 C는 클래스 A와 클래스 B는 동시 상속받을 수 없음
 * 동시 상속이 가능하면 클래스 C를 이용하여 생성한 객체에 print()를 호출했을 때
 * A의 print()인지 B의 print()인지 알 수 없음
class C extends A, B{}
*/