package jo.secondstep.dependency.correct;

public class IosApp implements MobileApp {

	private String name;

	public String getName() {
		return "ios App: "+name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IosApp(String name) {
		this.name = name;
	}
}
