package jo.secondstep.openclosed.wrong.im;

import java.util.List;
import jo.secondstep.openclosed.wrong.interfaces.NoSql;

public class MongoDB implements NoSql {

	private IPAddress ip;

	@Override
	public void setConnection(IPAddress ip, int port) {
		this.ip = ip;
		this.ip.connect(port);
		
	}

	@Override
	public void save(List<Object> data) {
		
		System.out.println("Save data to MongoDB");
	}
}
