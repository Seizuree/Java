package singleton;

import java.util.ArrayList;

import model.Confectionary;

public class Database {
	private static Database db;
	private ArrayList<Confectionary> confectionaries;

	private Database() {

	}

	public static Database getInstance() {
		if (db == null) {
			synchronized (Database.class) {
				if (db == null) {
					db = new Database();
				}
			}
		}
		return db;
	}

	public void addConfectionary(Confectionary confectionary) {
		confectionaries.add(confectionary);
	}

	public void deleteConfectionary(int index) {
		confectionaries.remove(index);
	}

	public static Database getDb() {
		return db;
	}

	public ArrayList<Confectionary> getConfectionaries() {
		return confectionaries;
	}

}
