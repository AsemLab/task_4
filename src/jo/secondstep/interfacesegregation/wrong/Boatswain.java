package jo.secondstep.interfacesegregation.wrong;

import java.util.List;

// Boatswain is the ordinary sailor
public class Boatswain implements Pirate {

	@Override
	public void giveOrder(List<Pirate> crew) {
		throw new UnsupportedOperationException("The boatswain can't give orders");

	}

	@Override
	public void navigate() {
		throw new UnsupportedOperationException("The boatswain is not responsible for Navigation");

	}

	@Override
	public void fight(Pirate enemy) {
		System.out.println("Fighting..");

	}

	@Override
	public void clean() {
		System.out.println("Cleaning..");

	}

}
