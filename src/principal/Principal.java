package principal;

import java.util.List;
import leerdatos.ObtenerDatos;
import model.Conserje;
import model.Trabajador;

public class Principal {

    public static void main(String[] args) {
/*
        Conserje t1 = new Conserje();
        t1.setIdTrabajador(1);
        t1.setNombre("Luis");
        t1.setApellido("Ruiz");
        t1.setAntiguedad(15);
        t1.setHorasTrabajadas(150);

        Funcionario t2 = new Funcionario(2, "Carla", "Roncal", 20, 160);

        System.out.println(t1);
        System.out.println("Sueldo t1: " + t1.sueldo());
        System.out.println(t2);
        System.out.println("Sueldo t2: " + t2.sueldo());
*/
        List<Trabajador> trabajadores_al = ObtenerDatos.leerArchivoCsv();

        for (Trabajador t : trabajadores_al) {
            
            if (t instanceof Conserje) {
                System.out.println(t.getNombre() + " "
                        + t.getApellido() + " "
                        + t.sueldo());
            } else {
                System.out.println(t.getNombre() + " "
                        + t.getApellido() + " "
                        + t.sueldo());
                
            }
        }
    }

}
