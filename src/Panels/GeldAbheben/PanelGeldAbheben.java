package Panels.GeldAbheben;

import Panels.FontsAndColors;
import Panels.ImageLoader;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Stack;



public class PanelGeldAbheben extends JPanel {

    private Image image;


    ImageLoader imageLoader = new ImageLoader();
    FontsAndColors fontsAndColors = new FontsAndColors();

    JButton notenAuswahlB = new JButton();
    JButton betragAuszahlen = new JButton();
    BetragPanel betragPanel = new BetragPanel();





public PanelGeldAbheben() {

        image = new ImageIcon("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\modern-6097781_960_720.jpg").getImage();


        this.add(betragPanel);
        this.setBounds(0, 0, 1080, 850);
        this.setLayout(null);
        this.setOpaque(true);
        try {
            addingButtonlabel(new JButton(), new JLabel());
            buttonNotenAuswahl(notenAuswahlB);
            betragAuszahlen(betragAuszahlen);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        repaint();
    }

        public void paintComponent (Graphics g){


        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);


        g2.drawImage(image, 0, 0, 1080, 850, null);

        repaint();
    }

        public void addingButtonlabel (JButton button, JLabel label) throws NullPointerException, IOException {

        String labelSparkasse = "Sparkasse Bielefeld";

        button = new JButton();
        button.setBounds(0, 0, 1080, 50);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setText(labelSparkasse.toUpperCase());
        button.setFont(fontsAndColors.getFont());
        button.setForeground(Color.black);
        button.setBackground(Color.red);
        button.setFocusable(false);
        //   button.setEnabled(false);
        button.setLayout(new BorderLayout());
        button.setForeground(Color.white);

        imageLoader.loadingImages(label, 50, 50, "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\LogoSparkasse.png",
                50, 20, 50, 50, 3);

        button.add(label, BorderLayout.WEST); // Platziere das Label links im Button

        this.add(button);


    }

        public void buttonNotenAuswahl (JButton buttonNotenausWahl) throws IOException {

        buttonNotenausWahl.setBounds(10, 600, 300, 50);
        buttonNotenausWahl.setFocusable(false);
        buttonNotenausWahl.setText("Notenauswahl");
        buttonNotenausWahl.setBackground(Color.white);
        buttonNotenausWahl.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        buttonNotenausWahl.setFont(fontsAndColors.getFont());
        imageLoader.buttonImages("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\Dollar.jpg", 50, 50, buttonNotenausWahl);
        buttonNotenausWahl.setFont(new Font("Arial", Font.BOLD, 20));
        buttonListenerNotenAuswahl(buttonNotenausWahl);

        repaint();

        this.add(buttonNotenausWahl);
    }

        public void betragAuszahlen (JButton auszahlen) throws IOException {


        auszahlen.setBounds(900, 600, 300, 50);
        auszahlen.setFocusable(false);
        auszahlen.setText("Betrag auszahlen");
        auszahlen.setBackground(Color.white);
        auszahlen.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        imageLoader.loadingImagesOnButton(auszahlen, 50, 50, "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\istockphoto-1079725292-612x612.jpg",
                750, 600, 300, 50, 3);

        auszahlen.setFont(new Font("Arial", Font.BOLD, 20));

        this.add(auszahlen);

    }


        public void buttonListenerNotenAuswahl (JButton button){
        button.addActionListener(e -> {

            System.out.println("Hallo Welt");

            repaint();
        });
    }






}
