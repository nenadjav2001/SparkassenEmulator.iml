package Interfaces;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public interface LoadingImages {


    public void loadingImages(JLabel label, int targetWitdh, int targetHeight, String path, int x, int y, int witdh, int height, int hints)
            throws IOException;


    public void loadingImageArray(JLabel [] labels , int targetW , int targetH , String [] paths , int x , int y , int witdh ,int heigt, int hints);

    public void loadingLargerImageArray(JLabel [] labels , int targetW , int targetH , String [] paths , int x , int y , int witdh ,int heigt, int hints);

    public void loadingImagesOnButton(JButton button, int targetWitdh, int targetHeight, String path, int x, int y, int witdh, int height, int hints)
            throws IOException;

    public void buttonImages(String path , int tWitdh , int tHeight , JButton button) throws IOException;


}
