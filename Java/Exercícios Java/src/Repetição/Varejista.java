package Repetição;


import java.util.Scanner;

public class Varejista {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float produto1 = 2.98f;
        float produto2 = 4.50f;
        float produto3 = 9.98f;
        float produto4 = 4.49f;
        float produto5 = 6.87f;
        int numero = 10;
        int quantidade;
        double calculo1 = 0;
        double calculo2 = 0;
        double calculo3 = 0;
        double calculo4 = 0;
        double calculo5 = 0;


        while (numero != 0) {
            System.out.print("Digite o código dos produtos: ");
            numero = entrada.nextInt();

            System.out.print("Digite a quantidade do produto: ");
            quantidade = entrada.nextInt();

            switch (numero) {
                case 1:
                    calculo1 = produto1 * quantidade;
                case 2:
                    calculo2 = produto2 * quantidade;
                case 3:
                    calculo3 = produto3 * quantidade;
                case 4:
                    calculo4 = produto4 * quantidade;
                case 5:
                    calculo5 = produto5 * quantidade;
            }
        }
        entrada.close();

        System.out.println("Valor dos produtos 1: " + calculo1);
        System.out.println("Valor dos produtos 2: " + calculo2);
        System.out.println("Valor dos produtos 3: " + calculo3);
        System.out.println("Valor dos produtos 4: " + calculo4);
        System.out.println("Valor dos produtos 5: " + calculo5);

    }
}
