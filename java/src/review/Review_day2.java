package review;

public class Review_day2 {

	public static void main(String[] args) {
		// 수업에서 푼 예제들을 다시 한번 내가 풀어봄
		
		/* 예제1) 성적에 맞는 학점을 출력하는 코드를 작성하세요
		 * A: 90이상 100이하
		 * B: 80이상 90미만
		 * C: 70이상 80미만
		 * D: 60이상 70미만
		 * F: 0이상 60미만
		 * 0미만, 100초과 이면 잘못된 성적이라고 출력 
		 */
		int score = 65;
		
		if(score < 0 || score > 100) {
			System.out.println("잘못된 성적");
		}

		else if(score >= 90) {
			System.out.println("A");
		}
		
		else if(score >= 80) {
			System.out.println("B");
		}
		
		else if(score >= 70) {
			System.out.println("C");
		}
		
		else if(score >= 60) {
			System.out.println("D");
		}
		
		else {
			System.out.println("F");
		}

		
		
		/* 예제2) month가 주어질 때 해당 달의 마지막 일을 출력하는 코드를 if 문으로 작성하시오.
		 * 31일: 1 3 5 7 8 10 12 월
		 * 30일: 4 6 9 11 월
		 * 28일: 2월
		 * 이외에는 해당은 없는 달입니다를 출력
		 */
		int month = 13;
		
		if(month < 1 || month > 12) {
			System.out.println(month + "는 없는 달입니다");
		}
		
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month + "의 마지막 일은 30일입니다");
		}
		
		else if(month == 2) {
			System.out.println(month + "의 마지막 일은 28일입니다");
		}
	
		else {
			System.out.println(month + "의 마지막 일은 31일입니다");
		}
		
		
		
		/* 예제3) num1과 num2가 주어지고 산술연산자 op가 주어졌을 때 
		산술 연산자(+, -, *, /, %)에 맞는 결과가 출력되는 코드를 작성하시오
		* 연산에 대해 num1 + num2 = 값 형식으로 출력
		* 이외의 연산자는 '산술연산자가 아닙니다' 출력
		* 나누기는 실수값이면 실수값으로 반환되도록
		*/
		
		int num1 = 5;
		int num2 = 2;
		
		char op = '%';
		
		if(op == '+') {
			System.out.println(""+ num1 + op + num2 + "=" + (num1 + num2));
		}
		
		else if(op == '-') {
			System.out.println(""+ num1 + op + num2 + "=" + (num1 - num2));
		}
		
		else if(op == '*') {
			System.out.println(""+ num1 + op + num2 + "=" + (num1 * num2));
		}
		
		else if(op == '/') {
			System.out.println(""+ num1 + op + num2 + "=" + ((double)num1 / num2));
		}
		
		else if(op == '%') {
			System.out.println(""+ num1 + op + num2 + "=" + (num1 % num2));
		}
		
		else {
			System.out.println("산술연산자가 아닙니다");
		}
		
		
		
		/* 예제4) num가 2의 배수이면 2의 배수라고 출력
		 * num가 3의 배수이면 3의 배수라고 출력
		 * num가 6의 배수이면 6의 배수라고 출력
		 * num가 2,3,6의 배수가 아니면 2,3,6의 배수가 아니라고 출력
		 * 단, num이 6일 때 6의 배수라고 출력해야합니다.  
		 */
		
		int num = 36;
		
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

		
		
	}

}
