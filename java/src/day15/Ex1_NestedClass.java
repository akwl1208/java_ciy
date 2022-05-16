package day15;

public class Ex1_NestedClass {

	public static void main(String[] args) {
		// <중첩 클래스>
		// 중첩 클래스는 public 접근제한자 불가능 -> 파일명이랑 같아야함
		
		//static 설명
		//A.num = 10; //오류 -> 인스턴트 변수라 클래슬르 통해 호출할 수 없음
		A.num2 =10; 
		
		//A 객체 생성 -> A 생성자 호출
		A a = new A();
		//B생성자는 A 객체를 생성해야 만들 수 있다
		A.B b = a.new B(); //B 생성자 호출
		//C생성자는 A 객체를 생성하지 않고 바로 출력 가능 -> static
		A.C c = new A.C(); //C 생성자 호출
		//메소드를 통해 D 생성자 호출
		a.method(1);
	}

}

class A{
	public int num;
	public static int num2;
	
	B b1;
	C c1;
	//인스턴트 멤버 클래스는 static 사용 불가능
	//static B b2 = new B(); //오류 -> A 객체가 없음
	static C c2 = new C();
	
	//인스턴드(객체) 멤버 클래스
	class B{
		int num = 2;
		public B() {
			System.out.println("B생성자");
			System.out.println(this.num); //B객체의 num 호출
			System.out.println(A.this.num); //바깥클래스 A 객체의 num 호출 -> 변수의 이름이 같을 때
		}
	}
	
	//정적(클래스) 멤버 클래스
	static class C{
		public C() {
			System.out.println("C생성자");
		}
	}
	
	public void method(int num) {//매개변수
		char ch = 'a'; //지역 변수
		//로컬 클래스
		//로컬 클래스에서 메소드의 매개변수와 지역변수에 사용할 수 있으나 자동으로 final이 붙음
		//-> 매개변수와 지역변수는 로컬클래스에서 수정할 수 없음
		//처음부터 붙는게 아니라 로컬에서 호출할 때 final이 붙음
		class D {
			public D() { 
				System.out.println("D생성자");			
				//ch = 'b'; //오류 -> 수정 불가
				//num = 2; //오류 -> 수정 불가
			}
		}
		D d = new D();
		ch = 'c'; //사용 가능 -> 로컬 클래스 밖..
	}
	
	public A() {
		System.out.println("A생성자");
	}
}