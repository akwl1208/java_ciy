package review;

public class Review_Drink_day12 extends Review_Product_day12{
	//필드
	private int capacity; //음료수 용량-ml
	
	//생성자
	public Review_Drink_day12(String name, int amount, int price, int capacity) {
		super(name, amount, price);
		this.capacity = capacity;
	}
	
	public Review_Drink_day12(Review_Drink_day12 product) {
		this(product.getName(), product.getPrice(), product.getAmount(), product.getCapacity());
	}

	//getter, setter
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	//기능1) 제품 출력
	@Override
	public void print() {
		System.out.println(getName() + " | " + getAmount() + "개 | " + getPrice() + "원 | "
				+ capacity + "ml" );
	}

}
