package ConditionalActivity;
import javax.swing.JOptionPane;

class ProgramaKernel{

    public void Metodo1Activity1(){
        int Numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero","´Pregunta",JOptionPane.QUESTION_MESSAGE));
        if ((Numero%2) == 0){
            JOptionPane.showMessageDialog(null, "Tu numero "+Numero+" es par","Resultado",JOptionPane.INFORMATION_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null, "Tu numero "+Numero+" es par","Resultado",JOptionPane.ERROR_MESSAGE);
    }

    public void Metodo1Activity2(){
        float Promedio1Mate = PedirFloat("Matematicas", 1);
        float Promedio2Mate = PedirFloat("Matematicas", 2);
        float Promedio1Info = PedirFloat("Informatica", 1);
        float Promedio2Info = PedirFloat("Informatica", 2);
        boolean Confirmacion = true;
        while (Confirmacion){
            int MenuPromedio = Integer.parseInt(JOptionPane.showInputDialog(null,"\n1. Notas de matemáticas y su promedio. \n2. Notas de informática y su promedio. \n3. El promedio final de las dos áreas. \n4. Re definir \n5. Salir"));
            if ((MenuPromedio==1)||(MenuPromedio==2)||(MenuPromedio==3)||(MenuPromedio==4)){
                if (MenuPromedio==1){
                    float Resultado = ((Promedio1Mate+Promedio2Mate)/2);
                    JOptionPane.showMessageDialog(null, "Sus notas en matematicas son: \n1."+Promedio1Mate+"\n2."+Promedio2Mate+"\nEl promedio seria "+Resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
                }else if (MenuPromedio==2){
                    float Resultado = ((Promedio1Info+Promedio2Info)/2);
                    JOptionPane.showMessageDialog(null, "Sus notas en informatica son: \n1."+Promedio1Info+"\n2."+Promedio2Info+"\nEl promedio seria "+Resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
                }else if (MenuPromedio==3){
                    float Resultado = ((Promedio1Info+Promedio2Info+Promedio1Mate+Promedio2Mate)/4);
                    JOptionPane.showMessageDialog(null, "Sus notas en informatica son: \n1."+Promedio1Info+"\n2."+Promedio2Info+"\nSus notas en matematicas son: \n1."+Promedio1Mate+"\n2."+Promedio2Mate+"\nEl promedio seria "+Resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
                }else if (MenuPromedio==4){
                    Promedio1Mate = PedirFloat("Matematicas", 1);
                    Promedio2Mate = PedirFloat("Matematicas", 2);
                    Promedio1Info = PedirFloat("Informatica", 1);
                    Promedio2Info = PedirFloat("Informatica", 2);
                }else{
                    JOptionPane.showMessageDialog(null, "Adios!! :3");
                    System.exit(0);
                }
            }else{
                JOptionPane.showMessageDialog(null,"---Digite una opcion valida---","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public float PedirFloat(String Materia, int Indice){
        float NumeroFinal = 0;
        boolean Confirmacion = true;
        while (Confirmacion){
            NumeroFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su promedio "+Indice+" de la materia "+Materia));
            if (NumeroFinal>=0 && NumeroFinal<=10){
                Confirmacion = false;
            }else{
                JOptionPane.showMessageDialog(null,"---Digite una opcion valida---\nDebe ser mayor a 0 y menor a 10","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        return NumeroFinal;
    }
}