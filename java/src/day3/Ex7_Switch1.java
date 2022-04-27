package day3;

public class Ex7_Switch1 {

	public static void main(String[] args) {
		/* <switch 문>
		 * 예제) 홀수 짝수 판별 문제
		 * num을 2로 나눴을 때 나머지가 0과 같으면 짝수라고 출력
		 * 아니면 홀수라고 출력
		 */
		
		//if문으로 이용
		int num = 3;
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		//switch문 이용
		//case값은 정수, 문자, 문자열만 가능 -> 실수, 조건식 안됨
		//break가 없으면 case에 맞아도 다음 실행문으로 넘어감
		//break가 나올 때까지 실행문을 다 실행함
		
		//방법1
		switch(num % 2) {
		case 0:
			System.out.println(num + "는 짝수");
			break;
		
		case 1:
			System.out.println(num + "는 홀수");
			break;
		}
		
		//방법2
		switch(num % 2) {
		case 0 :
			System.out.println(num + "는 짝수");
			break;
		
		default :
			System.out.println(num + "는 홀수");
		}
	}

}
