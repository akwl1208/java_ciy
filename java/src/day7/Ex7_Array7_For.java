package day7;

public class Ex7_Array7_For {

	public static void main(String[] args) {
		// <향상된 For문>
		//코드가 간결해짐 
		//값 수정은 못함
		//값을 가져와서 활용
		int score[] = {100, 90, 30};
		int sum = 0;
		double avg;
		
		for(int tmp : score) {
			sum += tmp;
		}
		avg = sum / (double)score.length;
		System.out.println("총점 : " + sum + ", 평균 : " + avg);
	}

}
