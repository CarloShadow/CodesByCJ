package Vetores_Matrizes;

import java.util.Arrays;

public class Vetor_manipulacao {

    public static void main(String[] args) {

        int[] vetor = {1, 0, 5, -2, -5, 7};
        int soma;

        System.out.println(Arrays.toString(vetor));

        soma = vetor[0] + vetor[1] + vetor[5];

        vetor[4] = 100;

        System.out.println(Arrays.toString(vetor));
        System.out.println(soma);

        for (int i : vetor) {
            System.out.println(i);
        }

    }
}
