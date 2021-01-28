// Soma, média, média dos pares, quantidade, maiores e menores dos números digitados

package Repetição;

import java.util.Scanner;

public class Tudojunto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        double repeticao;
        double soma = 0;
        int maior = 0;
        int menor = 9999;
        double media = 0;
        int somapares = 0;
        double mediapares = 0;


        System.out.print("Quantos números serão somados? ");
        repeticao = entrada.nextInt();

        for (int i=0; i<repeticao; i++ ) {
            System.out.print("Digite os números: ");
            numero = entrada.nextInt();
            soma = soma+numero;

            if (numero>maior) {
                maior = numero;
            }
            else if (numero<menor) {
                menor = numero;
            }

            else if (numero % 2 == 0) {
                somapares = numero+somapares;
                mediapares++;
            }

            if (numero == 0) {
                break;
            }

            media = soma/repeticao;
        }
        System.out.println("Quantidade de números digitada: " + repeticao);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Média de pares: " + somapares/mediapares);
    }
}
