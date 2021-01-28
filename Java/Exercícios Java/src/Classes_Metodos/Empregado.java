package Classes_Metodos;

import Entidades.Salario;

import java.util.Scanner;

public class Empregado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Salario salario;

        salario = new Salario();

        System.out.print("Digite o nome: ");
        salario.nome = entrada.nextLine();

        System.out.print("Informe o salário: ");
        salario.salarioBruto = entrada.nextDouble();

        System.out.print("Informe a taxa: ");
        salario.taxa = entrada.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + salario);
        System.out.println();
        System.out.println("Qual porcentagem irá aumentar o salário? ");
        double porcentagem = entrada.nextDouble();
        salario.aumento(porcentagem);

        System.out.println();
        System.out.println("Total do salário: " + salario);
        entrada.close();
    }
}
