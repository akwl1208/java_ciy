package day5;

public class Ex10_NestedLoop4_Alphabet {

	public static void main(String[] args) {
		/* 예제)
		 * a
		 * ab
		 * abc
		 * ...
		 * abcd...xyz
		 */
		
		//<내가푼거1>		
		for(int i = 1 ; i <= 26; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print((char)('a' + j));
			}
			System.out.println();
		}
		
		
		
		//<내가 푼거2>
		
		for(int i = 1 ; i <= 26; i++) {
			for(char j = 'a' ; j < (char)('a' + i) ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		//<내가 푼거3>
		for(char i = 'a' ; i <= 'z'; i++) {
			for(char j = 'a' ; j <= i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		

	}

}
