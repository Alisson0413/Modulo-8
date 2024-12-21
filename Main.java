// Nombre: Alisson Ibarguen
// Número de ID: 8-1020-2253
// Facultad: FACULTAD DE INGENIERÍA, ARQUITECTURA Y DISEÑO
// Carrera: Lic. INGENIERÍA EN SISTEMAS COMPUTACIONALES
// Curso: Programación de Computadoras II

/*
Enunciado: Tomando como base la Actividad #7, vamos a reformular
la calculadora de operaciones matemáticas utilizando la Programación
Orientada a Objetos (POO). Se crearán clases para representar los diferentes
tipos de operaciones, y se utilizará la herencia para modelar las relaciones
entre ellas. Además, se implementarán interfaces para promover un diseño más
flexible.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// clase principal del menu
public class Main {
    public static void main(String[] args) {
        // inicializacion de variables
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;
        // do while para mostrar el menu
        do {
            limpiarPantalla();
            mostrarMenu();
            // try catch para capturar errores de entrada
            try {
                System.out.print("Elige una opción: ");
                String input = reader.readLine();
                opcion = Integer.parseInt(input);
                // switch para elegir la opcion del menu
                switch (opcion) {
                    case 1:
                        FigurasGeometricas.EjecutarPrograma();
                        break;
                    case 2:
                        OperacionesMultiples.ejecutarPrograma();
                        break;
                    case 3:
                        CalcularPotencias.ejecutarPrograma();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");

                        System.exit(0);
                    default:
                        System.err.println("\nOpción no válida. Inténtalo de nuevo.");
                }
                // if para que no se cierre el programa
                if (opcion != 5) {
                    System.out.print("Presiona Enter para continuar...");
                    reader.readLine();
                }
                // catch para capturar errores de entrada
            } catch (IOException e) {
                System.err.println("Error de entrada/salida. " + e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("Por favor ingresa un número válido.");
            }
            // while para que no se cierre el programa
        } while (opcion != 5);
    }

    // metodo para limpiar la pantalla
    private static void limpiarPantalla() {
        for (int i = 0; i < 30; i++) {
            System.out.println("\n");
        }
    }
    // metodo para mostrar el menu
    private static void mostrarMenu() {
        System.out.println("MAIN MENU CALCULADORA MULTIPLE:");
        System.out.println("[1]____Area o Perimetro de Figuras Geométricas");
        System.out.println("[2]____Operaciones Matemáticas Multiples");
        System.out.println("[3]____Calcular Potencias con Recursividad");
        System.out.println("[4]____Salir");
        System.out.println("____________________________________________");
    }
}