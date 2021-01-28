/*
Ler N
Mostrar N
Fazer o programa ir de 1 a N
Mostrar o numero de cada linha no começo delas
Mostrar o quadro e o cubo em cada linha
 */

package Repetição;

import java.util.Scanner;

public class Potencia_Unfinished {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quad;
        int cubo;

        System.out.print("Deseja ir até qual número? ");
        int rept = entrada.nextInt();

        for (int i=0; i<rept; i++) {
            quad = i*i;
            cubo = i*i*i;

            System.out.println((i + 1) + (quad) + (cubo));

        }
        entrada.close();
    }
}
