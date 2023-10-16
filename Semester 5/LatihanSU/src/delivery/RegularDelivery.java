package delivery;

public class RegularDelivery extends Delivery{
	public RegularDelivery(int price) {
		super(price);
	}
	public RegularDelivery() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + 5000;
	}
}
