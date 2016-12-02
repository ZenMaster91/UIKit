package io.guill.UIKit;

import java.awt.Color;

/**
 * A UIColor object stores color data and sometimes opacity (alpha value). Color
 * objects are immutable and can be used safely from multiple threads in your
 * app.
 * 
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public final class UIColor extends Color {

	private static final long serialVersionUID = 6222522995411977707L;

	/**
	 * From the hexadecimal value of the color creates an UIColor storing that
	 * color.
	 * 
	 * @param hexValue The hexadecimal value of the color as #FFFFFF.
	 */
	public UIColor(String hexValue) {
		this(hexValue, 1.0);
	}

	/**
	 * From the hexadecimal value of the color and its opacity (alpha value)
	 * creates an UIColor storing that color.
	 * 
	 * @param hexValuethe Hexadecimal value of the color as #FFFFFF.
	 * @param alpha The opacity in range 0.0 - 1.0.
	 */
	public UIColor(String hexValue, double alpha) {
		this(Color.decode(hexValue).getRed(), Color.decode(hexValue).getGreen(),
				Color.decode(hexValue).getBlue(), alpha);
	}

	/**
	 * From the RGB (red, green, blue) values of the color creates an UIColor
	 * storing that color.
	 * 
	 * @param red The red value of the color object. In range 0 - 255.
	 * @param green The green value of the color object. In range 0 - 255.
	 * @param blue The blue value of the color object. In range 0 - 255.
	 */
	public UIColor(int red, int green, int blue) {
		this(red, green, blue, 1.0);
	}

	/**
	 * From the RGB (red, green, blue) values of the color and its opacity
	 * (alpha value) creates an UIColor storing that color.
	 * 
	 * @param red The red value of the color object. In range 0 - 255.
	 * @param green The green value of the color object. In range 0 - 255.
	 * @param blue The blue value of the color object. In range 0 - 255.
	 * @param alpha The opacity in range 0.0 - 1.0.
	 */
	public UIColor(int red, int green, int blue, double alpha) {
		super((float) red / 255, (float) green / 255, (float) blue / 255,
				(float) (alpha));
	}

	public static UIColor black() {
		return new UIColor(0,0,0);
	}

	public static UIColor blue() {
		throw new UnsupportedOperationException();
	}

	public static UIColor brown() {
		throw new UnsupportedOperationException();
	}

	public static UIColor clear() {
		throw new UnsupportedOperationException();
	}

	public static UIColor cyan() {
		throw new UnsupportedOperationException();
	}

	public static UIColor darkGray() {
		throw new UnsupportedOperationException();
	}

	public static UIColor darkText() {
		throw new UnsupportedOperationException();
	}

	public static UIColor gray() {
		throw new UnsupportedOperationException();
	}

	public static UIColor green() {
		throw new UnsupportedOperationException();
	}

	public static UIColor lightGray() {
		throw new UnsupportedOperationException();
	}

	public static UIColor lightText() {
		throw new UnsupportedOperationException();
	}
	
	public static UIColor magenta() {
		throw new UnsupportedOperationException();
	}
	
	public static UIColor orange() {
		throw new UnsupportedOperationException();
	}
	
	public static UIColor purple() {
		throw new UnsupportedOperationException();
	}
	
	public static UIColor red() {
		throw new UnsupportedOperationException();
	}
	
	public static UIColor white() {
		throw new UnsupportedOperationException();
	}
	
	public static UIColor yellow() {
		throw new UnsupportedOperationException();
	}
}
