package Variaveis;

import java.util.Scanner;

public class Produto {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int produto;

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        numero3 = input.nextInt();

        produto = numero1 * numero2 * numero3;

        System.out.printf("Resultado %d%n", produto);

    }
}
