package day12;

public class Ex5_Polymorphism {

	public static void main(String[] args) {
		//<다형성>
		/*
		//타이어 4개 만듬
		HankookTire t1 = new HankookTire(100, 90);
		HankookTire t2 = new HankookTire(90, 90);
		KumhoTire t3 = new KumhoTire(100, 100);
		KumhoTire t4 = new KumhoTire(100, 100);
				
		//자동차
		Car car1 = new Car(t1, t2, t3, t4);
		Car car2 = new Car(t3, t4, t1, t2); //바퀴를 바꿔 써도 상관없음
		*/
		
		//<필드의 다형성>
		//배열로 표현
		Tire tire[] = new Tire[4];
		tire[0] = new HankookTire(100, 100, "앞왼쪽");
		tire[1] = new HankookTire(100, 100, "앞오른쪽");
		tire[2] = new HankookTire(100, 100, "뒤왼쪽");
		tire[3] = new HankookTire(100, 100, "뒤오른쪽");
		Car car1 = new Car(tire);
		car1.print();
		System.out.println("------------------------");
		
		//다른 방식으로 배열 표현
		Tire tire2[] = {
				new HankookTire(90, 100, "앞왼쪽"),
				new HankookTire(90, 100, "앞오른쪽"),
				new HankookTire(90, 100, "뒤왼쪽"),
				new HankookTire(90, 100, "뒤오른쪽")
		};
		Car car2 = new Car(tire2);
		car2.print();
		System.out.println("---------------------");
		
		//<매개변수의 다형성>
		//바퀴 교체
		car2.repare(3, new HankookTire(80, 70, "뒤오른쪽"));
		car2.print();
		System.out.println("---------------------");
		car2.repare(3, new KumhoTire(80, 100, "뒤오른쪽"));
		car2.print();

	}

}
