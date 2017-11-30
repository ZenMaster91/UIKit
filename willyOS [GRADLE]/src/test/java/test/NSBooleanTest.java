package test;

import org.junit.Test;

import Foundation.NSBool;

public class NSBooleanTest {

	@Test
	public void test() {
		NSBool bol = new NSBool(true);
		if(bol.booleanValue()) {
			System.out.println(true);
		}
	}

}
