package ConditionalActivity;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;
import java.nio.LongBuffer;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.JLabel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import ParqueSoft.Algoritmos.Menu;

import javax.swing.JFrame;

public class ProgramaKernel {
    static Main.RenderImagesClass Render = new Main.RenderImagesClass();

    public static void Metodo1Activity1() {
        boolean Confirmacion = true;
        while (Confirmacion){
            float Numero = Float.parseFloat(
                JOptionPane.showInputDialog(null, "Digite un numero\n(Rango max de -1000 a 1000 y sin puntos)", "´Pregunta", JOptionPane.QUESTION_MESSAGE));
                if (Numero>=-1000&&Numero<=1000 ){
                    Confirmacion = false;
                    if ((Numero % 2) == 0) {
                        JOptionPane.showMessageDialog(null, "Tu numero " + Numero + " es par", "Resultado",
                            JOptionPane.INFORMATION_MESSAGE);
                    } else
                        JOptionPane.showMessageDialog(null, "Tu numero " + Numero + " es impar", "Resultado",
                            JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"Digite un dato valido","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        }
    }

    public static void Metodo1Activity2() {
        float Promedio1Mate = PedirFloat("Matematicas", 1, 1, false);
        float Promedio2Mate = PedirFloat("Matematicas", 2, 1, false);
        float Promedio1Info = PedirFloat("Informatica", 1, 1, false);
        float Promedio2Info = PedirFloat("Informatica", 2, 1, false);
        boolean Confirmacion = true;
        while (Confirmacion) {
            int MenuPromedio = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "\n1. Notas de matemáticas y su promedio. \n2. Notas de informática y su promedio. \n3. El promedio final de las dos áreas. \n4. Re definir \n5. Salir"));
            if (MenuPromedio>=1&&MenuPromedio<=5) {
                if (MenuPromedio == 1) {
                    float Resultado = ((Promedio1Mate + Promedio2Mate) / 2);
                    JOptionPane
                            .showMessageDialog(null,
                                    "Sus notas en matematicas son: \n1)" + Promedio1Mate + "\n2)" + Promedio2Mate
                                            + "\nEl promedio seria: " + Resultado,
                                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuPromedio == 2) {
                    float Resultado = ((Promedio1Info + Promedio2Info) / 2);
                    JOptionPane
                            .showMessageDialog(null,
                                    "Sus notas en informatica son: \n1)" + Promedio1Info + "\n2)" + Promedio2Info
                                            + "\nEl promedio seria: " + Resultado,
                                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuPromedio == 3) {
                    float Resultado = ((Promedio1Info + Promedio2Info + Promedio1Mate + Promedio2Mate) / 4);
                    JOptionPane.showMessageDialog(null,
                            "Sus notas en informatica son: \n1)" + Promedio1Info + "\n2)" + Promedio2Info
                                    + "\nSus notas en matematicas son: \n1)" + Promedio1Mate + "\n2)" + Promedio2Mate
                                    + "\nEl promedio seria: " + Resultado,
                            "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuPromedio == 4) {
                    Promedio1Mate = PedirFloat("Matematicas", 1, 1, false);
                    Promedio2Mate = PedirFloat("Matematicas", 2, 1, false);
                    Promedio1Info = PedirFloat("Informatica", 1, 1, false);
                    Promedio2Info = PedirFloat("Informatica", 2, 1, false);
                } else {
                    Confirmacion = false;
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

    public static void Metodo1Activity4() {
        float Num;
        boolean Confirmacion = true;
        while (Confirmacion) {
            Num = Float.parseFloat(
                    JOptionPane.showInputDialog(null, "Digite un numero\n(Numero max: -1000 a 1000 y sin puntos)\n\nDigite 0 para salir", "Pregunta", JOptionPane.QUESTION_MESSAGE));
            if (Num == 0){
                Confirmacion = false;
            } else if (Num > 0) {
                JOptionPane.showMessageDialog(null, "Su numero es positivo", "Respuesta",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (Num < 0) {
                JOptionPane.showMessageDialog(null, "Su numero es negativo", "Respuesta",
                        JOptionPane.INFORMATION_MESSAGE);
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
            case 5:
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
            case 6:
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
            int Eleccion = JOptionPane.showConfirmDialog(null, "Sus ingresos mensuales son: $" + IngresosFormato + "?");
            switch (Eleccion){
                case 0:
                    cicloSeleccion = false;
                    if (Ingresos>=8000l){    
                        while (cicloSeleccion2){
                            Long IngresosCasa = PedirNumeroDinero("Digite el valor de la propiedad a comprar", 130, 130);
                            String IngresosCasaFormato = FormatearDinero(IngresosCasa);
                            int Eleccion2 = JOptionPane.showConfirmDialog(null, "El valor de la propiedad es: $" + IngresosCasaFormato + "?");
                            switch (Eleccion2){
                                case 0:
                                    cicloSeleccion2 = false;
                                    double Descuento = IngresosCasa * 0.3;
                                    String DescuentoFormateado = FormatearDinero((long)Descuento);
                                    Tabla1 += "El enganche es de $"+DescuentoFormateado+"\n";
                                    long DescuentoFinal = (long) (IngresosCasa - Descuento);
                                    String DescuentoFinalFormateado = FormatearDinero(DescuentoFinal);
                                    System.out.println(DescuentoFinal);
                                    String PagosMensuales = FormatearDinero(DescuentoFinal/84);
                                    System.out.println(PagosMensuales);
                                    String PagosAnuales = FormatearDinero(DescuentoFinal/7);
                                    System.out.println(PagosAnuales);
                                    for (int i = 1;i<=4;i++){
                                        Tabla1 += "\nAño "+i+": $"+PagosAnuales+"\n";
                                        //System.out.println(Tabla);
                                        for (int o = 1;o<=12;o+=4){
                                            Tabla1 += "\tMes"+(o)+": $"+PagosMensuales+"   Mes"+(o+1)+": $"+PagosMensuales+"   Mes"+(o+2)+": $"+PagosMensuales+"   Mes"+(o+3)+": $"+PagosMensuales+"\n";
                                        }
                                    }
                                    for (int i = 4;i<=7;i++){
                                        Tabla2 += "\nAño "+i+": $"+PagosAnuales+"\n";
                                        //System.out.println(Tabla);
                                        for (int o = 1;o<=12;o+=4){
                                            Tabla2 += "\tMes"+(o)+": $"+PagosMensuales+"   Mes"+(o+1)+": $"+PagosMensuales+"   Mes"+(o+2)+": $"+PagosMensuales+"   Mes"+(o+3)+": $"+PagosMensuales+"\n";
                                        }
                                    }
                                    Tabla2 =Tabla2+"\nPago total: $"+DescuentoFinalFormateado+"\n";
                                    Tabla2 += "El enganche es de $"+DescuentoFormateado+"\n";
                                    //System.out.println(Tabla1);
                                    //System.out.println(Tabla2);
                                    JOptionPane.showMessageDialog(null,Tabla1,"Pagos 1",JOptionPane.PLAIN_MESSAGE);
                                    JOptionPane.showMessageDialog(null,Tabla2,"Pagos 2",JOptionPane.PLAIN_MESSAGE);
                                break;
                                case 2:
                                    cicloSeleccion2 = false;
                                    cicloSeleccion = false;
                                break;
                            }
                        }
                    }else{
                        while (cicloSeleccion2){
                            Long IngresosCasa = PedirNumeroDinero("Digite el valor de la propiedad a comprar", 130, 130);
                            String IngresosCasaFormato = FormatearDinero(IngresosCasa);
                            int Eleccion2 = JOptionPane.showConfirmDialog(null, "El valor de la propiedad es: $" + IngresosCasaFormato + "?");
                            switch (Eleccion2){
                                case 0:
                                    Tabla1 = "Los pagos de los primeros 5 años: \n\n";
                                    Tabla2 = "Los ultimos 5 años de pagos: \n\n";
                                    cicloSeleccion2 = false;
                                    double Descuento = IngresosCasa * 0.15;
                                    String DescuentoFormateado = FormatearDinero((long)Descuento);
                                    Tabla1 += "El enganche es de $"+DescuentoFormateado+"\n";
                                    long DescuentoFinal = (long) (IngresosCasa - Descuento);
                                    String DescuentoFinalFormateado = FormatearDinero(DescuentoFinal);
                                    System.out.println(DescuentoFinal);
                                    String PagosMensuales = FormatearDinero(DescuentoFinal/120);
                                    System.out.println(PagosMensuales);
                                    String PagosAnuales = FormatearDinero(DescuentoFinal/10);
                                    System.out.println(PagosAnuales);
                                    for (int i = 1;i<=5;i++){
                                        Tabla1 += "\nAño "+i+": $"+PagosAnuales+"\n";
                                        //System.out.println(Tabla);
                                        for (int o = 1;o<=12;o+=6){
                                            Tabla1 += "\tMes"+(o)+": $"+PagosMensuales+"   Mes"+(o+1)+": $"+PagosMensuales+"   Mes"+(o+2)+": $"+PagosMensuales+"   Mes"+(o+3)+": $"+PagosMensuales+"   Mes"+(o+4)+": $"+PagosMensuales+"   Mes"+(o+5)+": $"+PagosMensuales+"\n";
                                        }
                                    }
                                    for (int i = 1;i<=5;i++){
                                        Tabla2 += "\nAño "+i+": $"+PagosAnuales+"\n";
                                        //System.out.println(Tabla);
                                        for (int o = 1;o<=12;o+=6){
                                            Tabla2 += "\tMes"+(o)+": $"+PagosMensuales+"   Mes"+(o+1)+": $"+PagosMensuales+"   Mes"+(o+2)+": $"+PagosMensuales+"   Mes"+(o+3)+": $"+PagosMensuales+"   Mes"+(o+4)+": $"+PagosMensuales+"   Mes"+(o+5)+": $"+PagosMensuales+"\n";
                                        }
                                    }
                                    Tabla2 =Tabla2+"\nPago total: $"+DescuentoFinalFormateado+"\n";
                                    Tabla2 += "El enganche es de $"+DescuentoFormateado+"\n";
                                    //System.out.println(Tabla1);
                                    //System.out.println(Tabla2);
                                    JOptionPane.showMessageDialog(null,Tabla1,"Pagos 1",JOptionPane.PLAIN_MESSAGE);
                                    JOptionPane.showMessageDialog(null,Tabla2,"Pagos 2",JOptionPane.PLAIN_MESSAGE);
                                break;
                                case 2:
                                    cicloSeleccion2 = false;
                                    cicloSeleccion = false;
                                break;
                            }
                        }
                    }
                break;
                case 2:
                    cicloSeleccion = false;
                break;
            }
        }
    }

    public static void Metodo1Activity8(){
        Icon IconoHombre = Render.icono("/resources/IMG/Hombre.png",50,50);
        Icon IconoMujer = Render.icono("/resources/IMG/Mujer.png",50,50);
        Icon IconoGenero = Render.icono("/resources/IMG/Genero.png",50,50);
        Icon IconoCorazonPulsaciones = Render.icono("/resources/IMG/CorazonPulsaciones.png",50,50);

        Object[] GeneroOptions = {"Hombre","Mujer","Volver"};
        Color ColorSeleccionado;

        int Edad;
        float ResultadoPulsaciones;
        boolean Confirmacion = true;
        
        while (Confirmacion){
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
            default:
                Confirmacion = false;
            break;
            }
        }
        UIManager.put("OptionPane.background", null);
        UIManager.put("Panel.background", null);
    }

    public static void Metodo1Activity9(){
        String iteradosString = "";
        String[] CantidadDeVotosFormateados;
        boolean CorrectoPorcentaje, CantidadCorrectaDeRepresentantes;
        int Porcentaje = 100, CantidadTotalDeVotos = 0, SeleccionFinal, NumeroDeNombres;
        int[] CantidadDeVotos;
        int Personalizacion = JOptionPane.showConfirmDialog(null,"Desea usar valores personalizados?","Pregunta",JOptionPane.YES_NO_OPTION);
        switch (Personalizacion){
            case 0://si
                CantidadCorrectaDeRepresentantes = true;
                while (CantidadCorrectaDeRepresentantes){
                    NumeroDeNombres = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de candidatos a representante"));
                    if (NumeroDeNombres>=2){
                        CantidadCorrectaDeRepresentantes = false;
                        String[] Nombres = new String[NumeroDeNombres];
                        CantidadDeVotosFormateados = new String[NumeroDeNombres];
                        CantidadDeVotos = new int[NumeroDeNombres];
                        for (int i = 0; i < NumeroDeNombres; i++) {
                            int o = i+1;
                            Nombres[i] = JOptionPane.showInputDialog(null, "Digite el nombre del "+(o)+"° candidato");
                        }
                        Object[] SeleccionAveriguar = { "Tengo Cantidad", "Tengo Porcentajes" };
                        int Averiguar = JOptionPane.showOptionDialog(null, "Seleccione lo que desea realizar", "Seleccionando Modo",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                                Render.icono("/resources/IMG/GraficaPastel.png", 100, 100), SeleccionAveriguar, 0);
                        switch (Averiguar){
                            case 0://digitar cantidad
                                CorrectoPorcentaje = true;
                                while (CorrectoPorcentaje){
                                    iteradosString = "";
                                    for (int i = 0;i < NumeroDeNombres; i++){
                                        CantidadDeVotos[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas personas votaron por "+Nombres[i]+"?\n No digite puntos"));
                                        CantidadTotalDeVotos += CantidadDeVotos[i];
                                        CantidadDeVotosFormateados[i] = FormatearDinero(CantidadDeVotos[i]);
                                        iteradosString += ("- "+Nombres[i]+" tiene "+CantidadDeVotosFormateados[i]+" votos\n");
                                    }
                                    iteradosString += "\nDesea continuar? o volver a asignar votos";
                                    SeleccionFinal = JOptionPane.showConfirmDialog(null, iteradosString,"Continuar?",JOptionPane.YES_NO_OPTION);
                                    switch (SeleccionFinal){
                                        case 0:
                                            CorrectoPorcentaje = false;
                                            GenerarStadisticaSegunCantidad(Nombres,NumeroDeNombres,CantidadDeVotos);
                                        break;
                                        case 1:
                                        break;
                                    }
                                }
                            break;
                            case 1://digitar porcentaje
                                CorrectoPorcentaje = true;
                                while (CorrectoPorcentaje){
                                    CantidadTotalDeVotos = 0;
                                    Porcentaje = 100;
                                    iteradosString = "";
                                    for (int i = 0;i < NumeroDeNombres; i++){
                                        CantidadDeVotos[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuanto porcentaje tiene "+Nombres[i]+"\nTodavia le queda ("+Porcentaje+"%)\nSolo se acepta enteros"));
                                        CantidadTotalDeVotos += CantidadDeVotos[i];
                                        Porcentaje -= CantidadDeVotos[i];
                                        iteradosString += "- "+Nombres[i] + " tiene un " + CantidadDeVotos[i] + "%\n";
                                    }
                                    iteradosString += "\nDesea continuar? o volver a asignar porcentajes";
                                    if (CantidadTotalDeVotos == 100 && Porcentaje == 0) {
                                        SeleccionFinal = JOptionPane.showConfirmDialog(null, iteradosString,"Continuar?",JOptionPane.YES_NO_OPTION);
                                        switch (SeleccionFinal){
                                            case 0:
                                                CorrectoPorcentaje = false;
                                                GenerarStadisticaSegunPorcentaje(Nombres,NumeroDeNombres,CantidadDeVotos);
                                            break;
                                            case 1:
                                                Porcentaje = 100;
                                            break;
                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(null,"Hubo un error en su porcentaje, digite uno valido");
                                        Porcentaje = 100;
                                    }
                                }
                            break;
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Los candidatos deben ser minimo 2","Advertencia",JOptionPane.WARNING_MESSAGE);
                    }
                }

            break;
            case 1://no
                GenerarStadisticaDefaulAct9();
            break;
        }
    }

    public static void Metodo1Activity10(){
        String Mensaje="";
        float[] numero = new float[2];
        for (int i = 0; i<2; i++){
            numero[i]=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el "+i+"° numero: "));
        }
        if (numero[0]==numero[1]){
            Mensaje = numero[0]+" x "+numero[1]+" = "+(numero[0]*numero[1]);
        }else if(numero[0]>numero[1]){
            Mensaje = numero[0]+" - "+numero[1]+" = "+(numero[0]-numero[1]);
        }else{
            Mensaje = numero[0]+" + "+numero[1]+" = "+(numero[0]+numero[1]);
        }
        JOptionPane.showMessageDialog(null, Mensaje);
    }

    public static void Metodo1Activity11(){
        int Tipo;
        float Descuento;
        boolean ConfirmacionTipo = true;
        while (ConfirmacionTipo) {
            Tipo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el tipo de cliente que sos"));
            if (Tipo >= 1 || Tipo <=3){
                ConfirmacionTipo = false;
                String DineroFormateado = "";
                long Dinero = PedirNumeroDinero("Digite el valor de su compra", 80, 80);
                if (Tipo==1){
                    Descuento = 0.1f;
                }else if (Tipo==2){
                    Descuento = 0.05f;
                }else{
                    Descuento = 0.03f;
                }
                float ResultadoARestar = Dinero * Descuento;
                long TotalAPagar = (long)(Dinero - ResultadoARestar);
                DineroFormateado = FormatearDinero(TotalAPagar);
                String DescuentoFormateado = FormatearDinero((long)ResultadoARestar);
                String CompraFormateada = FormatearDinero(Dinero);
                JOptionPane.showMessageDialog(null,""
                +"Tu compra es de: $"+CompraFormateada+"\n"
                +"Tu descuento es de: $"+DescuentoFormateado+"\n"
                +"Tienes que pagar: $"+DineroFormateado+"\n");
            }else{
                JOptionPane.showMessageDialog(null,
                "Ocurrio un error en el programa\nVuelve a digitar el numero\nAcuerdece que solo hay 3 tipos de usuarios", "Error",
                JOptionPane.ERROR_MESSAGE);            
            }
        }

    }

    public static void Metodo1Activity12(){
        int Menu;
        double[] Numero = new double[5];
        boolean ConfirmacionMenu = true;
        while (ConfirmacionMenu){
            Menu = Integer.parseInt(JOptionPane.showInputDialog("***MENÚ***\n"
            + "Seleccione una figura geométrica \n"
            + "1. Rectángulo\n"
            + "2. triángulo\n"
            + "3. Círculo\n"
            + "4. Cuadrado \n"
            + "5. Salir\n"));
            if (Menu>=1 || Menu<=5){
                switch (Menu){
                    case 1:
                        Numero[1]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado A del rectángulo "));
                        Numero[2]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado B del rectángulo "));
                        Numero[0]=Numero[1]*Numero[2];
                        JOptionPane.showMessageDialog(null,"El área de rectángulo es de : " + Numero[0]+"\n A = "+Numero[1]+"\n B = "+Numero[2],"Formula",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/AreaRectangulo.jpg",250,250));
                        JOptionPane.showMessageDialog(null,"La fórmula utilizada para hallar el área del rectángulo fue la siguiente\n" +"\n A = "+Numero[1]+"\n B = "+Numero[2]+"\n"
                                + "Area = a*b ","Formula",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/AreaRectangulo.jpg",250,250));
                    break;
                    case 2:
                        Numero[1]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la base del triángulo : "));
                        Numero[2]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Altura del triángulo : "));
                        Numero[0]=(Numero[1]*Numero[2])/2;
                        JOptionPane.showMessageDialog(null,"EL área del triángulo es de : " + Numero[0]+"\n B = "+Numero[1]+"\n H = "+Numero[2],"Formula",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/AreaTriangulo.png",250,250));
                        JOptionPane.showMessageDialog(null, "La formula que se utilizó para hallar el área del triángulo fue la siguiente \n"+"B = "+Numero[1]+"\n H = "+Numero[2]
                                + "Area = b*h / 2","Formula",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/AreaTriangulo.png",250,250));
                                
                    break;
                    case 3:
                        final double PI = 3.1415;
                        Numero[1]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del radio del círculo : "));
                        Numero[2]=Numero[1]*Numero[1];
                        Numero[0]=PI*Numero[2];
                        JOptionPane.showMessageDialog(null,"El área del círculo es de : "+ Numero[0]+"\n r = "+Numero[1]+"\n r2 = "+Numero[2],"Formula",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/AreaCirculo.jpg",250,250));
                        JOptionPane.showMessageDialog(null,"La formula que se utilizó para conocer el área del círculo fue la siguiente \n"+"r = "+Numero[1]+"\n r2 = "+Numero[2]
                                 + "Area = pi * (r)*(r)","Formula",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/AreaCirculo.jpg",250,250));
                    break;
                    case 4:
                        Numero[1]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de los lados del cuadrado "));
                        Numero[0]= Numero[1]*Numero[1];
                        JOptionPane.showMessageDialog(null,"El área del cuadrado es de : " +Numero[0]+"\nB = "+Numero[1]+"\nH = "+Numero[1],"Formula",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/AreaCuadrado.jpg",250,250));
                        JOptionPane.showMessageDialog(null, "La formula que se utiliza para conocer el área del cuadrado es la siguiente : \n"+"B = "+Numero[1]+"\nH = "+Numero[1]+"\n"
                                + "Área = a*a","Formula",JOptionPane.PLAIN_MESSAGE,Render.icono("/resources/IMG/AreaCuadrado.jpg",250,250));
                    break;
                    default:
                        ConfirmacionMenu = false;       
                    break;
                }
            }else{
                JOptionPane.showMessageDialog(null,
                "Ocurrio un error en el programa\nDigite un numero valido", "Error",
                JOptionPane.ERROR_MESSAGE);     
            }
        }
    }
        
    public static void GenerarStadisticaSegunPorcentaje(String[] Nombres, int Total, int[] Porcentajes){
        DefaultPieDataset dataset = new DefaultPieDataset();
        //double[] PorcentajesGrafica = new double[Total];

        for (int i = 0;i < Total; i++){
            //PorcentajesGrafica[i]=(Porcentajes[i]*Total)/100;
            //dataset.setValue(Nombres[i],PorcentajesGrafica[i]);
            dataset.setValue(Nombres[i],Porcentajes[i]);
        }

        JFreeChart chart = ChartFactory.createPieChart(// char t
        "Votacion de representante",// title                                                                     
        dataset, // data
        true, // include legend
        true, false);

        ChartPanel panel= new ChartPanel(chart);

        //Creamos la ventana
        JFrame ventana = new JFrame("Grafica");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.add(panel);
    }

    public static void GenerarStadisticaSegunCantidad(String[] Nombres, int Total, int[] Votos){
        DefaultPieDataset dataset = new DefaultPieDataset();
        double[] VotosGrafica = new double[Total];

        for (int i = 0;i < Total; i++){
            VotosGrafica[i]=(Votos[i]*100)/Total;
            dataset.setValue(Nombres[i],VotosGrafica[i]);
        }

        JFreeChart chart = ChartFactory.createPieChart(// char t
        "Votacion de representante",// title                                                                     
        dataset, // data
        true, // include legend
        true, false);

        ChartPanel panel= new ChartPanel(chart);

        //Creamos la ventana
        JFrame ventana = new JFrame("Grafica");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.add(panel);

    }

    public static void GenerarStadisticaDefaulAct9() {
        int TotalDeEstudiantes = 60;
        double Ana = (TotalDeEstudiantes*0.25);
        double Luz = (TotalDeEstudiantes*0.10);
        double Ruth = (TotalDeEstudiantes*0.05);
        double Vero = (TotalDeEstudiantes*0.60);
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Ana",Ana);
        dataset.setValue("Luz",Luz);
        dataset.setValue("Ruth",Ruth);
        dataset.setValue("Vero",Vero);
        
        JFreeChart chart = ChartFactory.createPieChart(// char t
                "Votacion de representante",// title                                                                     
                dataset, // data
                true, // include legend
                true, false);
        
        ChartPanel panel= new ChartPanel(chart);
        
        //Creamos la ventana
        JFrame ventana = new JFrame("Grafica");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ventana.add(panel);
    }

    public static float PedirFloat(String Materia, int Indice, int Program, boolean Entero) {
        float NumeroFinal = 0;
        boolean Confirmacion = true;
        while (Confirmacion) {
            if (Program == 1 && Entero == true) {
                NumeroFinal = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite su nota " + Indice + " de la materia " + Materia));
                if (NumeroFinal >= 0 && NumeroFinal <= 10) {
                    Confirmacion = false;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "---Digite una opcion valida---\nDebe ser mayor a 0 y menor a 10", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else if (Program == 1 && Entero == false){
                NumeroFinal = Float.parseFloat(JOptionPane.showInputDialog(null,
                        "Digite su nota " + Indice + " de la materia " + Materia));
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
//670