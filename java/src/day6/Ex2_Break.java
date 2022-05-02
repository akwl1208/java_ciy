package day6;

public class Ex2_Break {

	public static void main(String[] args) {
		// 예제)break
		int i, j;
		for(i = 1 ; i <= 5 ; i++ ) {
			for(j = 1; j <= 5 ; j++) {
				System.out.println(i + ", " + j);
				if(j == 3) {
					break; //가장 가까운 반복문 빠져나옴
				}
			}
			//break를 만나면 이 위치로 이동
		}
		
		System.out.println("-----------------------------"); //구분선
		
		out:for(i = 1 ; i <= 5 ; i++ ) {
			for(j = 1; j <= 5 ; j++) {
				System.out.println(i + ", " + j);
				if(j == 3) {
					break out; 
				}
			}
		}
		//break를 만나면 out 반복문의 끝이 이 위치로 이동
		
	}

}
