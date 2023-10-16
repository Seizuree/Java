package model;

public abstract class Steak implements Cloneable {
	public String name;
	public String sauce;
	public double price;
	
//	adapter ga bikin constructor di parent
	
//	object steak harus bisa mendeskripsikan diri sendiri
	public abstract void printDetails();
	
	public Steak Clone() {
		Steak copiedSteak = null;
		try {
			copiedSteak = (Steak) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return copiedSteak;
	}
}
