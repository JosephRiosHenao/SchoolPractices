
import javax.swing.JOptionPane;
import java.util.Random;

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
            int menuOtp = menu();
            filter(menuOtp);
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
                int socialMedia = Integer.parseInt(JOptionPane.showInputDialog(null,"1.TWITTER\n2.WHATSAPP\n3.FACEBOOK"));
                switch (socialMedia){
                    case 1:
                        JOptionPane.showMessageDialog(null,"Es la plataforma de comunicación en tiempo real, más importante actualmente. El uso de hashtags facilita el alcance orgánico en esta plataforma. Información sintetizada en 280 caracteres. No es tan eficaz en términos publicitarios como las otras plataformas");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Una plataforma que cuenta con un gran número de visualizaciones/impresiones diarias. Tiene una mayor cercanía con el usuario, al usar su número telefónico como requisito para crear una cuenta en la aplicación. Se está implementando la herramienta WhatsApp Business, que permite revisar estadísticas o automatizar ciertos procesos con clientes.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Gran variedad de contenidos y formatos, con una herramienta muy potente de segmentación y analítica. Presente muy buenos ratios de conversión y leads. Sin embargo, el alcance orgánico se está reduciendo con el nuevo algoritmo e impide crecer de manera natural a las empresas, obligando a invertir en su plataforma de publicidad (Facebook Ads).");
                }
                break;
            case 7:
                while(true){
                    float n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite un numero, si es 0 finaliza el bucle"));
                    if (n3==0) break;
                    JOptionPane.showMessageDialog(null, "Si da 0 es par, si no es impar \n El numero es: "+(n3%2));
                }
                break;
            case 8:
                int maxEmployed = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de empleados"));
                int[] nEmployes = new int[maxEmployed];
                int minProfit = 0, maxProfit = 0, totalProfit = 0;
                String data2 = "";
                Random generadorAleatorios = new Random();
                for (int i = 0; i < nEmployes.length; i++) {
                    nEmployes[i] = 700000+generadorAleatorios.nextInt(1500000);;
                    data2 += (i+1)+") Sueldo: "+ nEmployes[i]+"\n";
                    totalProfit += nEmployes[i];
                    if (nEmployes[i]>700000 && nEmployes[i]<999999) minProfit++;
                    else maxProfit++;
                }
                JOptionPane.showMessageDialog(null, "LISTA DE EMPLEADOS\n\n"+data2);
                JOptionPane.showMessageDialog(null, "TOTAL DE EMPLEADOS: "+nEmployes.length+"\nEMPLEADOS CON SUELDO MINIMO: "+minProfit+"\nEMPLEADOS CON SUELDO MAXIMO: "+maxProfit+"TOTAL DE SUELDO: "+totalProfit+"\n");
                break;
            case 9:
                float[] nums = new float[8];
                float sumTotal = 0;
                float mulTotal = 0;
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el #"+(i+1)+": "));
                    sumTotal += nums[i];
                    mulTotal += nums[i];
                }
                JOptionPane.showMessageDialog(null, "La suma total fue: "+sumTotal+"\nLa multiplicacion total fue: "+mulTotal);
                break;
            case 10:
                float numMax = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el numero maximo"));
                float acum = 0;
                for (int i = 0; i < numMax; i+=3) {
                    acum += i;
                    JOptionPane.showMessageDialog(null, "El ciclo es el #"+i+" y el total sumado es: "+ acum);
                }
                break;
            case 11:
                int menuSelect2 = 0;
                switch (menuSelect2){
                    case 1:
                        JOptionPane.showMessageDialog(null, "                    nEmployes[i] = 700000+generadorAleatorios.nextInt(1500000);;\n" +
"                    data2 += (i+1)+\") Sueldo: \"+ nEmployes[i]+\"\\n\";\n" +
"                    totalProfit += nEmployes[i];\n" +
"                    if (nEmployes[i]>700000 && nEmployes[i]<999999) minProfit++;\n" +
"                    else maxProfit++;");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "\"                    if (nEmployes[i]>700000 && nEmployes[i]<999999) minProfit++;\\n\" +\n" +
"\"                    else maxProfit++;");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "                for (int i = 0; i < nEmployes.length; i++) {\n" +
"                    nEmployes[i] = 700000+generadorAleatorios.nextInt(1500000);;\n" +
"                    data2 += (i+1)+\") Sueldo: \"+ nEmployes[i]+\"\\n\";\n" +
"                    totalProfit += nEmployes[i];\n" +
"                    if (nEmployes[i]>700000 && nEmployes[i]<999999) minProfit++;\n" +
"                    else maxProfit++;\n" +
"                }");
                }
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
