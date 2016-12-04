package UIKit;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;

public class UIView extends JPanel implements UIComponent {

	private static final long serialVersionUID = -1310239412117595273L;

	public UIView() {
		super();
	}

	public UIView(int height, int width) {
		this(new Dimension(height, width));
	}

	public UIView(Dimension size) {
		super();
		setPreferredSize(size);
	}
	
	@Override
	public Component add(Component component) {
		if( !(component instanceof UIComponent))
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
	public void alpha(double alpha) {
		if (alpha > 1.0 || alpha < 0.0)
			throw new IllegalArgumentException(
					"The value of alpha must be between 0 - 255");
		
		for(Component c : getComponents()) {
			((UIComponent)c).alpha(alpha);
			((UIComponent)c).update();
		}
		
		setBackground(new UIColor(getBackground().getRed(), getBackground()
				.getGreen(), getBackground().getBlue(), alpha));
		
		update();
	}

}
