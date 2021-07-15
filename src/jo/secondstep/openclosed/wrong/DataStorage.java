package jo.secondstep.openclosed.wrong;

import java.util.*;

import jo.secondstep.openclosed.wrong.im.AWS;
import jo.secondstep.openclosed.wrong.im.IPAddress;
import jo.secondstep.openclosed.wrong.im.MongoDB;
import jo.secondstep.openclosed.wrong.im.MySql;
import jo.secondstep.openclosed.wrong.im.SSHConnection;
import jo.secondstep.openclosed.wrong.im.SqlAddress;
import jo.secondstep.openclosed.wrong.interfaces.Database;

public class DataStorage {

	public static void main(String[] arg) {
		List<Object> data = new ArrayList<>();
		data.add("1,Asem,24");
		data.add("2,Osama,17");
		data.add("3,Raed,33");
		data.add("4,Kareem,41");

		Database db = new MongoDB();
		String address = "1.2.3.4";
		Object required = 8084;

		save(data, db, address, required);
	}

	public static void save(List<Object> data, Database db, String address, Object required) {
		if (db instanceof AWS) {

			((AWS) db).setConnection(new SSHConnection(address), (String) required);

		} else if (db instanceof MySql) {

			((MySql) db).setConnection(new SqlAddress(address), (String) required);

		} else if (db instanceof MongoDB) {

			((MongoDB) db).setConnection(new IPAddress(address), (int) required);

		}

		db.save(data);
	}

}
