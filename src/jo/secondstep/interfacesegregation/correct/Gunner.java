package jo.secondstep.interfacesegregation.correct;

import java.util.List;

public class Gunner implements Pirate, Commander, Fighter{

	@Override
	public void fight(Sailor enemy) {
		System.out.println("Fighting..");

	}

	@Override
	public void giveOrder(List<Sailor> crew) {
		System.out.println("Load the cannons");

	}

}
