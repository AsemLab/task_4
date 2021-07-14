package jo.secondstep.openclosed.wrong.im;

import java.util.List;

import jo.secondstep.openclosed.wrong.interfaces.Connection;
import jo.secondstep.openclosed.wrong.interfaces.SQL;

public class MySql implements SQL {

	private SqlAddress dbAddress;

	@Override
	public void setConnection(Connection connection) {
		dbAddress = (SqlAddress) connection;
		dbAddress.connect();
	}

	@Override
	public void save(List<Object> data) {

		System.out.println("Save data to MySql");
	}

}
