package review;

public class Day14_Category implements Cloneable{
	//필드: 날짜, 수입/지출, 결제방식, 항목, 금액
	private String date;
	private String status; 
	private String payment;
	private String item;
	private int price;
	
	//생성자
	public Day14_Category(String date, String status, String payment, String item, int price) {
		this.date = date;
		this.status = status;
		this.payment = payment;
		this.item = item;
		this.price = price;
	}
	
	//클론
	@Override
	public Day14_Category clone() {
		Day14_Category obj = null;
		
		try {
			obj = (Day14_Category)super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;	
	}
	
	//기능1) 내역 항목 출력 -> 요거 안하니까 출력하면 주소 출력됨
	@Override
	public String toString() {
		return "내역 [" + date + " | " + status + " | " + payment + " | " + item
				+ " | " + price + "]";
	}

	//기능2) 내역 수정
	public void modify(String date, String status, String payment, String item, int price) {
		if(date != null) {
			this.date = date;
		}
		if(status != null) {
			this.status = status;
		}
		if(payment != null) {
			this.payment = payment;
		}
		if(item != null) {
			this.item = item;
		}
		if(price >= 0) {
			this.price = price;
		}
	}
	
	//getter and setter
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
