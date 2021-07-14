package jo.secondstep.openclosed.correct;

import java.util.*;

import jo.secondstep.openclosed.correct.im.AWS;
import jo.secondstep.openclosed.correct.im.MongoDB;
import jo.secondstep.openclosed.correct.im.MySql;
import jo.secondstep.openclosed.correct.interfaces.Database;
import jo.secondstep.openclosed.correct.interfaces.DatabaseSaveOperator;

public class DataStorage {

	public static void main(String[] arg) {
		List<Object> data = new ArrayList<>();
		data.add("1,Asem,24");
		data.add("2,Osama,17");
		data.add("3,Raed,33");
		data.add("4,Kareem,41");

		DatabaseSaveOperator db = new MySql();
		String address = "data.db";

		save(data, db, address);
	}

	public static void save(List<Object> data, Database db, String address) {
		db.save(data, address);
		
	}

}
