package jo.secondstep.interfacesegregation.wrong;

import java.util.List;

public class Captain implements Pirate {

	
	@Override
	public void giveOrder(List<Pirate> crew) {
		System.out.println("Clean the deck!");
	}

	@Override
	public void navigate() {
		System.out.println("To the west");

	}

	@Override
	public void fight(Pirate enemy) {
		System.out.println("Fighting..");

	}

	@Override
	public void clean() {
		throw new UnsupportedOperationException("The captain doesn't clean anything");

	}

}
