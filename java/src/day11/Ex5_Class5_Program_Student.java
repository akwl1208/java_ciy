package day11;

import java.util.Scanner;

public class Ex5_Class5_Program_Student {
	//예제) 학생 정보(이름, 학년, 반, 번호, 국어, 영어, 수학 성적)을 관리하는 프로그램 작성
	/*<내가 생각하는 접근 방법>
	  1. 학생정보관리 class 생성
	  2. 필드 생성(이름, 학년, 반, 번호, 국어, 영어, 수학 성적)
	  3. 메소드 생성
	  	1) 학생 정보 입력 -> 외부에서 입력 받음
	  	2) 학생 정보 저장
	  	3) 학생 정보 출력 -> 출력을 원하면 출력
	  4. 생성자 생성: 필드 초기화 -> 이름, 학년, 반, 번호
	  5. 콘솔창에 표현되도록 메인에 코드 작성
	   
	   <선생님 접근 방법>
	   1. 기능 정리
	    1) 학생 정보 입력 ->학년, 반, 번호, 이름, 국어, 영어, 수학 성적을 한번에 입력받음
	       -> 입력한 학생 정보를 저장
	    2) 학생 정보 출력 -> 전체 학생의 학년 반 번호 이름 국어 영어 수학 성적 출력
	    3) 학생 정보 수정 -> 학년 반 번호 입력받음 -> 입력받은 정보와 일치하는 학생이 있으면
	    	-> 이름 국어 영어 수학 성적을 전부 수정
		4) 학생 정보 삭제 -> 학년 반 번호 입력받음 -> 입력받은 정보와 일치하는 학생이 있으면
			-> 삭제
		5) 프로그램 종료
	   2. 필요한 클래스가 있는지 확인 ->  있으면 생성
		1) 필드: 학생 클래스 -> 학년, 반, 번호, 이름, 국어, 영어, 수학 성적
		2) 메소드
			- 학생 정보 출력
			- 학년 반 번호가 주어졌을 때 일치하는지 확인하는 기능
			- 이름 국어 영어 수학 수정하는 기능
		3) 생성자
		이름 학년 반 번호 국어 영어 수학 성적이 주어졌을 때 초기화하는 생성자
	   3. 기능 구현 -> 클래스 생성 후 메인에 잘 구동되는지 확인하고
   		1) 클래스 정의 및 구현
   		2) 반복문을 메뉴 출력 및 메뉴 선택 
   		3) 선택한 메뉴에 따른 조건문 생성
	 */
	//<내가 푼거>
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		Ex5_Student st = new Ex5_Student("홍길동", 1, 1, 1, 0, 0, 0); 
		//변수 선언
		int menu = 0;
		final int max =30;
		Ex5_Student std[] = new Ex5_Student[max];
		String name;
		int grade, classNum, num;
		double kor, eng, math;
		int index = 0; //여기서 index는 현재 저장한 학생의 수
		
