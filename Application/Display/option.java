package Display;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class option extends JFrame {
    
    private JPanel groundMenu;

    private int width = 720;
    private int height = 500;

    public option() {

        create();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(width, height);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);

        setLocation(x,y);

        getContentPane().setBackground(new Color(255,255,255));

        // setUndecorated(true);
        setResizable(false);
        shows();
    }

    private void create() {
        groundMenu = new JPanel();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void shows() {
        setVisible(true);
    }

}
