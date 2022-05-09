package day10;

public class Ex2_Class2_Point {

	public static void main(String[] args) {
		// <this>
	}

}

class Point1{
	int x, y;
	
	public Point1(int x, int y) {
		//내 멤버변수(필드)에 매개변수 x,y를 저장
		//우선순위가 매개변수
		//x = x; //의미없는 코드 -> 매개변수에 매개변수 저장
		//y = y;
		//그래서 멤버변수와 매개변수의 이름이 같을 때 구분해주기 위해 this 사용
		this.x = x; 
		this.y = y;
	}
	//this() 설명: 이것이자바다 p.212
	public Point1() {
		this(0,0); //다른 생성자에서 첫줄에 사용해야함 -> 아니면 오류남
	}
}