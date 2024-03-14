package Panels.GeldAbheben;

import javax.swing.*;
import java.awt.*;

public class LoadingScreen extends JPanel {

private Image image;
public LoadingScreen(){
    this.setBounds(0 , 0 , 1080 , 850);
    image = new ImageIcon("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\modern-6097781_960_720.jpg").getImage();
    this.setLayout(null);
    this.setOpaque(true);}




    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        g2.drawImage(image, 0, 0, 1080, 850, null);
    }








}
