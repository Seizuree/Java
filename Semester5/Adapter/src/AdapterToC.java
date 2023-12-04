public class AdapterToC extends ChargerC{
	
	private ChargerB chargerB;
	
	public AdapterToC(ChargerB chargerB) {
		// TODO Auto-generated constructor stub
		this.chargerB = chargerB;
	}

	@Override
	public int getOutput() {
		return chargerB.getOutput();
	}
	
}
