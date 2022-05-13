package day14;

import java.util.Scanner;

public class Ex1_AccountBookMain {

	public static void main(String[] args) {
		//윈도우라고 생각
		Scanner scan = new Scanner(System.in);
		
		AccountBookManager accountBookManager = new AccountBookManager(scan);
		accountBookManager.run();
		
		scan.close();

	}

}
