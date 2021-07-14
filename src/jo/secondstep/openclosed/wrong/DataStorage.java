package jo.secondstep.openclosed.wrong;

import java.util.*;

import jo.secondstep.openclosed.wrong.im.AWS;
import jo.secondstep.openclosed.wrong.im.IPAddress;
import jo.secondstep.openclosed.wrong.im.MongoDB;
import jo.secondstep.openclosed.wrong.im.MySql;
import jo.secondstep.openclosed.wrong.im.SSHConnection;
import jo.secondstep.openclosed.wrong.im.SqlAddress;
import jo.secondstep.openclosed.wrong.interfaces.Connection;
import jo.secondstep.openclosed.wrong.interfaces.Database;

public class DataStorage {

	public static void main(String[] arg) {
		List<Object> data = new ArrayList<>();
		data.add("1,Asem,24");
		data.add("2,Osama,17");
		data.add("3,Raed,33");
		data.add("4,Kareem,41");

		Database db = new MongoDB();
		String address = "54515weddjuh215";

		save(data, db, address);
	}

	public static void save(List<Object> data, Database db, String address) {
		if (db instanceof AWS) {
			db.setConnection((Connection) new SSHConnection(address));
		} else if (db instanceof MySql) {
			db.setConnection((Connection) new SqlAddress(address));
		} else if (db instanceof MongoDB) {
			db.setConnection((Connection) new IPAddress(address));
		}
		
		db.save(data);
	}

}
