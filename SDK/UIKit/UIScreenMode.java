package UIKit;

import java.awt.Dimension;

public class UIScreenMode {
	
	private Dimension size;
	private int bitDepth;
    private int refreshRate;
	
	public UIScreenMode(Dimension size) {
		this.size = size;
	}
	
    public UIScreenMode(Dimension size, int bitDepth, int refreshRate) {
        this.size = size;
        this.bitDepth = bitDepth;
        this.refreshRate = refreshRate;
    }
	
	public int width() {
		return this.size.width;
	}
	
	public int height() {
		return this.size.height;
	}
	
	public int bitDepth() {
        return bitDepth;
    }
	
	public int refreshRate() {
        return refreshRate;
    }

	public boolean equals(UIScreenMode screenMode) {
		return (this.size.height == screenMode.size.height 
				&& this.size.width == screenMode.size.width
				&& this.bitDepth == screenMode.bitDepth
				&& this.refreshRate == screenMode.refreshRate);
	}
	
	@Override
	public int hashCode() {
		return width() + height() + bitDepth() * 7 + refreshRate() * 13;
	}

}
