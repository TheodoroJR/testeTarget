package testes;

import java.util.Scanner;

public class TesteFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (isFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean isFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int a = 0, b = 1, soma = 0;
        while (soma < num) {
            soma = a + b;
            a = b;
            b = soma;
        }

        return soma == num;
    }
}
