package jo.secondstep.dependency.correct;

public class IosStore implements AppsStore {

	@Override
	public MobileApp download(String appName) {
		return new IosApp(appName);
	}

}
