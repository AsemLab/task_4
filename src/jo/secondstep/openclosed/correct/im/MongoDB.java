package jo.secondstep.openclosed.correct.im;

import java.util.List;

import jo.secondstep.openclosed.correct.InvalidConnectionException;
import jo.secondstep.openclosed.correct.interfaces.NoSql;

public class MongoDB extends NoSql {

	private IPAddress ip;

	@Override
	public void validateConnection() {
		ip = new IPAddress(getAddress());
		ip.connect(getRequired());

	}

	@Override
	public void process(List<Object> data) {

		System.out.println("Save data to MongoDB");

	}

}
