package Panels.GeldAbheben;

import Panels.FontsAndColors;
import Panels.ImageLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Stack;


public class EigeneNotenAuswahl extends JPanel implements KeyListener {

    private Image image;
    FontsAndColors fontsAndColors = new FontsAndColors();
    ImageLoader imageLoader = new ImageLoader();

    int sum = 0;
    JLabel labelSum = new JLabel();

    JButton [] buttons = new JButton[6];

    JPanel anzeigePanel;
    JLabel labelGesamt;
    JLabel labelSumme;

   public boolean isAlreadyClicked = false;


    int buttonFuenfClicked = 0;

    JButton geldButtonFuenf = new JButton();

    Stack <JButton> minusStackButtons = new Stack<JButton>();

    //ZehnerButton
    boolean buttonZehnerIsAlreadyClicked = false;
    JButton buttonZehner = new JButton();
    Noten noten = new Noten();
    int buttonZehnClicked = 0;
    Stack<JButton> zehnerStack = new Stack<JButton>();

    //ZwanzigerButton
    boolean buttonZwanzigerIsAlreadyClicked = false;
    JButton buttonZwanziger = new JButton();
    int buttonZwaniClicked = 0;
    Stack<JButton> zwaniStack = new Stack<JButton>();

    //FünfzigerButton
    boolean buttonFufiIsAlreadyClicked = false;
    JButton buttonFufi = new JButton();
    int buttonFufiClicked = 0;
    Stack<JButton> fufiStack = new Stack<JButton>();

    //Hunderter Button
    boolean hunderterButtonIsAlreadyClicked = false;
    JButton buttonHunderter = new JButton();
    int buttonHuniClicked = 0;
    Stack<JButton> huniStack = new Stack<JButton>();

    // Zweihunterdert Button
    boolean buttonZweihundertIsAlreadyClicked = false;
    JButton buttonZweihundert = new JButton();
    int buttonZweihundertCklicked = 0;
    Stack<JButton> zweihundertStack = new Stack<JButton>();



