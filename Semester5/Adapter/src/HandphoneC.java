public class HandphoneC {

		
	private String brand;
	private int battery;
	
	public HandphoneC(String brand) {
		// TODO Auto-generated constructor stub
		this.brand = brand;
		this.battery = 100;
	}
	
	public void playing() {
		System.out.println(brand+ " is playing!");
		while(battery > 0) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(".");
			battery = battery-20;
		}
	}
	
	public void charging(ChargerC charger) {
		System.out.println(brand+ " is charging!");
		while(battery < 100) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(".");
			battery += charger.getOutput();
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
	
}
