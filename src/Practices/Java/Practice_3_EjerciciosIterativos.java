package Practices.Java;

import javax.swing.JOptionPane;

public class Practice_3_EjerciciosIterativos {
    public static void main(String[] args) {

    }
    public static void Punto7(){
        int num=1;
        while(num!=5){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número "));         
        } 
        JOptionPane.showMessageDialog(null,"El programa finalizó porque digitaste el número 5 ");    
    }
    public static void Punto8(){
        String Tabla = "";
        int Numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero para la tabla"));
        for (int i = 0; i <= 10; i++) Tabla += Numero+" x "+i+" = "+(Numero*i)+"\n";
        JOptionPane.showMessageDialog(null,Tabla);
    }
    public static void Punto9(){
        String Lista = "";
        for (int i = 0; i <= 200; i += 24) Lista += (i)+" "+(i+8)+" "+(i+16)+"\n";
        JOptionPane.showMessageDialog(null,Lista);
    }
}
