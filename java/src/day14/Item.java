package day14;
//내역
public class Item implements Cloneable{
	//날짜, 구분(수입/지출), 구분(결제방식), 상세항목, 금액
	private String date; //날짜
	private boolean income; //구분(수입/지출)
	private String payment; //구분(결제방식)
	private String content; //상세항목
	private int price; //금액
	
	//클론
	@Override
	public Item clone() {
		Item obj = null;
		
		try {
			obj = (Item)super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	//기능1) 항목을 수정하는 기능
	public void modify(String date, boolean income, String payment, String content, int price) {
		if(date != null) {
			this.date = date;
		}
		if(payment != null) {
			this.payment = payment;
		}
		if(content != null) {
			this.content = content;
		}
		if(price >= 0) {
			this.price = price;
		}
		//참 아니면 거짓 밖에 없어서 조건없이 설정
		this.income = income;
	}
	
	//기능2)
	@Override
	public String toString() {
		return "내역 [" + date + " | " + (income?"수입":"지출") + " | " + payment
				+ " | " + content + " | " + price + "원]";
	}
	
	
	//생성자
	public Item(String date, boolean income, String payment, String content, int price) {
		this.date = date;
		this.income = income;
		this.payment = payment;
		this.content = content;
		this.price = price;
	}
	


	//getter, setter
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean isIncome() {
		return income;
	}
	public void setIncome(boolean income) {
		this.income = income;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
