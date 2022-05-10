package day11;

public class Ex3_Class3_FinalField {

	public static void main(String[] args) {
		//<파이널 필드>
		//Math.PI에 파이널이 설정되어 있는 것을 확인했다.
		//ctrl 누르고 마우스를 math에 가져다대면 2번째꺼..
		System.out.println(Math.PI);
		
		//상수
		System.out.println(Integer.MAX_VALUE);
	}

}

class Tv{
	//필드
	private final static int MIN_CHANNEL = 1; //상수처럼 활용 -> 상수는 아님
	private int channel;
	
	//메소드
	public void print() {
		System.out.println("최소 채널 : " + MIN_CHANNEL);
		System.out.println("현재 채널 : " + channel);
	}
	
	//생성자
	public Tv(int channel) {
		this.channel = channel;
		//에러 발생 -> final이 붙은 변수 수정 -> final은 도중에 변수 수정 불가
		//minChannel = 2;
	}
	
	//변수 선언에 따른 글씨체 차이
	int a;
	static int b;
	final static int c = 1;
}