package day4;

public class Ex8_InfiniteLoop {

	public static void main(String[] args) {
		// <무한 루프>
		
		//무한 루프 아님 ->그냥 무수히 많이 실행됨
		//1부터 int 최대 정수까지 반복
		//무한 루프인 경우 아래 코드가 에러 발생
		for(int i = 1 ; i > 0; i++ ) {
			System.out.println(i);
		}
		System.out.println("안녕");
	}

}
