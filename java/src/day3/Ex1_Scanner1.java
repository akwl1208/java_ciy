package day3;

import java.util.Scanner;

public class Ex1_Scanner1 {

	public static void main(String[] args) {
		//예제) 한 학생의 수학 영어 국어 성적을 입력 받고, 총점과 평균을 구하세요.
		//단, 성적은 점수로 입력받고 0~100사의의 정수를 입력
		
		//<내가 푼거>
		//1. 0~100사이의 정수 입력 설정 어떻게 하느지 모르겟당..
		//(mathscore>=0||mathscore<=100)? mathscore : 0;
		//를 int 아래 쓰는 것도 아니네 
		//그냥 0-100 사이의 정수 받으라는 표시하는 거였음~ 
		//아직 배운 영역에서는 못함!
		//2. 나누기할 때 주의사항 자꾸 까먹음..double!!
		//double 하니까 오류나네.. -> 괄호신경쓰자~~
		
		
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수학성적을 입력하세요 : ");
		int mathscore = scan.nextInt();
		
		System.out.print("영어성적을 입력하세요 : ");
		int engscore = scan.nextInt();
		
		System.out.print("국어성적을 입력하세요 : ");
		int korscore = scan.nextInt();
		
		System.out.println("성적 총점은 " + (mathscore+engscore+korscore) + "입니다");
		System.out.println("성적 평균은 " + ((double)(mathscore+engscore+korscore)/3) + "입니다");
		
		scan.close();
		*/
		
		/*<선생님 풀이>
		 * 만드는 과정 생각해보기
		 * 1. 콘솔창에 "수학성적을 입력하세요(0~100) : "가 표시
		 * 2. 내가 수학 성적 입력
		 * 3. 콘솔창에 "영어성적을 입력하세요(0~100) : "가 표시
		 * 4. 내가 영어 성적 입력
		 * 5. 콘솔창에 "국어성적을 입력하세요(0~100) : "가 표시
		 * 6. 내가 국어 성적 입력
		 * 7. 받은 값으로 총점 반환 -> 수학 영어 국어 더하면 됨
		 * 8. 받은 값으로 평균 반환 -> 총점을 과목개수로 나누면 됨
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수학성적을 입력하세요(0-100) : ");
		int mathscore = scan.nextInt();
		
		System.out.print("영어성적을 입력하세요(0-100) : ");
		int engscore = scan.nextInt();
		
		System.out.print("국어성적을 입력하세요(0-100) : ");
		int korscore = scan.nextInt();
		
		int sum = mathscore+engscore+korscore;
		double avg = sum / 3;
		
		System.out.println("성적 총점은 " + sum + "입니다");
		System.out.println("성적 평균은 " + avg + "입니다");
		
		scan.close();
		
		// 총점이랑 평균을 변수로 만들어서 해도 됨!
		//(double)sum하니까 오류나네..앞에 타입명에 double로!(63번 줄~)
	
		
		
	}

}
