package day13;

public class Ex3_Object {

	public static void main(String[] args) {
		// <equals_Object>
		//오버라이딩 안했을 때
		A a1 = new A(1,2);
		A a2 = new A(1,2);
		
		if(a1 == a2) {
			System.out.println("공유 중입니다");
		}else {
			System.out.println("공유하고 있지 않습니다");
		} //공유하고 있지 않습니다
		
		if(a1.equals(a2)) {
			System.out.println("같은 필드를 가진 객체입니다");
		}else {
			System.out.println("다른 객체 입니다");
		} //다른 객체입니다 -> 오버라이딩 후, 같은 필드를 가진 객체입니다
	
		//<toString>
		System.out.println(a1.toString());	
		
		//=을 통해 객체를 저장하면 공유, a1과 a3이 같은 객체를 공유
		A a3 = a1;
		//a3dml num1의 값을 변경 -> a1의 num1의 num
		a3.setNum1(3);
		System.out.println("-------------");
		System.out.println(a3.toString());
		System.out.println(a1.toString());
		
		//<clone>
		//clone을 통해 객체를 복사하면 새로운 객체를 생성한 후 필드를 복사하여 객체를 반환
		a3 = (A)a1.clone();
		//a3의 num1의 값을 변경 => a1의 num1의 값이 변경되지 않음
		a3.setNum1(5);
		System.out.println("-----------");
		System.out.println(a3.toString());
		System.out.println(a1.toString());
	}
}

class A implements Cloneable{
	//필드
	private int num1;
	private int num2;
	
	//생성자
	public A(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	//equals 오버라이딩
	/*
	@Override
	public boolean equals(Object obj) {
		//두 객체의 주소가 같은지 확인 -> 두 객체가 같은 객체를 공유하는지 확인
		if(this == obj) {
			return true;
		}
		//상대 객체가 없으면 비교 불가능
		if(obj == null) {
			return false;
		}
		//obj가 A로 타입변환이 불가능하면 비교할 수 없음 -> 자식도 아니고 완전 남..
		if(!(obj instanceof A)) {
			return false;
		}
		A object = (A)obj;
		//변수값 비교
		if(num1 != object.num1) {
			return false;
		}
		if(num2 != object.num2) {
			return false;
		}
		return true;
	}
	*/
	//우클릭 -> source -> generate hashcode and equals...
	@Override
	public int hashCode() {
		//2의 n제곱 - 1 중 가장 가까운 소수 = 31
		final int prime = 31;
		int result = 1;
		//num1 =1, num2 = 2
		result = prime * result + num1; //31*1 + 1 = 32
		result = prime * result + num2; //31*32 + 2 = 994
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (num1 != other.num1)
			return false;
		if (num2 != other.num2)
			return false;
		return true;
	}
	
	//toString 오버라이드
	//우클릭 -> source -> generate toString..
	@Override
	public String toString() {
		return "A [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
		
	}
	
	//클론 -> 클래스명 옆에 implements cloneable 붙여야함
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	

}
