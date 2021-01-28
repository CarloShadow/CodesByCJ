package Variaveis;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double ValorHora;
        double HorasFeitas;
        double SubTotal;
        double DezPorcento;
        double Total;

        System.out.print("Digite o valor da hora de trabalhado: ");
        ValorHora = input.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        HorasFeitas = input.nextDouble();

        SubTotal= ValorHora*HorasFeitas;

        DezPorcento = SubTotal*10/100;

        Total = SubTotal+DezPorcento;

        System.out.println("Subtotal: " + SubTotal);
        System.out.println("Total (+10%): " + Total);

    }
}
