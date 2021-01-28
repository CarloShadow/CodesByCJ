// Soma uma quantidade de números e mostra o resultado no final

package Repetição;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int repeticao;
        int soma = 0;

        System.out.print("Quantos números serão somados?");
        repeticao = entrada.nextInt();


        for (int i=0; i<repeticao; i++) {
            System.out.print("Digite o número; ");
            numero = entrada.nextInt();
            soma = numero+soma;
        }
        System.out.println("Resultado: " + soma);
        entrada.close();
    }
}
