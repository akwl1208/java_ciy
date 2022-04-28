package day4;

import java.util.Scanner;

public class Ex2_For2_Score {

	public static void main(String[] args) {
		/* 예제)
		 * 세 명의 국어 점수를 입력받아 총점과 평균을 구하는 코드를 작성하세요. 반복문 이용 
		 * 단 총점과 평균만 알면 됨 -> 총점과 평균을 구한 후 각 학생의 점수를 기억할 필요가 없다
		 */
		
		/*hint)
		반복횟수: 3번
		규칙성: 성적을 입력받고 총점에 누적
				스캐너를 이용하여 정수를 입력받아 num에 저장한 후, sum에 num을 더해 
		반복문 종료 후: 총점을 출력하고, 총점을 이용하여 평균을 계산한 후, 평균을 출력
					
		*/
		
		
			
		//<내가 푼거1>입력값을 for문 안에 넣길! 이렇게 하면 100명이 되면?
		/*
		Scanner scan = new Scanner(System.in);	
		
      	System.out.print("세 학생의 국어 성적을 입력하세요 (예: 70 80 90): ");
      	
      	int kor1 = scan.nextInt();
      	int kor2 = scan.nextInt();
      	int kor3 = scan.nextInt();
      
      	int sum = 0;
      	
      	for (int i=1; i<=3 ; i++) {
         	sum = kor1 + kor2 + kor3; 
      	}
      
      	double avg = sum/3;
      	
      	System.out.println("세 학생의 총점은 "+ sum + "입니다");   
      	System.out.println("세 학생의 평균은 "+ avg + "입니다");
		*/
		
		
		
		//<내가 푼거2>
		//총점...식을 모르겠다 -> 찾는데 고생했다..
		/*
		Scanner scan = new Scanner(System.in); //요건 for문 밖에서
		
		int sum = 0;

		for (int i=1; i<=3 ; i++) {
			
			System.out.print("학생의 국어 성적을 입력하세요 (예: 70): ");
			
			int kori = scan.nextInt();
			
			sum = sum + kori;
		}
		
		double avg = (double)sum/3;
		
		System.out.println("세 학생의 총점은 "+ sum + "입니다");	
		System.out.println("세 학생의 평균은 "+ avg + "입니다");	
		
		scan.close();
		*/
		
		
		
		//<선생님 풀이>
		int i, num, sum = 0;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		
		for (i=1; i<=3 ; i++) {
			
			System.out.print("학생" + i +"의 국어 성적을 입력하세요 (예: 70): ");
			
			num = scan.nextInt();
			
			sum = sum + num;
		}
		
		avg = sum / 0.3; //sum 실수로 강제 변환 잊지 말기! (double)도 됨
		
		System.out.println("세 학생의 총점은 "+ sum + "입니다");	
		System.out.println("세 학생의 평균은 "+ avg + "입니다");	
		
		scan.close();
	}

}
