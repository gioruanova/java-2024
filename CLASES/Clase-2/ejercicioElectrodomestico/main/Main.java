package ejercicioElectrodomestico.main;

import java.util.Scanner;

import ejercicioElectrodomestico.CasaElectrodomestico;
import ejercicioElectrodomestico.Electrodomestico;
import ejercicioElectrodomestico.Heladera;
import ejercicioElectrodomestico.Lavarropa;
import ejercicioElectrodomestico.Licuadora;
import ejercicioElectrodomestico.Televisor;

public class Main {

    public static void main(String[] args) {

        CasaElectrodomestico ce = new CasaElectrodomestico();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducí un articulo o 0 para salir: ");
        System.out.println("1 una Heladera.");
        System.out.println("2 un Lavarropas.");
        System.out.println("3 un Licuadora.");
        System.out.println("4 un Televisor.");
        System.out.println("0 SALIR.");
        Integer input = scanner.nextInt();

        // Variables para mis objetos
        String marca = "";
        String modelo = "";
        String numeroSerie = "";
        int voltaje = 0;
        double precio = 0;
        int capacidadLitros = 0;
        int maxCarga = 0;
        // Acciones para los booleanos
        String esFrost = "";

        while (input != 0) {
            scanner.nextLine();

            switch (input) {
                case 1:
                    ce.agregarProductos(
                            entradaDatosHeladera(scanner, marca, modelo, numeroSerie, voltaje, precio,
                                    capacidadLitros, esFrost));
                    break;
                case 2:
                    ce.agregarProductos(
                            entradaDatosLavarropas(scanner, marca, modelo, numeroSerie, voltaje, precio, maxCarga));
                    break;
                default:
                    break;
            }

            System.out.println("Si queres introducir otro articulo?: ");
            System.out.println("1 una Heladera.");
            System.out.println("2 un Lavarropas.");
            System.out.println("3 un Licuadora.");
            System.out.println("4 un Televisor.");
            System.out.println("0 SALIR.");
            input = scanner.nextInt();
        }

        System.out.println("Finalizó el sistema de carga");
        ce.mostarProductos();
        System.out.print("TOTAL: $" + ce.totalProductos() + "\n");

    }

    public static Heladera entradaDatosHeladera(Scanner scanner, String marca, String modelo, String numeroSerie,
            Integer voltaje,
            Double precio, int capacidadLitros, String esFrost) {
        System.out.println("Introduzca la marca: ");
        marca = scanner.nextLine();
        System.out.println("Introduzca el modelo: ");
        modelo = scanner.nextLine();
        System.out.println("Introduzca el numero de serie: ");
        numeroSerie = scanner.nextLine();
        System.out.println("Introduzca el voltaje 220/110: ");
        voltaje = scanner.nextInt();
        System.out.println("Introduzca el precio de la heladera a cargar");
        precio = scanner.nextDouble();
        System.out.println("Introduzca la capacidad de litros: ");
        capacidadLitros = scanner.nextInt();

        Heladera aDevolver = new Heladera(marca, modelo, numeroSerie, voltaje, precio, capacidadLitros);

        scanner.nextLine();
        System.out.println("Es noFrost? si / no: ");
        esFrost = scanner.nextLine();

        if (esFrost.toLowerCase().equals("si")) {
            aDevolver.setEsFrost(true);
        }

        return aDevolver;
    }

    public static Lavarropa entradaDatosLavarropas(Scanner scanner, String marca, String modelo, String numeroSerie,
            Integer voltaje,
            Double precio, int maxCarga) {
        System.out.println("Introduzca la marca: ");
        marca = scanner.nextLine();
        System.out.println("Introduzca el modelo: ");
        modelo = scanner.nextLine();
        System.out.println("Introduzca el numero de serie: ");
        numeroSerie = scanner.nextLine();
        System.out.println("Introduzca el voltaje 220/110: ");
        voltaje = scanner.nextInt();
        System.out.println("Introduzca el precio del lavarropas a cargar");
        precio = scanner.nextDouble();
        System.out.println("Introduzca max carga del lavarropas: ");
        maxCarga = scanner.nextInt();
        scanner.nextLine();
        return new Lavarropa(marca, modelo, numeroSerie, voltaje, precio, maxCarga);
    }

}
