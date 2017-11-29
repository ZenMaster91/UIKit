package UIKit;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;

/**
 * The UIView class defines a rectangular area on the screen.
 * 
 * <code>UIView</code> is a generic lightweight container. For examples and
 * task-oriented documentation for UIView, see <a href=
 * "https://docs.oracle.com/javase/tutorial/uiswing/components/panel.html">How
 * to Use Panels</a>, a section in <em>The Java Tutorial</em>.
 * <p>
 * <strong>Warning:</strong> Swing is not thread safe. For more information see
 * <a href="package-summary.html#threading">Swing's Threading Policy</a>.
 * <p>
 * <strong>Warning:</strong> Serialized objects of this class will not be
 * compatible with future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running the
 * same version of Swing. As of 1.4, support for long term storage of all
 * JavaBeans&trade; has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 * 
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public class UIView extends JPanel implements UIComponent {

	private static final long serialVersionUID = -1310239412117595273L;

	/**
	 * Initializes and returns a newly allocated view object.
	 */
	public UIView() {
		super();
	}

	/**
	 * Initializes and returns a newly allocated view object with the specified height and width.
	 * 
	 * @param height The height of the view.
	 * @param width The width of the view.
	 */
	public UIView(int height, int width) {
		this(new Dimension(height, width));
	}

	/**
	 * Initializes and returns a newly allocated view object with the specified dimension.
	 * 
	 * @param size The dimension of the view.
	 */
	public UIView(Dimension size) {
		super();
		setPreferredSize(size);
	}

	@Override
	public Component add(Component component) {
		if (!(component instanceof UIComponent))
			throw new IllegalArgumentException("Only UIComponent allowed.");
		return super.add(component);
	}

	@Override
	public void update() {
		revalidate();
		repaint();
	}

	@Override
	public UIColor backGroundColor() {
		return new UIColor(getBackground().getRed(), getBackground().getGreen(),
				getBackground().getBlue(), getBackground().getAlpha());
	}
	
	@Override
	public void backGroundColor(UIColor color) {
		setBackground(color);
	}

	@Override
	public void alpha(double alpha) {
		if (alpha > 1.0 || alpha < 0.0)
			throw new IllegalArgumentException(
					"The value of alpha must be between 0 - 255");

		for (Component c : getComponents()) {
			((UIComponent) c).alpha(alpha);
			((UIComponent) c).update();
		}

		setBackground(new UIColor(getBackground().getRed(),
				getBackground().getGreen(), getBackground().getBlue(), alpha));

		update();
	}

}
