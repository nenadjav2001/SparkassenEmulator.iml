package Panels;

import Panels.GeldAbheben.NotenAuswahl;
import Screen.SparkasseFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Stack;

public class SecondBackGroundImage extends JPanel {


    private Image image;
    FontsAndColors fontsAndColors = new FontsAndColors();
    ImageLoader imageLoader = new ImageLoader();
    Stack<JPanel> panels = new Stack<JPanel>();




    public SecondBackGroundImage() {
        image = new ImageIcon("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\modern-6097781_960_720.jpg").getImage();
        this.setBounds(0, 0, 1080, 850);
        this.setLayout(null);
        try {
            addingButtonlabel(new JButton(), new JLabel());
            taskButton(new JButton());
            addingLeftTaksButtons(new JButton[3]);
            addingRightTaksButtons(new JButton[4]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addingButtonlabel(JButton button, JLabel label) throws NullPointerException, IOException {

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

    public void taskButton(JButton button) {
        button.setBounds(0, 50, 1080, 50);
        button.setText("Bitte wählen sie die gewünschte Funktion aus");
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setBackground(Color.white);
        button.setForeground(Color.black);
        button.setFont(fontsAndColors.getFont());
        button.setFocusable(false);
        addingComponentsToPanel(button);

    }

    public void addingLeftTaksButtons(JButton[] buttons) throws IOException {

        int buttonX = 20;
        int buttonY = 200;
        int buttonWidth = 350;
        int buttonHeight = 70;

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();

            buttons[0] = new JButton();
            buttons[1] = new JButton();
            buttons[2] = new JButton();


            // Hier füge ich das Bild direkt zum Button hinzu
            Image img = ImageIO.read(new File("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\Download (2).png"));
            Image scaledImg = img.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(scaledImg);
            buttons[2].setIcon(icon);

            buttonImages("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\KontoStandIcon.jpg" , 100 , 100 ,buttons[0]);
            buttonImages("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\Geldautomat_Sparkasse_Markgraeflerland_Bad_Bellingen (1).png",
                    55 ,55 , buttons[1]);



            buttons[0].setText("Kontostand");
            buttons[1].setText("Handy aufladen");
            buttons[2].setText("English");

           buttons[0].setBounds(buttonX , buttonY , buttonWidth , buttonHeight);
           buttons[1].setBounds(buttonX , 340 , buttonWidth ,  buttonHeight);
           buttons[2].setBounds(buttonX , 620 , buttonWidth , buttonHeight);


            buttons[i].setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

            buttons[i].setHorizontalAlignment(SwingConstants.LEFT);
            buttons[i].setFocusable(false);
            buttons[i].setForeground(Color.BLACK);
            buttons[i].setBackground(Color.WHITE);
            buttons[i].setFont(fontsAndColors.getFont());

            addingComponentsToPanel(buttons[i]);
        }
    }


    public void addingRightTaksButtons(JButton[] buttons) throws IOException {

        int buttonX = 700;
        int buttonY = 200;
        int buttonWitdh = 350;
        int buttonHeight = 70;


        for (int i = 0; i < buttons.length; i++) {

            buttons[i] = new JButton();

            buttons[0] = new JButton();
            buttons[1] = new JButton();
            buttons[2] = new JButton();
            buttons[3] = new JButton();


            buttons[0].setText("Bargeldauszahlung");
            buttons[1].setText("Bargeldeinzahlung");
            buttons[2].setText("weitere Bargeld Funktionen");
            buttons[3].setText("Service Funktionen");

            buttonImages("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\75415027-geld-icon-euro-euro-und-bargeld-münze-währung-bank-symbol-flaches-design-stock-vektor.jpg",
                    55 , 55 , buttons[0]);
            buttonImages("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\png-transparent-computer-icons-money-cash-others-miscellaneous-angle-text.png",
                    55 , 55 ,buttons[1]);
            buttonImages("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\plus.png" , 55 ,55 ,buttons[2]);
            buttonImages("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\service.png" , 55 ,55 ,buttons[3]);

            buttons[i].setBorder(BorderFactory.createEmptyBorder(5 , 10 ,5 , 10));

            buttonListenerRight(i , buttons[i]);

            buttons[i].setBounds(buttonX, buttonY, buttonWitdh, buttonHeight);
            buttons[i].setFocusable(false);
            buttons[i].setForeground(Color.black);
            buttons[i].setBackground(Color.WHITE);
            buttons[i].setFont(fontsAndColors.getFont());
            buttonY += 140;




            addingComponentsToPanel(buttons[i]);
        }

    }

    public void buttonImages(String path , int tWitdh , int tHeight , JButton button) throws IOException {
        Image img = ImageIO.read(new File(path));
        Image scaledImg = img.getScaledInstance(tWitdh, tHeight, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImg);
        button.setIcon(icon);
    }



    public void paintComponent(Graphics g) {


        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);


        g2.drawImage(image, 0, 0, 1080, 850, null);
    }

    public void buttonListenerRight(int index , JButton button){
        switch (index){


            case 0 : button.addActionListener(e -> {

                panelAbheben(panels ,this , new NotenAuswahl());


            //    this.getParent().add(new PanelGeldAbheben());


            });

                break;
        }
    }

    public void panelAbheben(Stack<JPanel> stack , JPanel oldPanel , JPanel newPanel){

        oldPanel.setVisible(false);
        stack.push(newPanel);
        oldPanel.getParent().add(stack.peek());
    }





    public void addingComponentsToPanel(Component component) {
        if (component != null) {
            this.add(component);

        } else if (component == null) {
            throw new NullPointerException();
        }


    }

}

