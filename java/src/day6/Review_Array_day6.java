package day6;

import java.util.Scanner;

public class Review_Array_day6 {

	public static void main(String[] args) {
		// 예제1) 학생 3명의 국어 성적을 입력받고 총점과 평균을 구하는 코드를 작성
		//단, 총점과 평균을 출력한 다음, 학생 3명의 성적을 출력
		/*
		Scanner scan = new Scanner(System.in);		
		//변수 선언
		int score[] = new int[3];
		int sum = 0;
		double avg = 0.0;
		// 국어 성적 입력 받음
		for(int i = 0 ; i < score.length ; i++) {
			System.out.print((i+1) +"번째 학생의 국어 성적을 입력하세요 : ");
			score[i] = scan.nextInt();		
			//총점 저장
			sum += score[i];
		}
		//총점 출력
		System.out.println("총점 : " + sum);
		//평균 계산 -> 출력
		avg = sum / (double)score.length;
		System.out.println("평균 : " + avg);
		//학생의 성적 출력
		for(int i = 0 ; i < score.length ; i++) {
			System.out.println((i+1) + "번째 학생의 국어 성적 : " + score[i]);
		}
		*/
		
		
		//예제2) 배열에 1의 제곱부터 10의 제곱까지 저장하고, 출력하는 코드 작성
		/*
		int num[] = new int[10];
		
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = (i+1)*(i+1);
			System.out.println((i+1) + "의 제곱 = " + num[i]);
		}
		*/
		
		
		/*예제3) 최대 10명 학생의 성적을 저장하기 위한 배열을 선언하고
		입력한 학생수를 입력을 받아 입력받은 학생수만큼 성적을 입력받고
		총점과 평균을 출력하는 코드 작성
		예)
		학생수를 입력하세요 : 3
		1번 학생 : 
		1 미만 입력한 경우 : 최소 1명부터입니다 출력
		10명 초과 입력한 경수 : 최대 10명까지입니다 출력
		*/
		/*
		Scanner scan = new Scanner(System.in);
		//배열 선언
		int max = 10;
		int score[] = new int[max];
		int num = 1; 
		int sum = 0;
		double avg = 0.0;
		//학생수 입력 출력
		System.out.print("학생수를 입력하세요 : ");
		num = scan.nextInt(); 
		//1 미만 입력한 경우 : 최소 1명부터입니다 출력
		if(num < 1) {
			System.out.println("최소 1명부터입니다");
		}
		//10명 초과 입력한 경수 : 최대 10명까지입니다 출력
		else if(num > 10) {
			System.out.println("최대 10까지입니다");
		}
		//학생들 성적 입력
		else {
			for(int i = 0 ; i < num ; i++) {
				System.out.print((i+1) +"번째 학생의 국어 성적을 입력하세요 : ");
				score[i] = scan.nextInt();
				//총점 저장
				sum += score[i];
			}
			//총점 출력
			System.out.println("총점 : " + sum);
			//평균 계산 -> 출력
			avg = sum / (double)num;
			System.out.println("평균 : " + avg);
		}
		*/
		
		
		//예제4)정수 num의 약수를 배열에 저장한 후, 출력하는 코드 작성
		//약수는 최대 10개만 저장 가능
		//배열 선언
		int max = 10;
		int div[] = new int[max];
		int num = 144;
		int j = 0 ;
		//약수 저장
		for(int i = 1 ; i <= num ; i++) {
			if(num%i == 0) {
				if(j < max) {
					div[j] = i;
					System.out.print(div[j] + " ");
					j++;
				}
			}
			
		}
	}

}
