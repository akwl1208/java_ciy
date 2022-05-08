package review;

public class Review_for_day3 {

	public static void main(String[] args) {
		//예제1) 반목문 이용해서 Hello를 5번 출력
		
		int i = 1;
		
		for(i=1 ; i<=5; i++) {
			System.out.print("Hello"+ " "); //보기 쉽게 띄어쓰기 추가
		}
		
		System.out.println(""); //그냥 답 보기 편하게 줄 띄움
		
		
		

		//예제2) 1부터 5까지 반복문을 이용하여 출력하는 코드를 작성하세요
		
		for(i=1 ; i<=5 ; i++) {
			System.out.print(i+ " "); //보기 쉽게 띄어쓰기 추가
		}
		
		System.out.println(""); //그냥 답 보기 편하게 줄 띄움
		
		
		
		
		//예제3) 1부터 10사이의 짝수를 출력하는 코드 작성
		
		for(i=1 ; i<=5 ; i++) {
			System.out.print(i*2+ " "); //보기 쉽게 띄어쓰기 추가
		}
		
		System.out.println(""); //그냥 답 보기 편하게 줄 띄움
		
		
		
		
		//예제4) 1부터 5까지 합을 구하는 코드를 작성
		//15민 출력되야함
		int sum = 0;
		
		for(i=1 ; i<=5 ; i++) {
			sum = sum + i;
		}
		System.out.print(sum);
		
		System.out.println(""); //그냥 답 보기 편하게 줄 띄
		
		
		
		/* 예제5) 정수 num의 약수를 출력하는 코드를 작성하세요
		 * A의 약수 : A를 어떤 수로 나누었을 때 나머지가 0과 같은 수
		 * 12의 약수 : 1 2 3 4 6 12
		*/
		int num = 12;
		
		for(i=1 ; i<=num ; i++) {
			if(num % i == 0) {
				System.out.print(i + " "); //보기 쉽게 띄어쓰기 추가
			}
		}
	}

}
