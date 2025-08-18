package ex6;

import java.util.List;

public class RelatorioFinanceiro {

    private List<Cliente> clientes;

    public void gerarRelatorio(List<Cliente> clientes) {
        gerarCabecalho();
        gerarClientes();
        gerarRodape();
    }

    public void gerarCabecalho(){
        System.out.println("=== Relatório Financeiro ===");
    }

    public void gerarClientes(){
        for(Cliente cliente : clientes){
            System.out.println("Cliente: " + cliente.getNome() + " - Saldo: R$ " + cliente.getSaldo());
        }
    }

    public void gerarRodape(){
        System.out.println("=========================");
        System.out.println("Fim do Relatório");
    }


}

