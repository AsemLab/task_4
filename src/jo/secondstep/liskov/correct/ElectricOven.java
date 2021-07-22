package jo.secondstep.liskov.correct;

public class ElectricOven implements Oven {

	private Electric electric;
	
	@Override
	public void startHeating(Energy energy) {
		if(!(energy instanceof Electric))
			throw new RuntimeException("Energy must be electric!");
		
		electric = (Electric) energy;
		System.out.println("Start heating using electric.");
	}

	@Override
	public void stopHeating() {
		System.out.println("Stop heating using electric.");

	}

}
