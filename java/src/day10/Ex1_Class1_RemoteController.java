package day10;

import java.util.Scanner;

public class Ex1_Class1_RemoteController {

	public static void main(String[] args) {
		/*예제) 메뉴를 출력 후 메뉴에 맞는 기능을 동작하도록 코드 작성
		* <메뉴>
		* 1. 채널 UP
		* 2. 채널 DOWN
		* 3. 채널 변경
		* 4. 볼륨 UP
		* 5. 볼륨 DOWN
		* 6. 전원
		* 7. 종료
		* 메뉴를 선택하세요: 6
		* TV를 껐습니다
		* <메뉴>~
		* 메뉴를 선택하세요: 
		* 채널입력: 100
		* 채널: 100
		*/
		
		//<내가 푼거>
		RemoteController rm = new RemoteController();
		Scanner scan = new Scanner(System.in);
		//메뉴 출력
		int menu = 6;
		while(menu != 7) {
			/*
			System.out.println("<메뉴>");
			System.out.println("1. 채널 UP");
			System.out.println("2. 채널 DOWN");
			System.out.println("3. 채널 변경");
			System.out.println("4. 볼륨 UP");
			System.out.println("5. 볼륨 DOWN");
			System.out.println("6. 전원");
			System.out.println("7. 종료");
			
			*/
			//\n으로 한줄로 메뉴 출력할 수 있음
			System.out.println("<메뉴>\n1. 채널 UP\n2. 채널 DOWN\n3. 채널 변경\n4. 볼륨 UP\n5. 볼륨 DOWN\n6. 전원\n7. 종료");
			System.out.print("메뉴 선택 : ");
			//메뉴 입력
			menu = scan.nextInt();
			//기능 구현
			switch(menu) {
			case 1: rm.channelUp(); break;
			case 2: rm.channelDown(); break;
			case 3:
				System.out.print("채널 입력 : ");
				int ch = scan.nextInt();
				rm.channel(ch);
				break;
			case 4: rm.volumeUp(); break;
			case 5: rm.volumeDown(); break;
			case 6: rm.turn(); break;
			case 7: System.out.println("프로그램 종료"); break;
			default: System.out.println("잘못된 메뉴입니다");
			}
			System.out.println();
			System.out.println("-----------------------");
		}
		scan.close();

	}

}

//예제) tv 리모컨 클래스를 생성하고, 객체를 생성 후 기능들을 테스트 해보세요
class RemoteController{
	//필드: 전원, 채널, 음량
	boolean power; //켜고 끄고 2개
	int channel; 
	int volume;
	int minVolume = 0;
	int maxVolume = 32;
	int minChannel = 1;
	int maxChannel= 999;
	
	//메소드
	/* 기능: tv를 켜는 메소드
	 * 매개변수: 없음
	 * 리턴타입: 없음 -> void
	 * 메소드명: turnOn
	 */
	void turnOn() {
		power = true;
		System.out.println("tv를 켰습니다");
	}
	
	/* 기능: tv를 끄는 메소드
	 * 매개변수: 없음
	 * 리턴타입: 없음 -> void
	 * 메소드명: turnOff
	 */
	void turnOff() {
		power = false;
		System.out.println("tv를 껐습니다");
	}
	
	/* 기능: tv를 켜거나 끄는 메소드
	 * 매개변수: 없음
	 * 리턴타입: 없음 -> void
	 * 메소드명: turn
	 */
	void turn() {
		power = !power;
		if(power) {
			System.out.println("tv를 켰습니다");
		}else {
			System.out.println("tv를 껐습니다");
		}
	}
	
	/* 기능: tv 소리를 한칸 올리는 메소드
	 * 매개변수: 없음
	 * 리턴타입: 없음 -> void -> 필드값만 바꾸는 경우 대부분 리턴타입 없음
	 * 메소드명: volumeUp
	 */
	void volumeUp() {
		//전원이 켜져있고 소리가 최대치가 아니면
		if(power) {
			if(volume < maxVolume) {
				volume++;
			}
			System.out.println("소리 : " + volume);
		}
	}
		
	
	/* 기능: tv 소리를 한칸 내리는 메소드
	 * 매개변수: 없음
	 * 리턴타입: 없음 -> void
	 * 메소드명: volumeDown
	 */
	void volumeDown() {
		//전원이 켜져있고 소리가 최소치가 아니면
		if(power) {
			if(volume > minVolume) {
				volume--;
			}
			System.out.println("소리 : " + volume);
		}	
	}

	/* 기능: tv 채널을 1씩 증가하는 메소드
	 * 매개변수: 없음
	 * 리턴타입: 없음 -> void
	 * 메소드명: channelUp
	 */
	void channelUp() {
		if(power) {
			if(channel < maxChannel) {
				channel++;
			}
			System.out.println("채널 : " + channel);
		}
	}
	
	/* 기능: tv 채널을 1씩 감소하는 메소드
	 * 매개변수: 없음
	 * 리턴타입: 없음 -> void
	 * 메소드명: channelDown
	 */
	void channelDown() {
		if(power) {
			if(channel > minChannel) {
				channel--;
			}
			System.out.println("채널 : " + channel);
		}
	}
	
	/* 기능: 입력한 채널로 이동하는 메소드
	 * 매개변수: 이동할 채널 -> int ch
	 * 리턴타입: 없음 -> void
	 * 메소드명: channel
	 */
	void channel(int ch) {
		if(power) {
			if(ch < minChannel) {
				channel = minChannel;
			}else if(ch > maxChannel) {
				channel = maxChannel; 
			}else {
				channel = ch;
			}
			System.out.println("채널 : " + channel);
		}
	}
	
	//생성자 	
	//기본생성자 -> 안만들어도 자동 호출되서 실행 가능
	//그러나 생성자가 하나만 있어도 안만들면 오류남 -> 객체 생성할 때 초기화해주면 오류 안남
	public RemoteController() {
		channel = minChannel; //채널을 0번이 없기 때문에 minChannel로 초기화 해줌
		volume = minVolume;
	}
	public RemoteController(int ch, int vol) {
		if(ch >= minChannel && ch <= maxChannel) {
			channel = ch;
		}else {
			channel = minChannel;
		}
		if(vol >= minVolume && vol <= maxVolume) {
			volume = vol;
		}else {
			volume = minVolume;
		}		
	}
	
}