package day12;

public class Car {
	/*
	앞바퀴는 한국, 뒷바퀴는 금호이다
 		HankookTire backLeft, backRight;
		KumhoTire frontLeft, frontRight;
	만약 따로 지정하면 앞바퀴 고장으로 금호를 한국으로 바꿨다면
	직접 변경해줘야하지만 공통점인 tire로 묶어주면 편함?
	*/
	//<필드의 다형성>
	//필드	
	//private Tire backLeft, backRight, frontLeft, frontRight;
	//배열로도 만들 수 있음
	private Tire[] tire;
	
	//생성자
	public Car(Tire[] tire) {
		this.tire = tire;
	}
	//메소드: 타이어의 정보 출력
	/*
	public void print(){
		if(tire == null) {
			return;
		}
		for(Tire tmp : tire) {
			System.out.println(tmp.getPosition() + ", 압력 : " + tmp.getPressure() + ", 상태 : " + tmp.getState());
		}
	}
	*/
	//instanceof 사용해서 제조사도 함께 출력
	public void print(){
		if(tire == null) {
			return;
		}
		for(Tire tmp : tire) {
			if(tmp instanceof HankookTire) {
				System.out.println(((HankookTire) tmp).COMPANY + " : ");
			}else if(tmp instanceof KumhoTire) {
				System.out.println(((KumhoTire) tmp).COMPANY + " : ");
			}
			System.out.println(tmp.getPosition() + ", 압력 : " + tmp.getPressure() + ", 상태 : " + tmp.getState());
		}
	}
	
	//<매개변수의 다형성>
	//다형성을 이용안하는 경우 -> 회사별로 각각 메소드 만들어야 함
	//메소드: 타이어 수리
	public void repare(int index, Tire tire) {
		if(this.tire == null || this.tire.length <= index) {
			return;
		}
		this.tire[index] = tire;
	}
	
	
	
	
}
