package review;

import java.util.Scanner;

public class Review_RemoteController_day10 {

	public static void main(String[] args) {
		
		/*예제) 메뉴를 출력 후 메뉴에 맞는 기능을 동작하도록 코드 작성
		* <메뉴>
		* 1. 채널 UP1
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
		RemoteController1 rc = new RemoteController1();
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		while(menu != 7) {
			System.out.println("<메뉴>\n1. 채널 UP\n2. 채널 DOWN\n3. 채널 변경\n4. 볼륨 UP\n5. 볼륨 DOWN\n6. 전원\n7. 종료");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: rc.channelUp(); break;
			case 2: rc.channelDown(); break;
			case 3:
				System.out.print("채널 입력 : ");
				int ch = scan.nextInt();
				rc.channel(ch);
				break;
			case 4: rc.volumeUp(); break;
			case 5: rc.volumeDown(); break;
			case 6: rc.turn(); break;
			case 7: System.out.println("프로그램 종료"); break;
			default: System.out.println("잘못된 메뉴입니다");
			}
		}
	}
		
}


class RemoteController1{
	//필드: 전원, 채널, 음량
	boolean power; 
	int channel; 
	int volume;
	int minVolume = 0;
	int maxVolume = 32;
	int minChannel = 1;
	int maxChannel= 999;
		
	//메소드		
	//기능1)tv를 켜거나 끄는 메소드
	void turn() {
		power = !power;
		if(power) {
			System.out.println("tv를 켰습니다");
		}else {
			System.out.println("tv를 껐습니다");
		}
	}
		
	//기능2) tv 소리를 한칸 올리는 메소드
	void volumeUp() {
		if(power) {
			if(volume < maxVolume) {
				volume++;
			}
			System.out.println("소리 : " + volume);
		}
	}
				
	//기능3) tv 소리를 한칸 내리는 메소드
	void volumeDown() {
		if(power) {
			if(volume > minVolume) {
				volume--;
			}
			System.out.println("소리 : " + volume);
		}	
	}

	// 기능4): tv 채널을 1씩 증가하는 메소드
	void channelUp() {
		if(power) {
			if(channel < maxChannel) {
				channel++;
			}
			System.out.println("채널 : " + channel);
		}
	}
	
	// 기능5) tv 채널을 1씩 감소하는 메소드
	void channelDown() {
		if(power) {
			if(channel > minChannel) {
				channel--;
			}
			System.out.println("채널 : " + channel);
		}
	}
		
	// 기능6) 입력한 채널로 이동하는 메소드
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
	public RemoteController1() {
		channel = minChannel;
		volume = minVolume;
	}
	public RemoteController1(int ch, int vol) {
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

