package UIKit;

import java.awt.Component;

import javax.swing.JFrame;

/**
 * A UIWindow object provides the backdrop for your app’s user interface and
 * provides important event-handling behaviors. Windows do not have any visual
 * appearance of their own, but they are crucial to the presentation of your
 * app’s views. Every view that appears onscreen is enclosed by a window, and
 * each window is independent of the other windows in your app. Events received
 * by your app are initially routed to the appropriate window object, which in
 * turn forwards those events to the appropriate view. Windows work with your
 * view controllers to implement orientation changes and to perform many other
 * tasks that are fundamental to your app’s operation.
 * 
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public class UIWindow extends JFrame implements UIComponent {

	private static final long serialVersionUID = 4234113514069308783L;

	@Override
	public void update() {
		revalidate();
		repaint();
	}

	@Override
	public void alpha(double alpha) {
		setOpacity((float) alpha);
		if (alpha > 1.0 || alpha < 0.0)
			throw new IllegalArgumentException(
					"The value of alpha must be between 0 - 255");

		for (Component c : getComponents()) {
			if (c instanceof UIComponent) {
				((UIComponent) c).alpha(alpha);
				((UIComponent) c).update();
			}
		}

		setBackground(new UIColor(getBackground().getRed(),
				getBackground().getGreen(), getBackground().getBlue(), alpha));

		update();
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
}
