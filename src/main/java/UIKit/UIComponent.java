package UIKit;

/**
 * The UIView class defines the interfaces for managing the content in an area.
 * 
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public interface UIComponent {

	/**
	 * Will <code>repaint()</code> and <code>revalidate()</code> the component.
	 */
	public void update();

	/**
	 * Changes the value of the alpha for the component.
	 * 
	 * @param alpha The new alpha value in range 0.0 - 1.0
	 */
	public void alpha(double alpha);

	/**
	 * @return The background color of the component.
	 */
	public UIColor backGroundColor();
	
	/**
	 * Changes the backGroundColor of the element
	 * @param color
	 */
	public void backGroundColor(UIColor color);

}
