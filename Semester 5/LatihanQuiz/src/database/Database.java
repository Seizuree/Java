package database;

import java.util.ArrayList;

import model.Confectionary;

public class Database {
	private static volatile Database instance;
	private ArrayList<Confectionary> confectionary = null;

	private Database() {
		confectionary = new ArrayList<Confectionary>();
	}

	public static Database getInstance() {
		if (instance == null) {
			synchronized (Database.class) {
				if (instance == null)
					instance = new Database();
			}
		}
		System.out.println("Getting connection!");
		return instance;
	}

	public ArrayList<Confectionary> getConfectionary() {
		return confectionary;
	}
}
