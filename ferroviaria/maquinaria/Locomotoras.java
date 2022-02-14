package prácticas.ferroviaria.maquinaria;

import prácticas.ferroviaria.empleados.JefesDeEstación;
import prácticas.ferroviaria.empleados.Mecánicos;

import java.util.Date;

public class Locomotoras {
    public static int cantidad = 0;
    int cantidadLocomotoras;

    protected String matrícula;
    protected double potenciaMotores;
    protected int añoFabricación;
    Mecánicos mecánicos;

    public Locomotoras(String matrícula, double potenciaMotores, int añoFabricación, Mecánicos mecánicos) {
        this.matrícula = matrícula;
        this.potenciaMotores = potenciaMotores;
        this.añoFabricación = añoFabricación;
        this.mecánicos = mecánicos;
        cantidadLocomotoras = Locomotoras.cantidad++;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public double getPotenciaMotores() {
        return potenciaMotores;
    }

    public void setPotenciaMotores(double potenciaMotores) {
        this.potenciaMotores = potenciaMotores;
    }

    public int getAñoFabricación() {
        return añoFabricación;
    }

    public void setAñoFabricación(int añoFabricación) {
        this.añoFabricación = añoFabricación;
    }

    @Override
    public String toString() {
        return "Locomotoras{" +
                "matrícula='" + matrícula + '\'' +
                ", potenciaMotores=" + potenciaMotores +
                ", añoFabricación=" + añoFabricación +
                ", mecánicos=" + mecánicos +
                '}';
    }

    public void mostrarDato() {
        System.out.println(toString());
    }

    public String ImprimirNumero(){
        return Locomotoras.cantidad + " Locomotoras";
    }
}
