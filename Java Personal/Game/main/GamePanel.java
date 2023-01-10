package main;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

public class GamePanel extends JPanel {

    //screen settings
    final int originalTileSize = 16; //creates a 16x16 tile
    final int scale = 3; //scales 16x16 to 48x48

    final int tileSize = originalTileSize * scale; 
    final int maxScreenCol = 16;
    final int maxScreenRow = 12; //4x3 ratio
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

    public GamePanel() {
        this.setPreferredSize(new DimensionUIResource(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true); //improves games renderin performance
    }
}