package day8;

public class Ex3_Method3_GCD_LCM {

	public static void main(String[] args) {
		//예제) 두 정수의 최대공약수를 gcd를 이용하여 계산하고 출력
		int a = 10, b = 15;
		int res = gcd(a, b);
		System.out.println(a+ "와 " + b + "의 최대공약수 : " + res); //5
		
		//예제) 두 정수의 최소공배수를 lcm를 이용하여 계산하고 출력 
		//내가 푼거 출력
		int lcm1 = lcm(a, b);
		System.out.println(a+ "와 " + b + "의 최소공배수 : " +lcm1); //30
		//선생님 풀이 출력
		int lcm2 = lcm1(a, b);
		System.out.println(a+ "와 " + b + "의 최소공배수 : " +lcm2); //30

	}
	
	/* 최대공약수 메소드 만들기
	 * 기능: 두 정수가 주어지면 두 정수의 최대공약수를 알려주는 메소드
	 * 매개변수: 두 정수 -> int num1, int num2
	 * 리턴타입: 최대공약수 -> 정수 -> int
	 * 메소드명: gcd
	 */
	//<내가 푼거>
	public static int gcd(int num1, int num2) {
		int res = 0; //gcd로 변수명해도 됨 -> 메소드명과 겹쳐도 됨
		for(int i = 1; i <= num1 ; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				res = i;
			}
		}
		return res;
	}
	
	/* 최소공배수 메소드 만들기
	 * 기능: 두 정수가 주어지면 두 정수의 최소공배수를 알려주는 메소드
	 * 매개변수: 두 정수 -> int num1, int num2
	 * 리턴타입: 최소공배수 -> 정수 -> int
	 * 메소드명: lcm
	 */
	//<내가 푼거>
	public static int lcm(int num1, int num2) {
		
		int lcm = 1;
		for(int i = 1; i <= num1*num2 ; i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				lcm = i;
				break;
			}
		}
		return lcm;
	}
	
	//<선생님 풀이>재사용성 좋음 
	//return res= num1 * num2/ gcd(num1,num2);
	public static int lcm1(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}	

}
	

