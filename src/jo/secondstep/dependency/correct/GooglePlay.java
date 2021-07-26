package jo.secondstep.dependency.correct;

public class GooglePlay implements AppsStore {

	@Override
	public MobileApp download(String appName) {
		return new AndroidApp(appName);
	}

}
