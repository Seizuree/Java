public class Manager extends Technical{
	public int getBonus(){
		if(getKPI() > 3.8)
			return 3 * getGaji();
		else if(getKPI() > 3.3)
			return 2 * getGaji();
		else if(getKPI() > 2.8)
			return 1 * getGaji();
		else
			return 0;
	}
}