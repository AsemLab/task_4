package jo.secondstep.dependency.wrong;

public class Client {

	public static void main(String[] args) {
		
		Mobile samsungS20 = new Mobile();
		
		GooglePlay playStore = new GooglePlay();
		
		samsungS20.setStore(playStore);
		
		AndroidApp app = samsungS20.downloadApp("Facebook");
		
		System.out.println(app.getName());
	}
}
