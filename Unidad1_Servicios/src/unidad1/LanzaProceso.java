package unidad1;

import java.util.Arrays;
import java.io.IOException;
import java.util.Map;

public class LanzaProceso {

  public static void main(String[] args) {
    if (args.length <= 0) {
      System.out.println("Debe indicarse comando a ejecutar.");
    }
    ProcessBuilder pb = new ProcessBuilder(args);
    pb.inheritIO();
    Map<String, String> entorno = pb.environment();
    try {
      Process p = pb.start();
      int codRet = p.waitFor(); 
      System.out.println("La ejecución de " + Arrays.toString(args)
              + " devuelve " + codRet
              + " " + (codRet == 0 ? "(ejecución correcta)" : "(Error)"));
    } catch (IOException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      System.err.println("Proceso interrumpido");    
    }
  }
}
