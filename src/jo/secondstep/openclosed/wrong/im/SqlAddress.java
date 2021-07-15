package jo.secondstep.openclosed.wrong.im;

public class SqlAddress{

	String address;
	
	public SqlAddress(String address) {
		this.address = address;
	}

	public void connect(String username) {
	
		System.out.println("Connect using local database");;
	}

}
