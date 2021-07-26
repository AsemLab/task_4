package jo.secondstep.dependency.correct;

public class Mobile {

	private AppsStore store;
	
	public MobileApp downloadApp(String appName) {
		return store.download(appName);
		
	}

	public AppsStore getStore() {
		return store;
	}

	public void setStore(AppsStore store) {
		this.store = store;
	}
}
