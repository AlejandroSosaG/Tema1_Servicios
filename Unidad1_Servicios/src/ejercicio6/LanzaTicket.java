package ejercicio6;

import java.io.File;
import java.io.IOException;

public class LanzaTicket {
    public static void main(String[] args) {
        String[] fichero = {"java", "C:\\Users\\asosa\\Documents\\Unidad1_Servicios\\src\\ejercicio6\\TicketCompra.java"};
        ProcessBuilder pb = new ProcessBuilder(fichero);
        pb.redirectInput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectOutput(ProcessBuilder.Redirect.appendTo(new File("C:\\Users\\asosa\\Documents\\Unidad1_Servicios\\src\\ejercicio6\\Ticket.txt")));
        try {
            Process p = pb.start();
            p.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
