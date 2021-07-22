package jo.secondstep.liskov.correct;

public class GasOven implements Oven {

	private Gas gas;
	
	@Override
	public void startHeating(Energy energy) {
		if(!(energy instanceof Gas))
			throw new RuntimeException("Energy must be gas!");
		
		gas = (Gas) energy;
		System.out.println("Start heating using gas.");
	}

	@Override
	public void stopHeating() {
		System.out.println("Stop heating using gas.");

	}

}
