package review;

import java.util.Scanner;

public class Day14_MainAccountBook {
	
	public static void main(String[] args) {
		//윈도우라고 생각
		Scanner scan = new Scanner(System.in);
		
		Day14_AccountBookManager accountBookManager = new Day14_AccountBookManager(scan);
		accountBookManager.run();
		
		scan.close();

	}

}
