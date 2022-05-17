package day16;

import java.util.Arrays;
import java.util.Comparator;

public class Ex14_Arrays {

	public static void main(String[] args) {
		//<Arrays 클래스: 정렬>
		int nums[] = {10, 2, 8, 1, 5};
		
		System.out.println("정렬 전 배열 : ");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//정렬 : 오름차순밖에 안됨
		Arrays.sort(nums);
		
		System.out.println("정렬 후 배열 : ");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------");
		
		//<내림차순>
		Integer nums2[] = {10, 2, 8, 1, 5};
		
		System.out.println("정렬 전 배열 : ");
		for(int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + " ");
		}
		System.out.println();
		
		//정렬
		Arrays.sort(nums2, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
			
		});
		
		System.out.println("정렬 후 배열 : ");
		for(int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + " ");
		}
	}

}
