/*
Ler a cotação do dolar
Ler um valor de dolares ser comprado por alguem em reais
Informar quantos reais a pessoa vai pagar pelos dolares
Acrescentar os 6% do IOF
Criar a classe para fazer os calculos
 */

package Classes_Metodos;

import Entidades.CurrencyConverter;

import java.util.Scanner;

public class Dolar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        CurrencyConverter conversao;

        conversao = new CurrencyConverter();

        System.out.print("Informe a cotação atual do dólar: ");
        conversao.cotacaoFuncao = entrada.nextFloat();

        System.out.print("Informe a quantidade de dólares que será comprada: ");
        conversao.quantidadeFuncao = entrada.nextFloat();

        System.out.println(conversao);
    }
}
