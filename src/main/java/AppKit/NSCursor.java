package AppKit;

import java.awt.Cursor;

/**
 * Instances of the NSCursor class manage the appearance of the cursor.
 * 
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public class NSCursor extends Cursor {

	private static final long serialVersionUID = 4795075368891458022L;

	/**
	 * Creates a cursor from the given type parameter.
	 * 
	 * @param type Will define the appearance of the cursor.
	 */
	public NSCursor(int type) {
		super(type);
	}
	
	/**
	 * Creates a simple default cursor.
	 */
	public NSCursor() {
		super(DEFAULT_CURSOR);
	}
	
	/**
	 * @return a simple default cursor.
	 */
	public static NSCursor arrow() {
		return new NSCursor();
	}
	
	/**
	 * @return a pointing hand cursor.
	 */
	public static NSCursor pointingHand() {
		return new NSCursor(HAND_CURSOR);
	}
	
	/**
	 * @return a waiting cursor.
	 */
	public static NSCursor waiting() {
		return new NSCursor(WAIT_CURSOR);
	}

}
