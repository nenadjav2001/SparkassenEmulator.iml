package Panels;

import java.awt.*;

public class FontsAndColors {


Font font = new Font("Arial" , Font.ITALIC , 30);

Font font2 = new Font("Papyrus" , Font.BOLD, 20);
Color fontColor = Color.black;

    public Font getFont() {
        return font;
    }

    public Font getFont2(){
        return font2;
    }

    public Color getFontColor() {
        return fontColor;
    }
}
