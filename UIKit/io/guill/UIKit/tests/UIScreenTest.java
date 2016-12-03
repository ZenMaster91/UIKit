package io.guill.UIKit.tests;

import org.junit.Test;

import io.guill.UIKit.UIScreen;

public class UIScreenTest {

	@Test
	public void test() {
		System.out.println(UIScreen.size().getWidth() + " x " + UIScreen.size().getHeight());
		UIScreen.retina();
	}

}
