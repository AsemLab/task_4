package jo.secondstep.openclosed.wrong.interfaces;

import jo.secondstep.openclosed.wrong.im.SqlAddress;

public interface SQL extends Database {
	
	void setConnection(SqlAddress sql, String username);
}
