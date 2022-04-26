package day2;

public class Ex17_test5 {

	public static void main(String[] args) {
		/* 예제) num가 2의 배수이면 2의 배수라고 출력
		 * num가 3의 배수이면 3의 배수라고 출력
		 * num가 6의 배수이면 6의 배수라고 출력
		 * num가 2,3,6의 배수가 아니면 2,3,6의 배수가 아니라고 출력
		 * 단, num이 6일 때 6의 배수라고 출력해야합니다.  
		 */

		//<내가 푼거>
		/*일단 if는 첫번째부터 돌기 때문에 if문에 6의 배수를 넣으면 
		 else if는 if가 아닐 때 다음으로 넘어가는 조건이니까.....
		 만약 else 빼고 마지막 조건?에 6의 배수를 하면 이미 조건을 돌고 남은 6의 배수가 없음..
		 왜냐하면 6은 2의 배수이자 3의 배수이기 때문이기 때문에 
		*/
		int num = 6;
		
		if (num % 6 == 0) {
			System.out.println(num + "은 6의 배수입니다");
		}
		else if (num % 3 == 0) {
			System.out.println(num + "은 3의 배수입니다");
		}
		else if (num % 2 == 0) {
			System.out.println(num + "은 2의 배수입니다");
		}
		else {
			System.out.println(num + "은 2,3,6의 배수가 아닙니다");
		}
		
		
		//다른 풀이: 2의 배수를 확인할 때 3의 배수가 아닌 숫자를 확인
		//위에거가 더 간단한 코드~하지만 이런 방법도 있음!!
		if (num % 2 == 0 && num % 3 != 0) {
			System.out.println(num + "은 2의 배수입니다");
		}
		else if (num % 3 == 0 && num % 2 != 0) {
			System.out.println(num + "은 3의 배수입니다");
		}
		else if (num % 6 == 0) {
			System.out.println(num + "은 6의 배수입니다");
		}
		else {
			System.out.println(num + "은 2,3,6의 배수가 아닙니다");
		}
	}

}
