package day7;

import java.util.Scanner;

public class Ex2_Array2_Duplicated {

	public static void main(String[] args) {
		//예제) 정수 num을 입력받고, 입력받은 정수가 배열에 있는지 없는지 확인하는 코드 작성 
		
		//<내가 푼거>
		int arr[] = {1,2,3}; 
		
		Scanner scan = new Scanner(System.in);
		/*
		//정수 입력받기
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		//입력받은 정수가 배열에 있는지 없는지 확인
		if(num == arr[0] || num == arr[1] || num == arr[2]) {
			System.out.println(num + "은 배열에 포함되어 있습니다");
		}
		else {
			System.out.println(num + "은 배열에 포함되어 있지 않습니다");
		}
		*/
		
		//<내가 푼거2> 반복문 이용
		/*
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(num == arr[i]) {
				System.out.println(num + "은 배열에 포함되어 있습니다");
			}
			//배열에 포함되어있지 않을 때...출력을 어디에 배치해야할지 모르겠음
		}
		*/
		
		//<내가 푼거3>힌트보고 -> 배열 전체를 탐색
		//-> 있는지 확인 가능하지만 어디에 있는지는 모름
		/*
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		int count = 0;
		//배열에 포함되어 있으면 1 증가
		for(int i = 0 ; i < arr.length ; i++) {
			if(num == arr[i]) {
				count++;
			}
		}
		//count가 1이면 배열에 포함되어 있음
		if(count == 1) {
			System.out.println(num + "은 배열에 포함되어 있습니다");
		}
		else {
			System.out.println(num + "은 배열에 포함되어 있지 않습니다");
		}
		*/
		
		//<선생님 풀이> count 안쓰고 -> 첫번째 중복 숫자가 나오면 확인 중단
		//-> 어디에 있는지도 알 수 있다
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		int i;
		for(i = 0 ; i < arr.length ; i++) {
			if(num == arr[i]) {
				break;
			}
		}
		//반복문에서 break를 만나면 i는 3보다 작고, break를 안만나면 i는 3인 특성 이용
		if(i < arr.length) {
			System.out.println(num + "은 배열에 포함되어 있습니다");
		}
		else {
			System.out.println(num + "은 배열에 포함되어 있지 않습니다");
		}
		
		scan.close();
		
		//별도 설명: 배열 출력시 주소 출력
		
	}

}
