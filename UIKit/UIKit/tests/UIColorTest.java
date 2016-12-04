package UIKit.tests;

import static org.junit.Assert.*;
import org.junit.Test;

import UIKit.UIColor;

public class UIColorTest {

	@Test
	public void alphaTest() {
		assertEquals(128, new UIColor(1,1,1,0.5).getAlpha());
		assertEquals(255, new UIColor("#FFFFF").getAlpha());
		assertEquals(255, new UIColor(1,1,1).getAlpha());
	}

	@Test
	public void exceptionHandelingTest() {
		try {
			UIColor.darkGray();
			fail();
		} catch(UnsupportedOperationException e) { }
	}
}
