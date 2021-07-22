package jo.secondstep.liskov.wrong;

public class ElectricOven implements Oven {

	@Override
	public void igniteGas() {
		throw new RuntimeException("This oven doesn't have a gas source!");

	}

	@Override
	public void extinguishGas() {
		throw new RuntimeException("This oven doesn't have a gas source!");

	}

	public void heatingResistor() {
		System.out.println("Start heating using electric.");
	}

	public void coolingResistor() {
		System.out.println("Stop heating using electric.");
	}

}
