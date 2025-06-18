package model;

/**
 * Clase que representa una operación entre dos números
 */
public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double sumar() {
        return numero1 + numero2;
    }

    public double restar() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double dividir(){
        if (numero2 == 0) {
            System.out.println("No se puede dividir por cero.");
        }
        return numero1 / numero2;
    }
}
