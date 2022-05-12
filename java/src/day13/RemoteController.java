package day13;

public class RemoteController implements Controller {
	//<인터페이스 구현클래스>
	
	private boolean power;
	
	@Override
	public void run() {
		power = true;
	}

	@Override
	public void stop() {
		power = false;
	}

	public void print() {
		if(power) {
			System.out.println("실행중입니다");
		}else {
			System.out.println("정지중입니다");
		}
	}
}
