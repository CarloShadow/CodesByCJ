// Ler a nota de alunos e imprimir a média geral

package Vetores_Matrizes;

import java.util.Scanner;

public class MediaGeral {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float[] vetor;
        int qtdNotas;
        float soma = 0;
        float media = 0;

        System.out.println("Informe as notas do alunos para calcular a média geral");
        System.out.print("Digite a quantidade de notas: ");
        qtdNotas = entrada.nextInt();

        vetor = new float[qtdNotas];

        for (int i = 0; i < qtdNotas; i++) {
            System.out.print("Dgite a nota do " + (i + 1) + "º aluno: ");
            vetor[i] = entrada.nextInt();
            soma = soma + vetor[i];
        }
        entrada.close();

        media = soma/qtdNotas;

        System.out.println("Média: " + media);


    }
}
