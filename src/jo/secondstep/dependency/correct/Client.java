package jo.secondstep.dependency.correct;

public class Client {

	public static void main(String[] args) {

		Mobile samsungS20 = new Mobile();

		GooglePlay playStore = new GooglePlay();

		samsungS20.setStore(playStore);

		AndroidApp app = (AndroidApp) samsungS20.downloadApp("Facebook");

		System.out.println(app.getName());
		
		IosStore appStore = new IosStore();
		
		samsungS20.setStore(appStore);
		
		IosApp app2 = (IosApp) samsungS20.downloadApp("Facebook");
		
		System.out.println(app2.getName());
		
		
		

	}

}
