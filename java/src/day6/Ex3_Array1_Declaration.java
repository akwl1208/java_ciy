package day6;

public class Ex3_Array1_Declaration {

	public static void main(String[] args) {
		//<배열 선언>
		int [] arr1 ;
		int [] arr2  = null;
		//5개짜리 정수 배열을 선언과 동시에 초기화
		int [] arr3 = new int[5]; //가장 일반적인 방법
		int size = 5 ;
		//5개짜리 정수 배열을 선언과 동시에 초기화
		int [] arr4 = new int[size];
		//5개짜리 정수 배열을 선언과 동시에 초기화
		int arr5[] = new int[5];
		
		
		//타입 하나에 콤마로 여러개의 변수 선언시 주의
		int arr6[], arr7; //arr6 : 배열 , arr7 : 변수
		int []arr8, arr9; //arr8 : 배열 , arr9 : 배열
 
		
		//{}를 이용하여 초기화하는 방법은 배열 선언과 동시에 초기화하는 경우만 가능
		int []arr10 = {1,2,3};
		//arr10 = {4,5,6}; -> 오류 발생 -> {}를 이용한 방법은 초기호 이후에는 사용 불가능
		int []arr11 = new int[] {1,2,3};
		arr11 = new int[] {1,2,3};
		
		
		//배열명.length : 배열의 길이를 정수로 알려줌
		System.out.println(arr11.length); //3
		
	}

}
