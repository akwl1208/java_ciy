package homework1_baseballgame;

import java.util.Scanner;

public class BaseballGameMain {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
	BaseballGame baseballgame = new BaseballGame(scan);
	baseballgame.run();
	
	scan.close();

	}

}
