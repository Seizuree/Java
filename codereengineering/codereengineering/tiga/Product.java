
/*
 *
 * Smell code			: Incomplete Abstraction
 * potential cause(s)	: Tidak ada method getStock dalam class Product
 * solution(s)			: Buat method getStock
 *
 */

public class Product {
	private String productID;
	private String name;
	private int stock,price;
	
	public int getStock() {
		return stock;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
