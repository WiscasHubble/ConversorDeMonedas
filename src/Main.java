import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("Conversor de monedas: ");
        System.out.println("""
                1) Dollar >>> Peso Argentino
                1) Peso Argentino >>> Dollar
                1) Dollar >>> Real Brasileiro
                1) Real Brasileiro >>> Dollar
                1) Dollar >>> Chilean Peso
                1) Chilean Peso >>> Dollar
                1) Dollar >>> Colombian Peso
                1) Colombian Peso >>> Dollar
                1) Dollar >>> Mexican Peso
                1) Mexican Peso >>> Dollar
                """);
        System.out.println("Elige una opción valida: ");
        System.out.println("***********************");

        scanner.next();
        scanner.close();
    }
}