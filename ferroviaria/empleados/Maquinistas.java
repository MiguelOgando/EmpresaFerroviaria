package prácticas.ferroviaria.empleados;

public class Maquinistas {
    public static int cantidad = 0;
    int cantidadMaquinistas;

    private String nombre;
    private String DNI;
    private int sueldo;
    private int rango;

    public Maquinistas(String nombre, String DNI, int sueldo, int rango) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.rango = rango;
        cantidadMaquinistas = Maquinistas.cantidad++;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Maquinistas{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", sueldo=" + sueldo +
                ", rango=" + rango +
                '}';
    }

    public void mostrarDato() {
        System.out.println(toString());
    }

    public String ImprimirNumero(){
        return Maquinistas.cantidad + " Maquinistas";
    }
}
