public class CleaningService extends Employee{
	private int jamLembur;

	public int getGaji(){
		return gaji + getUpahLembur();
	}

	public void setJamLembur(int jamLembur){
		this.jamLembur = jamLembur;
	}

	public int getJamLembur(){
		return jamLembur;
	}

	public int getUpahLembur(){
		return jamLembur * gaji / 100;
	}

}