package Classes_Metodos;

import Entidades.Notas;

import java.util.Scanner;

public class LogicaNotas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Notas notas;
        notas = new Notas();

        System.out.print("Nome: ");
        notas.nome = entrada.nextLine();

        System.out.print("Primeira nota: ");
        notas.nota1 = entrada.nextDouble();
        System.out.print("segunda nota: ");
        notas.nota2 = entrada.nextDouble();
        System.out.print("Terceira nota: ");
        notas.nota3 = entrada.nextDouble();

        System.out.println("Nota final: " + notas.notaFinal());

        if (notas.notaFinal() < 60) {
            System.out.println("Reprovado");
            System.out.println("Faltam: " + notas.faltando());
        }
        else {
            System.out.println("Aprovado");
        }

        entrada.close();
    }
}
