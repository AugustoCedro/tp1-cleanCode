package ex5;

public interface ISistemaBancario {

    void criarConta(String titular, double saldoInicial);
    Conta buscarConta(String titular) throws ClassNotFoundException;
    void transferir(String titularOrigem, String titularDestino, double valor);
}
