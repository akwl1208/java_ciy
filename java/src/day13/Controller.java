package day13;

public interface Controller {
	//<인터페이스>
	//public static final이 앞에 자동으로 붙어 생략되어 있음 -> 상수
	//int num; //오류 -> 초기값을 설정하지 않아서
	int MIN = 1;
	public void run(); 
	void stop(); //public을 생략해줘도 됨 public abstract가 앞에 자동으로 붙음
	void print();
	//default는 구현클래스에서 사용하지 않아도 오류 안남
	default void test() {
		System.out.println("테스트입니다");
	}
}
