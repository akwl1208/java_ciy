package day12;

public class Ex1_Inheritance1 {

	public static void main(String[] args) {
		//<상속> 
		//코드의 중복을 줄일 수 있음
		
		//객체 생성
		Child c = new Child();
		c.x = 10; //public
		c.y = 20; //protected
		//c.z = 30; //private ->  오류
		c.setZ(30);
	}

}
//<부모클래스>
class Parent{
	public int x;
	protected int y;
	private int z;
	
	//생성자
	public Parent(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
}

//자식 클래스
class Child extends Parent{
	private int s;
	public void print() {
		System.out.println(x); //public: 전부
		System.out.println(y); //protected: 자식 + 같은 패키지	
		//System.out.println(z); //private: 나 -> 에러 발생 -> z에 직접 접근할 수 없기 때문
		System.out.println(getZ());//부모 클래스에서 z의 getter, setter 생성 -> 오류 사라짐
		System.out.println(s); //private
	}
	//생성자
	public Child() {
		//this()생성자와 super()생성자는 같이 쓸 수 없음 -> this()에서 부모 생성자를 이미 호출했기 때문
		this(0,0,0,0);
		//super(); //부모클래스에 기본생성자가 없으면 자동 생성 -> 부모클래스에 생성자 만들면 오류남
		//super(0,0,0); //그래서 부모클래스에 생성자를 만들었을 때는 이렇게 해서 오류 해결 
		
	}
	//생성자
	public Child(int x, int y, int z, int s) {
		super(x, y, z);
		this.s = s;
	}
}