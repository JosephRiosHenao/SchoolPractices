package ConditionalActivity;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.JLabel;

public class ProgramaKernel {
    static Main.RenderImagesClass Render = new Main.RenderImagesClass();

    public void Metodo1Activity1() {
        int Numero = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Digite un numero", "´Pregunta", JOptionPane.QUESTION_MESSAGE));
        if ((Numero % 2) == 0) {
            JOptionPane.showMessageDialog(null, "Tu numero " + Numero + " es par", "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        } else
            JOptionPane.showMessageDialog(null, "Tu numero " + Numero + " es par", "Resultado",
                    JOptionPane.ERROR_MESSAGE);
    }

    public void Metodo1Activity2() {
        float Promedio1Mate = PedirFloat("Matematicas", 1, 1, false);
        float Promedio2Mate = PedirFloat("Matematicas", 2, 1, false);
        float Promedio1Info = PedirFloat("Informatica", 1, 1, false);
        float Promedio2Info = PedirFloat("Informatica", 2, 1, false);
        boolean Confirmacion = true;
        while (Confirmacion) {
            int MenuPromedio = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "\n1. Notas de matemáticas y su promedio. \n2. Notas de informática y su promedio. \n3. El promedio final de las dos áreas. \n4. Re definir \n5. Salir"));
            if ((MenuPromedio == 1) || (MenuPromedio == 2) || (MenuPromedio == 3) || (MenuPromedio == 4)
                    || (MenuPromedio == 5)) {
                if (MenuPromedio == 1) {
                    float Resultado = ((Promedio1Mate + Promedio2Mate) / 2);
                    JOptionPane
                            .showMessageDialog(null,
                                    "Sus notas en matematicas son: \n1." + Promedio1Mate + "\n2." + Promedio2Mate
                                            + "\nEl promedio seria " + Resultado,
                                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuPromedio == 2) {
                    float Resultado = ((Promedio1Info + Promedio2Info) / 2);
                    JOptionPane
                            .showMessageDialog(null,
                                    "Sus notas en informatica son: \n1." + Promedio1Info + "\n2." + Promedio2Info
                                            + "\nEl promedio seria " + Resultado,
                                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuPromedio == 3) {
                    float Resultado = ((Promedio1Info + Promedio2Info + Promedio1Mate + Promedio2Mate) / 4);
                    JOptionPane.showMessageDialog(null,
                            "Sus notas en informatica son: \n1." + Promedio1Info + "\n2." + Promedio2Info
                                    + "\nSus notas en matematicas son: \n1." + Promedio1Mate + "\n2." + Promedio2Mate
                                    + "\nEl promedio seria " + Resultado,
                            "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuPromedio == 4) {
                    Promedio1Mate = PedirFloat("Matematicas", 1, 1, false);
                    Promedio2Mate = PedirFloat("Matematicas", 2, 1, false);
                    Promedio1Info = PedirFloat("Informatica", 1, 1, false);
                    Promedio2Info = PedirFloat("Informatica", 2, 1, false);
                } else {
                    JOptionPane.showMessageDialog(null, "Adios!! :3");
                    System.exit(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "---Digite una opcion valida---", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void Metodo1Activity3(){
        Icon CelularBase = Render.icono("/resources/IMG/CelularBase.png",50,60);

        int Seleccion, SeleccionCaracteristica;
        Object[] Celulares = {"Samsung Galaxy","Huawei P9","IPhone 7","Salir"};
        Object[] DetallesOptions = {"1° Caracteristica","2° Caracteristica","Volver"};
        boolean Ciclo = true;
        while (Ciclo){
            Seleccion = JOptionPane.showOptionDialog(null,"Seleccione el celular a visualizar","Seleccion de Modelo",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,CelularBase,Celulares,3);
            switch (Seleccion){
                case 0://samsung galaxy
                    SeleccionCaracteristica = JOptionPane.showOptionDialog(null,"Qué desea vizualizar?","Seleccion",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/Samsung.png",50,60),DetallesOptions,2);
                    switch (SeleccionCaracteristica){
                        case 0:
                            JOptionPane.showMessageDialog(null,"7 Caracteristicas del modelo Galaxy s20 (1)\n\n"
                            +"\t-Conectividad 5G\n"
                            +"\t-Resistente al agua (IP68)\n"
                            +"\t-Lector de huellas embebido en pantalla\n"
                            +"\t-Carga inalámbrica (15W)\n"
                            +"\t-Carga rápida (25W)\n"
                            +"\t-Parlantes stereo\n"
                            +"\t-Estabilización óptica de imagen","7 Caracteristicas (1)",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/Samsung.png",50,60));
                        break;
                        case 1:
                            JOptionPane.showMessageDialog(null,"7 Caracteristicas del modelo Galaxy s20 (2)\n\n"
                            +"\t-Zoom óptico 3X\n"
                            +"\t-Cámara triple de alta resolución (12MP+64MP+12MP)\n"
                            +"\t-Amplia memoria RAM (8/12GB)\n"
                            +"\t-Refresco 120Hz\n"
                            +"\t-Pantalla Gorilla Glass 6\n"
                            +"\t-Pantalla AMOLED\n"
                            +"\t-Excelente densidad de pixels (563ppi)\n","7 Caracteristicas (2)", JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/Samsung.png",50,60));
                        break;
                        default:
                        break;
                    }
                break;
                case 1://huawei p9
                    SeleccionCaracteristica = JOptionPane.showOptionDialog(null,"Qué desea vizualizar?","Seleccion",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/Huawei.png",50,60),DetallesOptions,2);
                    switch (SeleccionCaracteristica){
                        case 0:
                            JOptionPane.showMessageDialog(null,"6 Caracteristicas del modelo Huawei P9 (1)\n\n"
                            +"\t-Pantalla IPS de 5,2 pulgadas con resolución Full HD\n"
                            +"\t-Medidas de 145 x 70,9 x 6,95 milímetros\n"
                            +"\t-Lector de huellas dactilares\n"
                            +"\t-Procesador Kirin 955 de ocho núcleos\n"
                            +"\t-3/4 GB de RAM\n"
                            +"\t-32 GB de memoria interna (en Europa), 64 GB en otras partes del mundo\n","6 Caracteristicas (1)",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/Huawei.png",50,60));
                        break;
                        case 1:
                            JOptionPane.showMessageDialog(null,"6 Caracteristicas del modelo Huawei P9 (2)\n\n"
                            +"\t-Android 6.0 Marshmallow con EMUI 4.1\n"
                            +"\t-Doble-cámara principal de 12 megapíxeles\n"
                            +"\t-Cámara frontal de ocho megapíxeles\n"
                            +"\t-Batería de 3.000 mAh de capacidad\n"
                            +"\t-Puerto USB Tipo-C\n"
                            +"\t-Disponible en seis acabados: gris, plata (en dos variantes), dorado (en dos variantes) y rosa\n","6 Caracteristicas (1)",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/Huawei.png",50,60));
                        break;
                        default:
                        break;
                    }
                break;
                case 2://iphone 7
                    SeleccionCaracteristica = JOptionPane.showOptionDialog(null,"Qué desea vizualizar?","Seleccion",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/IPhone.png",50,60),DetallesOptions,2);
                    switch (SeleccionCaracteristica){
                        case 0:
                            JOptionPane.showMessageDialog(null,"3 Caracteristicas del modelo IPhone 7\n\n"
                            +"\t-Estabilización óptica de imagen\n"
                            +"\t-Cámara de alta resolución (12MP)\n"
                            +"\t-Delgado (7.1mm)\n","3 Caracteristicas (1)",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/IPhone.png",50,60));
                        break;
                        case 1:
                            JOptionPane.showMessageDialog(null,"2 Caracteristicas del modelo IPhone 7\n\n"
                            +"\t-Resistente al agua (IP67)\n"
                            +"\t-Buena densidad de pixels (326ppi)\n","2 Caracteristicas (2)",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/IPhone.png",50,60));
                        break;
                        default:
                        break;
                    }
                break;
                default://volver a seleccionar
                    Ciclo = false;
                break;
            }
        }
    }

    public void Metodo1Activity4() {
        float Num;
        boolean Confirmacion = true;
        while (Confirmacion) {
            Num = Float.parseFloat(
                    JOptionPane.showInputDialog(null, "Digite un numero", "Pregunta", JOptionPane.QUESTION_MESSAGE));
            if (Num >= 0) {
                JOptionPane.showMessageDialog(null, "Su numero es positivo", "Respuesta",
                        JOptionPane.INFORMATION_MESSAGE);
                Confirmacion = false;
            } else if (Num <= -1) {
                JOptionPane.showMessageDialog(null, "Su numero es negativo", "Respuesta",
                        JOptionPane.INFORMATION_MESSAGE);
                Confirmacion = false;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Ocurrio un error en el programa\nVuelve a digitar un numero para evitar problemas", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void Metodo1Activity5y6(int Activity) {
        Float num1, num2, num3;
        switch (Activity) {
            case 1:
                num1 = PedirFloat("Ninguna", 1, 2, false);
                num2 = PedirFloat("Ninguna", 2, 2, false);
                num3 = PedirFloat("Ninguna", 3, 2, false);
                if ((num1 > num3) || (num2 > num3)) {
                    if (num1 > num2) {
                        if (num2 > num3) {
                            JOptionPane.showMessageDialog(null,
                                    "El orden seria\nMayor: " + num1 + "\nMedio: " + num2 + "\nMenor: " + num3);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "El orden seria\nMayor: " + num1 + "\nMedio: " + num3 + "\nMenor: " + num2);
                        }
                    } else {
                        if (num1 > num3) {
                            JOptionPane.showMessageDialog(null,
                                    "El orden seria\nMayor: " + num2 + "\nMedio: " + num1 + "\nMenor: " + num3);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "El orden seria\nMayor: " + num2 + "\nMedio: " + num3 + "\nMenor: " + num1);
                        }
                    }
                } else {
                    if (num2 > num1) {
                        JOptionPane.showMessageDialog(null,
                                "El orden seria\nMayor: " + num3 + "\nMedio: " + num2 + "\nMenor: " + num1);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "El orden seria\nMayor: " + num3 + "\nMedio: " + num1 + "\nMenor: " + num2);
                    }
                }
                break;
            case 2:
                num1 = PedirFloat("Ninguna", 1, 2, true);
                num2 = PedirFloat("Ninguna", 2, 2, true);
                num3 = PedirFloat("Ninguna", 3, 2, true);
                if ((num1 > num3) || (num2 > num3)) {
                    if (num1 > num2) {
                        if (num2 > num3) {
                            JOptionPane.showMessageDialog(null, "El orden seria\nMayor: " + num1.intValue()
                                    + "\nMedio: " + num2.intValue() + "\nMenor: " + num3.intValue());
                        } else {
                            JOptionPane.showMessageDialog(null, "El orden seria\nMayor: " + num1.intValue()
                                    + "\nMedio: " + num3.intValue() + "\nMenor: " + num2.intValue());
                        }
                    } else {
                        if (num1 > num3) {
                            JOptionPane.showMessageDialog(null, "El orden seria\nMayor: " + num2.intValue()
                                    + "\nMedio: " + num1.intValue() + "\nMenor: " + num3.intValue());
                        } else {
                            JOptionPane.showMessageDialog(null, "El orden seria\nMayor: " + num2.intValue()
                                    + "\nMedio: " + num3.intValue() + "\nMenor: " + num1.intValue());
                        }
                    }
                } else {
                    if (num2 > num1) {
                        JOptionPane.showMessageDialog(null, "El orden seria\nMayor: " + num3.intValue() + "\nMedio: "
                                + num2.intValue() + "\nMenor: " + num1.intValue());
                    } else {
                        JOptionPane.showMessageDialog(null, "El orden seria\nMayor: " + num3.intValue() + "\nMedio: "
                                + num1.intValue() + "\nMenor: " + num2.intValue());
                    }
                }
                break;
        }

    }

    public static void Metodo1Activity7() {
        boolean cicloSeleccion = true, cicloSeleccion2 = true;
        long Ingresos;
        String IngresosFormato;
        String Tabla1 = "Los pagos de los primeros 4 años: \n\n", Tabla2 = "Los ultimos pagos: \n\n";
        while (cicloSeleccion){
            Ingresos = PedirNumeroDinero("Digite sus ingresos mensuales", 100, 100);
            IngresosFormato = FormatearDinero(Ingresos);
            int Eleccion = JOptionPane.showConfirmDialog(null, "Sus ingresos mensuales son: " + IngresosFormato + "$ ??");
            switch (Eleccion){
                case 0:
                    cicloSeleccion = false;
                    if (Ingresos>=8000l){    
                        while (cicloSeleccion2){
                            Long IngresosCasa = PedirNumeroDinero("Digite el valor de la propiedad a comprar", 130, 130);
                            String IngresosCasaFormato = FormatearDinero(IngresosCasa);
                            int Eleccion2 = JOptionPane.showConfirmDialog(null, "El valor de la propiedad es: " + IngresosCasaFormato + "$ ??");
                            switch (Eleccion2){
                                case 0:
                                    cicloSeleccion2 = false;
                                    double Descuento = IngresosCasa * 0.3;
                                    String DescuentoFormateado = FormatearDinero((long)Descuento);
                                    Tabla1 += "El enganche es de "+DescuentoFormateado+"$ \n";
                                    long DescuentoFinal = (long) (IngresosCasa - Descuento);
                                    System.out.println(DescuentoFinal);
                                    String PagosMensuales = FormatearDinero(DescuentoFinal/84);
                                    System.out.println(PagosMensuales);
                                    String PagosAnuales = FormatearDinero(DescuentoFinal/7);
                                    System.out.println(PagosAnuales);
                                    for (int i = 1;i<=4;i++){
                                        Tabla1 += "\nAño "+i+": "+PagosAnuales+"$\n";
                                        //System.out.println(Tabla);
                                        for (int o = 1;o<=12;o+=4){
                                            Tabla1 += "\tMes"+(o)+": "+PagosMensuales+"$   Mes"+(o+1)+": "+PagosMensuales+"$   Mes"+(o+2)+": "+PagosMensuales+"$   Mes"+(o+3)+": "+PagosMensuales+"$\n";
                                        }
                                    }
                                    for (int i = 4;i<=7;i++){
                                        Tabla2 += "\nAño "+i+": "+PagosAnuales+"$\n";
                                        //System.out.println(Tabla);
                                        for (int o = 1;o<=12;o+=4){
                                            Tabla2 += "\tMes"+(o)+": "+PagosMensuales+"$   Mes"+(o+1)+": "+PagosMensuales+"$   Mes"+(o+2)+": "+PagosMensuales+"$   Mes"+(o+3)+": "+PagosMensuales+"$\n";
                                        }
                                    }
                                    Tabla2 =Tabla2+"\nPago total: "+DescuentoFinal+"\n";
                                    Tabla2 += "El enganche es de "+DescuentoFormateado+"$ \n";
                                    //System.out.println(Tabla1);
                                    //System.out.println(Tabla2);
                                    JOptionPane.showMessageDialog(null,Tabla1,"Pagos 1",JOptionPane.PLAIN_MESSAGE);
                                    JOptionPane.showMessageDialog(null,Tabla2,"Pagos 2",JOptionPane.PLAIN_MESSAGE);
                                break;
                                case 2:
                                    System.exit(0);
                                break;
                            }
                        }
                    }else{
                        while (cicloSeleccion2){
                            Long IngresosCasa = PedirNumeroDinero("Digite el valor de la propiedad a comprar", 130, 130);
                            String IngresosCasaFormato = FormatearDinero(IngresosCasa);
                            int Eleccion2 = JOptionPane.showConfirmDialog(null, "El valor de la propiedad es: " + IngresosCasaFormato + "$ ??");
                            switch (Eleccion2){
                                case 0:
                                    Tabla1 = "Los pagos de los primeros 5 años: \n\n";
                                    Tabla2 = "Los ultimos 5 años de pagos: \n\n";
                                    cicloSeleccion2 = false;
                                    double Descuento = IngresosCasa * 0.15;
                                    String DescuentoFormateado = FormatearDinero((long)Descuento);
                                    Tabla1 += "El enganche es de "+DescuentoFormateado+"$ \n";
                                    long DescuentoFinal = (long) (IngresosCasa - Descuento);
                                    System.out.println(DescuentoFinal);
                                    String PagosMensuales = FormatearDinero(DescuentoFinal/120);
                                    System.out.println(PagosMensuales);
                                    String PagosAnuales = FormatearDinero(DescuentoFinal/10);
                                    System.out.println(PagosAnuales);
                                    for (int i = 1;i<=5;i++){
                                        Tabla1 += "\nAño "+i+": "+PagosAnuales+"$\n";
                                        //System.out.println(Tabla);
                                        for (int o = 1;o<=12;o+=6){
                                            Tabla1 += "\tMes"+(o)+": "+PagosMensuales+"$   Mes"+(o+1)+": "+PagosMensuales+"$   Mes"+(o+2)+": "+PagosMensuales+"$   Mes"+(o+3)+": "+PagosMensuales+"$   Mes"+(o+4)+": "+PagosMensuales+"$   Mes"+(o+5)+": "+PagosMensuales+"$\n";
                                        }
                                    }
                                    for (int i = 1;i<=5;i++){
                                        Tabla2 += "\nAño "+i+": "+PagosAnuales+"$\n";
                                        //System.out.println(Tabla);
                                        for (int o = 1;o<=12;o+=6){
                                            Tabla2 += "\tMes"+(o)+": "+PagosMensuales+"$   Mes"+(o+1)+": "+PagosMensuales+"$   Mes"+(o+2)+": "+PagosMensuales+"$   Mes"+(o+3)+": "+PagosMensuales+"$   Mes"+(o+4)+": "+PagosMensuales+"$   Mes"+(o+5)+": "+PagosMensuales+"$\n";
                                        }
                                    }
                                    Tabla2 =Tabla2+"\nPago total: "+DescuentoFinal+"\n";
                                    Tabla2 += "El enganche es de "+DescuentoFormateado+"$ \n";
                                    //System.out.println(Tabla1);
                                    //System.out.println(Tabla2);
                                    JOptionPane.showMessageDialog(null,Tabla1,"Pagos 1",JOptionPane.PLAIN_MESSAGE);
                                    JOptionPane.showMessageDialog(null,Tabla2,"Pagos 2",JOptionPane.PLAIN_MESSAGE);
                                break;
                                case 2:
                                    System.exit(0);
                                break;
                            }
                        }
                    }
                break;
                case 2:
                    System.exit(0);
                break;
            }
        }
    }

    public static void Metodo1Activity8(){
        Icon IconoHombre = Render.icono("/resources/IMG/Hombre.png",50,50);
        Icon IconoMujer = Render.icono("/resources/IMG/Mujer.png",50,50);
        Icon IconoGenero = Render.icono("/resources/IMG/Genero.png",50,50);
        Icon IconoCorazonPulsaciones = Render.icono("/resources/IMG/CorazonPulsaciones.png",50,50);

        Object[] GeneroOptions = {"Hombre","Mujer"};
        Color ColorSeleccionado;

        int Edad;
        float ResultadoPulsaciones;
        int Genero = JOptionPane.showOptionDialog(null, "Seleccione su genero", "Seleccion de genero",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, IconoGenero, GeneroOptions, 0);
        switch (Genero){
            case 0: //HOMBRE
                ColorSeleccionado = new Color(113, 208, 252);
                UIManager.put("OptionPane.background", ColorSeleccionado);
                UIManager.put("Panel.background", ColorSeleccionado);
                Edad = Integer.parseInt(JOptionPane.showInputDialog(null,new JLabel("Digite su edad",IconoHombre,JLabel.CENTER),"Edad",JOptionPane.PLAIN_MESSAGE));
                ResultadoPulsaciones = (210 - Edad);
                ResultadoPulsaciones = ResultadoPulsaciones/10;
                JOptionPane.showMessageDialog(null,"Sus pulsaciones cada 10 segundos son: "+ResultadoPulsaciones,"Pulsaciones",JOptionPane.PLAIN_MESSAGE,IconoCorazonPulsaciones);
            break;
            case 1: //MUJER
                ColorSeleccionado = new Color(252, 113, 203);
                UIManager.put("OptionPane.background", ColorSeleccionado);
                UIManager.put("Panel.background", ColorSeleccionado);
                Edad = Integer.parseInt(JOptionPane.showInputDialog(null,new JLabel("Digite su edad",IconoMujer,JLabel.CENTER),"Edad",JOptionPane.PLAIN_MESSAGE));
                ResultadoPulsaciones = (220 - Edad);
                ResultadoPulsaciones = ResultadoPulsaciones/10;
                JOptionPane.showMessageDialog(null,"Sus pulsaciones cada 10 segundos son: "+ResultadoPulsaciones,"Pulsaciones",JOptionPane.PLAIN_MESSAGE,IconoCorazonPulsaciones);
            break;
        }
        UIManager.put("OptionPane.background", null);
        UIManager.put("Panel.background", null);
    }

    public static float PedirFloat(String Materia, int Indice, int Program, boolean Entero) {
        float NumeroFinal = 0;
        boolean Confirmacion = true;
        while (Confirmacion) {
            if (Program == 1) {
                NumeroFinal = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite su promedio " + Indice + " de la materia " + Materia));
                if (NumeroFinal >= 0 && NumeroFinal <= 10) {
                    Confirmacion = false;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "---Digite una opcion valida---\nDebe ser mayor a 0 y menor a 10", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            if (Program == 2 && Entero == true) {
                NumeroFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el " + Indice + "° numero"));
                Confirmacion = false;
            } else if (Program == 2 && Entero == false) {
                NumeroFinal = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el " + Indice + "° numero"));
                Confirmacion = false;
            }
        }
        return NumeroFinal;
    }

    public static String FormatearDinero(long Dinero) {
        // MyIcon icon = new MyIcon();
        String NumeroFinalString = "";
        NumberFormat formatoNumero = NumberFormat.getNumberInstance(new Locale("es", "COL"));
        NumeroFinalString = (formatoNumero.format(Dinero).toString());
        /*
         * JOptionPane.showMessageDialog(null,
         * "\nNo ingrese puntos\nEl programa lo interpretara solo", "Instrucciones",
         * JOptionPane.DEFAULT_OPTION, iconorRender);
         */
        // JOptionPane.showMessageDialog(null,Mensaje+"\nNo ingrese puntos\nEl programa
        // lo interpretara solo","Pregunta",JOptionPane.PLAIN_MESSAGE,IconDinero);
        return NumeroFinalString;
    }

    public static Long PedirNumeroDinero(String Mensaje, int x, int y) {

        Color ColorSeleccionado = new Color(252, 194, 027);
        UIManager.put("OptionPane.background", ColorSeleccionado);
        UIManager.put("Panel.background", ColorSeleccionado);
        Icon iconorRender = Render.icono("/resources/IMG/Dinero.png", x, y);

        long Dinero = Long.parseLong(
            JOptionPane.showInputDialog(null, new JLabel(
                "<html><td>--------------Dinero--------------</td>"
                +"<td>El formato es en pesos colombianos</td>"
                +"<td>No digite puntos ni espacios</td>"
                +"<td>----------------------------------</td>"
                +"<td>"+Mensaje+"</td></html>",
                iconorRender,JLabel.CENTER),"Pregunta",JOptionPane.DEFAULT_OPTION));
                
        UIManager.put("OptionPane.background", null);
        UIManager.put("Panel.background", null);
        return Dinero;
    }
}