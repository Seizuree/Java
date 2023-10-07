
public abstract class JNT extends Shipping {

	public JNT(Order order) {
		super(order);
		// TODO Auto-generated constructor stub
	}
	public int getEstimationDays(){
		int estimation = (int)(getDistance()-5) / 25;
		if(estimation < 0) estimation=0;
		return estimation + 1;
	}

}
