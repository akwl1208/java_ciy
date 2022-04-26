package day2;

public class Ex14_test2 {

	public static void main(String[] args) {
		/* 예제) 성적에 맞는 학점을 출력하는 코드를 작성하세요
		 * A: 90이상 100이하
		 * B: 80이상 90미만
		 * C: 70이상 80미만
		 * D: 60이상 70미만
		 * F: 0이상 60미만
		 */
		
		//<내가 푼거>
		int score = 105;
		
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}
		
		else if(score >= 80 && score < 90) {
			System.out.println("B");
		}
		
		else if(score >= 70 && score < 80) {
			System.out.println("C");
		}
		
		else if(score >= 60 && score < 70) {
			System.out.println("D");
		}
		
		else {
			System.out.println("F");
		}
		
		
		//예제) 0미만, 100초과 이면 잘못된 성적이라고 출력하도록 수정하시오. 
		
		//<내가 푼거>
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}
		
		else if(score >= 80 && score < 90) {
			System.out.println("B");
		}
		
		else if(score >= 70 && score < 80) {
			System.out.println("C");
		}
		
		else if(score >= 60 && score < 70) {
			System.out.println("D");
		}
		
		else if(score < 0 || score > 100) {
			System.out.println("잘못된 성적");
		}
		
		else {
			System.out.println("F");
		}
		
		/* <내가 다른 방법으로 푼거>
		else if(score >= 0 && score < 60) {
			System.out.println("F");
		}
		
		else {
			System.out.println("잘못된 성적");
		}
		*/
  
		//<선생님 풀이> 조금 더 간단한 풀이
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
		
			
			
		}


	}

