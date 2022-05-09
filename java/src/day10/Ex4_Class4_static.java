package day10;

public class Ex4_Class4_static {

	public static void main(String[] args) {
		//<클래스변수와 객체변수 구분>
		//생성시점이 다름
		//Test1.printY(); //y 만들어짐, x는 안만들어짐
		Test1 t1 = new Test1();
		t1.printX(); //x는 호출해야 만들어짐
		Test1 t2 = new Test1();
		Test1.printCount(); //2
		
		/*sum에서 static이 없으면 오류 발생
		 * 같은 클래스 내에서 클래스 메소드에는 객체 메소드/변수를 사용 불가
			-> 클래스 메소드에 객체를 생성 후 객체 메소드
		 * 객체 메소드에는 클래스 메소드/변수 사용 가능 
		 */
		/* sum은 객체 메소드이기 때문에 클래스 메소드인 main에서 호출하려면
			클래스 메소드에 객체를 생성 후 객체를 통해 호출해야 함
		*/
		Ex4_Class4_static ex4 = new Ex4_Class4_static();
		System.out.println(ex4.sum(1,2));
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
}
class Test1{
	int x; //객체 변수
	static int count; //클래스 변수 -> Test1 클래스로 만들어진 객체의 수

	void printX() {
		System.out.println(x);
	}
	static void printCount() {
		System.out.println(count);
		///같은 클래스 내에서 클래스 메소드에는 객체 메소드/변수를 사용 불가
		//System.out.println(x);  //오류
	}
	public Test1() {
		count++;
	}
}