import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt(); // Número 1 recebido pelo usuário

        System.out.printf("%d ", num1);
        String operacao = scanner.next(); // Recebe a operação requerida pelo usuário

        System.out.printf("%d %s ", num1, operacao);
        int num2 = scanner.nextInt(); // Número 2 recebido pelo usuário

        System.out.printf("%d %s %d -> ", num1, operacao, num2);

        switch (operacao) {
            case "somar", "soma", "+" -> somar(num1, num2);
            case "multiplicar", "multiplica", "x" -> multiplicar(num1, num2);
            case "dividir", "divide", "/" -> dividir(num1, num2);
            case "subtrair", "subtrai", "-" -> subtrair(num1, num2);
            default -> System.out.println("Nao existe essa operacao!");
        }
    }

    static void somar(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void multiplicar(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    static void dividir(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    static void subtrair(int num1, int num2) {
        System.out.println(num1 - num2);
    }
}
