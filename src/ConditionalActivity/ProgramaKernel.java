package ConditionalActivity;

import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.Icon;

public class ProgramaKernel{
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

    public void Metodo1Activity7() {
        FormatearDinero(0, true, "Ingrese sus ingresos");
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
                NumeroFinal = Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Digite un el " + Indice + "° numero"));
                Confirmacion = false;
            } else if (Program == 2 && Entero == false) {
                NumeroFinal = Float
                        .parseFloat(JOptionPane.showInputDialog(null, "Digite un el " + Indice + "° numero"));
                Confirmacion = false;
            }
        }
        return NumeroFinal;
    }

    public static String FormatearDinero(long Dinero, boolean MensajePregunta, String Mensaje) {
        // MyIcon icon = new MyIcon();
        String NumeroFinalString = "";
        Mensaje = "";
        NumberFormat formatoNumero = NumberFormat.getNumberInstance(new Locale("es", "COL"));
        // System.out.println(formatoNumero.format(Dinero));

        Icon iconorRender = Render.icono("/resources/IMG/Dinero.png", 100, 100);
        if (MensajePregunta == false){
            NumeroFinalString = (formatoNumero.format(Dinero).toString()+"$");
        }else{
            JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Titulo", JOptionPane.DEFAULT_OPTION,iconorRender);
            //JOptionPane.showMessageDialog(null,Mensaje+"\nNo ingrese puntos\nEl programa lo interpretara solo","Pregunta",JOptionPane.PLAIN_MESSAGE,IconDinero);
            long DineroConMensaje = Long.parseLong(JOptionPane.showInputDialog(null, Mensaje,"Digite el dinero",JOptionPane.DEFAULT_OPTION));
            NumeroFinalString = (formatoNumero.format(DineroConMensaje).toString()+"$");
        }
        return NumeroFinalString;
    }
}