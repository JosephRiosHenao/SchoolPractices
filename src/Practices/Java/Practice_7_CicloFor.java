package Practices.Java;

import javax.swing.JOptionPane;
import ConditionalActivity.ProgramaKernel;

public class Practice_7_CicloFor {

    static String Lista = "";

    public static void main(String[] args) {
        point5();    
    }

    public static void menu(){

    }

    public static void point1(){
        for (int i = 100; i > 0; i-=7) Lista+= i+"\n";
        JOptionPane.showMessageDialog(null,Lista);
    }
    public static void point2(){
        for (int i = 1; i < 10; i+=2) Lista+= i+"\n";
        JOptionPane.showMessageDialog(null,Lista);
    }
    public static void point3(){
        int numPos = 0, numNeg = 0, numZero = 0, num;
        for (int i = 1; i <= 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero, va por el "+i+"° numero"));
            if (num == 0) numZero++;
            else if (num > 0) numPos++;
            else numNeg++;
        }
        JOptionPane.showMessageDialog(null,"Cantidad de numeros positivos: "+numPos+"\nCantidad de numeros negativos: "+numNeg+"\nCantidad de ceros: "+numZero);
    }
    public static void point4(){
        long money = 0, sumMoney = 0, cont = 0;
        for (int i = 1; i <= 10; i++) {
            money = ProgramaKernel.PedirNumeroDinero("Digite el presupuesto del usuario "+i, 300, 300);
            sumMoney += money;
            if (money>1000000)  cont++;
        }
        JOptionPane.showMessageDialog(null,"El presupuesto final es: "+(ProgramaKernel.FormatearDinero(sumMoney))+"\nLos presupuestos mayores a 1M son: "+cont);
    }
    public static void point5(){
        int years, contYears = 0, contHeight = 0, sumYears = 0;
        float height, sumHeight = 0.0f;
        for (int i = 1; i <= 5; i++) {
            years = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la edad del "+i+"° estudiante"));
            sumYears += years;
            if (years>18) contYears++;
            height = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la altura del "+i+"° estudiante"));
            sumHeight += height;
            if (height>1.75) contHeight++;
        }
        JOptionPane.showMessageDialog(null,"Edad media "+(sumYears/5)+"\nEstatura media "+(sumHeight/5)+"\nCantidad de alumnos mayores a 18: "+contYears+"\nCantidad de alumnos mas altos de 1.75: "+contHeight);
    }
    public static void point6(){
        String[] NombreMeses =  {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        for (String Mes : NombreMeses){
            JOptionPane.showMessageDialog(null,Mes);
        }
    }
}
