package client;

import javax.swing.*;

public class JFrameClient extends JFrame {
    public JFrameClient(){
        super("INoobCardGame");
        this.setSize(600, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initJFrame();
    }

    private void initJFrame(){
        this.setVisible(true);
    }
}
