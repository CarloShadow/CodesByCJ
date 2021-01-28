package Entidades;

public class CurrencyConverter {
    public double cotacaoFuncao;
    public double quantidadeFuncao;

    public double calculoFuncao() {
        return cotacaoFuncao * quantidadeFuncao;
    }
    public double totalFuncao() {
        return (calculoFuncao() * 6 / 100) + calculoFuncao();
    }
    public String toString() {
        return "Total a ser pago: " + String.format("%.2f" ,totalFuncao());
    }
}
