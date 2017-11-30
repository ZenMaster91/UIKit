package AppKit;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 * NSResponder is an abstract class that forms the basis of event and command processing in AppKit.
 * 
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public class NSResponder implements MouseListener, MouseWheelListener, MouseMotionListener, KeyListener {

	/**
     * {@inheritDoc}
     */
    public void mouseClicked(MouseEvent e) {}

    /**
     * {@inheritDoc}
     */
    public void mousePressed(MouseEvent e) {}

    /**
     * {@inheritDoc}
     */
    public void mouseReleased(MouseEvent e) {}

    /**
     * {@inheritDoc}
     */
    public void mouseEntered(MouseEvent e) {}

    /**
     * {@inheritDoc}
     */
    public void mouseExited(MouseEvent e) {}

    /**
     * {@inheritDoc}
     * @since 1.6
     */
    public void mouseWheelMoved(MouseWheelEvent e){}

    /**
     * {@inheritDoc}
     * @since 1.6
     */
    public void mouseDragged(MouseEvent e){}

    /**
     * {@inheritDoc}
     * @since 1.6
     */
    public void mouseMoved(MouseEvent e){}

	public void keyTyped(KeyEvent e) {}

	public void keyPressed(KeyEvent e) {}

	public void keyReleased(KeyEvent e) {}
    
}
