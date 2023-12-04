package protection;

public class Database implements IExecutable {

	public Database() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executeQuery(String query) throws Exception {
		System.out.println(query);
		
	}

}
