package jo.secondstep.openclosed.correct.im;

import java.util.List;

import jo.secondstep.openclosed.correct.InvalidConnectionException;
import jo.secondstep.openclosed.correct.interfaces.NoSql;

public class MongoDB extends NoSql {

	private IPAddress ip;

	@Override
	public void validateConnection() {
		if (!getAddress().matches("[0-9]\\.[0-9]\\.[0-9]\\.[0-9]")) {
			throw new InvalidConnectionException("Invalid ip address");
		}

		ip = new IPAddress(getAddress());
		ip.connect();

	}

	@Override
	public void process(List<Object> data) {

		System.out.println("Save data to MongoDB");

	}

}
