package jo.secondstep.openclosed.wrong.interfaces;

import jo.secondstep.openclosed.wrong.im.IPAddress;

public interface NoSql extends Database {

	void setConnection(IPAddress ip, int port);
}
