package UIKit;

import javax.swing.ImageIcon;

/**
 * An object that manages image data in your application.
 *
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public final class UIImageIcon extends ImageIcon {

	private static final long serialVersionUID = -3910478680425740019L;

	/**
	 *  Creates an ImageIcon from the specified file. The image will
     * be preloaded by using MediaTracker to monitor the loading state
     * of the image. The specified String can be a file name or a
     * file path. When specifying a path, use the Internet-standard
     * forward-slash ("/") as a separator.
     * (The string is converted to an URL, so the forward-slash works
     * on all systems.)
     * For example, specify:
     * <pre>
     *    new UIImageIcon("images/myImage.gif") </pre>
     * The description is initialized to the <code>filename</code> string.
     *
     * @param imageRoute a String specifying a filename or path
	 */
	public UIImageIcon(String imageRoute) {
		super(imageRoute);
	}

}
