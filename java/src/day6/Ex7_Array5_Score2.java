package day6;

import java.util.Scanner;

public class Ex7_Array5_Score2 {

	public static void main(String[] args) {
		/*예제) 최대 10명 학생의 성적을 저장하기 위한 배열을 선언하고
		입력한 학생수를 입력을 받아 입력받은 학생수만큼 성적을 입력받고
		총점과 평균을 출력하는 코드 작성
		예)
		학생수를 입력하세요 : 3
		1번 학생 : 
		*/
		
		//<내가 푼거>배치가 어렵다ㅠㅠ배치에 따라 결과가 다르게 나옴..
		//scan 선언
		Scanner scan = new Scanner(System.in);
		/*
		//배열 선언 10개짜리
		int num = scan.nextInt();
		int score[] = new int [num];
		int sum = 0;
		double avg = 0.0;
		
		//성적 입력 받기
		for(int i = 0 ; i < num ; i++) {
			System.out.print("학생수를 입력하세요 : ");			
			i = 0;
			
			if(num < 1) {
				System.out.println("최소 1명부터 입니다");
				continue;
			}	
			
			if(num > 10) {
				System.out.println("최대 10명까지 입니다");
				continue;
			}
			//성적 입력
			System.out.print((i+1) + "번째 학생의 성적 : ");
			score[i] = scan.nextInt();
			
			}

		//총점과 평균 입력
		for(int i = 0; i < score.length ; i++) {
			sum += score[i];
			avg = sum / (double)score.length;
		)
		//총점과 평균 출력
		System.out.println("학생들의 총점 : " + sum + "점" );
		System.out.println("학생들의 평균 : " + avg + "점");
		*/
		
		
		//<선생님 풀이>
		//배열선언
		int max = 10;
		int score[] = new int[max];
		
		//학생수 입력
		System.out.print("학생수를 입력하세요 : ");
		int count = scan.nextInt();
		
		//입력받은 학생수가 10보다 크면 최대 10명까지입니다 출력
		if(count > 10) {
			System.out.println("최대 10명까지입니다");
		}
		//0보다 작거나 같으면 최소 1명부터입니다 출력
		else if(count <= 0) {
			System.out.println("최소 1명부터입니다");
		}
		//성적 입력
		else {
			int sum = 0;
			double avg = 0.0;
			for(int i = 0; i < count ; i++) {
				System.out.print(i+1 +"번 학생 : ");
				score[i] = scan.nextInt();
				sum+= score[i];
			}
		//평균 계산
		avg = (double)sum / count;
		//총점과 평균 출력
		System.out.println("총점 : " + sum + "점, 평균 : " + avg);
		}
	}

}
