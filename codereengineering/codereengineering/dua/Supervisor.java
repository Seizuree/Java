public class Supervisor extends Technical{
	public int getBonus(){
		if(getKPI() > 3.5)
			return 3 * getGaji();
		else if(getKPI() > 3)
			return 2 * getGaji();
		else if(getKPI() > 2.5)
			return 1 * getGaji();
		else
			return 0;
	}
}