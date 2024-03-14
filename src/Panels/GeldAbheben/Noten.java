package Panels.GeldAbheben;

import Panels.ImageLoader;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.IOException;
import java.util.Stack;

public class Noten {

    Font notenFont = new Font("Arial" , Font.BOLD , 20);
    ImageLoader imageLoader = new ImageLoader();


    public void createZehnerButton(JButton geldButton , JLabel labelImage , JLabel labelScheinAnzeige , Stack<JButton> stack , int buttonClicked , boolean zehnnerIsAlreadyClicked , JPanel panel){
        labelScheinAnzeige.setText("10 € ");
        geldButton.setText(String.valueOf(buttonClicked));
        geldButton.setBackground(Color.lightGray);
        geldButton.setBorder(BorderFactory.createEmptyBorder(5 , 10 ,5 , 10));
        geldButton.setFont(notenFont);
        labelScheinAnzeige.setFont(notenFont);

        if (!zehnnerIsAlreadyClicked && stack.size() < 2){



            try {

                geldButton.setLayout(new BorderLayout());
                imageLoader.loadingImages(labelImage , 25 , 25 ,"C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Geldscheine\\Simple-icon-of-10-euro-banknote-for-wall-Graphics-29661372-1.jpg",
                        5 , 5 ,25 ,25  ,3);
                geldButton.setBounds(70 , 240 , 200 , 30);
                geldButton.add(labelImage , BorderLayout.WEST);
                geldButton.add(labelScheinAnzeige , BorderLayout.EAST);
                stack.add(geldButton);
                zehnnerIsAlreadyClicked = true;
                panel.repaint();

            } catch (IOException ex){
                throw new RuntimeException(ex);
            }



        }

        panel.add(geldButton);


}

public void createZwanzigerButton(JButton geldButton , JLabel labelImage , JLabel labelScheinAnzeige , Stack<JButton> stack , int buttonClicked , boolean zwaniIsAlreadyClicked , JPanel panel){



    labelScheinAnzeige.setText("20 € ");
    geldButton.setText(String.valueOf(buttonClicked));
    geldButton.setBackground(Color.lightGray);
    geldButton.setBorder(BorderFactory.createEmptyBorder(5 , 10 ,5 , 10));
    geldButton.setFont(notenFont);
    labelScheinAnzeige.setFont(notenFont);

    if (!zwaniIsAlreadyClicked && stack.size() < 2){



        try {

            geldButton.setLayout(new BorderLayout());
            imageLoader.loadingImages(labelImage , 25 , 25 ,"C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Geldscheine\\20euroImageIcon.png",
                    5 , 5 ,25 ,25  ,3);
            geldButton.setBounds(70 , 280 , 200 , 30);
            geldButton.add(labelImage , BorderLayout.WEST);
            geldButton.add(labelScheinAnzeige , BorderLayout.EAST);
            stack.add(geldButton);
            zwaniIsAlreadyClicked = true;
            panel.repaint();

        } catch (IOException ex){
            throw new RuntimeException(ex);
        }



    }

    panel.add(geldButton);








}

public void createFunfzigerButton(JButton geldButton , JLabel labelImage , JLabel labelScheinAnzeige , Stack<JButton> stack , int buttonClicked , boolean fufiIsAlreadyClicked , JPanel panel){
    labelScheinAnzeige.setText("50 € ");
    geldButton.setText(String.valueOf(buttonClicked));
    geldButton.setBackground(Color.lightGray);
    geldButton.setBorder(BorderFactory.createEmptyBorder(5 , 10 ,5 , 10));
    geldButton.setFont(notenFont);
    labelScheinAnzeige.setFont(notenFont);

    if (!fufiIsAlreadyClicked && stack.size() < 2){



        try {

            geldButton.setLayout(new BorderLayout());
            imageLoader.loadingImages(labelImage , 25 , 25 ,"C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Geldscheine\\Simple-icon-of-50-euro-banknote-for-wall-Graphics-29661414-1.jpg",
                    5 , 5 ,25 ,25  ,3);
            geldButton.setBounds(70 , 320 , 200 , 30);
            geldButton.add(labelImage , BorderLayout.WEST);
            geldButton.add(labelScheinAnzeige , BorderLayout.EAST);
            stack.add(geldButton);
            fufiIsAlreadyClicked = true;
            panel.repaint();

        } catch (IOException ex){
            throw new RuntimeException(ex);
        }



    }

    panel.add(geldButton);
}

public void createHunterdertButton(JButton geldButton , JLabel labelImage , JLabel labelScheinAnzeige , Stack<JButton> stack , int buttonClicked , boolean hunniIsAlreadyClicked , JPanel panel){

    labelScheinAnzeige.setText("100 € ");
    geldButton.setText(String.valueOf(buttonClicked));
    geldButton.setBackground(Color.lightGray);
    geldButton.setBorder(BorderFactory.createEmptyBorder(5 , 10 ,5 , 10));
    geldButton.setFont(notenFont);
    labelScheinAnzeige.setFont(notenFont);

    if (!hunniIsAlreadyClicked && stack.size() < 2){



        try {

            geldButton.setLayout(new BorderLayout());
            imageLoader.loadingImages(labelImage , 25 , 25 ,"C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Geldscheine\\Simple-icon-of-100-euro-banknote-for-wal-Graphics-29768038-1.jpg",
                    5 , 5 ,25 ,25  ,3);
            geldButton.setBounds(70 , 360 , 200 , 30);
            geldButton.add(labelImage , BorderLayout.WEST);
            geldButton.add(labelScheinAnzeige , BorderLayout.EAST);
            stack.add(geldButton);
            hunniIsAlreadyClicked = true;
            panel.repaint();

        } catch (IOException ex){
            throw new RuntimeException(ex);
        }



    }

    panel.add(geldButton);



    }

public void createZweiHunderterSchein(JButton geldButton , JLabel labelImage , JLabel labelScheinAnzeige , Stack<JButton> stack , int buttonClicked , boolean zweiHunniIsAlreadyClicked , JPanel panel){

    labelScheinAnzeige.setText("200 € ");
    geldButton.setText(String.valueOf(buttonClicked));
    geldButton.setBackground(Color.lightGray);
    geldButton.setBorder(BorderFactory.createEmptyBorder(5 , 10 ,5 , 10));
    geldButton.setFont(notenFont);
    labelScheinAnzeige.setFont(notenFont);

    if (!zweiHunniIsAlreadyClicked && stack.size() < 2){



        try {

            geldButton.setLayout(new BorderLayout());
            imageLoader.loadingImages(labelImage , 25 , 25 ,"C:\\Users\\bewer\\Downloads\\TicTacToe\\SparkassenEmulator\\Geldscheine\\Simple-icon-of-200-euro-banknote-for-wal-Graphics-29768045-1.jpg",
                    5 , 5 ,25 ,25  ,3);
            geldButton.setBounds(70 , 400 , 200 , 30);
            geldButton.add(labelImage , BorderLayout.WEST);
            geldButton.add(labelScheinAnzeige , BorderLayout.EAST);
            stack.add(geldButton);
            zweiHunniIsAlreadyClicked = true;
            panel.repaint();

        } catch (IOException ex){
            throw new RuntimeException(ex);
        }



    }

    panel.add(geldButton);


    }





}
