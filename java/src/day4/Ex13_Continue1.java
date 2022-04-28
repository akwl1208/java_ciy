package day4;

public class Ex13_Continue1 {

	public static void main(String[] args) {
		// <continue>
		/* 예제) 1에서 10 사이의 짝수를 출력하는 코드를 continue를 이용하여 작성
		 * 반복횟수: i는 1부터 10까지 1씩 증가
		 * 규칙성: i가 홀수이면 continue, 아니면 i 출력
		 */
		
		//for문에서 continue는 증감식 위치로 이동
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			//else 생략가능 -> break와 같은 이유
			System.out.print(i); 
		}
		
		System.out.println(); //줄바꿈
		
		//while문으로
		int i = 1;
		while(i <= 10) {
			/*무한 루프에 빠짐 -> i가 1인 상태로 계속 반복 -> 증감연산자 위치 중요
			if(i % 2 != 0) {
				continue;
			}
			System.out.print(i);
			i++;
			*/
			
			if(i % 2 != 0) {
				i++;
				continue;
			}
			System.out.print(i);
			i++;
		}
		

	}

}
