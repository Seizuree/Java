package virtual;

public class ImageDisplay implements IDisplayImage {
	
	private String url;

	public ImageDisplay(String url) {
		super();
		this.url = url;
		loadData();
	}
	
	private void loadData() {
		// TODO Auto-generated method stub
		System.out.println("Loading Heavy tasks");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void displayImage() {
		// TODO Auto-generated method stub
		System.out.println("Displaying " + url);
	}

}
