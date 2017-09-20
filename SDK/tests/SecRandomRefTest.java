package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import SecKit.SecAccessControl;

public class SecRandomRefTest {

	@Test
	public void hashTest() {
		String pass = "12345abcde";
		String prevPass = new SecAccessControl().hash(pass.toCharArray());
		String newPass = new SecAccessControl().hash(pass.toCharArray());
		assertNotEquals(prevPass, newPass);
		
		String fakePass = new SecAccessControl().hash("12345abcdE".toCharArray());
		assertNotEquals(prevPass, fakePass);
	}
	
	@Test
	public void authenticateTest() {
		String pass = "12345abcde";
		String hash = new SecAccessControl().hash(pass.toCharArray());
		assertEquals(true, new SecAccessControl().authenticate(pass.toCharArray(), hash));
		
		String fakeHash = new SecAccessControl().hash("12345abcdE".toCharArray());
		assertEquals(false, new SecAccessControl().authenticate(pass.toCharArray(), fakeHash));
	}
}
