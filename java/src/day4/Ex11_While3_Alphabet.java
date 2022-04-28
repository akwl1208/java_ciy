package day4;

public class Ex11_While3_Alphabet {

	public static void main(String[] args) {
		//예제)a에서 z까지 출력하는 코드를 while문으로 작성
		
		//<내가 푼거>
		char i = 'a';
				
		while( i <= 'z') {
			System.out.print(i);
			i++;
		}
		
		System.out.println(); //줄바꿈
		
		//<내가 푼거2>
		int j = 0;
		
		while(i<26) {
			System.out.println((char)'a'+j);
			j++;
		}
		
		System.out.println(); //줄바꿈
		
		//<선생님 풀이> i++ 위치 참고 
		i='a';
		while( i <= 'z') {
			System.out.print(i++);
		}
		

	}

}
