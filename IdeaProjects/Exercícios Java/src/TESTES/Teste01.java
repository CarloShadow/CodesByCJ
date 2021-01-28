package TESTES;

import java.util.Scanner;

public class Teste01{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigo = 50;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (codigo != 0) {
            System.out.print("Digite o código: ");
            codigo = entrada.nextInt();

            switch (codigo) {
                case 1:
                    alcool = alcool + 1;
                case 2:
                    gasolina = gasolina + 1;
                case 3:
                    diesel = diesel + 1;
                case 0:
                    System.out.println("MUITO OBRIGADO");
                    break;
            }
        }
        entrada.close();

        System.out.println("Alcool: " + alcool);
    }
}
