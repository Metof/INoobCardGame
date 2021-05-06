package client;

import javax.swing.*;
import java.awt.*;

public class StartingPage extends JPanel {
    public StartingPage(Dimension d){
        this.setLayout(null);
        this.setSize(this.getSize());
        JButton g = new JButton("Staring page");
        g.setSize(100, 100);
        this.add(g);
        g.setVisible(true);
        /*
        this.setLayout(null);
        this.setSize(d);
        //this.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        JButton g = new JButton("Staring page");
        g.setSize(100, 100);
        this.add(g);
        g.setVisible(true);
        this.setVisible(true);
        this.repaint();
        this.revalidate();

         */
    }
}
