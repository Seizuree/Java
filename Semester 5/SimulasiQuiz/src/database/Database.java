package database;

import java.util.ArrayList;

import model.Steak;

public class Database {
	public ArrayList<Steak> data;
	
	private static Database instance;
	
	private Database() {
		data = new ArrayList<>();
	}
	
	public static Database getInstance() {
		if(instance == null) {
			instance = new Database();
		}
		return instance;
	}
}
