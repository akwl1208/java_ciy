package day13;

public class PlayerController implements Controller, Player {
	//<다중 인터페이스 구현 클래스>
	//여러 인터페이스를 구현한 구현 클래스를 만들 수 있음
	@Override
	public void next() {
	}

	@Override
	public void prev() {
	}
	//Controller와 Player 둘다 run()이 있는데 충돌이 안 일어난 이유
	//구현된 부분이 없기 때문에 두 인터페이스를 불러도 충돌없음
	@Override
	public void run() {
	}

	@Override
	public void stop() {
	}

	@Override
	public void print() {
	}

}
