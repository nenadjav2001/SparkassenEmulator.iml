package Panels;

import Interfaces.GifLoader;
import Screen.SparkasseFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Stack;
import java.util.concurrent.ForkJoinPool;

public class Startpanel extends JPanel {

    private final int x = 35;
    private final int y = 65;
    private final int witdh = 1000;
    private final int height = 400;


    FontsAndColors fontsAndColors;

    Font font;

    JLabel[] labelsAnweisungen;

    JLabel gifLabel;

    public Startpanel() {

        this.setBounds(x, y, witdh, height);
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        fontsAndColors = new FontsAndColors();
        font = fontsAndColors.getFont();
        labelsAnweisungen = new JLabel[4];


        try {
            loadingGif();
            loadingScanImage(new JLabel() , new JLabel());
            anweisungen(labelsAnweisungen);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void anweisungen(JLabel[] labels) {
        int labelsY = 50;

        for (int i = 0; i < labels.length; i++) {
            labels[0] = new JLabel();
            labels[1] = new JLabel();
            labels[2] = new JLabel();
            labels[3] = new JLabel();

            labels[i].setFont(new Font("Arial", Font.BOLD, 20));
            labels[i].setBounds(220, labelsY, 600, 30);

            labels[0].setText("bitte karte eingeben".toUpperCase());
            labels[1].setText("oder auf den kontaktlos-leser halten".toUpperCase());

            labelsY += 50;

            labels[2].setText("please insert card or tap it".toUpperCase());
            labels[3].setText("once on the contactless reader".toUpperCase());

            addingComponents(labels[i]);
        }
    }

    public void loadingGif() throws IOException {


        // Pfad zum animierten GIF
            String gifPath = "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\vidio-output.gif";

            // Erstellen eines JLabels mit animiertem GIF
            ImageIcon gifIcon = new ImageIcon(gifPath);
            gifLabel = new JLabel(gifIcon);
            gifLabel.setBounds(680, 50, gifIcon.getIconWidth(), gifIcon.getIconHeight());

            // Hinzufügen des JLabels zum Panel
            addingComponents(gifLabel);
    }

    public void loadingScanImage(JLabel label , JLabel secondLabel) throws IOException {

        ImageLoader imageLoader = new ImageLoader();

        imageLoader.loadingImages(label , 200 , 200 , "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\360_F_651065985_PXiZuiNY64G1qSf18Jj69e1iZ5agzQkx.jpg",
                0 , 0 , 200 , 200 , 3);

        imageLoader.loadingImages(secondLabel , 100 , 100 , "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\2485526.png",
                50 , 200 , 100 , 100 , 3);


        addingComponents(label);
        addingComponents(secondLabel);


    }


    public void buttonListener(JButton button){

        button.addActionListener(e -> {



        });


    }






    public void addingComponents(Component component) {
        if (component != null) {
            this.add(component);
        } else {
            throw new NullPointerException();
        }
    }
}
