package day4;

public class Ex7_Overflow {

	public static void main(String[] args) {
		// <Overflow/Underflow> 정수에서 표현번위를 넘어가는 경우 발생
		
		byte num = 127;
		/* byte로 표현 가능한 가장 큰 정수 127에 1을 더하면 128이 아닌 -128로 저장
		 * byte는 128로 표현할 수 없기 때문에 -> 오버플로우 발생
		 */
		num = (byte)(num);
		System.out.println(num);
		/*byte로 표현 가능한 가장 작은 정수 -128에 1을 빼면 -129가 아닌 127이 됨
		 * 언더 플로우 발생
		 */
		num = (byte)(num - 1);
		System.out.println(num);

	}

}
