
public abstract class JNE extends Shipping {

	public JNE(Order order) {
		super(order);
		// TODO Auto-generated constructor stub
	}
	public int getEstimationDays(){
		int estimation = (int)getDistance() / 20;
		return estimation + 1;
	}

}
