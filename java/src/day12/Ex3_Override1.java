package day12;

public class Ex3_Override1 {

	public static void main(String[] args) {
		//<오버라이드>
		Animal a = new Animal();
		a.bark(); //짖다
		Dog d = new Dog();
		d.bark(); //멍멍
		Cat c = new Cat();
		c.bark(); //야옹
	}
}
class Animal{
	public void bark() {
		System.out.println("짖다");
	}
}

class Dog extends Animal{
	//어노테이션 -> 특정 역할이 있는 것
	//오버라이드할 때 사용해주는 것이 좋음
	
	@Override // 문법 체크 ex)변수를 추가하면 에러 발생
	public void bark() {
		System.out.println("-------------");
		//super.메소드()는 첫번째가 아니어도 됨
		super.bark(); //부모클래스에 있는 bark 먼저 하고 새로운 기능 추가
		System.out.println("멍멍");
		System.out.println("-------------");
	}
}

class Cat extends Animal{
	public void bark() {
		//부모클래스의 메소드를 사용하지 않고 재정의
		System.out.println("야옹");
	}
}