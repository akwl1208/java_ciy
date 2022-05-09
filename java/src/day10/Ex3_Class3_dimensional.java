package day10;

public class Ex3_Class3_dimensional {

	public static void main(String[] args) {
		//<클래스 변수와 객체변수 구분>
		//에러 발생: print() 메소드는 객체 메소드이기 때문에 클래스 이름으로 호출 불가능
		//Point.print();
		Point p1 = new Point(10,20);
		p1.print();
		//printDimensional() 메소드는 클래스 메소드이기 때문에 클래스 이름으로 호출 가능
		Point.printDimensional();
		//클래스 메소드는 객체를 이용하여 호출할 수 있지만 경고가 뜬다
		p1.printDimensional();
		
		System.out.println(Math.random()); //객체: println, 클래스: random
	}

}

class Point{
	static String dimensional="이차원"; //클래스 변수
	int x, y; //객체 변수
	
	public Point(int x, int y) {
		this.x = x; 
		this.y = y;
	}

	public Point() {
		this(0,0);
	}

	public void print() { //객체변수가 있으므로 static 붙이면 안됨
		System.out.println("차원 : " + dimensional);
		System.out.println("좌표 : " + x + ", " + y);
	}
	
	public void move(int x, int y) { //객체변수가 있으므로 static 붙이면 안됨
		this.x = x;
		this.y = y;
	}
	
	public static void printDimensional() { //객체변수가 없으므로 static 붙임
		System.out.println("차원 : " + dimensional);
	}
}