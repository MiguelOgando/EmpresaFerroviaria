package prácticas.ferroviaria.maquinaria;

import prácticas.ferroviaria.empleados.Maquinistas;

import java.util.ArrayList;
import java.util.Scanner;

public class Trenes {
    public static int cantidad = 0;
    int cantidadTrenes;

    protected Maquinistas maquinistas;
    protected Locomotoras locomotoras;
    protected ArrayList<Vagones> vagones = new ArrayList<>(5);

    public Trenes(Locomotoras locomotoras, Maquinistas maquinistas) {
        this.locomotoras = locomotoras;
        this.maquinistas = null;
        cantidadTrenes = Trenes.cantidad++;
    }

    public int getVagones() {
        return vagones.size();
    }

    public void setVagones(ArrayList<Vagones> vagones) {
        this.vagones = vagones;
    }

    public Maquinistas getMaquinistas() {
        return maquinistas;
    }

    public void setMaquinistas(Maquinistas maquinistas) {
        this.maquinistas = maquinistas;
    }

    public Locomotoras getLocomotoras() {
        return locomotoras;
    }

    public void setLocomotoras(Locomotoras locomotoras) {
        this.locomotoras = locomotoras;
    }

    @Override
    public String toString() {
        return "Trenes{" +
                "locomotoras=" + locomotoras +
                ", vagones=" + vagones +
                ", maquinistas=" + maquinistas +
                '}';
    }

    public void mostrarDato() {
        System.out.println(toString());
    }

    public String ImprimirNumero(){
        return Trenes.cantidad + " Trenes";
    }

    public void añadirVagón() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5  ; i++) {
            System.out.println("Creando vagón...");
            Vagones v = new Vagones(0, 0, 0, null);

            System.out.println("¿Cuál es la carga máxima?");
            v.setCargaMáxima(sc.nextInt());
            System.out.println("¿Qué tipo de mercancía lleva?");
            System.out.println("1. Perecedera");
            System.out.println("2. No perecedera");
            System.out.println("3. Frágil");
            System.out.println("4. Peligrosa");
            System.out.println("5. Dimensional");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1 :
                    v.setMercancía(Mercancía.PERECEDERA);
                    break;
                case 2 :
                    v.setMercancía(Mercancía.NO_PERECEDERA);
                    break;
                case 3 :
                    v.setMercancía(Mercancía.FRÁGIL);
                    break;
                case 4 :
                    v.setMercancía(Mercancía.PELIGROSA);
                    break;
                case 5 :
                    v.setMercancía(Mercancía.DIMENSIONAL);
            }

            v.ImprimirNumero();

            v.setIdentificación(cantidadTrenes + v.cantidadVagones);

            vagones.add(i, v);
        }

        }
        public void eliminarUltimoVagon(){
            this.vagones.remove(getVagones() - 1);
    }

}













    /*public static void añadirVagón(Vagones vagon) {
        Scanner sc = new Scanner(System.in);
        int tipoMercancía = sc.nextInt();
        Vagones[] tamaño = new Vagones[5];
        for (int i = 0; i < tamaño.length; i++) {
            System.out.println("Creando vagón...");
            System.out.println("¿Cuál es la carga máxima?");
            vagon.cargaMáxima = sc.nextDouble();
            System.out.println("¿Qué tipo de mercancía lleva?");
            System.out.println("1. Perecedera");
            System.out.println("2. No perecedera");
            System.out.println("3. Frágil");
            System.out.println("4. Peligrosa");
            System.out.println("5. Dimensional");

            switch (tipoMercancía) {
                case 1:
                    vagon.setMercancía(Mercancía.PERECEDERA);
                    break;
                case 2:
                    vagon.setMercancía(Mercancía.NO_PERECEDERA);
                    break;
                case 3:
                    vagon.setMercancía(Mercancía.FRÁGIL);
                    break;
                case 4:
                    vagon.setMercancía(Mercancía.PELIGROSA);
                    break;
                case 5:
                    vagon.setMercancía(Mercancía.DIMENSIONAL);
                    break;
                default:
                    System.out.println("No se pueden hacer más vagones.");
            }
        }
    }*/



