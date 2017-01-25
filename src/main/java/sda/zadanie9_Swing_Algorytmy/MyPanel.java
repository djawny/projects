package sda.zadanie9_Swing_Algorytmy;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    MyWindow window;

    public MyPanel(MyWindow window) {
        this.window = window;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.CYAN);
        g.fillRect(10,10,50,30);
    }
}
