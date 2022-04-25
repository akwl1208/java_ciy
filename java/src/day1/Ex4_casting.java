package day1;

public class Ex4_casting {

	public static void main(String[] args) {
		/* 
		 <타입 변환>
		 1. 자동 타입 변환
		 - 작은 타입의 값은 큰 타입에 저장하는 경우
		 2. 강체 타입 변환: 값이나 변수 앞에 (타임명)을 써줌
		 - 큰 타입의 값을 작은 타입에 저장하는 경우(자동 타입 변환이 불가능한 경우)
		 - 계산을 위해 특정값을 일시적으로 변환하는 경우(나누기 연산자(/)ㅅ 설명할 때 다시 언급)
		 */
		
		//예제) 자동 타입 변환
		byte num1_1 = 1;
		int num1_2 = num1_1;
		double num1_3 = num1_2; //정수를 실수로 표현
		
		//예제) 강제 타입 변환
		int num2_1 = 1;
		byte num2_2 = (byte)num2_1;
		num2_1 = (int)1.23; //실수를 정수에 넣는 경우 
		
		//예제) 강제 타입 변환에서 계산을 위해 특정값을 일시적으로 변환하는 경우
		double num3_1 = 1/2; //0.5가 아니라 0.0
		double num3_2 = (double)1/2; // 0.5
		System.out.println(num3_1);
		System.out.println(num3_2);
		
		//예제) 자동 타임변환에서 연산 과정
		int num4_1 = 1;
		double num4_2 = 1.23;
		//num4_1과 더하는 값이 실수이기 때문에 num4_1을 실수로 자동 타임변환한 후 실수+실수로 계산하여 num4_3에 저장
		//더할 때 자동 타입 변환
		double num4_3 = num4_1 + num4_2; 
	    //num4_1과 더하는 값이 정수이기 때문에 정수+정수를 한 후 더한 값을 실수로 자동 타입변환을 하여 num4_3에 저장
		//더한 후 저장하기 전에 타입 변환
		double num4_4 = num4_1 + 5;
		System.out.println(num4_3); //2.23
		System.out.println(num4_4); //6.0
		
		//예제)정수를 실수로 자동변환할 때 정밀도가 떨어질 수 있다/int->float(이것이 자바다 p.57)
		//int -> float로 타입 변환하기 보다는 double로 타입 변환하여 활용
		int num5_1 = 1234567890;
		float num5_2 = num5_1; //자동 타입 변환
		int num5_3 = (int)num5_2; //강제 타입 변환
		//변환되는 과정에서 정확도 떨어짐
		System.out.println(num5_1); //1234567890
		System.out.println(num5_2); //1.234567804E9
		System.out.println(num5_3); //1234567936
	}

}
