package prácticas.ferroviaria.maquinaria;

import prácticas.ferroviaria.empleados.JefesDeEstación;

import java.util.Date;

public class Vagones {
    public static int cantidad = 0;
    int cantidadVagones;

    protected int identificación;
    protected int cargaMáxima;
    protected int cargaActual;
    protected Mercancía mercancía;

    public Vagones(int identificación, int cargaMáxima, int cargaActual, Mercancía mercancía) {
        this.identificación = identificación;
        this.cargaMáxima = cargaMáxima;
        this.cargaActual = cargaActual;
        this.mercancía = mercancía;
        cantidadVagones = Vagones.cantidad++;
    }

    public int getIdentificación() {
        return identificación;
    }

    public void setIdentificación(int identificación) {
        this.identificación = identificación;
    }

    public double getCargaMáxima() {
        return cargaMáxima;
    }

    public void setCargaMáxima(int cargaMáxima) {
        this.cargaMáxima = cargaMáxima;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public Mercancía getMercancía() {
        return mercancía;
    }

    public void setMercancía(Mercancía mercancía) {
        this.mercancía = mercancía;
    }

    @Override
    public String toString() {
        return "Vagones{" +
                "identificación=" + identificación +
                ", cargaMáxima=" + cargaMáxima +
                ", cargaActual=" + cargaActual +
                ", mercancía=" + mercancía +
                '}';
    }

    public void mostrarDato() {
        System.out.println(toString());
    }

    public String ImprimirNumero(){
        return Vagones.cantidad + " Vagones";
    }
}
