package day8;

public class Ex5_Class1 {

	public static void main(String[] args) {
		// 객체 생성
		Point1 p1 = new Point1();
		p1.print(); //0, 0 
		
		//public과 private 비교
		p1.x1 = 20; //접근 제한자가 public
		//p1.x2 = 20; //에러 발생 -> 접근제한자가 private으로 되어 접근 불가 -> 다른 클래스
	
		p1.x = 20;
		p1.print(); //20, 0 -> 바뀐 좌표로 출력
	}

}
//class 앞에 public은 함부로 못씀 -> 클래스 이름과 파일이름이 같은 경우에만 사용 가능
//좌표평면(2차원 화면)에서 두 점을 나타내는 클래스
class Point1{
	/*멤버변수 : 좌표평면에서 점을 나타내기 위해 필요한 정보
	          ->  클래스 내 메소드에서 사용 
	* 멤버변수는 초기화하지 않아도 각 타입의 기본값으로 자동으로 초기화됨
	* 대부분의 멤버변수는 private으로 하는게 좋다
	 	-> 멤버변수 값을 바꾸려면 기능(메소드)를 통해 변경하는 것이 좋다
	 */
	//x좌표, y좌표
	int x, y;
	
	//public과 private 비교
	public int x1, y1;
	private int x2, y2;
	
	//메소드 : 기능
	// 대부분의 메소드는 public으로 하는게 좋다
	/* 기능: 현재 좌표 출력하는 기능
	 * 매개변수: 현재 좌표 -> int x, int y 라고 생각했으나 매개변수 없음
	 			-> 내 정보이기 때문에 남이 알려줄 필요 없음
	 * 리턴타입: void
	 * 메소드명 : print
	 */
	public void print() {
		System.out.println(x + ", " + y);
		//접근제한자 살펴보기 위해
		x1 = 20;
		x2 = 20; //에러 안뜸 -> 같은 클래스 안
	}
	
}
