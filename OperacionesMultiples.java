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

// Clase OperacionesMultiples
public class OperacionesMultiples {
    private static int Operador1;
    private static int Operador2;
    private static int Resultado;
    private static int Opcion;

    // Metodo principal main
    public static void main(String[] args) {
        OperacionesMultiples op = new OperacionesMultiples();
        op.ejecutarPrograma();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }

    // Metodo para ejecutar el programa
    public static void ejecutarPrograma() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // try catch para capturar errores de entrada
        try{
            // Mostrar el menu de opciones
            System.out.println("Ingrese la operación a realizar: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            Opcion = Integer.parseInt(br.readLine());

        }
        catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
            ejecutarPrograma();
        }
        catch (NumberFormatException e) {
            System.err.println("Por favor ingresa un número válido.");
            ejecutarPrograma();
        }

        // switch para elegir la opcion del menu
        switch (Opcion) {
            case 1:
                Suma();
                break;
            case 2:
                Resta();
                break;
            case 3:
                Multiplicacion();
                break;
            case 4:
                Division();
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                System.exit(0);
                break;
            default:
                System.err.println("\nOpción no válida. Inténtalo de nuevo.");
                ejecutarPrograma();
        }




    }

    // Metodo para realizar la suma
    private static void Suma() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Solicitar y leer los números a sumar
            System.out.println("Ingrese el primer número: ");
            OperacionesMultiples.Operador1 = Integer.parseInt(br.readLine());
            System.out.println("Ingrese el segundo número: ");
            OperacionesMultiples.Operador2 = Integer.parseInt(br.readLine());
            OperacionesMultiples.Resultado = OperacionesMultiples.Operador1 + OperacionesMultiples.Operador2;
            System.out.println("El resultado de la suma es: " + OperacionesMultiples.Resultado);
        }
        catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
            Suma();
        }
        catch (NumberFormatException e) {
            System.err.println("Por favor ingresa un número válido.");
            Suma();
        }
    }

    // Metodo para realizar la resta
    private static void Resta(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Solicitar y leer los números a restar
            System.out.println("Ingrese el primer número: ");
            OperacionesMultiples.Operador1 = Integer.parseInt(br.readLine());
            System.out.println("Ingrese el segundo número: ");
            OperacionesMultiples.Operador2 = Integer.parseInt(br.readLine());
            OperacionesMultiples.Resultado = OperacionesMultiples.Operador1 - OperacionesMultiples.Operador2;
            System.out.println("El resultado de la resta es: " + OperacionesMultiples.Resultado);
        }
        catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
            Resta();
        }
        catch (NumberFormatException e) {
            System.err.println("Por favor ingresa un número válido.");
            Resta();
        }
    }

    // Metodo para realizar la multiplicación
    private static void Multiplicacion(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Solicitar y leer los números a multiplicar
            System.out.println("Ingrese el primer número: ");
            OperacionesMultiples.Operador1 = Integer.parseInt(br.readLine());
            System.out.println("Ingrese el segundo número: ");
            OperacionesMultiples.Operador2 = Integer.parseInt(br.readLine());
            OperacionesMultiples.Resultado = OperacionesMultiples.Operador1 * OperacionesMultiples.Operador2;
            System.out.println("El resultado de la multiplicación es: " + OperacionesMultiples.Resultado);
        }
        catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
            Multiplicacion();
        }
        catch (NumberFormatException e) {
            System.err.println("Por favor ingresa un número válido.");
            Multiplicacion();
        }
    }

    // Metodo para realizar la división
    private static void Division(){
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float result = 0;
        try {
            System.out.println("Ingrese el primer número: ");
            OperacionesMultiples.Operador1 = Integer.parseInt(br.readLine());
            System.out.println("Ingrese el segundo número: ");
            OperacionesMultiples.Operador2 = Integer.parseInt(br.readLine());
            if (OperacionesMultiples.Operador2 != 0) {
                result = (float) OperacionesMultiples.Operador1 / OperacionesMultiples.Operador2;
                System.out.println("El resultado de la división es: " + result);
            } else {
                System.err.println("Error: No se puede dividir por cero.");
                Division();
            }
        }
        catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
            Division();
        }
        catch (NumberFormatException e) {
            System.err.println("Por favor ingresa un número válido.");
            Division();
        }
    }
}




