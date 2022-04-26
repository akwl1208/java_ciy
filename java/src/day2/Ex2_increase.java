package day2;

public class Ex2_increase {

	public static void main(String[] args) {
		/* <증감연산자> : 최종적으로 1 증가 또는 1감수
		 * 전위형: ++변수명, 증가 후에 동작
		 * 후위형: 변수명++, 동작 후 증가
		 */
		
		
		//예제) num1: 전위형, num2: 후위형
		int num1 = 10, num2 = 10;
		System.out.println(num1 + "," + num2); //10,10
		System.out.println(++num1 + "," + num2++); //11.10
		System.out.println(num1 + "," + num2); //11, 11
		
		
		//예제) 
		//num3: 전위형, num4: 후위형
		int num3 = 10, num4 = 10;
		System.out.println(num3 + "," + num4); //10
		++num3;//++num3; //num3 = num3 + 1; 
		System.out.println(num3 + "," + num4); //10
		++num4;//++num4; //num4 = num4 + 1;
		System.out.println(num3 + "," + num4); //10
		
	}

}
