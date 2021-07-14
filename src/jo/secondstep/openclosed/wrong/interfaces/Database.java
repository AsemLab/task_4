package jo.secondstep.openclosed.wrong.interfaces;

import java.util.*;

public interface Database {
	
	void setConnection(Connection connection);
	
	void save(List<Object> data);
}
