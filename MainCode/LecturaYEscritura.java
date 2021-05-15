package MainCode;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class LecturaYEscritura {

    java.util.Random Aleatorio = new java.util.Random();

    public void Escribir(String Mensaje,String ColorSeleccionado,String PathImage,int y, int x){
        JOptionPane.showMessageDialog(null,Mensaje,"Salida",JOptionPane.PLAIN_MESSAGE,new ImageIcon(new ImageIcon(getClass().getResource(PathImage)).getImage().getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH)));
    }
    public int LeerInt(String Mensaje,String PathImage,int y, int x){
        java.awt.Color ColorSeleccionado = new java.awt.Color(Aleatorio.nextInt(255),Aleatorio.nextInt(255),Aleatorio.nextInt(255));
        UIManager.put("OptionPane.background", ColorSeleccionado);
        UIManager.put("Panel.background", ColorSeleccionado);
        int IntDevuelta = Integer.parseInt(JOptionPane.showInputDialog(null,new JLabel(Mensaje,new ImageIcon(new ImageIcon(getClass().getResource(PathImage)).getImage().getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH)), JLabel.CENTER), "Entrada", JOptionPane.PLAIN_MESSAGE));
        UIManager.put("OptionPane.background", null);
        UIManager.put("Panel.background", null);
        return IntDevuelta;
    }
    public float LeerFloat(String Mensaje,String PathImage,int y, int x){
        java.awt.Color ColorSeleccionado = new java.awt.Color(Aleatorio.nextInt(255),Aleatorio.nextInt(255),Aleatorio.nextInt(255));
        UIManager.put("OptionPane.background", ColorSeleccionado);
        UIManager.put("Panel.background", ColorSeleccionado);
        float FloatDevuelta = Float.parseFloat(JOptionPane.showInputDialog(null,new JLabel(Mensaje,new ImageIcon(new ImageIcon(getClass().getResource(PathImage)).getImage().getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH)), JLabel.CENTER), "Entrada", JOptionPane.PLAIN_MESSAGE));
        UIManager.put("OptionPane.background", null);
        UIManager.put("Panel.background", null);
        return FloatDevuelta;
    }
    public String LeerString(String Mensaje,String PathImage,int y, int x){
        java.awt.Color ColorSeleccionado = new java.awt.Color(Aleatorio.nextInt(255),Aleatorio.nextInt(255),Aleatorio.nextInt(255));
        UIManager.put("OptionPane.background", ColorSeleccionado);
        UIManager.put("Panel.background", ColorSeleccionado);
        String StringDevuelta = JOptionPane.showInputDialog(null,new JLabel(Mensaje,new ImageIcon(new ImageIcon(getClass().getResource(PathImage)).getImage().getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH)), JLabel.CENTER), "Entrada", JOptionPane.PLAIN_MESSAGE);
        UIManager.put("OptionPane.background", null);
        UIManager.put("Panel.background", null);
        return StringDevuelta;
    }
}
