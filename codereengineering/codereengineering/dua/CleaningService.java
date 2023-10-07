public class CleaningService extends Employee{
	private int jamLembur;

	public int getCurrentGaji(){
		return getGaji() + getUpahLembur();
	}

	public void setJamLembur(int jamLembur){
		this.jamLembur = jamLembur;
	}

	public int getJamLembur(){
		return jamLembur;
	}

	public int getUpahLembur(){
		return jamLembur * getGaji() / 100;
	}
}