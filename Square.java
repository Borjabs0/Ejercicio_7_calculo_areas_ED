// Square.java
package figuras;

import java.util.Scanner;

public class Square extends Figura {
    @Override
    public void CalcularArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        double side = scanner.nextDouble();
        double area = side * side;
        System.out.println("El área del cuadrado es: " + area);
    }
}