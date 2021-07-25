package jo.secondstep.interfacesegregation.correct;

import java.util.List;

public interface Commander {

	void giveOrder(List<Sailor> crew);
}
