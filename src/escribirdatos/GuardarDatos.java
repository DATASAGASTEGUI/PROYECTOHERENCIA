package escribirdatos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarDatos {

    public static void guadarArchivoCsv(String cadena) {
        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
            f = new File("data/informe.csv");
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(cadena + "\n"); //GRABAR UNA CADENA EN EL ARCHIVO
            bw.flush();
            System.out.println("GRABACION CORRECTA");
        } catch (IOException e) {
            System.out.println("ERROR ESCRITURA");
        }
    }

    public static void guadarArchivoCsvClasificar(String cadena, String archivo) {
        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
            f = new File("data/"+archivo);
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(cadena + "\n"); //GRABAR UNA CADENA EN EL ARCHIVO
            bw.flush();
            System.out.println("GRABACION CORRECTA");
        } catch (IOException e) {
            System.out.println("ERROR ESCRITURA");
        }
    }
}
