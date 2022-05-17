	package day16;

public class Ex5_String2_IndexOf {

	public static void main(String[] args) {
		// <String>
		String str = "Hello world world";
		String search = "wo";
		
		//검색기능 구현가능
		/* 1) indexOf()
		   일치하는 문자열이 없으면 -1, 있으면 시작번지
		   여러 개 있어도 처음 시작하는 번지를 찾음
		   2) 문자열.(검색어, 시작번지)
		   문자열에서 시작번지부터 검색어를 찾아 있으면 시작번지, 없으면 -1
		 */
		
		//wo가 있으면 번지를 알려줌
		int index = str.indexOf(search);
		System.out.println(index); //6 출력
		
		if(index >= 0) {
			System.out.println(str + "문자열에 "+ search + "문자열은 " + index + "번지에 있습니다");
			index = str.indexOf(search, index + search.length());
			if(index >= 0) {
				System.out.println(str + "문자열에 "+ search + "문자열은 " + index + "번지에 2개 있습니다");
			} else {
				System.out.println(str + "문자열에 "+ search + "문자열은 1개 있습니다");
			}
		} else {
			System.out.println(str + "문자열에 "+ search + "문자열은 없습니다");
		}
		
		//lastIndexOf: 뒤에서부터 찾음..
		System.out.println(str.lastIndexOf(search)); //12
		//contains 는 있는지 없는지만 알려줌
		System.out.println(str.contains(search));

	}

}
