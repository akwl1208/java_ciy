package day13;

public class Ex1_Interface1 {

	public static void main(String[] args) {
		// <인터페이스>
		//인터페이스로 객체 생성 불가
		//Controller con = new Controller(); //오류 발생
		
		//RemoteController rc = new RemoteController();
		Controller rc = new RemoteController(); 
		//오류-> print()때문에..interface가 가지고 있지 않는 기능을 사용하는 경우
		//->인터페이스에 print를 추가하면 오류 안님
		rc.print();
		rc.run();
		rc.print();
		rc.stop();
		rc.print();

		//<익명 구현 객체> 익명 클래스를 이용하여 객체 생성
		//인터페이스를 이용하여 같은 종류의 객체를 1개만 만들면 되는 경우
		//재사용할 필요없는 경우
		Controller rc2 = new Controller() {
			
			@Override
			public void stop() {
				System.out.println("중지");	
			}
			
			@Override
			public void run() {
				System.out.println("시작");	
			}
			
			@Override
			public void print() {
				System.out.println("출력");
			}
		};
		rc2.print();
		rc2.run();
		rc2.print();
		rc2.stop();
		rc2.print();
	}

}
