package prácticas.ferroviaria;

import prácticas.ferroviaria.empleados.Especialidad;
import prácticas.ferroviaria.empleados.JefesDeEstación;
import prácticas.ferroviaria.empleados.Maquinistas;
import prácticas.ferroviaria.empleados.Mecánicos;
import prácticas.ferroviaria.maquinaria.Locomotoras;
import prácticas.ferroviaria.maquinaria.Trenes;
import prácticas.ferroviaria.maquinaria.Vagones;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Simulamos una estación: creamos objetos de diversos tipos:

        // dos maquinistas
        System.out.println("Dos maquinistas:");
        Maquinistas maquinista1 = new Maquinistas("Manuel", "12345678A", 12000, 1);
        Maquinistas maquinista2 = new Maquinistas("Hugo", "09876543S", 17000, 2);
        // imprimimos los datos de los dos maquinistas
        maquinista1.mostrarDato();
        maquinista2.mostrarDato();


        // un mecánico de cada especialidad
        System.out.println("\nUn mecánico de cada especialidad:");
        Mecánicos mecánico1 = new Mecánicos("Daniel", 612233445, Especialidad.ELECTRICIDAD);
        Mecánicos mecánico2 = new Mecánicos("Alejando", 600998877, Especialidad.FRENOS);
        Mecánicos mecánico3 = new Mecánicos("Jose María", 640182946, Especialidad.HIDRÁULICA);
        Mecánicos mecánico4 = new Mecánicos("Hades", 600001111, Especialidad.MOTOR);
        // imprimimos los datos de cada mecánico
        mecánico1.mostrarDato();
        mecánico2.mostrarDato();
        mecánico3.mostrarDato();
        mecánico4.mostrarDato();

        // Un jefe de estación
        System.out.println("\nUn jefe de estación:");
        JefesDeEstación jefe = new JefesDeEstación("Rodrigo", "00011199P", "01-01-2002");
        // Imprimimos los datos del jefe de estación
        jefe.mostrarDato();

        // Una locomotora
        System.out.println("\nUna locomotora:");
        Locomotoras locomotora1 = new Locomotoras("092ML", 190, 2000, mecánico1);
        // imprimimos los datos de la locomotora
        locomotora1.mostrarDato();

        // Creamos un tren con la locomotora que acabamos de crear
        System.out.println("\nCreamos un tren con la locomotora que acabamos de crear");
        Trenes tren1 = new Trenes(locomotora1, maquinista1);
        tren1.mostrarDato();

        // Añadimos 6 vagones al tren (nos dirá que el último no se puede
        System.out.println("\nAñadimos 5 vagones al tren y tratamos de añadir uno más: ");
        System.out.println("***************************");
        tren1.añadirVagón();

        // Asignamos uno de los maquinistas al tren creado
        System.out.println("\n*****     Le asignamos un maquinista *****");
        tren1.setMaquinistas(maquinista2);

        // Mostramos el número de vagones del tren
        System.out.println("\nNúmero de vagones: " + tren1.getVagones());
        // Mostramos los datos del tren creado
        System.out.println("\nDatos del tren");
        tren1.mostrarDato();

        // Quitamos un vagón
        System.out.println("\n***** Quitamos un vagón *****");
        tren1.eliminarUltimoVagon();

        // mostramos el número de vagones del tren
        System.out.println("\nNúmero de vagones: " + tren1.getVagones());
        // Finalmente, contamos todos los elementos que tenemos en la estación
        System.out.println("\nMi estación se compone de");
        System.out.println(jefe.ImprimirNumero());
        System.out.println(maquinista2.ImprimirNumero());
        System.out.println(mecánico4.ImprimirNumero());
        System.out.println(locomotora1.ImprimirNumero());
        System.out.println(tren1.ImprimirNumero());


    }
}
