package jo.secondstep.liskov.wrong;

public class MicrowaveOven implements Oven {

	@Override
	public void igniteGas() {
		throw new RuntimeException("This oven doesn't have a gas source!");

	}

	@Override
	public void extinguishGas() {
		throw new RuntimeException("This oven doesn't have a gas source!");

	}

	public void produceWaves() {
		System.out.println("Start heating using microwaves.");
	}

	public void stopWaves() {
		System.out.println("Stop heating using microwaves.");
	}
}
