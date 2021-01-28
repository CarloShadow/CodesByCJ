package Vetores_Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Impar_Par{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetor;
        int qtdNumeros;
        int pares = 0;
        int impares = 0;

        System.out.println("Este programa recebe números e separa os pares dos ímpares");
        System.out.print("Digite a quantidade de números que quer informar: ");
        qtdNumeros = entrada.nextInt();

        vetor = new int[qtdNumeros];

        int[] vetorPares = new int[qtdNumeros];
        int[] vetorImpares = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            vetor[i] = entrada.nextInt();
        }

        for (int numero : vetor) {
            if (numero % 2 == 0) {
                vetorPares[pares] = numero;
                pares++;
            } else {
                vetorImpares[impares] = numero;
                impares++;
            }
        }
        entrada.close();

        System.out.println("Números pares: " + Arrays.toString(vetorPares));
        System.out.println("Números impares: " + Arrays.toString(vetorImpares));
    }
}
