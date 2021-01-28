// Ler uma quantidade especifica de números colocar num vetor e receber um número x,
// calcular quais números do vetor são multiplos de x.


package Vetores_Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetor;
        int qtdnumeros;
        int x;
        int mult = 0;

        System.out.println("Este programa lê quantos números são multilos de x");
        System.out.print("Quantos números você quer saber se são multiplos de x? ");
        qtdnumeros = entrada.nextInt();

        System.out.print("Digite o número x: ");
        x = entrada.nextInt();

        vetor = new int[qtdnumeros];
        int[] multiplos = new int[qtdnumeros];

        for (int i = 0; i < qtdnumeros; i++) {
            System.out.print("Digite o " + (i + 1) + "º números: ");
            vetor[i] = entrada.nextInt();
        }
        for (int numero : vetor) {
            if (numero % x == 0) {
                multiplos[mult] = numero;
                mult++;
            }
        }
        entrada.close();

        System.out.print("Os multiplos de " + (x) + " são " + Arrays.toString(multiplos));
    }
}
