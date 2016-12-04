package UIKit;

import java.awt.Component;

import javax.swing.JFrame;

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

		setBackground(new UIColor(getBackground().getRed(), getBackground()
				.getGreen(), getBackground().getBlue(), alpha));

		update();
	}

	@Override
	public UIColor backGroundColor() {
		return new UIColor(getBackground().getRed(), getBackground().getGreen(),
				getBackground().getBlue(), getBackground().getAlpha());
	}

}
