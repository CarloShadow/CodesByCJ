package Vetores_Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Maior_Menor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int vetor[];
        int maior = 0;
        int menor = 0;
        int qtdNumeros;

        System.out.println("Esse programa recebe números e mostra qual é o maior e o menor");
        System.out.println("Digite a quantidade de números que quer digitar: ");
        qtdNumeros = entrada.nextInt();

       vetor = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = entrada.nextInt();
            maior = vetor[i];
            menor = vetor[i];
        }

        for (int i = 0; i < qtdNumeros; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        entrada.close();

        System.out.println("Números informados: " + Arrays.toString(vetor));
        System.out.println("Maior número = " + maior);
        System.out.println("Menor número = " + menor);
    }
}
