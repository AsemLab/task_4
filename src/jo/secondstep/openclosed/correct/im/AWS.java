package jo.secondstep.openclosed.correct.im;

import java.util.List;
import jo.secondstep.openclosed.correct.interfaces.Cloud;

public class AWS extends Cloud {

	private SSHConnection ssh;
	
	@Override
	public void validateConnection() {
		ssh = new SSHConnection(getAddress());
		ssh.connect(getRequired());
	}

	@Override
	public void process(List<Object> data) {
		System.out.println("Save data to AWS");	
	}

}
