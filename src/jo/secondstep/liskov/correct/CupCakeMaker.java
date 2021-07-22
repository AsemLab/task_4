package jo.secondstep.liskov.correct;

public class CupCakeMaker {

	public static void main(String[] args) {
		Oven oven = new GasOven();
		Energy energy = new Gas();
		bake(oven,energy, "Cupcake");

	}

	public static void bake(Oven oven,Energy energy, String dough) {
		oven.startHeating(energy);
		System.out.println("-- Putting " + dough + " in the oven");
		System.out.println("-- Start baking");
		oven.stopHeating();
		System.out.println("-- Stop baking");

	}
}
