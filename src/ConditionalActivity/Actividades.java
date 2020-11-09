package ConditionalActivity;
import javax.swing.JOptionPane;

class Actividades{

    public void Metodo1Activity1(){
        int Numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero","´Pregunta",JOptionPane.QUESTION_MESSAGE));
        if ((Numero%2) == 0){
            JOptionPane.showMessageDialog(null, "Tu numero "+Numero+" es par","Resultado",JOptionPane.INFORMATION_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null, "Tu numero "+Numero+" es par","Resultado",JOptionPane.ERROR_MESSAGE);
    }

    public void Metodo1Activity2(){

        boolean Confirmacion = true;
        while (Confirmacion){
            int MenuPromedio = Integer.parseInt(JOptionPane.showInputDialog(null,"\n1. Notas de matemáticas y su promedio. \n2. Notas de informática y su promedio. \n3. El promedio final de las dos áreas. \n4. Salir"));
            if ((MenuPromedio==1)||(MenuPromedio==2)||(MenuPromedio==3)||(MenuPromedio==4)){
                Confirmacion = false;
                if (MenuPromedio==1){
                    
                }
            }else{
                JOptionPane.showMessageDialog(null,"---Digite una opcion valida---","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}