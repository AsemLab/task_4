package jo.secondstep.openclosed.wrong.im;

import java.util.List;
import jo.secondstep.openclosed.wrong.interfaces.SQL;

public class MySql implements SQL {

	private SqlAddress dbAddress;

	@Override
	public void setConnection(SqlAddress sql, String username) {
		dbAddress = sql;
		dbAddress.connect(username);
	}

	@Override
	public void save(List<Object> data) {

		System.out.println("Save data to MySql");
	}

}
