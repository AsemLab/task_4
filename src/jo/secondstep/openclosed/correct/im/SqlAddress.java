package jo.secondstep.openclosed.correct.im;

import jo.secondstep.openclosed.correct.InvalidConnectionException;
import jo.secondstep.openclosed.correct.interfaces.Connection;

public class SqlAddress implements Connection {

	String address;
	
	public SqlAddress(String address) {
		this.address = address;
	}

	@Override
	public void connect(Object required) {
		if(!(required instanceof String))
			throw new InvalidConnectionException("Invalid username object type");
		
		
		System.out.println("Connect using local database: "+address);
	}

}
