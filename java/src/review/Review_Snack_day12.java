package review;

public class Review_Snack_day12 extends Review_Product_day12 {
	//필드
	private int count; //과자는 박스과자임. 박스당 안에 든 과자 개수
	
	//생성자
	public Review_Snack_day12(String name, int amount, int price, int count) {
		super(name, amount, price);
		this.count = count;
	}
	
	public Review_Snack_day12(Review_Snack_day12 product) {
		this(product.getName(), product.getPrice(), product.getAmount(), product.getCount());
	}
	
	//getter, setter
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	//기능1) 제품 출력
	@Override
	public void print() {
		System.out.println(getName() + " | " + getAmount() + "개 | " + getPrice() + "원 | "
		+ count + "개/1box" );	
	}

}
