import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double x1, x2;
        System.out.print("Ingrese a: ");
        a = sc.nextInt();
        System.out.print("Ingrese b: ");
        b = sc.nextInt();
        System.out.print("Ingrese c: ");
        c = sc.nextInt();

        if (a == 0) {
            System.out.println("El coeficiente 'a' no puede ser 0 en una ecuación cuadrática.");
        } else {
            double discriminante = (b * b) - (4 * a * c);

            if (discriminante > 0) {
                x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Raiz 1: " + x1);
                System.out.println("Raiz 2: " + x2);
            } else if (discriminante == 0) {
                x1 = (double) -b / (2 * a);
                System.out.println("Raiz 1: " + x1);
                System.out.println("Raiz 2: " + x1);
            } else {
                System.out.println("La ecuación no tiene soluciones reales"
                        + "(discriminante negativo).");
            }
        }
    }
}