package prácticas.ferroviaria.empleados;

import java.util.Date;

public class JefesDeEstación {
    public static int cantidad = 0;
    int cantidadJefe;

    private String nombre;
    private String DNI;
    private String fechaNombramiento;

    public JefesDeEstación(String nombre, String DNI, String fechaNombramiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNombramiento = fechaNombramiento;
        cantidadJefe = JefesDeEstación.cantidad++;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(String fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    @Override
    public String toString() {
        return "JefesDeEstación{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", fechaNombramiento=" + fechaNombramiento +
                '}';
    }

    public void mostrarDato() {
        System.out.println(toString());
    }
    public String ImprimirNumero(){
        return JefesDeEstación.cantidad + " Jefe de Estación";
    }
}
