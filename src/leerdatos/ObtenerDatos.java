package leerdatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Trabajador;

public class ObtenerDatos {
    
    //DEVUELVE UNA COLECCION DE OBJETOS DE TIPO TRABAJADOR
    public static void leerArchivoCsv() {
        List<Trabajador> trabajadores_al = new ArrayList<>();
        
        File f;
        FileReader fr;
        BufferedReader br;
        
        String fila = "";//Guarda cada fila leida del archivo
        
        try {
               f = new File("data/Trabajador.csv");
               fr = new FileReader(f);
               br = new BufferedReader(fr);
               
               while((fila = br.readLine()) != null) {
                   System.out.println(fila);
               }
            
        }catch(IOException e) {
            System.out.println("ERROR DE LECTURA");
        } 
 
    }
    
}
