package database;

import java.util.ArrayList;

import model.Cake;

public class Database {

	private static Database instance;
	public ArrayList<Cake> cakeDB = null;
	
	public Database() {
		// TODO Auto-generated constructor stub
		cakeDB = new ArrayList<Cake>();	
	}
	
	public ArrayList<Cake> getList(){
		return cakeDB;
	}
	
	public static Database getInstance() {
		
		if(instance == null) {
			instance = new Database();
			return instance;
		} 
		return instance;
	}
}
