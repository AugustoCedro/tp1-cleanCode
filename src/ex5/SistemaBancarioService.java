package ex5;

public class SistemaBancarioService {



    public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("Valor de transferência menor ou igual a 0");
        }
        contaOrigem.transferirValor(valor);
        contaDestino.receberValor(valor);
        System.out.println("Transferência realizada com sucesso");

    }

}
