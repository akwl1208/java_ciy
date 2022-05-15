package review;

import java.util.Scanner;

public interface Day14_ConsoleProgram {
	//기능1) 메뉴 출력 후, 선택
	int selectMenu(Scanner scan);
	
	//기능2) 메뉴에 따른 기능 구현
	void excute(int menu);
	
	//기능3) 프로그램 실행
	void run();
}
