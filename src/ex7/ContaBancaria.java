package ex7;

public class ContaBancaria {
    private String titular;
    private Double saldo;


    public ContaBancaria(String titular, double saldoInicial) {
        if(saldoInicial < 0){
            throw new IllegalArgumentException("Erro ao criar conta: Saldo inicial não deve ser menor que 0");
        }
        this.titular = titular;
    }

    public void depositar(double valor) {
        if(valor < 0){
            throw new IllegalArgumentException("Erro ao depositar: Valor de depósito não deve ser menor que 0");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if(valor > saldo){
            throw new IllegalArgumentException("Erro ao sacar: Valor de saque maior que o saldo");
        }
        saldo -= valor;
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


}
