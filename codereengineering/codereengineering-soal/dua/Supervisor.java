public class Supervisor extends AntiWideHierarcy{
	public int getBonus(){
		if(getKpi() > 3.5)
			return 3 * gaji;
		else if(getKpi() > 3)
			return 2 * gaji;
		else if(getKpi() > 2.5)
			return 1 * gaji;
		else
			return 0;
	}

	public void medicalBenefitInfo(){
		System.out.println("Rawat inap : 1.000.000/malam");
		System.out.println("ICU : 2.000.000/malam");
		System.out.println("Medical Checkup : 5.000.000/tahun");
		// and other benefit
	}
}