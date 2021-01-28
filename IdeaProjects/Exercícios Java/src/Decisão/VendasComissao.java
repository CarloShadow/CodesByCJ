package Decisão;

import java.util.Scanner;

public class VendasComissao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double Valor;
        double Comissao;

        System.out.print("Informe o valor das suas vendas: ");
        Valor = input.nextDouble();

        if (Valor >= 1000000.00) {
            Comissao = (700 + ((Valor * 16) / 100));
            System.out.println("Comissão: " + Comissao);
        } else if (Valor < 1000000.00 && Valor >= 80000.00) {
            Comissao = (650 + ((Valor * 14) / 100));
            System.out.println("Comissão: " + Comissao);
        } else if (Valor < 80000.00 && Valor >= 60000.00) {
            Comissao = (600 + ((Valor * 14) / 100));
            System.out.println("Comissão: " + Comissao);
        }else if (Valor < 60000.00 && Valor >= 40000.00){
            Comissao = (550 + ((Valor * 14) / 100));
            System.out.println("Comissão: " + Comissao);
        }else if (Valor < 40000.00 && Valor >= 20000.00){
            Comissao = (500 + ((Valor * 14) / 100));
            System.out.println("Comissão: " + Comissao);
        }else {
            Comissao = (400 + ((Valor * 14) / 100));
            System.out.println("Comissão: " + Comissao);
        }
    }
}
