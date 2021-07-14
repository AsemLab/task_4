package jo.secondstep.openclosed.wrong.im;

import java.util.List;

import jo.secondstep.openclosed.wrong.interfaces.Cloud;
import jo.secondstep.openclosed.wrong.interfaces.Connection;

public class AWS implements Cloud {

	private SSHConnection ssh;

	@Override
	public void setConnection(Connection connection) {
		ssh = (SSHConnection) connection;
		ssh.connect();
	}

	@Override
	public void save(List<Object> data) {

		System.out.println("Save data to AWS");
	}

	
	
}
