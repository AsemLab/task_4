package jo.secondstep.dependency.wrong;

public class AndroidApp {

	private String name;

	public AndroidApp(String name) {
		this.name = name;
	}

	public String getName() {
		return "Android App: "+name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
