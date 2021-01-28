package Entidades;

public class FuncaoDobro {

    public int numero;

    public int calculoDobro() {
        return numero * 2;
    }
    public String toString() {
        return "O dobro de " + numero + " é: " + calculoDobro();
    }

}
