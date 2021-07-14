package jo.secondstep.openclosed.wrong.im;

import jo.secondstep.openclosed.wrong.interfaces.Connection;

public class IPAddress implements Connection {

	String address;

	public IPAddress(String address) {
		this.address = address;
	}

	@Override
	public void connect() {

		System.out.println("Connect using IP address");
	}

}
