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

// Clase FigurasGeometricas
public class FigurasGeometricas {

    // Metodo principal main
    public void main(String[] args) {
        FigurasGeometricas figuras = new FigurasGeometricas();
        figuras.EjecutarPrograma();
    }

    // Metodo para ejecutar el programa
    public static void EjecutarPrograma() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Mostrar el menu de opciones
            System.out.println("Seleccione la figura a calcular: ");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Círculo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            int opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    calcularTriangulo();
                    break;
                case 2:
                    calcularCuadrado();
                    break;
                case 3:
                    calcularCirculo();
                    break;
                case 4:
                    calcularRectangulo();
                    break;
                case 5:
                    calcularPentagono();
                    break;
            }
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Por favor ingresa un número válido.");
        }
    }

    // Metodo para calcular el triángulo
    private static void calcularTriangulo() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double base = 0;
        double altura = 0;
        try {
            // try catch para capturar errores de entrada
            System.out.print("Ingrese la base del triángulo: ");
            base = Double.parseDouble(br.readLine());
            System.out.print("Ingrese la altura del triángulo: ");
            altura = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Por favor ingresa un número válido.");
        }
        // Calcular el área y perímetro del triángulo
        double area = (base * altura) / 2;
        double perimetro = base * 3;
        System.out.println("El área del triángulo es: " + area);
        System.out.println("El perímetro del triángulo es: " + perimetro);
    }

    // Metodo para calcular el cuadrado
    private static void calcularCuadrado() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double lado = 0;
        try {
            // try catch para capturar errores de entrada
            System.out.print("Ingrese el lado del cuadrado: ");
            lado = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Por favor ingresa un número válido.");
        }
        // Calcular el área y perímetro del cuadrado
        double area = lado * lado;
        double perimetro = lado * 4;
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }

    // Metodo para calcular el círculo
    private static void calcularCirculo() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double radio = 0;
        double pi = 3.1416;
        try {
            // try catch para capturar errores de entrada
            System.out.print("Ingrese el radio del círculo: ");
            radio = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Por favor ingresa un número válido.");
        }
        double area = pi * radio * radio;
        double perimetro = 2 * pi * radio;
        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);
    }

    // Metodo para calcular el rectángulo
    private static void calcularRectangulo() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double base = 0;
        double altura = 0;
        try {
            // try catch para capturar errores de entrada
            System.out.print("Ingrese la base del rectángulo: ");
            base = Double.parseDouble(br.readLine());
            System.out.print("Ingrese la altura del rectángulo: ");
            altura = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Por favor ingresa un número válido.");
        }
        // Calcular el área y perímetro del rectángulo
        double area = base * altura;
        double perimetro = (base * 2) + (altura * 2);
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }

    // Metodo para calcular el pentágono
    private static void calcularPentagono() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double lado = 0;
        try {
            System.out.print("Ingrese el lado del pentágono: ");
            lado = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Por favor ingresa un número válido.");
        }
        // Calcular el área y perímetro del pentágono
        double area = (lado * 5) / 2;
        double perimetro = lado * 5;
        System.out.println("El área del pentágono es: " + area);
        System.out.println("El perímetro del pentágono es: " + perimetro);
    }
}
