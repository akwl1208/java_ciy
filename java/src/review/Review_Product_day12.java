package review;

public abstract class Review_Product_day12 {
	//필드: 제품명, 수량, 가격
	private String name;
	private int amount;
	private int price;
	
	//생성자
	public Review_Product_day12(String name, int amount, int price) {		
		this.name = name;
		this.amount = amount;
		this.price = price;		
	}
	
	//기능1) 제품 출력
	public abstract void print();
	
	//기능2) 수량 누적 합계
	public void sumAmount(int amount) {
		this.amount += amount;
	}
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
}
