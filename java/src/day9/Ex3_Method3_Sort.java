package day9;

import java.util.Scanner;

public class Ex3_Method3_Sort {

	public static void main(String[] args) {
		//예제) 5명의 학생의 성적을 입력받아 오름차순으로 출력하는 코드 작성
		//단, 입력받은 성적은 배열에 저장
		//<내가 푼거>
		Scanner scan = new Scanner(System.in);
		
		//5명 학생의 성적 입력
		System.out.print("성적을 입력하세요 : ");
		int score[] = inputCreatArray(scan, 5);
		
		/* 메소드를 사용하지 않고 풀어봄 -> 이후에 관련 메소드 생성
	    //오름차순으로 정렬 -> 버블정렬	
		for(int i = 0 ; i < score.length - 1 ; i++) {
			for(int j = 0 ; j < score.length - 1 - i ; j++) {
				//앞 자리가 더 크면 두 수 교환
				if(score[j] > score[j+1]) {
					int tmp = score[j];
					score[j] = score[j+1];
					score[j+1] = tmp;
				}
			}
		}
		//배열 출력
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}	
		//다른 방법
		for(int tmp : score){
		System.out.println(tmp + " ");
		*/
		/*
		//메소드를 이용하여 버블정렬한 배열을 출력
		printArray(bubbleSort(score));
	    */
		
		//성적 정렬
		bubbleSort(score, false);
		
		//정렬 출력
		printArray(score);
		
	    scan.close();
		

		
	}
	//성적을 입력하면 배열을 만들어서 알려주는 메소드
	public static int[] inputCreatArray(Scanner scan, int n) {	
		if(n <= 0) {
			return null;
		}
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	
	/*기능: 배열을 오름차순 또는 내림차순하는 기능
	 *매개변수: 배열, 오름차순(ascending)/내림차순 -> int arr[], boolean asc
	 *리턴타입: 정수 배열 int[] 라고 생각했으나 -> void
	 *메소드명: bubbleSort
	 */
	//<내가 푼거>오름차순만...
	/* 
	public static int[] bubbleSort(int arr[]) {
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			for(int j = 0 ; j < arr.length - 1 - i ; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	*/
	
	//<선생님 풀이>
	public static void bubbleSort(int arr[], boolean asc) {
		if(arr == null) {
			return;
		}
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			for(int j = 0 ; j < arr.length - 1 - i ; j++) {
				//오름차순
				if(asc && arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				//내림차순
				else if(!asc && arr[j] < arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					}
				}
			}
		}
	
	// 정수형 배열이 주어졌을 때, 주어진 배열의 값을 콘솔에 출력하는 메소드
	public static void printArray(int num[]) {
		if(num == null || num.length == 0) {
			System.out.println("출력할 배열이 없습니다");
			return;
		}
		for(int i = 0 ; i< num.length ; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
