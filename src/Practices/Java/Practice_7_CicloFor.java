package Practices.Java;

import javax.swing.JOptionPane;
import ConditionalActivity.ProgramaKernel;

public class Practice_7_CicloFor {

    static String Lista = "";

    public static void main(String[] args) {
        menu();    
    }

    public static void menu() {
        int options = 0;
        while (true) {
            Lista = "";
            options = Integer.parseInt(JOptionPane.showInputDialog(null,"MENU\n\n1.Punto1 (Numeros de 100 a 0 de 7 en 7)\n2.Punto2 (10 primeros numeros impares)\n3.Punto3 (Cantidad de negativos, positivos y ceros)\n4.Punto4 (Pedir sueldos y calcular)\n5.Punto5 (Media de edades y estura de un curso)\n6.Punto6 (Meses con for each)\n7.Salir\n\n"));
            switch (options) {
                case 1:
                    point1();
                    break;
                case 2:
                    point2();
                    break;
                case 3:
                    point3();
                    break;
                case 4:
                    point4();
                    break;
                case 5:
                    point5();
                    break;
                case 6:
                    point6();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "\n\nDigite una opcion valida\n\n");
                    break;
            }
        }
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
        int numPos = 0, numNeg = 0, numZero = 0, num, numPosCant = 0, numNegCant = 0;
        for (int i = 1; i <= 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero, va por el "+i+"° numero"));
            if (num == 0) numZero++;
            else if (num > 0){
                numPos++;
                numPosCant += num;
            }else{
                numNeg++;
                numNegCant += num;
            }
        }
        JOptionPane.showMessageDialog(null,"Cantidad de numeros positivos: "+numPos+"\nCantidad de numeros negativos: "+numNeg+"\nCantidad de ceros: "+numZero+"\nPromedio Negativo: "+(numNegCant/numNeg)+"\nPromedio Positivo: ");
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
