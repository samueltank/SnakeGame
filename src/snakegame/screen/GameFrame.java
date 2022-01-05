package snakegame.screen;

import javax.swing.*;

public class GameFrame  extends JFrame {
    public GameFrame() {
        GamePanel gamePanel = new GamePanel();
        this.add(gamePanel);

        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
