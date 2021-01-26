package Practices.Java;

import javax.swing.JOptionPane;

public class Practice_3_EjerciciosIterativos {
    public static void main(String[] args) {
        Punto10();
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
    public static void Punto10(){
        String Nombre, Lista = "";
        double[] Notas = new double[4];
        for (int i = 0; i < 5; i++){
            Nombre = JOptionPane.showInputDialog(null,"Digite el nombre del "+(i+1)+"° estudiante: ");
            while (true) { 
                Notas[0] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la nota practica(10%):")); 
                if (Notas[0]<=10 && Notas[0]>=0) break; 
                else JOptionPane.showMessageDialog(null,"Las notas solo pueden ser desde 0-10","Error",JOptionPane.ERROR_MESSAGE);
            }
            while (true) { 
                Notas[1] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la nota problemas(50%):")); 
                if (Notas[1]<=10 && Notas[1]>=0) break; 
                else JOptionPane.showMessageDialog(null,"Las notas solo pueden ser desde 0-10","Error",JOptionPane.ERROR_MESSAGE);
            }
            while (true) { 
                Notas[2] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la nota teorica(40%):")); 
                if (Notas[2]<=10 && Notas[2]>=0) break; 
                else JOptionPane.showMessageDialog(null,"Las notas solo pueden ser desde 0-10","Error",JOptionPane.ERROR_MESSAGE);
            }
            Notas[0] = Notas[0] * 0.1;
            Notas[1] = Notas[1] * 0.5;
            Notas[2] = Notas[2] * 0.4;
            Notas[3] = Notas[0] + Notas[1] + Notas[2];
            Lista += "Estudiante #"+(i+1)+"\nNombre: "+Nombre+"\n Nota practica: "+Notas[0]+" Nota problemas: "+Notas[1]+" Nota teorica: "+Notas[2]+"\n\n";
        }
        JOptionPane.showMessageDialog(null,Lista);
    }
}
