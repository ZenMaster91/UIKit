package Security;

import java.security.SecureRandom;

public class SecRandomRef extends SecureRandom {

	private static final long serialVersionUID = 4989868272629924432L;
	
	public SecRandomRef() {
		super();
	}
	
	public SecRandomRef(byte[] bytes) {
		super(bytes);
	}

}
