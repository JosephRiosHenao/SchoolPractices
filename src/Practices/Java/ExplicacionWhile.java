package ParqueSoft.Algoritmos;

import javax.swing.JOptionPane;

public class ExplicacionWhile{
    public static void main (String[] args){
        float[] Promedios = new float[3];
        int Opcion, Opcion2;
        boolean Ciclo = true;
        while (Ciclo){
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
            "1) Promedio 1\n"
            +"2) Promedio 2\n"
            +"3) Salir\n"
            ));
            if (Opcion>=1 && Opcion<=3){
                float SumaCompleta, Resultado;
                SumaCompleta = 0;
                switch (Opcion){
                    case 1:
                        boolean Ciclo1 = true;
                        while (Ciclo1){
                            Opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1) Seguir\n"
                            +"2) Volver\n"
                            ));
                            switch (Opcion2){
                                case 1:
                                    for (int i = 0; i < 3; i++){
                                        Promedios[i] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la nota "+i));
                                        SumaCompleta += Promedios[i];
                                    }
                                    Resultado = SumaCompleta/3;
                                    JOptionPane.showMessageDialog(null,"Su promedio es "+Resultado);
                                break;
                                case 2:
                                    Ciclo1 = false;
                                break;
                            }
                        }
                    break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Estas en la 2");
                    break;
                    case 3:
                        Ciclo = false;
                    break;
                }
            }else{
                JOptionPane.showMessageDialog(null,"Digite un dato valido","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}