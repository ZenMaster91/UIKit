package UIKit;

import javax.swing.JLabel;

/**
 * The UILabel class implements a read-only text view. You can use this class to
 * draw one or multiple lines of static text, such as those you might use to
 * identify other parts of your user interface. The base UILabel class provides
 * support for both simple and complex styling of the label text. You can also
 * control over aspects of appearance, such as whether the label uses a shadow
 * or draws with a highlight. If needed, you can customize the appearance of
 * your text further by subclassing.
 *
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public final class UILabel extends JLabel implements UIComponent {

	private static final long serialVersionUID = 2681368558889558226L;

	/**
     * Creates a <code>UILabel</code> instance with the specified text.
     * The label is aligned against the leading edge of its display area,
     * and centered vertically.
     *
     * @param text The text to be displayed by the label.
     */
	public UILabel(String text) {
		super(text);
	}

	@Override
	public void update() {
		revalidate();
		repaint();
	}

	@Override
	public void alpha(double alpha) {
		setBackground(new UIColor(getBackground().getRed(),
				getBackground().getGreen(), getBackground().getBlue(), alpha));
		setForeground(new UIColor(getBackground().getRed(),
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
