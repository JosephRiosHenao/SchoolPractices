package MainCode;

import java.io.*;

public class PuenteJavaToPy{
    public static String pedirStringPy() throws IOException, InterruptedException {
        String ArchivoPy = "Menu";
        String Resultado = "";
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("python -m" + ArchivoPy);
        pr.waitFor();
        return Resultado;
    }
}