package unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LanzaProcesoRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		String[] comando = ("java", "unidad1.LanzaProceso");
		try {
			Process p = r.exec(comando);
			InputStream is = p.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String linea = br.readLine();
			while(linea!=null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
