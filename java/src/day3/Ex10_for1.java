package day3;

public class Ex10_for1 {

	public static void main(String[] args) {
		// <반복문 : for >
		//콘솔에 Hello를 5번 출력하기(for문 없이)
 
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

		
		//반목문 이용해서 Hello를 5번 출력
		//반복횟수 : 1은 1부터 5까지 1씩 증가
		//초기화 : i는 1부터
		//조건식 : 1은 5까지(초기값에 따라 까지가 의미가 달라짐)
		//증감식 : 1은 1씩 증가
		//규칙성(실행문) : "Hello" 출력
		
		int i = 1; //변수 선언
		
		for (i=1 ; i<=5 ; i++) { //증감식에 ++i / i+=1로 작성 가능
			System.out.println("Hello");
		}
		
		//이런 방법으로도 표현 가능
		for (i=0 ; i<=4 ; i++) {
			System.out.println("Hello");
		}
		
		//이렇게 표현하는게 효율적? 5번이 i<5로 표시되서..
		for (i=0 ; i<5 ; i++) {
			System.out.println("Hello");
		}
		
		System.out.println(i); //i가 5가 되면 for문을 빠져나오기 때문에 출력값은 5!
	}

}
