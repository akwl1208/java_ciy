package day7;

public class Ex1_Array1 {

	public static void main(String[] args) {
		// 예제) 5개짜리 배열을 만들고, 0번지에 1, 1번지에 2,, 저장하고 출력하는 코드 작성
		
		//<내가 푼거>
		int num [] = new int[5];
		
		for(int i = 0 ; i < 5 ; i++) {
			num[i] = i + 1;
			System.out.print(num[i] + " ");
		}

	}

}
