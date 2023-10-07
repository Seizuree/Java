public abstract class AntiWideHierarcy extends Employee {

	public AntiWideHierarcy() {
		// TODO Auto-generated constructor stub
	}

	public AntiWideHierarcy(String nip, String nama, String alamat, String email, int gaji) {
		super(nip, nama, alamat, email, gaji);
		// TODO Auto-generated constructor stub
	}
	
	private float kpi;
	
	public float getKpi() {
		return kpi;
	}

	public void setKpi(float kpi) {
		if (kpi > 4)kpi = 4;
		else if(kpi < 0) kpi=0;
		this.kpi = kpi;
	}

	public abstract int getBonus();
	public abstract void medicalBenefitInfo();

}
