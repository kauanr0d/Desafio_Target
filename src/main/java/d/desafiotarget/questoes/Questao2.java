package d.desafiotarget.questoes;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar está na sequência de Fibonacci: ");
        int num = scanner.nextInt();

        if (pertenceFibonacci(num)) {
            System.out.println(num + " está na sequência de Fibonacci.");
        } else {
            System.out.println(num + " não está na sequência de Fibonacci.");
        }
    }

    public static boolean pertenceFibonacci(int num) {
        return pertenceFibonnaci(num, 0, 1);
    }

    private static boolean pertenceFibonnaci(int num, int primeiro, int segundo) {
        if (num == primeiro || num == segundo) {
            return true;
        }
        int prox = primeiro + segundo;
        if (prox == num) {
            return true;
        } else if (prox > num) {
            return false;
        }

        return pertenceFibonnaci(num, segundo, prox);
    }
}
