package day15;

public class Ex9_Exception7_NullPoint {

	public static void main(String[] args) {
		// 예제)문자열이 주어지면 주어진 문자열에 a가 몇개 있는지 확인하는 코드 작성
		//abca -> 2개
		//<내가 푼거>
		try{
			String str = null;
			int count = 0;
			//반복문 조건식을 모르겟다...문자열 길이...어떻게
			//str.length도 아니고..-> if문 안에 At(i)인데 At[i]로 해서 오류난거임 
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'a') {
					count++;
				}
			}
			System.out.println(count);
		} catch(NullPointerException e) {
			System.out.println("비어있는 문자열입니다");
		}
		
		//<선생님 풀이> 부분으로 감쌀 수 있다 -> 하지만 변수 위치 조심
		int count = 0;
		try{
			String str = null;		
	
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'a') {
					count++;
				}
			}	
		} catch(NullPointerException e) {
			System.out.println("객체가 비어있습니다");
		}
		System.out.println("문자열에는 a가 " + count +"개 있습니다");
	}

}
