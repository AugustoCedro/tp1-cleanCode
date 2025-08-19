package ex1;

import java.util.ArrayList;
import java.util.List;

public class SistemaFinanceiro {
    private List<Conta> contas;

    public SistemaFinanceiro() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(String titular, double saldoInicial) {
        contas.add(new Conta(titular,saldoInicial));
    }

    public void gerarRelatorio() {
        System.out.println("== Relatório Financeiro ===");
        for(Conta conta : contas){
            System.out.println("Conta: " + conta.getTitular() + " - Saldo: " + conta.getSaldo());
        }
    }

    public void processarPagamentos(double taxa) {
        for(Conta conta : contas){
            conta.pagarTaxa(taxa);
        }
    }
}
//Separacao de responsabilidades, separar contas e valores que são dados interligados em duas listas diferentes é um problema
//Nomes de métodos e parametros pouco descritivos
//Não trata as excecoes