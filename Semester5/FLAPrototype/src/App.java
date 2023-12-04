import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        new App();
    }

    public App(){
        Product p = new Product("Samsung", 2);
        ArrayList <Product> productList = new ArrayList<Product>();

        productList.add(p);
        
        try {
			Product p2 = (Product) p.clone();
		} catch (Exception e) {
			// TODO: handle exception
		}

        for (int i = 0; i < 100; i++) {
            try {
            	productList.add((Product) p.clone());				
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
        }
        
        for (Product product : productList) {
			System.out.println(product.getName() + product.getPrice());
		}
    }
}
