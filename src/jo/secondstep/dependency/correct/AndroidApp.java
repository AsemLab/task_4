package jo.secondstep.dependency.correct;

public class AndroidApp implements MobileApp {

	private String name;

	public String getName() {
		return "Android App: "+name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AndroidApp(String name) {
		this.name = name;
	}
	
}
