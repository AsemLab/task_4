package jo.secondstep.openclosed.wrong.im;

import java.util.List;

import jo.secondstep.openclosed.wrong.interfaces.Connection;
import jo.secondstep.openclosed.wrong.interfaces.NoSql;

public class MongoDB implements NoSql {

	private IPAddress ip;

	@Override
	public void setConnection(Connection connection) {
		ip = (IPAddress) connection;
		ip.connect();
	}

	@Override
	public void save(List<Object> data) {
		System.out.println("Save data to MongoDB");

	}

}
