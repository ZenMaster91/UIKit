package UIKit;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.lang.reflect.Field;

/**
 * A UIScreen object defines the properties associated with a hardware-based
 * display. Use this class to obtain screen objects for each display attached to
 * the device. Each screen object defines the bounds rectangle for the
 * associated display and other interesting properties such as its brightness
 * 
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public final class UIScreen {

	public UIScreenMode currentMode;
	private UIDevice monitor;

	/**
	 * From a UIDevice creates an UIScreen Instance containing all the device
	 * properties.
	 * 
	 * @param monitor The monitor where the properties will came from.
	 */
	public UIScreen(UIDevice monitor) {
		this.monitor = monitor;
	}

	/**
	 * Creates an UIScreen Instance from the UIScreenMode and the UIDevice.
	 * 
	 * @param currentMode The current screen mode.
	 * @param monitor The monitor where the properties will came from.
	 */
	public UIScreen(UIScreenMode currentMode, UIDevice monitor) {
		this.currentMode = currentMode;
		this.monitor = monitor;
	}

	/**
	 * @return The size of the monitor as a Dimension measured in pixels.
	 */
	public Dimension size() {
		return new Dimension(monitor.getDisplayMode().getWidth(),
				monitor.getDisplayMode().getHeight());
	}

	/**
	 * Calculates the size of a given monitor as a UIDevice.
	 * 
	 * @param monitor The monitor where the properties will came from.
	 * @return The size of the monitor as a Dimension measured in pixels.
	 */
	public static Dimension size(UIDevice monitor) {
		return new Dimension(monitor.getDisplayMode().getWidth(),
				monitor.getDisplayMode().getHeight());
	}

	/**
	 * @return The resolution attached to the default toolkit.
	 */
	public static int resolution() {
		return Toolkit.getDefaultToolkit().getScreenResolution();
	}

	/**
	 * @return All the screens attached to the system.
	 */
	public static UIScreen[] screens() {
		GraphicsDevice[] screenDevices = GraphicsEnvironment
				.getLocalGraphicsEnvironment().getScreenDevices();
		UIScreen[] screens = new UIScreen[screenDevices.length];
		for (int i = 0; i < screenDevices.length; i++) {
			screens[i] = new UIScreen(
					new UIScreenMode(new Dimension(
							screenDevices[i].getDisplayMode().getWidth(),
							screenDevices[i].getDisplayMode().getHeight()),
							screenDevices[i].getDisplayMode().getBitDepth(),
							screenDevices[i].getDisplayMode().getRefreshRate()),
					UIDevice.interpolate(screenDevices[i]));
		}
		return screens;
	}

	/**
	 * @return True if the screen is "Retina". That means that has a scale
	 *         factor of 2.
	 */
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
				if (scale instanceof Integer
						&& ((Integer) scale).intValue() == 2) {
					isRetina = true;
				}
			}
		} catch (Exception e) {
			System.err.println("The system does not support retina display.");
		}
		return isRetina;
	}
}
