package jo.secondstep.openclosed.correct.im;

import jo.secondstep.openclosed.correct.InvalidConnectionException;
import jo.secondstep.openclosed.correct.interfaces.Connection;

public class SSHConnection implements Connection {

	String address;
		
	public SSHConnection(String address) {
		this.address = address;
	}

	@Override
	public void connect(Object required) {
		if(!(required instanceof String))
			throw new InvalidConnectionException("Invalid password object type");
		
		System.out.println("Connect using SSH key: "+"\'"+address+"\'");
	}

}
