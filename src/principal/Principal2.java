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
            if (t instanceof Conserje) {
                GuardarDatos.guadarArchivoCsvClasificar(t.cadenaCsv(), "Conserje.csv");
            } else {
                GuardarDatos.guadarArchivoCsvClasificar(t.cadenaCsv(), "Funcionario.csv");
            }
        }

    }

}
