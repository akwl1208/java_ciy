package day5;

public class Ex7_NestedLoop2_Star {

	public static void main(String[] args) {
		/* 예제1) 아래와 같이 출력되도록 코드를 작성
		 *
		 **
		 ***
		 ****
		 *****
		 */
		
		//<내가 푼거>
		/*
		for(int i=1 ; i<=5; i++) {

			for(int j=1 ; j<=i ;j++) {				
					System.out.print("*");
			}
		 	System.out.println();
		}
		*/
		
		
		/* 예제2)
		     *
		    **
		   ***
		  ****
		 *****      
		 */
		//<내가 푼거>
		/*
		for(int i=1 ; i<=5; i++) {

			for(int j=1 ; j<=5 ;j++) {
				//공백 출력
				if(j <= 5-i) {
					System.out.print(" ");
				}
				//* 출력
				else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		*/
		
		//<선생님 풀이>
		
		int num = 5;
		/*
		for(int i = 1 ; i <= num; i++) {
			//공백 출력
			for(int j = 1 ; j <= num - i ;j++) {
				System.out.print(" ");
			}
			//* 출력
			for(int j=1 ; j <= i ; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		
		/*예제3)
		   *
		  ***
		 *****
		*******
	   ********* 
		 */
		//<내가 푼거> 방법1
		/*
		for(int i = 1 ; i <= num ; i++ ) {
			for(int j=1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j <= 2*i -1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
			
		
		
		/*<선생님 풀이> 다른 방법
		   *
		  ** *
		 *** **
		**** ***
	   ***** **** 
		 */
		
		for(int i = 1 ; i <= num; i++) {
			//공백 출력 
			for(int j = 1 ; j <= num - i ;j++) {
				System.out.print(" ");
			}
			//*출력
			for(int j=1 ; j <= i ; j++) {
					System.out.print("*");
			}
			//*을 출력: i - 1
			for(int j=1 ; j<=i - 1 ; j++) {				
				System.out.print("*");
			}		 	
			System.out.println();		
		}

		
	
		
		
	}
}
