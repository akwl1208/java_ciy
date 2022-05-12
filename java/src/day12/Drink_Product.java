package day12;

public class Drink_Product extends Product_Mart {
	
	private int capacity; //용량 ml
	
	//생성자
	public Drink_Product(String name, int price, int amount, int capacity) {
		super(name, price, amount);
		this.capacity = capacity;
	}
	
	public Drink_Product(Drink_Product product) {
		this(product.getName(), product.getPrice(), product.getAmount(), product.getCapacity());
	}
	
	//메소드
	@Override
	public void print() {
		if(capacity<1000) {
			System.out.println(getName() + "[" + capacity + " ml] : " + getPrice() + "원 - "
			+ getAmount()+ "개");
		}else {
			System.out.println(getName() + "[" + capacity/1000.0 + " L] : " + getPrice() + "원 - "
					+ getAmount()+ "개");
		}
	}
	
	//getter, setter
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
