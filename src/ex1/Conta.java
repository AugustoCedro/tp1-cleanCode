package ex1;

public class Conta {
    String titular;
    Double saldo;

    public Conta(String titular, Double saldo) {
        if(saldo < 0){
            throw new IllegalArgumentException("Erro ao criar conta: Saldo não deve ser negativo");
        }
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

    public void pagarTaxa(double taxa){
        if(saldo < taxa){
            throw new IllegalArgumentException("Erro ao processar pagamento: Saldo do titular " + titular + " menor que a taxa");
        }
        saldo -= taxa;
    }

}
