package view;

import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 */
public class CalculadoraView {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("---- Calculadora Simple ----");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }

    public int leerOpcion() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Debes introducir un número válido.");
            scanner.next(); // limpiar buffer
            return -1;
        }
    }

    public double leerNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public void mostrarResultado(double resultado) {
        System.out.println("El resultado es: " + resultado);
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }

    public void mostrarSalida() {
        System.out.println("¡Saliendo!");
    }
    public void mostrarSeparador(){
        System.out.println("      ");
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
