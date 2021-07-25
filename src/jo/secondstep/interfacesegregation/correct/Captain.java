package jo.secondstep.interfacesegregation.correct;

import java.util.List;

public class Captain implements Pirate, Commander, Navigator, Fighter {

	@Override
	public void navigate() {
		System.out.println("To the west");

	}

	@Override
	public void fight(Sailor enemy) {
		System.out.println("Fighting..");

	}

	@Override
	public void giveOrder(List<Sailor> crew) {
		System.out.println("Clean the deck!");

	}

}
