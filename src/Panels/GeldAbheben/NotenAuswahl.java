package Panels.GeldAbheben;

import Panels.FontsAndColors;
import Panels.ImageLoader;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class NotenAuswahl extends JPanel {

 private Image image;
 FontsAndColors fontsAndColors = new FontsAndColors();
 ImageLoader imageLoader = new ImageLoader();
 Stack<JPanel> stack = new Stack<JPanel>();

 protected BetragPanel betragPanel = new BetragPanel();

    public NotenAuswahl(){

        image = new ImageIcon("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\modern-6097781_960_720.jpg").getImage();
        this.setBounds(0, 0, 1080, 850);
        this.setLayout(null);

        try {
            addingButtonlabel(new JButton() , new JLabel());
            leftTaskButtons(new JButton[4] , new JLabel());
            rightTaskButtons(new JButton[4] , new JLabel());
            titleButton(new JButton());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void leftTaskButtons(JButton [] buttons , JLabel label) throws IOException {

        int buttonsX = 10;
        int buttonsY = 250;
        int buttonsWitdh = 350;
        int buttonsHeight = 70;



        for (int i = 0; i < buttons.length; i++){

            buttons[0] = new JButton();
            buttons[1] = new JButton();
            buttons[2] = new JButton();
            buttons[3] = new JButton();

            buttons[0].setText("10 €");
            buttons[1].setText("25 €");
            buttons[2].setText("50 €");
            buttons[3].setText("100 €");


            buttons[i].setFont(new FontsAndColors().getFont());
            buttons[i].setBorder(BorderFactory.createEmptyBorder(5 , 10 , 5 , 10));
            buttons[i].setBackground(Color.WHITE);
            buttons[i].setFocusable(false);



            buttons[0].setBounds(buttonsX , buttonsY , buttonsWitdh , buttonsHeight );
            buttons[1].setBounds(buttonsX , buttonsY , buttonsWitdh , buttonsHeight );
            buttons[2].setBounds(buttonsX , buttonsY , buttonsWitdh , buttonsHeight );
            buttons[3].setBounds(buttonsX , buttonsY , buttonsWitdh , buttonsHeight );
            buttonsY += 120;

            buttonImages("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\Touch.png" , 50 , 50 , buttons[i]);




            addingComponents(buttons[i]);
        }
    }
   public void rightTaskButtons(JButton [] buttons , JLabel label) throws IOException {

       int buttonsX = 700;
       int buttonsY = 250;
       int buttonsWitdh = 350;
       int buttonsHeight = 70;

       for (int i = 0; i < buttons.length; i++){

           buttons[0] = new JButton();
           buttons[1] = new JButton();
           buttons[2] = new JButton();
           buttons[3] = new JButton("anderer Betrag & \\nNotenauswahl €");

           buttons[0].setText("250 €");
           buttons[1].setText("500 €");
           buttons[2].setText("1.000 €");
           buttons[3].setText("anderer Betrag & Notenauswahl €");

           buttons[i].setFont(new FontsAndColors().getFont());
           buttons[i].setBorder(BorderFactory.createEmptyBorder(5 , 10 , 5 , 10));
           buttons[i].setBackground(Color.WHITE);
           buttons[i].setFocusable(false);
           buttons[3].setFont(new Font("Arial" , Font.BOLD , 15));

           buttonImages("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\Touch.png" , 50 , 50 , buttons[i]);

           buttons[0].setBounds(buttonsX , buttonsY , buttonsWitdh , buttonsHeight );
           buttons[1].setBounds(buttonsX , buttonsY , buttonsWitdh , buttonsHeight );
           buttons[2].setBounds(buttonsX , buttonsY , buttonsWitdh , buttonsHeight );
           buttons[3].setBounds(buttonsX , buttonsY , buttonsWitdh , buttonsHeight );

           buttonListener(i , buttons[i] , this , betragPanel , new PanelGeldAbheben() , stack);


           buttonsY += 120;

           addingComponents(buttons[i]);
       }



   }

    public void paintComponent(Graphics g) {


        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);


        g2.drawImage(image, 0, 0, 1080, 850, null);
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

    public void titleButton(JButton button){
        button.setBounds(0 ,50 , 1080 , 50);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setBackground(Color.WHITE);
        button.setFont(fontsAndColors.getFont());
        button.setText("Bitte wählen Sie die gewünschten Betrag aus.");
        button.setFocusable(false);

        addingComponents(button);
    }

    public void buttonImages(String path , int tWitdh , int tHeight , JButton button) throws IOException {
        Image img = ImageIO.read(new File(path));
        Image scaledImg = img.getScaledInstance(tWitdh, tHeight, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImg);
        button.setLayout(new BorderLayout());
        button.setIcon(icon);
        button.setHorizontalAlignment(SwingConstants.LEFT);
    }

    public void buttonListener(int index , JButton button , JPanel oldPanel , JPanel newPanel ,JPanel secondNewPanel , Stack<JPanel> stack){
        switch (index){

            case 3 : button.addActionListener(e -> {

                oldPanel.setVisible(false);
                stack.push(newPanel);
                stack.push(secondNewPanel);
                oldPanel.getParent().add(stack.get(0));
                oldPanel.getParent().add(stack.get(1));


            });


        }
    }

    public void addingComponents(Component component){
        if (component != null){
            this.add(component);
        }
    }


}
