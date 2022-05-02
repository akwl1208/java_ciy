package day6;

import java.util.Scanner;

public class Ex5_Array3_score {

	public static void main(String[] args) {
		// 예제) 학생 3명의 국어 성적을 입력받고 총점과 평균을 구하는 코드를 작성
		//단, 총점과 평균을 출력한 다음, 학생 3명의 성적을 출력
		
		//<내가 푼거>
		
		Scanner scan = new Scanner(System.in);
		/*
		int arr[] = new int[3];
		int sum = 0;
		for(int i=0 ;;i++) {
			System.out.print("국어 성적을 입력하세요 : ");
			arr[i] = scan.nextInt();
			
			sum += arr[i];
						
			if(i ==2) {			
				System.out.println("총점 : " + sum);
				System.out.println("평균 : " + (double)sum/(i+1));
				break;
			}
				
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("학생 "+ (i+1) + "의 국어점수 : " + arr[i]);
		}
		*/

		
		//<선생님 풀이> score.length 활용 -> 내가 생각 못한 부분
		//배열 선언
		int []score = new int[3];
		int sum = 0;
		double avg = 0;	
		
		//반복문으로 점수 입력
		for(int i = 0; i < score.length ; i++) {
			//학생의 점수 입력
			System.out.print((i+1) + "번째 학생의 성적 : ");
			score[i] = scan.nextInt();
		}
		
		//반복문으로 총점 계산
		for(int i = 0; i < score.length ; i++) {
			sum += score[i];
		}
		
		//총점을 이용하여 평균 계산
		avg = sum / (double)score.length;
		
		//총점과 평균을 출력
		System.out.println("학생 3명의 총점은 " + sum + "점이고, 평균은 " + avg + "점입니다" );
		
		//반복문으로 학생 점수 출력
		for(int i = 0; i < score.length ; i++) {
			System.out.println((i+1) + "번째 학생의 성적 : " + score[i]);
		}
	}

}
