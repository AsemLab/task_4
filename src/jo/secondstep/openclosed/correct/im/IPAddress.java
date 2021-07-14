package jo.secondstep.openclosed.correct.im;

import jo.secondstep.openclosed.correct.interfaces.Connection;

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
