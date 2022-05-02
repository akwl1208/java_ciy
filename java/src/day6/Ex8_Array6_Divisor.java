package day6;

public class Ex8_Array6_Divisor {

	public static void main(String[] args) {
		//예제)정수 num의 약수를 배열에 저장한 후, 출력하는 코드 작성
		//약수는 최대 10개만 저장 가능
		
		//<내가 푼거>
		/* 약수는 구하겠는데 배열에 값을 순서대로 입력하는걸 못하겠음
	      int num = 200;
	      int div[] = new int[10];
	      
	      for(int i = 1 ; i <= num ; i++) {
	         if(num % i == 0) {
	            div[i] = i;
	            System.out.println(div[i);
	         }
	      }
	     */ 
		
		//<선생님 풀이>
		int num = 200;
		int max = 10;
		int div[] = new int[max];
		int index = 0;
		
		for(int i = 1 ; i <= num ; i++) {
			if(num % i == 0) {
				//?번지가 10보다 작은지 확인하여 10보다 작으면 배열 ?번지에 i를 저장
				if(index < max) {
					div[index] = i;				
				//?을 1증가
				index++;	
				}
			}
		}
		//출력
		for(int i = 0 ; i < index; i++) {
		System.out.print(div[i] + " ");
		}

	}
}	



