package jo.secondstep.interfacesegregation.correct;

//Boatswain is the ordinary sailor
public class Boatswain implements Pirate, Fighter, Cleaner {

	@Override
	public void fight(Sailor enemy) {
		System.out.println("Fighting..");

	}

	@Override
	public void clean() {
		System.out.println("Cleaning..");

	}

}
