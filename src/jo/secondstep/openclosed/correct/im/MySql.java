package jo.secondstep.openclosed.correct.im;

import java.util.List;

import jo.secondstep.openclosed.correct.*;
import jo.secondstep.openclosed.correct.interfaces.*;

public class MySql extends SQL {

	private SqlAddress dbAddress;

	@Override
	public void validateConnection() {
		
		dbAddress = new SqlAddress(getAddress());
		dbAddress.connect(getRequired());
		
	}

	@Override
	public void process(List<Object> data) {
		System.out.println("Save data to MySql");
	}


}
