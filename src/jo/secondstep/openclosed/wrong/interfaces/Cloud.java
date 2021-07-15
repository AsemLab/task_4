package jo.secondstep.openclosed.wrong.interfaces;

import jo.secondstep.openclosed.wrong.im.SSHConnection;

public interface Cloud extends Database{

	void setConnection(SSHConnection ssh, String password);
	
}
