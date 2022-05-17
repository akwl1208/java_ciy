package day16;

public class Ex6_String3_Search {

	public static void main(String[] args) {
		//예제) 주어진 str에 search가 몇 번 있는지 출력하는 코드 작성
		String str ="abcdabcdababab";
		String search = "ab";
	
		int index = 0;
		int count = 0;
		do {
			index = str.indexOf(search, index);
			if(index >= 0) {
				count++;
				index = str.indexOf(search, index + search.length());
			}
		}while(index >= 0);
		
		System.out.println(str + "에는 " + search + "가 " + count + "개 있습니다");
	}

}
