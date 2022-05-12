package day12;

public class SnackBox_Product extends Product_Mart {
	
	private int count;
	
	//생성자
	public SnackBox_Product(String name, int price, int amount, int count) {
		super(name, price, amount);
		this.count = count;
	}
	
	public SnackBox_Product(SnackBox_Product product) {
		this(product.getName(), product.getPrice(), product.getAmount(), product.getCount());
	}
	
	//메소드
	@Override
	public void print() {	
		System.out.println(getName() + "[박스당 " + count + "개] : " + getPrice() + "원 - "
		+ getAmount()+ "개");
	}
	
	//getter, setter
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

}
