package day12;

public class Ex6_Abstract {

	public static void main(String[] args) {
		// <추상 클래스>
		//추상클래스를 이용해서 객체를 만들 수 없음
		//Ex6_Animal animal = new Ex6_Animal(); //오류
		
		//추상클래스를 상속받은 일반 클래스는 호출 가능
		Ex6_Dog dog = new Ex6_Dog();
		dog.bark();
		//자식클래스를 통해 객체 생성가능
		Ex6_Animal animal = new Ex6_Dog();
		animal.bark();
	}	
}
//추상클래스는 추상 메소드와 일반 메소드 모두 존재 가능
//추상 메소드에는 필드가 있을 수 있음
abstract class Ex6_Animal{
	public String type; //~목
	public abstract void bark();
	public void print() {
		System.out.println("동물입니다");
	}
}
//추상클래스를 상속받은 일반 클래스는 반드는 추상메소드를 오버라이딩해야한다.
class Ex6_Dog extends Ex6_Animal{
	//오류 발생 -> 오버라이드하면 사라짐...
	//오류 발생한 곳에 마우스 가져다 되면 
	@Override
	public void bark() {
		System.out.println("멍멍");
	} 
	
}
