package day12;

public class HankookTire extends Tire{
	public final static String COMPANY = "한국타이어";
	//생성자
	public HankookTire(int state, int pressure, String position) {
		super(state, pressure, position);
	}
	//기본 생성자
	public HankookTire() {
		//super(); //생략되어 잇음 -> 써도 되고 안써도 됨
	}
}
