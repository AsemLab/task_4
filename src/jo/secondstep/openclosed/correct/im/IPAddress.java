package jo.secondstep.openclosed.correct.im;

import jo.secondstep.openclosed.correct.InvalidConnectionException;
import jo.secondstep.openclosed.correct.interfaces.Connection;

public class IPAddress implements Connection {

	String address;

	public IPAddress(String address) {
		this.address = address;
	}

	@Override
	public void connect(Object required) {
		try {
			int r = (int) required;
			
			System.out.println("Connect using IP address: "+address+":"+r);
			
		}catch(ClassCastException e) {
			throw new InvalidConnectionException("Invalid port object type");
		}
		
	}

}
