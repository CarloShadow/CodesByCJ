/*
Ler um numero N
depois ler N pares n�meros
mostrar a divis�o do primeiro pelo segundo
se o numero for dividido for zero, imprimir mensagem de erro
 */

package Repeticao;

import java.util.Scanner;

public class divisao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos pares deseja informar? ");
        int rept = entrada.nextInt();
        float div;

        for (int i=0; i<rept; i++) {
            System.out.println("Informe o " + (i + 1) + "� par");
            System.out.print("Digite o 1� n�mero: ");
            float num1 = entrada.nextInt();

            System.out.print("Digite o 2� n�mero: ");
            float num2 = entrada.nextInt();

            if (num1 != 0) {
                div = num1 / num2;
                System.out.println((num1) + "/" + (num2) + "= " + (div));
            }
            else {
                System.out.println("Divis�o imposs�vel");
            }
        }
        entrada.close();
    }
}