    public EigeneNotenAuswahl(){

    this.setBounds(0 , 0 , 1080 , 850);
    image = new ImageIcon("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\modern-6097781_960_720.jpg").getImage();
    this.setLayout(null);
    this.setOpaque(true);
    anzeigePanel = new JPanel();
    labelSumme = new JLabel();
    labelGesamt = new JLabel();

    try {
        addingButtonlabel(new JButton() , new JLabel());
        createAnzeigePanel(anzeigePanel , this);
        minusButtons(buttons);
        plusButton(new JButton[6]);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

}

public void createAnzeigePanel(JPanel anzeigePanel , JPanel panel){


    anzeigePanel.setBounds(350 , 75 , 400 , 730);
    anzeigePanel.setBackground(Color.WHITE);
    anzeigePanel.setLayout(null);
    addingPanelMethods();
    panel.add(anzeigePanel);


}




    public void minusButtons(JButton [] buttons){

    int buttonsY = 100;

    for (int i = 0; i < buttons.length; i++){

     buttons[i] = new JButton();


        buttons[0] = new JButton();
        buttons[1] = new JButton();
        buttons[2] = new JButton();
        buttons[3] = new JButton();
        buttons[4] = new JButton();
        buttons[5] = new JButton();

        buttons[0].setText("5 €");
        buttons[1].setText("10 €");
        buttons[2].setText("20 €");
        buttons[3].setText("50 €");
        buttons[4].setText("100 €");
        buttons[5].setText("200 €");

        try {
            imageLoader.loadingImagesOnButton(buttons[i] , 50 , 50 , "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\Minus.png",
                    10 , 10 , 50 , 50 , 3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        buttons[i].setBounds(10 , buttonsY , 300 , 70);
        buttons[i].setBackground(Color.white);
        buttons[i].setFont(new Font("Arial" , Font.BOLD , 25));
        buttons[i].setHorizontalAlignment(SwingConstants.LEFT);
        buttons[i].setFocusable(false);
        buttonsY += 100;
        buttons[i].setBorder(BorderFactory.createEmptyBorder( 5 , 10 ,5  , 10));
        buttonListenerMinus(i , buttons[i]);

        buttons[5].setEnabled(false);



       minusStackButtons.add(buttons[i]);
        this.add(buttons[i]);
    }



    }

    public void plusButton(JButton [] buttons){
        int buttonsY = 100;

        for (int i = 0; i < buttons.length; i++){

            buttons[i] = new JButton();


            buttons[0] = new JButton();
            buttons[1] = new JButton();
            buttons[2] = new JButton();
            buttons[3] = new JButton();
            buttons[4] = new JButton();
            buttons[5] = new JButton();

            buttons[0].setText("5 €");
            buttons[1].setText("10 €");
            buttons[2].setText("20 €");
            buttons[3].setText("50 €");
            buttons[4].setText("100 €");
            buttons[5].setText("200 €");

            try {
                imageLoader.loadingImagesOnButton(buttons[i] , 50 , 50 , "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\PlusICON.png",
                        10 , 10 , 50 , 50 , 3);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            buttons[i].setBounds(780 , buttonsY , 250 , 70);
            buttons[i].setBackground(Color.white);
            buttons[i].setFont(new Font("Arial" , Font.BOLD , 25));
            buttons[i].setHorizontalAlignment(SwingConstants.RIGHT);
            buttons[i].setHorizontalTextPosition(SwingConstants.LEFT);
            buttons[i].setFocusable(false);
            buttonsY += 100;
            buttons[i].setBorder(BorderFactory.createEmptyBorder( 5 , 10 ,5  , 10));
            //   buttonsListenerPlus(i , buttons[i]);
            getSum(labelSum);
            buttonListenerPlus(i , buttons[i]);



            this.add(buttons[i]);
        }

    }

    public void addingButtonlabel(JButton button, JLabel label) throws NullPointerException, IOException {

        String labelSparkasse = "Sparkasse Bielefeld";

        button = new JButton();
        button.setBounds(0, 0, 1080, 70);
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






    //Methoden für das Zweite Panel


    public void addingPanelMethods() {
        anweisungen(new JLabel[3]);
        notenAuswahl(new JLabel());
        eingabeBestaotigung(new JLabel[2]);
        korrekttur(new JLabel[4]);
        gesamtSumme();
        addingPanelKeyListener(anzeigePanel);

    }

    public void anweisungen(JLabel [] labels){

    int labelsY = 30;

    for (int i = 0; i < labels.length; i++){

        labels[i] = new JLabel();
        labels[0] = new JLabel();
        labels[1] = new JLabel();
        labels[2] = new JLabel();



        labels[i].setFont(new Font("Arial" , Font.BOLD , 25));

        labels[0].setText("Bitte gewünschte ");
        labels[1].setText("Banknoten hinzufügen");
        labels[2].setText("bzw. abziehen");

        labels[i].setBounds(70 , labelsY , 500 , 30);
        labelsY += 30;

        anzeigePanel.add(labels[i]);

    }

    }

    public void notenAuswahl(JLabel label){
        label = new JLabel("Notenauswahl");
        label.setFont(new Font("Arial" , Font.BOLD , 25));
        label.setBounds(70 , 150 , 300 , 30);
        anzeigePanel.add(label);

    }

    public void eingabeBestaotigung(JLabel [] labels){

    int labelsY = 500;

    for (int i = 0; i < labels.length; i++){

        labels[i] = new JLabel();
        labels[0] = new JLabel();
        labels[1] = new JLabel();

        labels[0].setText("Beenden Sie die Eingabe");
        labels[1].setText("mit Enter");

        labels[i].setBounds(70 , labelsY , 300 , 30);
        labels[i].setFont(new Font("Arial" , Font.BOLD , 23));
        labelsY += 30;

        anzeigePanel.add(labels[i]);
    }
}


public void korrekttur(JLabel [] labels) {


    int labelsY = 580;

    for (int i = 0; i < labels.length; i++){

        labels[i] = new JLabel();
        labels[0] = new JLabel();
        labels[1] = new JLabel();
        labels[2] = new JLabel();
        labels[3] = new JLabel();


        labels[0].setText("Mit Korrektur wird die");
        labels[1].setText("Stückelungsvorgabe gelöscht");
        labels[2].setText("Mit ABBRUCH erhalten Sie ");
        labels[3].setText("ihre Karte zurück");

        labels[i].setBounds(70 , labelsY , 300 , 30);
        labels[i].setFont(new Font("Arial" , Font.BOLD , 15));
        labelsY += 15;

        anzeigePanel.add(labels[i]);
    }
}


    public void buttonListenerMinus(int index ,  JButton button){

        switch (index){

            case 0 : button.addActionListener(e -> {

                    buttonFuenfClicked--;
                    geldButtonFuenf.setText(String.valueOf(buttonFuenfClicked));
                    sum -= 5;
                    labelSum.setText(String.valueOf(sum + " € "));
                    geldButtonFuenf.setVisible(true);

                if (buttonFuenfClicked == 0 ) {
                    minusStackButtons.get(0).setEnabled(false);
                    geldButtonFuenf.setVisible(false);
                } else {
                    button.setEnabled(true);
                }

                repaint();

            });
                break;

            case 1 : button.addActionListener(e -> {


             buttonZehnClicked--;
             buttonZehner.setText(String.valueOf(buttonZehnClicked));
             sum-= 10;
             labelSum.setText(String.valueOf(sum + " € "));
             if (buttonZehnClicked == 0){
                 minusStackButtons.get(1).setEnabled(false);
                 buttonZehner.setVisible(false);
             }

            });
            break;

            case 2 : button.addActionListener(e -> {

                buttonZwaniClicked--;
                buttonZwanziger.setText(String.valueOf(buttonZwaniClicked));
                sum-=20;
                labelSum.setText(String.valueOf(sum + " € "));
                if(buttonZwaniClicked == 0){
                    minusStackButtons.get(2).setEnabled(false);
                    buttonZwanziger.setVisible(false);
                }

            });
            break;

            case 3 : button.addActionListener(e -> {

                buttonFufiClicked--;
                buttonFufi.setText(String.valueOf(buttonFufiClicked));
                sum-=50;
                labelSum.setText(String.valueOf(sum + " € "));
                if (buttonFufiClicked == 0){
                    minusStackButtons.get(3).setEnabled(false);
                    buttonFufi.setVisible(false);
                }
            });
            break;

            case 4 : button.addActionListener(e -> {
                buttonHuniClicked--;
                buttonHunderter.setText(String.valueOf(buttonHuniClicked));
                sum-=100;
                labelSum.setText(String.valueOf(sum + " € "));
                if (buttonHuniClicked == 0){
                    minusStackButtons.get(4).setEnabled(false);
                    buttonHunderter.setVisible(false);
                }
            });
              break;

            case 5 : button.addActionListener(e -> {


                buttonZweihundertCklicked--;
                buttonZweihundert.setText(String.valueOf(buttonZweihundertCklicked));
                sum-=200;
                labelSum.setText(String.valueOf(sum + " € "));

                if (buttonZweihundertCklicked == 0) {

                    minusStackButtons.get(5).setEnabled(false);
                    buttonZweihundert.setVisible(false);

                }


            });




                break;
        }
        for (int i = 0; i < minusStackButtons.size();  i++){
            minusStackButtons.get(i).setEnabled(false);
        }


        repaint();
    }

    public void buttonListenerPlus(int index , JButton button){

         Stack<JButton> stack = new Stack<JButton>();


        switch (index){

            case 0 : button.addActionListener(e -> {

                   buttonFuenfClicked++;
                   sum+= 5;
                   labelSum.setText(String.valueOf(sum + " € "));


                   fuenferScheinButton(geldButtonFuenf , new JLabel() , new JLabel() , stack );
                   geldButtonFuenf.setVisible(true);
                   minusStackButtons.get(0).setEnabled(true);

                   repaint();
            });
                break;

            case 1 : button.addActionListener(e -> {

                buttonZehnClicked++;
                sum+= 10;
                labelSum.setText(String.valueOf(sum + " € "));
                noten.createZehnerButton(buttonZehner ,new JLabel() , new JLabel() , zehnerStack , buttonZehnClicked , buttonZehnerIsAlreadyClicked , anzeigePanel);
             buttonZehner.setVisible(true);
             minusStackButtons.get(1).setEnabled(true);
             repaint();
            });
            break;

            case 2 : button.addActionListener(e -> {


                buttonZwaniClicked++;
                sum+= 20;
                labelSum.setText(String.valueOf(sum + " € "));

                noten.createZwanzigerButton(buttonZwanziger , new JLabel() , new JLabel() ,  zwaniStack , buttonZwaniClicked , buttonZwanzigerIsAlreadyClicked , anzeigePanel);
                buttonZwanziger.setVisible(true);

                minusStackButtons.get(2).setEnabled(true);
                repaint();
            });
            break;

            case 3 : button.addActionListener(e -> {

                buttonFufiClicked++;
                sum+=50;
                labelSum.setText(String.valueOf(sum + " € "));

                noten.createFunfzigerButton(buttonFufi , new JLabel() , new JLabel() , fufiStack ,buttonFufiClicked , buttonFufiIsAlreadyClicked , anzeigePanel);
                buttonFufi.setVisible(true);
                minusStackButtons.get(3).setEnabled(true);
                repaint();
            });
            break;

            case 4 : button.addActionListener(e -> {

                buttonHuniClicked++;
                sum+=100;
                labelSum.setText(String.valueOf(sum + " € "));

                noten.createHunterdertButton(buttonHunderter ,new JLabel() , new JLabel() , huniStack , buttonHuniClicked , hunderterButtonIsAlreadyClicked , anzeigePanel);
                buttonHunderter.setVisible(true);
                minusStackButtons.get(4).setEnabled(true);
                repaint();

            });
            break;

            case 5 : button.addActionListener(e -> {

                buttonZweihundertCklicked++;
                sum+=200;
                labelSum.setText(String.valueOf(sum + " € "));

                noten.createZweiHunderterSchein(buttonZweihundert , new JLabel() , new JLabel() , zweihundertStack , buttonZweihundertCklicked , buttonZweihundertIsAlreadyClicked , anzeigePanel);
                buttonZweihundert.setVisible(true);
                minusStackButtons.get(5).setEnabled(true);
                repaint();
            });
            break;
        }
    }



public void fuenferScheinButton(JButton geldButton , JLabel labelImage , JLabel labelScheinAnzeige , Stack<JButton> stack ){



    labelScheinAnzeige.setText("5 €");
    geldButton.setText(String.valueOf(buttonFuenfClicked));
    geldButton.setBackground(Color.lightGray);
    geldButton.setBorder(BorderFactory.createEmptyBorder(5 , 10 , 5 , 10));
    geldButton.setFont(new Font("Arial" , Font.BOLD , 20));
    labelScheinAnzeige.setFont(new Font("Arial" , Font.BOLD , 20));


    if (!isAlreadyClicked && stack.size() < 2 ) {
        try {
            geldButton.setLayout(new BorderLayout());

            imageLoader.loadingImages(labelImage, 25, 25, "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Geldscheine\\Simple-icon-of-5-euro-banknote-for-walle-Graphics-29661359-1.jpg",
                    5, 5, 25, 25, 3);
            geldButton.setBounds(70, 200, 200, 30);
            geldButton.add(labelImage, BorderLayout.WEST);
            geldButton.add(labelScheinAnzeige, BorderLayout.EAST);
            stack.push(geldButton);
            isAlreadyClicked = true;
            repaint();

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }

    anzeigePanel.add(geldButton);
}


public void gesamtSumme(){

    labelGesamt.setBounds(70 , 450 ,  300 , 30);
    labelGesamt.setFont(fontsAndColors.getFont());
    labelGesamt.setText("Gesamt: ");
    anzeigePanel.add(labelGesamt);


}

public void getSum(JLabel label){
    label.setFont(fontsAndColors.getFont());
    label.setBounds(200 , 450 , 300 , 30);
    label.setText(String.valueOf(sum) + " € ");
    anzeigePanel.add(label);
}


public void paintComponent(Graphics g){

       Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        g2.drawImage(image, 0, 0, 1080, 850, null);
    }

    public void addingPanelKeyListener(JPanel panel){
        panel.setFocusable(true);
        panel.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            System.out.println("Hallo Welt");

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}





