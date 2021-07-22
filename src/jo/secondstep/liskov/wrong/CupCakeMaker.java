package jo.secondstep.liskov.wrong;

public class CupCakeMaker {

	public static void main(String[] args) {

		Oven gasOven = new MicrowaveOven();
		bake(gasOven, "Cupcake");

	}

	public static void bake(Oven oven, String dough) {
		oven.igniteGas();
		System.out.println("-- Putting " + dough + " in the oven");
		System.out.println("-- Start baking");
		oven.extinguishGas();
		System.out.println("-- Stop baking");

	}

}
