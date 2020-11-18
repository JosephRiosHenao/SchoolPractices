package ConditionalActivity;

import javax.swing.JOptionPane;

public class MenuActivity {
    public static void MenuActivityConditional(){
        boolean CicloMenu = true;
        while (CicloMenu){
            int Menu = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Menu actividad condicional\n\n"
            +"\t1- Punto 1\n"
            +"\t2- Punto 2\n"
            +"\t3- Punto 3\n"
            +"\t4- Punto 4\n"
            +"\t5- Punto 5\n"
            +"\t6- Punto 6\n"
            +"\t7- Punto 7\n"
            +"\t8- Punto 8\n"
            +"\t9- Punto 9\n"
            +"\t10- Salir\n"
            +"\nDigite la el indice al que desea entrar"));
            if (Menu>=1 && Menu <=10){
                switch (Menu){
                    case 1:
                        ProgramaKernel.Metodo1Activity1();
                    break;
                    case 2:
                        ProgramaKernel.Metodo1Activity2();
                    break;
                    case 3:
                        ProgramaKernel.Metodo1Activity3();
                    break;
                    case 4:
                        ProgramaKernel.Metodo1Activity4();
                    break;
                    case 5:
                        ProgramaKernel.Metodo1Activity5y6(5);
                    break;
                    case 6:
                        ProgramaKernel.Metodo1Activity5y6(6);
                    break;
                    case 7:
                        ProgramaKernel.Metodo1Activity7();
                    break;
                    case 8:
                        ProgramaKernel.Metodo1Activity8();
                    break;
                    case 9:
                        ProgramaKernel.Metodo1Activity9();
                    break;
                    case 10://salir
                        CicloMenu = false;
                    break;
                }
            }else{
                JOptionPane.showMessageDialog(null,"Digite un dato valido","Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            
        }
        JOptionPane.showMessageDialog(null,"Adios!! :3");
    }
}
