package homework1_baseballgame;

public class BaseballGameRecords {
 //필드 -> 플레이어 이름, 플레이 날짜, 점수
	private String playername;
	private String date;
	private int score;
	
	//생성자
	public BaseballGameRecords(String playername, String date, int score) {
		this.playername = playername;
		this.date = date;
		this.score = score;
	}
	
	//기능1) 기록 출력
	@Override
	public String toString() {
		return "기록 [" + playername + " | " + date + " | " + score + "점]";
	}


	//getter and setter
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
