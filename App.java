package figuras;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        Pentagon pentagon = new Pentagon();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        int option;
        do {
            System.out.println("Calculadora de Área - Seleccione una opción:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    circle.CalcularArea();
                    break;
                case 2:
                    square.CalcularArea();
                    break;
                case 3:
                    triangle.CalcularArea();
                    break;
                case 4:
                    rectangle.CalcularArea();
                    break;
                case 5:
                    pentagon.CalcularArea();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 0);
        scanner.close();    }
}
