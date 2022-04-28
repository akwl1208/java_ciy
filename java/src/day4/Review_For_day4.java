package day4;

import java.util.Scanner;

public class Review_For_day4 {

	public static void main(String[] args) {
		/* 예제1) 정수가 num가 소수인지 아닌지 판별하는 코드 작성
		 * 소수 : 약수가 1과 자기 자신인 수. 약수의 개수가 2개인 수 ex)17
		 * 1는 소수가 아님
		 * 2는 소수
		 */
		
		int i, num = 4, count=0;
		
		for(i=1;i<=num;i++) {
			if(num/i == 0) {			
			count = count + 1;
			}
		}
		
		if(count == 2) {
			System.out.println("소수");
		}
		else {
			System.out.println("소수 아님");
		}

		
		
		
		/* 예제2)
		 * 세 명의 국어 점수를 입력받아 총점과 평균을 구하는 코드를 작성하세요. 반복문 이용 
		 * 단 총점과 평균만 알면 됨 -> 총점과 평균을 구한 후 각 학생의 점수를 기억할 필요가 없다
		 */
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		for(int j = 1 ; j<=3 ; j++) {
			System.out.print(j + "번째 학생의 국어 점수를 입력하시오 : ");
			int score = scan.nextInt();
			
			sum = sum + score;
		}
		avg = sum / 3.0;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
