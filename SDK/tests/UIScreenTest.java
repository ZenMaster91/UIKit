package tests;

import java.awt.GraphicsEnvironment;

import org.junit.Test;

import UIKit.UIDevice;
import UIKit.UIScreen;

public class UIScreenTest {

	@Test
	public void test() {
		UIDevice monitor = new UIDevice(GraphicsEnvironment
				.getLocalGraphicsEnvironment().getScreenDevices()[0]
						.getConfigurations(), GraphicsEnvironment
								.getLocalGraphicsEnvironment()
								.getScreenDevices()[0]
										.getDefaultConfiguration(),
				GraphicsEnvironment.getLocalGraphicsEnvironment()
						.getScreenDevices()[0].getType(), GraphicsEnvironment
								.getLocalGraphicsEnvironment()
								.getScreenDevices()[0].getIDstring());
		System.out.println(UIScreen.size(monitor).getWidth() + " x " + UIScreen.size(monitor).getHeight());
		
		for(UIScreen screen : UIScreen.screens()) {
			System.out.println(screen.size().getWidth() + " x " + screen.size().getHeight());
			
		}
		System.out.println(UIScreen.resolution());
	}

}
