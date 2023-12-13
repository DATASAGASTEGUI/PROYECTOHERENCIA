package principal;

import java.util.List;
import leerdatos.ObtenerDatos;
import model.Conserje;
import model.Trabajador;

public class Principal1 {

    public static void main(String[] args) {
                List<Trabajador> trabajadores_al = ObtenerDatos.leerArchivoCsv();
        double maximo = -999999;
        String nombre = "", apellido = "", tipo = "";
        for (Trabajador t : trabajadores_al) {
             if(t.sueldo() > maximo) {
                 maximo = t.sueldo();
                 nombre = t.getNombre();
                 apellido = t.getApellido();
                 if(t instanceof Conserje) {
                     tipo = "Conserje";
                 }else {
                     tipo = "Funcionario";
                 }
             }
            
       }
        System.out.println("Nombre       : " + nombre);
        System.out.println("Nombre       : " + apellido);
        System.out.println("Nombre       : " + tipo);
        System.out.println("Sueldo Maximo: " + maximo);
    }
    
}