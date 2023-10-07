
public abstract class TIKI extends Shipping {

	public TIKI(Order order) {
		super(order);
		// TODO Auto-generated constructor stub
	}

	public int getEstimationDays(){
		int estimation = (int)(getDistance()+5) / 30;
		return estimation + 1;
	}
}
