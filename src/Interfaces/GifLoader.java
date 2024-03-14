package Interfaces;

import javax.swing.*;

@FunctionalInterface
public interface GifLoader {
    public void gifLoader(JPanel panel , String gifPath , JLabel label , int x , int y , int witdh , int height);

}
