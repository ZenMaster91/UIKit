package UIKit;

import javax.swing.JLabel;

public final class UILabel extends JLabel implements UIComponent {

	private static final long serialVersionUID = 2681368558889558226L;
	
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
		setBackground(new UIColor(getBackground().getRed(), getBackground()
				.getGreen(), getBackground().getBlue(), alpha));
		setForeground(new UIColor(getBackground().getRed(), getBackground()
				.getGreen(), getBackground().getBlue(), alpha));
		update();
	}

	@Override
	public UIColor backGroundColor() {
		return new UIColor(getBackground().getRed(), getBackground().getGreen(),
				getBackground().getBlue(), getBackground().getAlpha());
	}

}
