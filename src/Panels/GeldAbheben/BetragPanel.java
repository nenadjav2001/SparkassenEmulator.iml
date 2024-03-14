package Panels.GeldAbheben;

import Panels.FontsAndColors;
import Panels.ImageLoader;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class BetragPanel extends JPanel {

    FontsAndColors fontsAndColors = new FontsAndColors();
    JTextField betragField = new JTextField();
    ImageLoader imageLoader = new ImageLoader();

public BetragPanel(){

 this.setBounds(80 , 100 ,900 , 400);
  this.setOpaque(true);
  this.setLayout(null);
  this.add(betragField);
  this.setBackground(Color.WHITE);
    try {
        panelMethods();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

public void panelMethods() throws IOException {
    setLabelAnweisung(new JLabel() , "Bitte gewünschten Betrag eingeben" , 230 , 50 , 500 , 30);
    setBetragField(betragField , 320 , 120 , 300 , 50);
    secondAnweisungen(new JLabel[3]);
}

public void setLabelAnweisung(JLabel label , String text , int x , int y , int witdh , int height){
    label.setBounds(x , y ,witdh , height);
    label.setText(text);
    label.setFont(fontsAndColors.getFont());
    addingComponents(label);
}

public void setBetragField(JTextField betragField , int x , int y , int witdh , int height) throws IOException {
    betragField.setHorizontalAlignment(SwingConstants.LEFT);
    betragField.setBounds(x ,y  ,witdh ,height);
    betragField.setFont(new Font("Arial" , Font.ITALIC , 23));
    betragField.setBackground(new Color(230, 230, 230));
    betragField.setBorder(BorderFactory.createEmptyBorder(5 , 10 , 5 , 10));
    addingImageToField(betragField , new JLabel() , new JLabel());
    addingComponents(betragField);
}
public void secondAnweisungen(JLabel [] labels){

    int x = 200;
    int y = 200;
    int witdh = 550;
    int height = 30;


    for (int i = 0; i < labels.length; i++){
        labels[i] = new JLabel();
        labels[0] = new JLabel();
        labels[1] = new JLabel();
        labels[2] = new JLabel();

        labels[0].setText("danach \"Notenauswahl.\"" + "für individuelle Stückelung");
        labels[1].setText("oder \"Betrag auszahlen\"" + "drücken");
        labels[2].setText("Verfügbare Noten : 5 € / 10 € / 20 € / 50 €");

        labels[i].setFont(new Font("Arial" , Font.BOLD , 22));
    //    labels[i].setBounds(x ,y , witdh , height);
        labels[0].setBounds(200 , 200 , 550 , 30);
        labels[1].setBounds(300 , 240 , 550 , 30);
        labels[2].setBounds(250 , 290 , 550 , 30);
        y+= 40;

        addingComponents(labels[i]);

    }


}

public void addingImageToField(JTextField field , JLabel label , JLabel labelPinPard) throws IOException {

    imageLoader.loadingImages(label , 25 , 25 , "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\-euro-symbol_90430 (1).png",
            220 , 15, 25 ,25 , 3);

   imageLoader.loadingImages(labelPinPard , 50 ,50 , "C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Images\\PinPard.png",
           250 , 5 , 50 ,50 ,3);

  //  field.setLayout(new BorderLayout());
    field.add(labelPinPard );
    field.add(label );

}
public void setVisibiltyForPanel(){
    this.setVisible(false);
}





public void addingComponents(Component component)throws NullPointerException{
    if (component != null){
        this.add(component);
    }
}


}
