package day11;

public class Ex1_Class1_initialization {

	public static void main(String[] args) {
		// <멤버변수 초기화 순서>
		Test t = new Test(4); //num4 초기화값 = 4
		/* <객체멤버> 결과값
		 1. 타입의 기본값으로 초기화 = 0
		 2. 명시적 초기화 = 2 
		 3. 초기화 블록을 이용한 초기화 = 3
		 4. 생성자를 이용한 초기화 = 4
		 */
		t.print(); 
		
		System.out.println("-----------------------"); //구분선
		
		/* <클래스멤버> 결과값
		 1. 타입의 기본값으로 초기화 = 0
		 2. 명시적 초기화 = 2 
		 3. 초기화 블록을 이용한 초기화 = 3
		 */
		Test2.print();

	}

}

class Test{
	//<객체멤버>
	//1. 타입의 기본값으로 초기화
	int num1;
	
	//2. 명시적 초기화
	int num2 = 2;
	
	int num3 = -1;
	//3. 초기화 블록을 이용한 초기화
	{
		num3 = 3;
	}
	
	int num4 = -1;
	//메소드
	void print() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
	//4. 생성자를 이용한 초기화
	public Test(int num4) {
		this.num4 = num4;
	}
}

class Test2{
	//클래스멤버
	//1. 타입의 기본값에 의한 초기화
	static int num1;
	//2. 명시적 초기화
	static int num2 = 2;
	
	static int num3 = -1;
	//3. 초기화 블록에 의한 초기화
	static {
		num3 = 3;
	}
	//메소드
	public static void print() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}