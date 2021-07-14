package jo.secondstep.openclosed.correct.interfaces;

import java.util.List;

import jo.secondstep.openclosed.correct.InvalidConnectionException;

public abstract class DatabaseSaveOperator implements Database {

	private String address;
	
	@Override
	final public void save(List<Object> data, String address) {
		try {
			this.address = address;
			validateConnection();
			process(data);
			
		}catch(InvalidConnectionException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public abstract void process(List<Object> data);
	
	public String getAddress() {
		return address;
	}
		
}
