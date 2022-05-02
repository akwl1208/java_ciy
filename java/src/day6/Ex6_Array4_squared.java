package day6;

public class Ex6_Array4_squared {

	public static void main(String[] args) {
		//예제) 배열에 1의 제곱부터 10의 제곱까지 저장하고, 출력하는 코드 작성
		//<내가 푼거>
		//장점 : 10개를 사용
		//단점 : 1의 제곱을 하려면 약간의 작업 필요 
		int arr[] = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) {
			int squ = (i+1)*(i+1);
			arr[i] = squ;
			System.out.println((i+1) + "의 제곱 : " + arr[i]);
		}
		System.out.println("-----------------");//구분선
		
		
		//<선생님 풀이> 다른 방법
		// 11개짜리 배열을 만들어서 0번지를 사용하지 않고 1번지부터 사용
		//장점: 1의 제곱을 작업없이 확인 가능
		//단점: 필요없는 공간이 1개 추가
		
		int arr1[] = new int[11];
		
		for(int i = 1 ; i < arr1.length ; i++) {
			arr1[i] = i*i;
			System.out.println(i + "의 제곱 : " + arr1[i]);
		}
	}

}
