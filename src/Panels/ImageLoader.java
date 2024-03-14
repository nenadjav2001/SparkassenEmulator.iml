package Panels;

import Interfaces.LoadingImages;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ImageLoader implements LoadingImages {
    @Override
    public void loadingImages(JLabel label, int targetWitdh, int targetHeight, String path, int x, int y, int witdh, int height, int hints) throws IOException {
        File file = new File(path);
        Image img = ImageIO.read(file);
        Image icon = img.getScaledInstance(targetWitdh, targetHeight, hints);
        label.setIcon(new ImageIcon(icon));
        label.setBounds(x, y, witdh, height);
    }

    @Override
    public void loadingImageArray(JLabel[] labels, int targetW, int targetH, String[] paths, int x, int y, int witdh, int height, int hints) {

        if (labels.length != paths.length){
            throw new ArrayIndexOutOfBoundsException("Array länge gleicht nicht der Path länge");

        }  else if (labels == null || paths == null){

            throw new NullPointerException("Null Pointer Exception");
        }

        for (int i = 0; i < labels.length; i++){


            try {

            File file = new File(paths[i]);
            Image img = ImageIO.read(file);
            Image icon = img.getScaledInstance(targetW , targetH , 3);
            labels[i].setIcon(new ImageIcon(icon));
            labels[i].setBounds(x ,y ,witdh , height);
            x+= 120;

            }  catch (Exception e){

               e.printStackTrace();
            }



        }






    }

    @Override
    public void loadingLargerImageArray(JLabel[] labels, int targetW, int targetH, String[] paths, int x, int y, int witdh, int height, int hints) {
        if (labels.length != paths.length){
            throw new ArrayIndexOutOfBoundsException("Array länge gleicht nicht der Path länge");

        }  else if (labels == null || paths == null){

            throw new NullPointerException("Null Pointer Exception");
        }

        for (int i = 0; i < labels.length; i++){


            try {

                File file = new File(paths[i]);
                Image img = ImageIO.read(file);
                Image icon = img.getScaledInstance(targetW , targetH , 3);
                labels[i].setIcon(new ImageIcon(icon));
                labels[i].setBounds(x ,y ,witdh , height);
                x+= 160;

            }  catch (Exception e){

                e.printStackTrace();
            }



        }
    }

    @Override
    public void loadingImagesOnButton(JButton button, int targetWitdh, int targetHeight, String path, int x, int y, int witdh, int height, int hints) throws IOException {
        File file = new File(path);
        Image img = ImageIO.read(file);
        Image icon = img.getScaledInstance(targetWitdh, targetHeight, hints);
        button.setIcon(new ImageIcon(icon));
        button.setBounds(x, y, witdh, height);
    }

    @Override
    public void buttonImages(String path, int tWitdh, int tHeight, JButton button) throws IOException {
        Image img = ImageIO.read(new File(path));
        Image scaledImg = img.getScaledInstance(tWitdh, tHeight, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImg);
        button.setIcon(icon);
    }


}
