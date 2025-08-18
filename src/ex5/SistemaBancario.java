package ex5;

import java.util.ArrayList;
import java.util.List;

public class SistemaBancario implements ISistemaBancario{
    private List<Conta> contas;
    private static SistemaBancarioService service;

    public SistemaBancario(SistemaBancarioService service) {
        contas = new ArrayList<>();
    }

    public void criarConta(String titular, double saldoInicial) {
        contas.add(new Conta(titular,saldoInicial));
    }

    public Conta buscarConta(String titular) throws ClassNotFoundException {
        for(Conta conta : contas){
            if(conta.getTitular() == titular){
                return conta;
            }
        }
        throw new ClassNotFoundException("Conta com o titular: " + titular + " não encontrada");
    }

    public void transferir(String titularOrigem, String titularDestino, double valor){
        try{
            Conta contaOrigem = buscarConta(titularOrigem);
            Conta contaDestino = buscarConta(titularDestino);
            service.transferir(contaOrigem,contaDestino,valor);
            System.out.println("Transferência realizada com sucesso");
        }catch (Exception e){
            System.out.println("Erro na transferência: " + e.getMessage());
        }
    }

}