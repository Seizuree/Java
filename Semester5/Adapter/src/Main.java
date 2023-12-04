public class Main {

	public Main() {
		HandphoneC hp = new HandphoneC("kPhone");
		ChargerC cType = new ChargerC();
		ChargerB bType = new ChargerB();
		AdapterToC adapter = new AdapterToC(bType);
		
		//Charger C
		System.out.println("CHARGER C");
		System.out.println("Battery = " +hp.getBattery());
		hp.playing();
		System.out.println("Battery = " +hp.getBattery());
		hp.charging(cType);
		System.out.println("Battery = " +hp.getBattery());
		
		//Charger B
		System.out.println("CHARGER B");
		System.out.println("Battery = " +hp.getBattery());
		hp.playing();
		System.out.println("Battery = " +hp.getBattery());
		hp.charging(adapter);
		System.out.println("Battery = " +hp.getBattery());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
