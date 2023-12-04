package cache;

public class RealService implements IFetchData {
	
	public String fetchData(String url) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Page from the url: " + url;
	}
}
