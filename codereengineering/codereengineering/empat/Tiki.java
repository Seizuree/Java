
public class Tiki extends Shipping {

	public Tiki(Order order) {
		super(order);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getEstimationDays() {
		// TODO Auto-generated method stub
		return (int)((getDistance()+5) / 30)+1;
	}

}
