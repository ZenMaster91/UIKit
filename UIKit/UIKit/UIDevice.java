package UIKit;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class UIDevice extends GraphicsDevice {
	
	private GraphicsConfiguration configuration;
	private GraphicsConfiguration[] configurations;
	private int type;
	private String ID;
	
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

	public UIDevice(GraphicsConfiguration[] configurations, GraphicsConfiguration configuration, int type, String ID) {
		super();
		this.configuration = configuration;
		this.configurations = configurations;
		this.type = type;
		this.ID = ID;
	}
	
	public static UIDevice interpolate(GraphicsDevice gd) {
		return new UIDevice(gd.getConfigurations(), gd.getDefaultConfiguration(), gd.getType(), gd.getIDstring());
	}

	@Override
	public int getType() {
        return  type;
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
