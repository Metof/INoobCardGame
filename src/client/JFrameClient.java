package client;

import client.Game.RoomPage;

import javax.swing.*;

public class JFrameClient extends JFrame {

    public JFrameClient(){
        super("INoobCardGame");
        this.setLayout(null);
        this.setSize(600, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        goToStartingPage();
    }
    public void goToStartingPage(){
        this.removeAll();
        this.add(new StartingPage(this.getSize()));
        this.setVisible(true);
    }

    public void goToSettingsRoomPage(RoomPage settingsRoom){
        this.removeAll();
        this.setVisible(true);
    }

    public void goToGameRoomPage(){
        this.removeAll();
        this.setVisible(true);
    }
}
