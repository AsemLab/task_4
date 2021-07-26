package jo.secondstep.dependency.wrong;

public class Mobile {
	
	private GooglePlay store;
	
	public AndroidApp downloadApp(String appName) {
		return store.download(appName);
	}

	public GooglePlay getStore() {
		return store;
	}

	public void setStore(GooglePlay store) {
		this.store = store;
	}
	
	
}
