package day13;

public class Ex2_Polymorphism {

	public static void main(String[] args) {
		//<인터페이스에서 필드의 다형성>
		Controller controller[] = new Controller[3];
		controller[0] = new TvController();
		controller[1] = new RadioController();
		controller[2] = new TvController();
				
		controller[1].run();
		for(int i = 0; i < 900; i++) {
			if(controller[1] instanceof RadioController) {
				RadioController tmp = (RadioController)controller[1];
				tmp.frequencyUp();
			}
			if(controller[1] instanceof TvController) {
				TvController tmp = (TvController)controller[1];
				tmp.channelUp();
			}
		}
		//controller[1].print();
		//<인터페이스에서 매개 변수의 다형성>
		System.out.println("----------------------------");
		for(Controller tmp : controller) {
			printController(tmp);
			System.out.println("----------------------------");
		}
	}
	
	//<인터페이스에서 매개 변수의 다형성>
	//매개변수가 인터페이스이면 호출할 때 인터페이스를 구현한 구현 객체가 와야함
	//오버로딩을 줄이기 위해서...
	public static void printController(Controller con) {
		con.print();
	}
	/* 원래는 이렇게 각각 메소드를 만들어줘야 함
	public static void printController(TvController con) {
		con.print();
	}
	public static void printController(RadioController con) {
		con.print();
	}
	 */
}
