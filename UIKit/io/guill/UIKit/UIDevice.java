package io.guill.UIKit;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class UIDevice extends GraphicsDevice {
	
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

	public UIDevice() {
		super();
	}
	
	public static UIDevice interpolate(GraphicsDevice gd) {
		return new UIDevice();
	}

	@Override
	public int getType() {
        return  ge.getDefaultScreenDevice().getType();
	}

	@Override
	public String getIDstring() {
        return ge.getDefaultScreenDevice().getIDstring();
	}

	@Override
	public GraphicsConfiguration[] getConfigurations() {
        return ge.getDefaultScreenDevice().getConfigurations();
	}

	@Override
	public GraphicsConfiguration getDefaultConfiguration() {
        return ge.getDefaultScreenDevice().getDefaultConfiguration();
	}

}
