package Practices.Java;
import java.util.Scanner;

public class Matrix{
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        String Columnas= "   ";  
        String Filas = "";
        System.out.println("Digite el tamaño");
        int Cantidad = Entrada.nextInt();
        System.out.println("Digite el tamaño de la segunda dimension");
        int Cantidad2 = Entrada.nextInt();
        System.out.println("Digite solo numeros enteros");

        int[][] Numeros = new int[Cantidad][Cantidad2];
        for (int i = 0; i < Cantidad2; i++){
            Filas += (i)+") ";
            for (int j = 0; j < Cantidad; j++){
                System.out.println("Digite el "+(j+1)+"° entero de la dimension "+(i+1));
                Numeros[j][i] = Entrada.nextInt();
                Filas += Numeros[j][i]+"\t";
            }
            if (i < Cantidad2){
                Columnas += +(i)+")\t";
            }
            Filas += "\n";
        }
        System.out.println(Columnas);
        System.out.println(Filas);
        /*for (int i = 0; i < Cantidad; i++){
            for (int j = 0; j < Cantidad2; j++){
                System.out.println("el "+(j+1)+"° entero de la dimension "+(i+1)+" es: "+Numeros[i][j]+"");
            }
        }*/
    }
}

