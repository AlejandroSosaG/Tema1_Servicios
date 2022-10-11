package ejercicio5;

import java.io.File;
import java.io.IOException;

public class LanzaPregunta {
    public static void main(String[] args) {
        String[] fichero = {"java", "C:\\Users\\asosa\\Documents\\Unidad1_Servicios\\src\\ejercicio5\\PreguntaNombre.java"};
        ProcessBuilder pb = new ProcessBuilder(fichero);
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectInput(new File("C:\\Users\\asosa\\Documents\\Unidad1_Servicios\\src\\ejercicio5\\Nombre.txt"));
        try {
            Process p = pb.start();
            p.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

