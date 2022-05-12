package day12;

public abstract class Product_Mart {
	//제품명
	private String name;
	//가격
	private int price;
	//수량
	private int amount; 
	
	//private으로 외부에서 활용하기 위해 getter, setter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	//생성자
	public Product_Mart(String name) {
		this(name,0,0);
	}
	public Product_Mart(String name, int price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	//추상 메소드
	public abstract void print();
	
	//메소드: 수량이 주어지면 기존 수량에 누적하는 메소드
	public void sumAmount(int amount) {
		this.amount += amount;
	}
}
