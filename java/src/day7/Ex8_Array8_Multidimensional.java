package day7;

public class Ex8_Array8_Multidimensional {

	public static void main(String[] args) {
		// <다차원 배열>
		//예제) 1학년 1반의 국어 성적(정수)을 저장하기 위한 배열 선언
		//각 반에는 최대 30명
		int score1[] = new int [30];
		
		//예제) 1학년 전체 학생의 국어 성적을 저장하기 위한 배열 선언
		//각 학년은 최대 10반까지 있음
		int score2[] = new int [30*10];
		//위에 처럼 선언 시 불편한 점
		score1[10] = 100; //1반 학생의 11번 학생 성적
		score2[201] = 100; //7반 학생의 22번 학생 성적 -> 계산해야함...복잡
		
		//다차원 배열을 이용해서 선언
		int score3[][] = new int [10][30];
		score3[6][21] = 100; //7반 학생의 22번 학생 성적 -> 위보다 쉬움
		
		//예제) 1~3학년 전체 학생의 국어 성적을 저장하기 위한 배열 선언
		int score4[][][] = new int[3][10][30];
	}

}
