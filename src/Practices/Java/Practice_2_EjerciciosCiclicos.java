package Practices.Java;

import javax.swing.JOptionPane;
import ConditionalActivity.ProgramaKernel;

public class Practice_2_EjerciciosCiclicos {
    static MainCode.RenderImagesClass Render = new MainCode.RenderImagesClass();
    public static void main(String[] args) {
        menu();
    }
    public static void Punto1() {
        int i = 1;
        String Lista = "";
        while (i <= 20) {
            if (i % 2 == 0) {
                Lista += "Numero par: " + i + "\n";
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, ""+Lista);
    }
    public static void Punto2() {
        int Entrada;
        do {
            Entrada = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Digite un numero\nSi desea salir digite \"20\""));
            if (Entrada == 0)
                JOptionPane.showMessageDialog(null, Entrada + " es numero es neutro");
            else if (Entrada > 0)
                JOptionPane.showMessageDialog(null, Entrada + " es numero positivo");
            else
                JOptionPane.showMessageDialog(null, Entrada + " es numero negativo");
        } while (Entrada != 20);
    }
    public static void Punto3() {
        int Suma = 0, Input = 0, Producto = 1;
        while (Input != 999) {
            Input = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite '999' para salir\nDigite un numero: "));
            if (Input % 2 == 0)
                Suma += Input;
            if (Input % 5 == 0)
                Producto *= Input;
            JOptionPane.showMessageDialog(null, "Su suma es: " + Suma + "\nSu producto es: " + Producto);
        }
    }
    public static void Punto4(){
        String[] NombreMeses =  {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        long[] DineroMeses = new long[12];
        long DineroTotal = 0;
        String Mensaje = "MESES\n";
        for (int i = 0; i < 12; i++){
            DineroMeses[i] = ProgramaKernel.PedirNumeroDinero("Cuanto dinero ahorrastes el mes de "+NombreMeses[i], 50, 50);
            DineroTotal += DineroMeses[i];
            Mensaje += NombreMeses[i]+": "+DineroMeses[i]+"\n";
        }
        JOptionPane.showMessageDialog(null,Mensaje+"\n\nDinero ahorrado en todo el año: "+ProgramaKernel.FormatearDinero(DineroTotal));
    }
    public static void Punto5(){    
        String Color = "N/A";
        while(true){
            Color = JOptionPane.showInputDialog(null,"Color = "+Color+"\nDigite un color, sí digita 'BLUE' finaliza el programa");
            if (Color.equals("BLUE")) break;
        }
    }
    public static void Punto6(){
        String[] Options ={ "Bogota","Medellin","Cali"};
        int Seleccion;
        for (int i = 1; i <= 5;i++){
            Seleccion = JOptionPane.showOptionDialog(null,"PERSONA #"+i+"\n\nSelecciona tu ciudad favorita","Elige",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/Samsung.png",50,60),Options, 0);
            switch (Seleccion){
                case 0:
                    JOptionPane.showMessageDialog(null,"Vamos a comenzar hablando de Bogotá, capital de la República de Colombia y del departamento\nde Cundinamarca, además de ser el epicentro político, administrativo, económico, industrial,\nartístico, cultural, deportivo y, por supuesto, turístico del país. Se trata de una ciudad diversa y\nmulticultural en la que se combinan las construcciones modernas con las del pasado colonial.\nAdemás, es importante tener en cuenta que gracias a sus cerros y a sus parques, es una ciudad\nverde."
                    ,"BOGOTA",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/Bogota.jpg",500,250));
                break;
                case 1:
                    JOptionPane.showMessageDialog(null,"La segunda ciudad más poblada de Colombia es Medellín, capital del departamento de\nAntioquia. Situada en la cordillera central de los Andes, es un destino ideal para hacer\nsenderismo, tirolina y montar a caballo. Además, los turistas podrán disfrutar de unas\nvacaciones llenas de cultura."
                    ,"MEDELLIN",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/Medellin.jpg",500,250));
                break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Tras Medellín, la ciudad más poblada de Colombia es Cali, cuyo nombre oficial es Santiago de\nCali. Se trata de la capital del departamento del Valle del Cauca y está considerada como una de\nlas ciudades más antiguas de América. Por otro lado, debes saber que se trata de uno de los\nprincipales centros económicos e industriales del país."
                    ,"CALI",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/Cali.jpg",500,250));
                break;
            }
        }
    }
    public static void menu() {
        int options = 0;
        while (true){
            options = Integer.parseInt(JOptionPane.showInputDialog(null,"MENU\n\n1.Punto1 (Numero pares de 0 a 20)\n2.Punto2 (Detectar valor de numero)\n3.Punto3 (Sumar pares y multiplicar multiplos de 5)\n4.Punto4 (Dinero ahorrado en el año)\n5.Punto5 (Digitador de colores)\n6.Punto6 (Ciudades de Colombia)\n7.Punto7 (Ciclo hasta que digites 5)\n8.Punto8 (Tabla de multiplicasr)\n9.Punto9 (Multiplos de 8 hasta 200)\n10.Punto10 (Porcentaje de notas de 5 estudiantes)\n11.Salir\n\n"));
            switch (options){
                case 1:
                    Punto1();
                break;
                case 2:
                    Punto2();
                break;
                case 3:
                    Punto3();
                break;
                case 4:
                    Punto4();
                break;
                case 5:
                    Punto5();
                break;
                case 6:
                    Punto6();
                break;
                case 7:
                    Practice_3_EjerciciosIterativos.Punto7();
                break;
                case 8:
                    Practice_3_EjerciciosIterativos.Punto8();
                break;
                case 9:
                    Practice_3_EjerciciosIterativos.Punto9();
                break;
                case 10:
                    Practice_3_EjerciciosIterativos.Punto10();
                break;
                case 11:
                    System.exit(0);
                break;
                default:
                    JOptionPane.showMessageDialog(null,"\n\nDigite una opcion valida\n\n");
                break;
            }
        }
    }
}