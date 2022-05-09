package day10;

import java.util.Scanner;

public class Ex5_Class5_Point {

	public static void main(String[] args) {
		/* 예제) 아래와 같이 출력되로록 코드 작성
		 * <메뉴>
		 * 1. 좌표 설정
		 * 2. 좌표 출력
		 * 3. 종료
		 * 메뉴 선택 : 1
		 * 좌표를 입력하세요 (예: 1 2 3) : 1 2 3
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		Point3D1 p3d = new Point3D1(0, 0, 0);
		int menu = 0;
		while(menu != 3) {
			//메뉴 출력
			System.out.println("<메뉴>\n1. 좌표 설정\n2. 좌표 출력\n3. 종료");
			System.out.print("메뉴 선택 : ");
			//메뉴 입력
			menu = scan.nextInt();
			//기능 구현
			switch(menu) {
			case 1:
			/*요기서 조금 헤맴..
			 *처음에 이렇게 작성했는데 그럼 반복문을 왜 사용한건지..ㅎㅎ
			  int point;
			  for(int i = 1; i <= 3; i++){
		  		point = scan.nextInt();
			  }
			 */			
				System.out.print("좌표를 입력하세요(예: 1 2 3) : ");
				/*
				p3d.x = scan.nextInt();
				p3d.y = scan.nextInt();
				p3d.z = scan.nextInt();
				*/
				//이렇게 만드는걸 추천!
				int x = scan.nextInt();
				int y = scan.nextInt();
				int z = scan.nextInt();
				p3d = new Point3D1(x, y, z);
				break;
			case 2: p3d.print(); break;
			case 3: System.out.println("프로그램 종료"); break;
			default: System.out.println("잘못된 메뉴입니다");
			}
		}
		scan.close();
		
		
	}

}
/*다음 정보를 가지는 3차원에서 점을 나타내는 클래스 생성
 * 정보: 점 x, 점 y, 점 z
 * 기능: 좌표를 출력하는 기능 
 * */
//<내가 푼거>
class Point3D1{
	//변수
	int x, y, z;
	
	//메소드
	void print() {
		System.out.println(x + ", " + y + ", " + z);
	}
	
	//생성자
	public Point3D1(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	
}