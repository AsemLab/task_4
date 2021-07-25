package jo.secondstep.interfacesegregation.wrong;

import java.util.List;

public interface Pirate {

	void giveOrder(List<Pirate> crew);

	void navigate();

	void fight(Pirate enemy);

	void clean();

}
