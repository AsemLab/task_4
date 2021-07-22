package jo.secondstep.liskov.wrong;

public class GasOven implements Oven {

	@Override
	public void igniteGas() {
		System.out.println("Start heating using gas.");

	}

	@Override
	public void extinguishGas() {
		System.out.println("Stop heating using gas.");
		
	}

}
