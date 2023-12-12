package model;

public class Conserje extends Trabajador {
    
    private double sueldo;
    
    public Conserje() {}
    
    public Conserje(int idTrabajador, String nombre, String apellido, int antiguedad, int ht) {
        super(idTrabajador, nombre, apellido, antiguedad, ht);
    }
    
    public double sueldo() {
        this.sueldo = this.getHorasTrabajadas() * 10;
        return this.sueldo;
    }
}
