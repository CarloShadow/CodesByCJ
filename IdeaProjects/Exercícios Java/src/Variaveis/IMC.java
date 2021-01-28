package Variaveis;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double peso;
        double altura;
        double resultado;

        System.out.print("Digite o seu peso: ");
        peso = input.nextDouble();

        System.out.print("Digite a sua altura: ");
        altura = input.nextDouble();

        resultado = peso/(altura*altura);

        System.out.println("Resultado " + resultado);

    }
}
