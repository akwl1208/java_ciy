package day2;

public class Ex8_BitlLogic {

	public static void main(String[] args) {
		/*<비트논리연산자>
		 * 양쪽에 값(변수)가 온다
		 * 양쪽에 있는 값을 비트로 나열한 후 논리 연산을 함
		 * 1을 참으로 생각하고 0을 거짓으로 생각
		 */
		
		/* 예제) 비트논리 예제 확인하기 
		 * 3:    00000011
		 * 10:   00001010
		 * 3&10: 00000010 -> 2
		 * 3|10: 00001011 -> 11
		 * 3^10: 00001001 -> 9
		 * ~3:   11111100 -> -4          
		 */
	
		byte num1 = 3;
		byte num2 = 10;
		System.out.println(num1 & num2); //2
		System.out.println(num1 | num2); //11
		System.out.println(num1 ^ num2); //9
		System.out.println(~num1); //-4
	}

}
