package jo.secondstep.interfacesegregation.wrong;

import java.util.List;

public class Gunner implements Pirate {

	
	@Override
	public void giveOrder(List<Pirate> crew) {
		System.out.println("Load the cannons");

	}

	@Override
	public void navigate() {
		throw new UnsupportedOperationException("The gunner is not responsible for Navigation");

	}

	@Override
	public void fight(Pirate enemy) {
		System.out.println("Fighting..");

	}

	@Override
	public void clean() {
		throw new UnsupportedOperationException("The gunner is not responsible for Cleaning");

	}

}
