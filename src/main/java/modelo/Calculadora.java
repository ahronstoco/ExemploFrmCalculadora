package modelo;

public class Calculadora {
    private double ValorA;
    private double ValorB;

    public Calculadora() {
    }

    public Calculadora(double ValorA, double ValorB) {
        this.ValorA = ValorA;
        this.ValorB = ValorB;
    }

    public double getValorA() {
        return ValorA;
    }

    public void setValorA(double ValorA) {
        this.ValorA = ValorA;
    }

    public double getValorB() {
        return ValorB;
    }

    public void setValorB(double ValorB) {
        this.ValorB = ValorB;
    }
    public double getAdicao() {
        return ValorA + ValorB;
    }
    public double getSubtracao() {
        return ValorA - ValorB;
    }
    public double getMultiplicacao() {
        return ValorA * ValorB;
    }
    public double getDivisao() {
        return ValorA / ValorB;
    }
}