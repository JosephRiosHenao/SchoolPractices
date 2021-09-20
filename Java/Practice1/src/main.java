
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RiosHenao
 */
public class main {
    
    public static void main(String[] args) {
        while(true){
            int menuOtp = menu();
            filter(menuOtp);
        }
    }
    
    public static int menu(){
       int menuSelect = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la actividad"));
       return menuSelect;
    }
    
    public static void filter(int menu){
        switch(menu){
            case 1: 
                float w = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el ancho"));
                float h = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el alto"));
                JOptionPane.showMessageDialog(null, "El area es: "+((w*h)/2));
                break;
            case 2:
                float r = Float.parseFloat(JOptionPane.showInputDialog(null,"Digita el radio"));
                JOptionPane.showMessageDialog(null, "El area es: "+(3.14*(r*r)));
                break;
            case 3:
                float n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el numero"));
                JOptionPane.showMessageDialog(null, "El cuadrado es: "+(n*n));
                break;
            case 4:
                float n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite un numero"));
                JOptionPane.showMessageDialog(null, "Si da 0 es par, si no es impar \n El numero es: "+(n2%2));
                break;
            case 5:
                activity5();
                break;
            case 6:
                
                
                     
        }
    }
    
    public static void activity5(){
        float[][] notes = new float[2][10];
        boolean exit = false;
        while (exit){
            String data = "";
            float sumPro = 0;
            String state = JOptionPane.showInputDialog(null,"Desea registrar la notas: (y/n) ");
            if (state == "y"){
                for (int i = 0; i < notes.length; i++) {
                    for (int j = 0; j < notes[i].length; j++) {
                        notes[i][j] = Float.parseFloat(JOptionPane.showInputDialog(null,"Materias: \n1. LENGUA\n2. INGLES\n\nDigite la nota de la materia "+(i+1)+", la nota #"+(j+i)+" es: "));    
                    }
                }
            }
            int menuFive = Integer.parseInt(JOptionPane.showInputDialog(null,"1.Ver promedios y notas de LENGUA\n2.Ver promedios y notas de INGLES\n3.Promedio final de las 2 areas\n4.SALIR DEL BUCLE"));
            switch (menuFive){
                case 1:
                    for (int i = 0; i < notes[0].length; i++) {
                        data += "Nota "+(i+1)+": "+notes[0][i]+"\n";
                        sumPro += notes[0][i];
                    }
                    JOptionPane.showMessageDialog(null, "Las notas son: \n"+data+"\n El promedio es: "+(sumPro/notes[0].length));
                    break;
                case 2:
                    for (int i = 0; i < notes[1].length; i++) {
                        data += "Nota "+(i+1)+": "+notes[1][i]+"\n";
                        sumPro += notes[1][i];
                    }
                    JOptionPane.showMessageDialog(null, "Las notas son: \n"+data+"\n El promedio es: "+(sumPro/notes[1].length));
                    break;
                case 3:
                    for (int i = 0; i < notes[0].length; i++) {
                        data += "Nota "+(i+1)+": "+notes[0][i]+"\n";
                        sumPro += notes[0][i];
                    }
                    JOptionPane.showMessageDialog(null, "Las notas de LENGUA son: \n"+data+"\n El promedio es: "+(sumPro/notes[0].length));
                    for (int i = 0; i < notes[1].length; i++) {
                        data += "Nota "+(i+1)+": "+notes[1][i]+"\n";
                        sumPro += notes[1][i];
                    }
                    JOptionPane.showMessageDialog(null, "Las notas de INGLES son: \n"+data+"\n El promedio es: "+(sumPro/notes[1].length));
                    break;
                default:
                    exit = true;
                    break;
            }
        }
    }
}
