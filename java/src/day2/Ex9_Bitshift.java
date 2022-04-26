package day2;

public class Ex9_Bitshift {

	public static void main(String[] args) {
		/*<비트 이동 연산자>
		 * A<<B : A를 2의 B제곱만큼 곱한 결과값
		 * A>>B : A를 2의 B제곱만큼 나눈 결과의 몫
		 */

		byte num1 = 3;
		int num2 = -4;
		System.out.println(num1<<2);
		System.out.println(num1>>1);
		System.out.println(num2>>1);
		System.out.println((num2>>>1));
	}

}
