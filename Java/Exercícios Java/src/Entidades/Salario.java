package Entidades;

public class Salario {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double calculoTaxa() {
        return salarioBruto - taxa;
    }
    public void aumento(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }
    public String toString() {
        return nome + "R$" + String.format("%.2f", calculoTaxa()) ;

    }
}
