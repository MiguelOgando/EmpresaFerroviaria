package prácticas.ferroviaria.empleados;

import java.util.Date;

public class Mecánicos {
    public static int cantidad = 0;
    int cantidadMecánicos;

    private String nombre;
    private int teléfono;
    private Especialidad especialidad;

    public Mecánicos(String nombre, int teléfono, Especialidad especialidad) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.especialidad = especialidad;
        cantidadMecánicos = Mecánicos.cantidad++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecánicos{" +
                "nombre='" + nombre + '\'' +
                ", teléfono=" + teléfono +
                ", especialidad=" + especialidad +
                '}';
    }

    public void mostrarDato() {
        System.out.println(toString());
    }
    public String ImprimirNumero(){
        return Mecánicos.cantidad + " Mecánicos";
    }
}
