package Display.Components;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class FrameDragListener extends MouseAdapter {
    
    private final JFrame frame;
    private Point mouseDragCoords = null;

    public FrameDragListener(JFrame frame) {
        this.frame = frame;
    } 

    public void mouseReleased(MouseEvent e) {
        mouseDragCoords = null;
    }

    public void mousePressed(MouseEvent e) { 
        mouseDragCoords = e.getPoint();
    }

    public void mouseDragged(MouseEvent e) {
        Point currentCoords = e.getLocationOnScreen();
        frame.setLocation(currentCoords.x - mouseDragCoords.x, currentCoords.y - mouseDragCoords.y);
    }

}