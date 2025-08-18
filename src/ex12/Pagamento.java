package ex12;

public class Pagamento {
    public void processarPagamento(double valor, String metodo) {
        if(valor <= 0){
            throw new ValorInvalidoException("ERROR: Valor de pagamento inválido");
        }

        switch (metodo){
            case "cartão":
                System.out.println("Pagamento de R$" + valor + " realizado via cartão.");
                break;
            case "boleto":
                System.out.println("Pagamento de R$" + valor + " realizado via boleto.");
                break;
            default:
                throw new MetodoInvalidoException("ERROR: Método de pagamento inválido");
        }
    }
}