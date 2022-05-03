package day7;

public class Ex4_Array4_Copy {

	public static void main(String[] args) {
		//예제)arr2 배열을 생성하여 arr1 배열을 복사하고, arr2배열값 출력  
		//<내가 푼거>
		/*
		int arr1[] = {1, 4, 6, 8};
		int arr2[] = new int[4];
		
		for(int i = 0 ; i < arr2.length ; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i] + " ");
		}
		*/
		
		//<선생님 풀이>
		/*
		int arr1[] = {1, 4, 6, 8};
		int arr2[] = new int[arr1.length];
		
		for(int i = 0 ; i < arr1.length ; i++) {
			arr2[i] = arr1[i];
		}
		for(int i = 0 ; i < arr2.length ; i++) {
			System.out.print(arr2[i] + " ");
		}
		*/
		
		//배열 복사 설명
		int arr1[] = {1, 4, 6, 8};
		int arr2[] = new int[arr1.length];
		int arr3[] = arr1;
		int arr4[] = new int[arr1.length];
		int arr5[] = new int[arr1.length];
		int arr6[] = new int[arr1.length];
		
		//arr2에 arr1 복사
		for(int i = 0 ; i < arr1.length ; i++) {
			arr2[i] = arr1[i];
		}
		
		//arr1의 값들을 기능을 통해 arr4에 저장 -> 부분복사, 붙여넣는 위치도 조정 가능 
		//arr1 배열에 있는 값들을 0번지부터 arr1.length개 복사하여
		//arr4 배열의 0번지부터 붙여넣음
		System.arraycopy(arr1, 0, arr4, 0, arr1.length-2);
		System.arraycopy(arr1, 2, arr5, 0, arr1.length-2);
		System.arraycopy(arr1, 2, arr6, 2, arr1.length-2);
		
		//arr1의 0번지를 0으로 수정
		arr1[0] = 0;
		for(int i = 0 ; i < arr1.length ; i++) {
			System.out.print(arr1[i] + " "); //0 4 6 8
		}
		System.out.println();
		
		//arr2는 이전 arr1을 저장
		for(int i = 0 ; i < arr2.length ; i++) {
			System.out.print(arr2[i] + " "); //1 4 6 8
		}
		System.out.println();
		
		//arr3은 arr1을 공유
		for(int i = 0 ; i < arr3.length ; i++) {
			System.out.print(arr3[i] + " "); //0 4 6 8
		}
		System.out.println();
		
		//기능을 통해 arr1을 복사 -> 1 4만 복사하여 0번지부터 붙여넣음
		for(int i = 0 ; i < arr4.length ; i++) {
			System.out.print(arr4[i] + " "); //1 4 0 0
		}
		System.out.println();
		
		//arr1을 복사 -> 6 8만 복사하여 0번지부터 붙여넣음
		for(int i = 0 ; i < arr5.length ; i++) {
			System.out.print(arr5[i] + " "); //6 8 0 0
		}
		System.out.println();
		
		//arr1을 복사 -> 6 8만 복사하여 2번지부터 붙여넣음
		for(int i = 0 ; i < arr6.length ; i++) {
			System.out.print(arr6[i] + " "); //0 0 6 8
		}
	}

}
