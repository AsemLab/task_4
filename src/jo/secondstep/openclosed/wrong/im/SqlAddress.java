package jo.secondstep.openclosed.wrong.im;

import jo.secondstep.openclosed.wrong.interfaces.Connection;

public class SqlAddress implements Connection {

	String address;
	
	public SqlAddress(String address) {
		this.address = address;
	}

	@Override
	public void connect() {
	
		System.out.println("Connect using local database");;
	}

}
