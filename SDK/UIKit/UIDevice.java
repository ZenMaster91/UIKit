package UIKit;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;

/**
 * 
 * The UIDevice class provides a Singleton instance representing the current
 * device. From this instance you can obtain information about the device such
 * as assigned name, device model, and operating-system name and version.
 *
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public class UIDevice extends GraphicsDevice {

	private GraphicsConfiguration configuration;
	private GraphicsConfiguration[] configurations;
	private int type;
	private String ID;

	/**
	 * Creates an UIDevice object from a configuration set, its configuration,
	 * its type and its ID String.
	 * 
	 * @param configurations All the possible graphics configurations.
	 * @param configuration The default graphic configuration.
	 * @param type The type of this graphic device.
	 * @param ID The identification string associated with this GraphicsDevice.
	 */
	public UIDevice(GraphicsConfiguration[] configurations,
			GraphicsConfiguration configuration, int type, String ID) {
		super();
		this.configuration = configuration;
		this.configurations = configurations;
		this.type = type;
		this.ID = ID;
	}

	/**
	 * From a graphics device interpolates a UIDevice object.
	 * 
	 * @param gd The graphics device.
	 * @return the UIDevice containing the properties of the Graphics Device
	 */
	public static UIDevice interpolate(GraphicsDevice gd) {
		return new UIDevice(gd.getConfigurations(),
				gd.getDefaultConfiguration(), gd.getType(), gd.getIDstring());
	}

	@Override
	public int getType() {
		return type;
	}

	@Override
	public String getIDstring() {
		return ID;
	}

	@Override
	public GraphicsConfiguration[] getConfigurations() {
		return configurations;
	}

	@Override
	public GraphicsConfiguration getDefaultConfiguration() {
		return configuration;
	}

}
