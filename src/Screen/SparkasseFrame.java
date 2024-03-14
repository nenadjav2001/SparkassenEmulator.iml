package Screen;


import Panels.*;
import Panels.GeldAbheben.BetragPanel;
import Panels.GeldAbheben.EigeneNotenAuswahl;
import Panels.GeldAbheben.NotenAuswahl;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Stack;



public class SparkasseFrame extends JFrame {

    private final int screenWitdh = 1080;
    private final int screenHeigt = 850;

    BackgroundPanel backgroundPanel;

    ImageLoader imageLoader;

    JButton buttonUeberschrift;
    JLabel labelLogo;

    String anweisung = "Bitte geben Sie ihre Karte ein";
    String anweisungEnglish = "Please insert your card";

    FontsAndColors fontsAndColors;

    Startpanel startpanel = new Startpanel();

    Stack<JPanel> panelsStack = new Stack<JPanel>();



    public SparkasseFrame() {
        super("Sparkasse");
        backgroundPanel = new BackgroundPanel();
        imageLoader = new ImageLoader();
        buttonUeberschrift = new JButton();
        labelLogo = new JLabel();
        fontsAndColors = new FontsAndColors();

        // for (int i = 0; i < getPanel().length; i++){
        //   getPanel()[i].setVisible(false);
        //   }



    }

    public void createFrame() throws Exception {

        this.add(startpanel);

        ImageIcon icon = new ImageIcon("C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\Sparkasse.svg.png");
        this.setIconImage(icon.getImage());

        this.setSize(screenWitdh, screenHeigt);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.add(backgroundPanel);
        adddingMehtods();





        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    public void adddingMehtods() throws IOException {

        addingButtonlabel(buttonUeberschrift, labelLogo);
        //     setAnweisungen(new JLabel(), new JLabel());
        loadingStartImages();
        loadingSecondStartImages();
        loadingThirdStartImages();
        karteVerlorenButton(new JLabel());
        noCard(new JLabel() , new JButton());



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

        addingComponentsToPanel(button);

    }

    public void setAnweisungen(JLabel labelAnweisung, JLabel labelAnweisungEng) throws NullPointerException {

        labelAnweisung = new JLabel();
        labelAnweisung.setBounds(340, 80, 400, 30);
        //  labelAnweisung.setFont();
        labelAnweisung.setText(anweisung);


        labelAnweisungEng = new JLabel();
        labelAnweisungEng.setBounds(380, 120, 400, 30);
        labelAnweisungEng.setFont(fontsAndColors.getFont());
        labelAnweisungEng.setText(anweisungEnglish);

        addingComponentsToPanel(labelAnweisung);
        addingComponentsToPanel(labelAnweisungEng);


    }

    public void loadingStartImages() {

        JLabel[] labels = new JLabel[4];


        for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel();
            addingComponentsToPanel(labels[i]);
        }

        String[] paths = {"C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\Girocard_logo.svg.png", "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\1200px-Geldkarte_Logo.svg.png",
                "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\Geldautomat_Sparkasse_Markgraeflerland_Bad_Bellingen (1).png", "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\220px-Eufiserv_Logo.jpg"
        };

        imageLoader.loadingImageArray(labels, 100, 80, paths, 300, 480, 100, 80, 3);

    }

    public void loadingSecondStartImages() {

        JLabel[] labels = new JLabel[6];

        int imagesX = 80;


        for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel();
            addingComponentsToPanel(labels[i]);
        }

        String[] paths = {"C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\Mastercard.png", "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\maestro_payment_method_card_icon_142736.png",
                "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\Cirrus_logo.svg.png", "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\visa-logo.png" , "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\vpay_logo-320x145.jpg",
                "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\2560px-Visa_Electron.svg.png"

        };

        imageLoader.loadingLargerImageArray(labels, 130, 80, paths, imagesX , 570, 130, 80, 3);

    }

    public void loadingThirdStartImages(){

        JLabel[] labels = new JLabel[3];

        int imagesX = 235;


        for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel();
            addingComponentsToPanel(labels[i]);
        }

        String[] paths = {"C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\1200px-China-UnionPay-Logo.svg.png" , "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\1026px-American_Express_logo_(2018).svg.png",
                "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\998326cc1066481ec2b3216668236cb5.png"


        };

        imageLoader.loadingLargerImageArray(labels, 130, 80, paths, imagesX , 670, 130, 80, 3);

    }

    public void karteVerlorenButton(JLabel label) throws IOException {

        imageLoader.loadingImages(label , 150 , 80 , "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\ks_ws_artikel_september_116116.jpg",
                700 , 670 , 150 , 80 ,3);

        addingComponentsToPanel(label);

    }
    public void noCard(JLabel labelNoCard , JButton buttonNoCard) throws IOException{


        labelNoCard.setBounds(900 , 780 , 200 , 30);
        labelNoCard.setText("Keine-Karte !?");
        labelNoCard.setFont(new Font("Arial", Font.BOLD, 20));
        ImageLoader imageLoader = new ImageLoader();
        imageLoader.loadingImagesOnButton(buttonNoCard , 100 , 100 , "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\1000_F_327187830_vMjAhYywuDtbJdovaHjUwsTRV4ak19Sn.jpg",
                900 , 670 , 100 , 100 , 3 );

        noCardListener(buttonNoCard);
        addingComponentsToPanel(labelNoCard);
        addingComponentsToPanel(buttonNoCard);
    }



    public void noCardListener(JButton button){
        button.addActionListener(e -> {
            nextPanel(new SecondBackGroundImage() , panelsStack);
        });
    }

    public void nextPanel(JPanel panel , Stack<JPanel> stack){

        for (int i = 0; i < getPanel().length; i++){
            getPanel()[i].setVisible(false);
        }

        panelsStack.push(panel);
        this.add(panelsStack.peek());

        if (stack.isEmpty()) {
            panelsStack.push(panel);
            this.add(panelsStack.peek());
        }
    }



    public JFrame getFrame(){
        return this;
    }

    public JPanel [] getPanel(){
        JPanel [] panels = {startpanel , backgroundPanel};
        return  panels;
    }



    public void addingComponentsToPanel(Component component) {

        if (component != null) {
            backgroundPanel.add(component);

        } else if (component == null) {
            throw new NullPointerException();
        }
    }




}


