package io.guill.UIKit;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.lang.reflect.Field;

/**
 * A UIScreen object
 * 
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public final class UIScreen {

	public UIScreenMode currentMode;

	public UIScreen() {}

	public UIScreen(UIScreenMode currentMode) {
		this.currentMode = currentMode;
	}

	public static Dimension size() {
		UIDevice enviroment = new UIDevice();
		return new Dimension(enviroment.getDisplayMode().getWidth(), enviroment.getDisplayMode()
				.getHeight());
	}

	public static int resolution() {
		return Toolkit.getDefaultToolkit().getScreenResolution();
	}

	public static UIScreen[] screens() {
		GraphicsDevice[] screenDevices = GraphicsEnvironment
				.getLocalGraphicsEnvironment().getScreenDevices();
		UIScreen[] screens = new UIScreen[screenDevices.length];
		for (int i = 0; i < screenDevices.length; i++) {
			screens[i] = new UIScreen(new UIScreenMode(new Dimension(
					screenDevices[i].getDisplayMode().getWidth(),
					screenDevices[i].getDisplayMode().getHeight()),
					screenDevices[i].getDisplayMode().getBitDepth(),
					screenDevices[i].getDisplayMode().getRefreshRate()));
		}
		return screens;
	}

	public static boolean retina() {
		boolean isRetina = false;
		GraphicsDevice graphicsDevice = GraphicsEnvironment
				.getLocalGraphicsEnvironment().getDefaultScreenDevice();

		try {
			Field field = graphicsDevice.getClass().getDeclaredField("scale");
			System.out.println(graphicsDevice.getClass().getName());
			if (field != null) {
				field.setAccessible(true);
				Object scale = field.get(graphicsDevice);
				if (scale instanceof Integer && ((Integer) scale)
						.intValue() == 2) {
					isRetina = true;
				}
			}
		} catch (Exception e) {
			System.err.println("The system does not support retina display.");
		}
		return isRetina;
	}
}
