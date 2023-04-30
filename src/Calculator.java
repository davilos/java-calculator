public class Calculator {

    public static void main(String[] args) {
        // Exemplo de como usar o sistema: java Calculator 6 + 2
        if (args.length < 3) {
            System.out.println("Erro: sao necessarios 3 argumentos: num1, operacao e num2.");
            System.exit(-1);
        }

        int num1 = Integer.parseInt(args[0]); // Número 1 recebido pelo usuário
        String operacao = args[1]; // Recebe a operação requerida pelo usuário
        int num2 = Integer.parseInt(args[2]); // Número 2 recebido pelo usuário

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
