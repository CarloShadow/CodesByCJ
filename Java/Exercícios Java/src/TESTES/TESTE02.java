package TESTES;

import Entidades.CurrencyConverter;

import java.util.Scanner;

public class TESTE02 {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            CurrencyConverter quantidade, cotacao;

            quantidade = new CurrencyConverter();
            cotacao = new CurrencyConverter();

            System.out.print("Informe a cotação atual do dólar: ");
            cotacao.cotacaoFuncao  = entrada.nextFloat();

            System.out.print("Informe a quantidade de dólares que será comprada: ");
            quantidade.quantidadeFuncao = entrada.nextFloat();

            double calculo = cotacao.cotacaoFuncao * quantidade.quantidadeFuncao;

            double total = (calculo * 6 / 100) + calculo;

            entrada.close();

            System.out.println(total);
        }
    }
