package jo.secondstep.openclosed.wrong.im;

import java.util.List;

import jo.secondstep.openclosed.wrong.interfaces.Cloud;

public class AWS implements Cloud {

	private SSHConnection ssh;

	@Override
	public void setConnection(SSHConnection ssh, String password) {
		this.ssh = ssh;
		this.ssh.connect(password);
	}

	@Override
	public void save(List<Object> data) {

		System.out.println("Save data to AWS");
	}

	
	
}
