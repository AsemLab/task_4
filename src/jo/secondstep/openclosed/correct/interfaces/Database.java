package jo.secondstep.openclosed.correct.interfaces;

import java.util.*;

public interface Database {

	void validateConnection();

	void save(List<Object> data, String address, Object required);

}
