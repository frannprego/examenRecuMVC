package controller;

import model.Operacion;
import view.CalculadoraView;


    /**
     * Controlador que gestiona la lógica de la aplicación
     */
    public class CalculadoraController {
        private CalculadoraView view = new CalculadoraView();
        private boolean continuar = true;

        public void iniciar() {
            while (continuar) {
                view.mostrarMenu();
                int opcion = view.leerOpcion();
                procesarOpcion(opcion);
            }
            view.cerrarScanner();
        }

        private void procesarOpcion(int opcion) {
            view.mostrarSeparador();
            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                    double num1 = view.leerNumero("Introduce el primer número: ");
                    double num2 = view.leerNumero("Introduce el segundo número: ");
                    Operacion op = new Operacion(num1, num2);
                    ejecutarOperacion(opcion, op);
                    break;
                case 5:
                    continuar = false;
                    view.mostrarSalida();
                    break;
                default:
                    view.mostrarError("Opción no válida.");
            }
            view.mostrarSeparador();
        }

        private void ejecutarOperacion(int opcion, Operacion op) {
            try {
                double resultado = 0;
                switch (opcion) {
                    case 1:
                        resultado = op.sumar();
                        break;
                    case 2:
                        resultado = op.restar();
                        break;
                    case 3:
                        resultado = op.multiplicar();
                        break;
                    case 4:
                        resultado = op.dividir();
                        break;
                }
                view.mostrarResultado(resultado);
            } catch (ArithmeticException e) {
                view.mostrarError(e.getMessage());
            }
        }
    }

