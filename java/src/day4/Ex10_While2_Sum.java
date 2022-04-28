package day4;

public class Ex10_While2_Sum {

	public static void main(String[] args) {
		// 예제)1부터 5까지의 합을 구하는 코드를 while문을 이용하여 작성
		
		//<내가 푼거>
		int i=1, sum = 0;
			
		while(i<=5) {
			
			sum = sum + i; //sum += i
			
			i++; //i++ 위치도 중요 -> sum 앞에 있으면 2 5 9 14 20 나옴
			     //-> 1로 들어온 i가 i++만나 2가 된 후 sum에서 계산
		}
		System.out.println(sum);
		
		
		
		//<선생님 풀이> while문 활용
		i=1;
		
		sum = 0;
		while(i <= 5) {
			sum += i++; //후위형 증감연산자
		}
		System.out.println(sum);
		
		

	}

}
