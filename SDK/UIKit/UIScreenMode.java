package UIKit;

import java.awt.Dimension;

/**
 * A UIScreenMode object represents a possible set of attributes that can be
 * applied to a UIScreen object. The object encapsulates information about the
 * size of the screen’s underlying display buffer and the aspect ratio it uses
 * for individual pixels.
 *
 * @author guille
 * @version
 * @since 2016"1"482016
 * @formatter Oviedo Computing Community
 */
public class UIScreenMode {

	private Dimension size;
	private int bitDepth;
	private int refreshRate;

	/**
	 * Creates a new Instance of the UIScreenMode from the dimension of the
	 * screen.
	 * 
	 * @param size The size of the screen.
	 */
	public UIScreenMode(Dimension size) {
		this.size = size;
	}

	/**
	 * Creates a new Instance of the UIScreenMode from the dimension of the
	 * screen, the bit depth and the refresh rate.
	 * 
	 * @param size The size of the screen.
	 * @param bitDepth The bit depth.
	 * @param refreshRate the refresh rate.
	 */
	public UIScreenMode(Dimension size, int bitDepth, int refreshRate) {
		this.size = size;
		this.bitDepth = bitDepth;
		this.refreshRate = refreshRate;
	}

	/**
	 * @return The width of the screen with this screen mode attached.
	 */
	public int width() {
		return this.size.width;
	}

	/**
	 * @return The height of the screen with this screen mode attached.
	 */
	public int height() {
		return this.size.height;
	}

	/**
	 * @return The bit depth of the screen with this screen mode attached.
	 */
	public int bitDepth() {
		return bitDepth;
	}

	/**
	 * @return The refresh rate of the screen with this screen mode attached.
	 */
	public int refreshRate() {
		return refreshRate;
	}

	/**
	 * Compares the equality between two UIScreenModes
	 * 
	 * @param screenMode The second UIScreenMode to compare the equality.
	 * @return true if they have the same property values, false otherwise.
	 */
	public boolean equals(UIScreenMode screenMode) {
		return (this.size.height == screenMode.size.height
				&& this.size.width == screenMode.size.width
				&& this.bitDepth == screenMode.bitDepth
				&& this.refreshRate == screenMode.refreshRate);
	}

	@Override
	public int hashCode() {
		return width() + height() + bitDepth() * 7 + refreshRate() * 13;
	}

}
