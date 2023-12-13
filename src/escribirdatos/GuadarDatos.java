package escribirdatos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuadarDatos {
    
    public void guadarArchivoCsv(String cadena) {
        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
              f = new File("data/informe.csv");
              fw = new FileWriter(f);
              bw = new BufferedWriter(fw);
              bw.write(cadena); //GRABAR UNA CADENA EN EL ARCHIVO
              bw.flush();
              System.out.println("GRABACION CORRECTA");
        }catch(IOException e) {
             System.out.println("ERROR ESCRITURA");
        }
    }
}
