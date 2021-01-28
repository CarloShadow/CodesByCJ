package Variaveis;

public class premiacao {

    public static void main(String[] args)
    {

        float premio = 7800000;
        float ganhador1;
        float ganhador2;
        float ganhador3;

        ganhador1 = premio*46/100;
        ganhador2 = premio*32/100;
        ganhador3 = premio*22/100;

        System.out.println("O primeiro vencedor receberá: " + ganhador1);
        System.out.println("O segundo vencedor receberá: " + ganhador2);
        System.out.println("O terceiro vencedor receberá: " + ganhador3);

    }
}
