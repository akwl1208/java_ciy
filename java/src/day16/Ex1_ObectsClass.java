package day16;

import java.util.Comparator;
import java.util.Objects;

public class Ex1_ObectsClass {

	public static void main(String[] args) {
		// <objects Class : compare()>
		Integer num1 = 10, num2 = 20;
		/* objects.compare()에서 세번째 매개변수는 Comparator 인터페이스의 객체가 필요
		 * Comparator 인터페이스의 구현 클래스가 필요
		 	-> 구현 클래스 대신 익명 객체 이용
		 * objects.compare()의 리턴값
		 	-> 0: 같다
		 	-> 음수: 앞에 수가 작다
		 	-> 양수: 앞에 수가 크다
		 */
		System.out.println(Objects.compare(num1, num2, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {			
				return o1 - o2;
			}
		}));

	}
}

class Ex1_A {
	
}
