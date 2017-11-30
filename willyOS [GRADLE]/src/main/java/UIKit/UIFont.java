package UIKit;

import java.awt.Font;

/**
 * The UIFont class provides the interface for getting and setting font
 * information. The class provides you with access to the font’s characteristics
 * and also provides the system with access to the font’s glyph information,
 * which is used during layout. You use font objects by passing them to methods
 * that accept them as a parameter.
 *
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public final class UIFont extends Font {

	private static final long serialVersionUID = -1704496265327259420L;
	
	/**
	 * 
	 * @param fontName The fully specified name of the font. This name
	 *            incorporates both the font family name and the specific style
	 *            information for the font.
	 *            
	 * @param fontSize The size (in points) to which the font is scaled. This
	 *            value must be greater than 0.0.
	 */
	public UIFont(String fontName, int fontSize) {
		this(fontName, PLAIN, fontSize);
	}

	/**
	 * Creates and returns a font object for the specified font name and size.
	 * 
	 * @param fontName The fully specified name of the font. This name
	 *            incorporates both the font family name and the specific style
	 *            information for the font.
	 * 
	 * @param type The style constant for the Font The style argument is an
	 *            integer bitmask that may be PLAIN, or a bitwise union of BOLD
	 *            and/or ITALIC (for example, ITALIC or BOLD|ITALIC). If the
	 *            style argument does not conform to one of the expected integer
	 *            bitmasks then the style is set to PLAIN.
	 * 
	 * @param fontSize The size (in points) to which the font is scaled. This
	 *            value must be greater than 0.0.
	 */
	public UIFont(String fontName, int type, int fontSize) {
		super(fontName, type, fontSize);
	}

	/**
	 * @return The defined font object for the title 1.
	 */
	public static UIFont title1() {
		return new UIFont("SFUIText-Medium", Font.PLAIN, 17);
	}

}
