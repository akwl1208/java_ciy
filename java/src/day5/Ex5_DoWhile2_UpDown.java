package day5;

import java.util.Scanner;

public class Ex5_DoWhile2_UpDown {

	public static void main(String[] args) {
		/* 예제) 램덤으로 생성한 수(1-100를 맞추는 게임을 작성
		 * 정수를 입력하고 입력한 정수보다 램덤으로 생성된 수가 크면 up, 작으면 down 표시
		 * 맞으면 맞췄습니다 표시
		 * 예시) 램덤으로 생성한 수 : 40
		 * 입력 100 -> down
		 * 입력 30 -> up
		 */
		
		//<내가 푼거>
		int min = 1, max = 100;		
		int r= (int)(Math.random() * (max-min+1) + min);
		int num = -1;
		
		Scanner scan = new Scanner (System.in);

		do {
			System.out.print("0~100 사이의 정수를 입력하세요 : ");
			num = scan.nextInt();
			
			
			if(num < 1 || num > 100) {
				continue;
			}
			if(num > r) {
				System.out.println("Down");
			}
			else if(num<r){
				System.out.println("Up");
			}
		}while(num != r);
		System.out.println("정답입니다");
		scan.close();
	}
}
