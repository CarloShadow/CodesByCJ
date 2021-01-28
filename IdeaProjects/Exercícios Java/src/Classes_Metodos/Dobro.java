package Classes_Metodos;

import Entidades.FuncaoDobro;

import java.util.Scanner;

public class Dobro {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        FuncaoDobro funcaoDobro;

        funcaoDobro = new FuncaoDobro();

        System.out.println("Este programa recebe um número e calcula o dobro com uma função");
        System.out.println("Informe o número: ");
        funcaoDobro.numero = entrada.nextInt();

        System.out.println(funcaoDobro);
    }
}
