package jo.secondstep.openclosed.wrong.im;

import jo.secondstep.openclosed.wrong.interfaces.Connection;

public class SSHConnection implements Connection {

	String address;
		
	public SSHConnection(String address) {
		this.address = address;
	}

	@Override
	public void connect() {
	
		System.out.println("Connect using SSH key");;
	}

}
