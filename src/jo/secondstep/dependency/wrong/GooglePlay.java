package jo.secondstep.dependency.wrong;

public class GooglePlay {

	public AndroidApp download(String appName) {
		
		return new AndroidApp(appName); 
	}
}
