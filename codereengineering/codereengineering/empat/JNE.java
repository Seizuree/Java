
public class JNE extends Shipping {

	public JNE(Order order) {
		super(order);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getEstimationDays() {
		// TODO Auto-generated method stub
		return (int)(getDistance()/20)+1;
	}
}