		while(menu != 5) {
			//메뉴 출력하고 메뉴 선택
			menu = selectMenu(scan);
			//기능 구현
			switch(menu) {
			case 1: //콘솔창에서 학생정보를 입력받고 정보 저장
				//std 배열에 각 학생들의 정보를 입력 받아 저장
				/*각각 학년 반 번호..어떻게 저장하지..
					std[i].grade 도 아니고..
					그냥 std[i]도 아니고...
					grade[i]도 아니고...
					grade.std[i] 아니고..
					std.classNum[i]...아녀
					클래스에 만든 변수는 private인디..못들고 오는디..
				 	아님 -> std[i] = {scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};
				 */
				//힌트보고... -> 반복문 아님...
				//내가 못한거 -> index를 반복문 안이 아니라 밖에 선언해야함1
				//정보 입력받음
				System.out.println("학생 정보 입력(예 : 학년 반 번호 이름): ");
				grade = scan.nextInt();
				classNum = scan.nextInt();
				num = scan.nextInt();
				name = scan.next();
				System.out.println("학생 성적 입력(예 : 국어 영어 수학): ");
				kor = scan.nextDouble();
				eng = scan.nextDouble();
				math = scan.nextDouble();
				//Ex5_Student의 생성자를 이용하여 객체를 생성한 후 index 번지에 저장	
				std[index] = new Ex5_Student(name, grade, classNum, num, kor, eng, math);
				//index 1증가
				index++;
				break;
			case 2: //저장된 전체 학생정보를 출력				
				//print 메소드는 배열이 아니라 객체 정보를 출력하는건데
				//배열에 저장된 정보를 출력하라고 하니까..
				//객체에 배열 저장하는거 찾는게 어려웠음..
				for(int i = 0; i < index; i++) {
					//<내가 푼거>
					//st = std[i];
					//st.print();
					
					// 요렇게 하면 더 간단...
					std[i].print();
				}
				break;
			case 3:/* 
				//<내가 푼거>
				//학년 반 번호를 입력
				System.out.println("학생 정보 입력(예: 학년 반 번호) : ");
				grade = scan.nextInt();
				classNum = scan.nextInt();
				num = scan.nextInt();
				//정보가 일치하면 			
				for(int i = 0; i < index; i ++) {
					if(std[i].equal(grade, classNum, num)) {
						//수정할 값 입력
						System.out.println("수정할 정보 입력(예: 이름 국어 영어 수학) : ");
						name = scan.next();
						kor = scan.nextDouble();
						eng = scan.nextDouble();
						math = scan.nextDouble();
						//이름 국어 수학 영어 성적 수정
						st.modify(name, kor, eng, math);
					}	
					if(!std[i].equal(grade, classNum, num)) {
						System.out.println("등록된 학생이 아닙니다");
					}
				}
				*/			
				//<선생님 풀이>
				System.out.println("수정할 학생 정보 입력(예: 학년 반 번호) : ");
				grade = scan.nextInt();
				classNum = scan.nextInt();
				num = scan.nextInt();
				
				for(int i = 0; i < index; i++) {
					if(std[i].equal(grade, classNum, num)) {
						System.out.println("수정할 정보 입력(예: 이름 국어 영어 수학) : ");
						name = scan.next();
						kor = scan.nextDouble();
						eng = scan.nextDouble();
						math = scan.nextDouble();
						std[i].modify(name, kor, eng, math);
						break;
					}
					if(i + 1 == index) {
						System.out.println("등록된 학생이 아닙니다");
					}
				}			
				break;
			case 4: 
				System.out.println("삭제할 학생 정보 입력(예: 학년 반 번호) : ");
				grade = scan.nextInt();
				classNum = scan.nextInt();
				num = scan.nextInt();
				/*
				//<내가 푼거1>
				for(int i = 0; i < index; i++) {
               		if(std[i].equal(grade, classNum, num)) {
                  	std[i] = null;
                  	index--;
                  	break;
               		}
				}
				*/
				
				//<내가 푼거 2>힌트보고
				//일치하는 학생 정보가 있으면 몇 번지인지 기억하고 반복문 종료 -> 삭제할 위치 찾기
				int delIndex = -1; //삭제할 정보의 번지
				for(int i = 0; i < index; i++) {
					if(std[i].equal(grade, classNum, num)) {
						delIndex = i;
						break;
					}
				}
				//delIndex가 0이상(일치하는 학생이 있음)이면 다음 번지를 현재 번지에 저장 -> 정보 덮어씌우기
				if(delIndex >= 0) {
					for(int i = delIndex; i < index - 1; i++) {
						std[i] = std[i+1];	
					}
					//index 1감소
					index--;
				}else {
					System.out.println("등록된 학생이 아닙니다");
				}	
				break;
			case 5: //프로그램이 종료되었다는 문구 출력
				System.out.println("프로그램 종료합니다...........");
				break;
			default: //예외처리 -> 1~5 이외의 값을 메뉴에 입력했을 때
				System.out.println("메뉴를 잘못 선택했습니다!!!!!!!");
			}			
		}
		scan.close();
	}

	//메소드
	/* 기능)메뉴를 출력하고, 메뉴를 입력한 메뉴를 돌려주는 메소드
	 * 매개변수: 입력받기 위한 스캐너 -> Scanner scan
	 * 리턴타입: 입력한 메뉴 -> int
	 * 메소드명: selectMenu
	 * */
	public static int selectMenu(Scanner scan) {
		System.out.println("------------메뉴-----------");
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 출력");
		System.out.println("3. 학생정보 수정");
		System.out.println("4. 학생정보 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 : ");
		
		int menu = scan.nextInt();
		System.out.println("-----------------------");
		
		return menu;
	}
}
