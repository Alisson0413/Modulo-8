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

// importamos la clase BufferedReader del paquete java.io
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Clase CalcularPotencias
public class CalcularPotencias {
    private static double base;
    private static int exponente;
    private static double resultado;
// Metodo principal main
    public static void main(String[] args) {
        // Crear un objeto CalcularPotencias
        CalcularPotencias potencias = new CalcularPotencias();
        potencias.ejecutarPrograma();
    }

    // Metodo para ejecutar el programa
    public static void ejecutarPrograma() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try catch para capturar errores de entrada
        try {
            System.out.println("Ingrese la base de la potencia: ");
            base = Double.parseDouble(br.readLine());
            System.out.println("Ingrese el exponente de la potencia: ");
            exponente = Integer.parseInt(br.readLine());
            resultado = calcularPotencia(base, exponente);
            System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
        } catch (IOException e) {
            // catch para capturar errores de entrada/salida
            System.err.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            // catch para capturar errores de formato de número
            System.err.println("Por favor ingresa un número válido.");
        }
    }

    // Metodo para calcular la potencia
    public static double calcularPotencia(double base, int exponente) {
        // if para verificar si el exponente es 0
        if (exponente == 0) {
            return 1;
        }
        // if para verificar si el exponente es 1
        return base * calcularPotencia(base, exponente - 1);
    }
}
