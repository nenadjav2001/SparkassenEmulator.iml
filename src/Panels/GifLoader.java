package Panels;

import javax.swing.*;
import java.awt.*;




public class GifLoader implements Interfaces.GifLoader  {
    @Override
    public void gifLoader(JPanel panel,  String gifPath, JLabel gifLabel , int x , int y , int witdh , int heigt) {


       // String gifPath = "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\4b9ae4996c6c7af519a1d1728a431c60.gif";

        // Erstellen eines JLabels mit animiertem GIF
        ImageIcon gifIcon = new ImageIcon(gifPath);
        gifLabel = new JLabel(gifIcon);
        gifLabel.setBounds(x, y, witdh , heigt);

        // Hinzufügen des JLabels zum Panel
        panel.add(gifLabel);

    }
}
