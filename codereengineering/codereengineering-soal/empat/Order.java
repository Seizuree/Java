
import java.util.Vector;

public abstract class Order {
	private String orderID;
	private Shipping shipping;
	private Vector<Item>items = new Vector<>();
	private double lonOrigin,latOrigin;
	private double lonDestination,latDestination;

	public void addItem(Item item){
		items.add(item);
	}

	public Vector<Item> getItems(){
		return items;
	}
	public Item getItem(int idx){
		return items.get(idx);
	}

	public int getTotalPrice(){
		int totalPrice=0;
		int shipPrice = getShippingPrice();

		for(int i=0;i<items.size();i++){
			totalPrice = totalPrice + (items.get(i).getPrice() * items.get(i).getQty());
		}

		return totalPrice+shipPrice;
	}

	public double getLonOrigin() {
		return lonOrigin;
	}

	public void setLonOrigin(double lonOrigin) {
		this.lonOrigin = lonOrigin;
	}

	public double getLatOrigin() {
		return latOrigin;
	}

	public void setLatOrigin(double latOrigin) {
		this.latOrigin = latOrigin;
	}

	public double getLonDestination() {
		return lonDestination;
	}

	public void setLonDestination(double lonDestination) {
		this.lonDestination = lonDestination;
	}

	public double getLatDestination() {
		return latDestination;
	}

	public void setLatDestination(double latDestination) {
		this.latDestination = latDestination;
	}

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public int getShippingPrice(){
		int totalWeight = 0,totalPrice=0;
		for(int i=0;i<getItems().size();i++){
			totalWeight += getItem(i).getWeight();
		}
		return totalPrice;
	}
}
