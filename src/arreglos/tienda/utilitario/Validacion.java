package arreglos.tienda.utilitario;

import java.util.Scanner;

public class Validacion {
    private static Scanner sc = new Scanner(System.in);

    public static String leerString(String mensaje){
        String dato;
        do{
            System.out.println(mensaje+" : ");
            dato = sc.nextLine();
        }while(dato == null || dato.trim().isEmpty());
        return dato;
    }

    public static int leerEnteroMenorQue(String mensaje, int limiteMaximo) {
        int numero;
        do {
            System.out.print(mensaje + " (Debe ser menor a " + limiteMaximo + "): ");
            numero = Integer.parseInt(sc.nextLine());
            if (numero >= limiteMaximo) {
                System.out.println("El número debe ser menor a " + limiteMaximo + ". Intente de nuevo.");
            }
        } while (numero >= limiteMaximo);
        return numero;
    }

    public static int leerEnteroMayorQue(String mensaje, int limiteMinimo) {
        int numero;
        do {
            System.out.print(mensaje + " (Debe ser mayor a " + limiteMinimo + "): ");
            numero = Integer.parseInt(sc.nextLine());
            if (numero <= limiteMinimo) {
                System.out.println("El número debe ser mayor a " + limiteMinimo + ". Intente de nuevo.");
            }
        } while (numero <= limiteMinimo);
        return numero;
    }

    public static int leerEnteroEntre(String mensaje, int min, int max) {
        int numero;
        do {
            System.out.print(mensaje + " (Entre " + min + " y " + max + "): ");
            numero = Integer.parseInt(sc.nextLine());
            if (numero < min || numero > max) {
                System.out.println("Fuera de rango. Debe estar entre " + min + " y " + max + ".");
            }
        } while (numero < min || numero > max);
        return numero;
    }

    public static double leerDoublePositivo(String mensaje) {
        double numero;
        do {
            System.out.print(mensaje + " (Debe ser mayor a 0): ");
            numero = Double.parseDouble(sc.nextLine());
            if (numero <= 0) {
                System.out.println("El valor debe ser mayor a 0. Intente de nuevo.");
            }
        } while (numero <= 0);
        return numero;
    }

    public static double leerDoubleEntre(String mensaje, double min, double max) {
        double numero;
        do {
            System.out.print(mensaje + " (Entre " + min + " y " + max + "): ");
            numero = Double.parseDouble(sc.nextLine());
            if (numero < min || numero > max) {
                System.out.println("Fuera de rango. Debe estar entre " + min + " y " + max + ".");
            }
        } while (numero < min || numero > max);
        return numero;
    }
}