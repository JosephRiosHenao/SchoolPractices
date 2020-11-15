package Main;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class RenderImagesClass {
    public Icon icono(String path, int width, int height){
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width,height,java.awt.Image.SCALE_SMOOTH));
        return img;
    }
    
}
