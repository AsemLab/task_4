package jo.secondstep.openclosed.correct.interfaces;

import java.util.List;

import jo.secondstep.openclosed.correct.InvalidConnectionException;

public abstract class DatabaseSaveOperator implements Database {

	private String address;
	private Object required;
	
	@Override
	final public void save(List<Object> data, String address, Object required) {
		try {
			this.address = address;
			this.required = required;
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

	public Object getRequired() {
		return required;
	}
		
}
