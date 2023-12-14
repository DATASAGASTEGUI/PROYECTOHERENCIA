package principal;

import escribirdatos.GuardarDatos;
import java.util.List;
import leerdatos.ObtenerDatos;
import model.Conserje;
import model.Trabajador;

public class Principal2 {

    public static void main(String[] args) {
        List<Trabajador> trabajadores = ObtenerDatos.leerArchivoCsv();
        for (Trabajador t : trabajadores) {
            String cadena = t.getIdTrabajador() + ";"
                    + t.getNombre() + ";"
                    + t.getApellido() + ";"
                    + t.getAntiguedad() + ";"
                    + t.getHorasTrabajadas();
            if (t instanceof Conserje) {
                GuardarDatos.guadarArchivoCsvClasificar(cadena, "Conserje.csv");
            } else {
                GuardarDatos.guadarArchivoCsvClasificar(cadena, "Funcionario.csv");
            }
        }

    }

}
