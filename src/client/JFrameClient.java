package client;

import client.Game.RoomPage;

import javax.swing.*;
import java.awt.*;

public class JFrameClient extends JFrame {
    private JPanel mainPanel = new JPanel();

    public JFrameClient(){
        super("INoobCardGame");
        this.setLayout(null);
        this.setPreferredSize(new Dimension(600, 600));
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initFrame();
        goToStartingPage();
    }

    public void initFrame(){
        this.add(mainPanel);
        this.setVisible(true);
    }

    public void goToStartingPage(){
        /*
        this.mainPanel.setLayout(null);
        this.mainPanel.setSize(this.getSize());
        JButton g = new JButton("Staring page");
        g.setSize(100, 100);
        this.mainPanel.add(g);
        g.setVisible(true);
        */

        this.mainPanel = new StartingPage(this.getSize());
        this.mainPanel.setSize(this.getSize());
        this.mainPanel.repaint();
        this.mainPanel.revalidate();

        this.repaint();
        this.revalidate();
    }

    public void goToSettingsRoomPage(RoomPage settingsRoom){
    }

    public void goToGameRoomPage(){
    }
}
