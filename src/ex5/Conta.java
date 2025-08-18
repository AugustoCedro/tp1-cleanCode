package ex5;

public class Conta implements IConta{
    private String titular;
    private Double saldo;

    public Conta(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void transferirValor(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }
        throw new IllegalArgumentException("Valor maior do que o saldo");
    }

    public void receberValor(double valor){
        this.saldo += valor;
    }




}
