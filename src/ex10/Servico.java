package ex10;

public class Servico {
    public void processar(String dado) {
        if(!dado.isEmpty()){
            System.out.println("Processando: " + dado.toUpperCase());
        }else{
            System.out.println("Erro ao processar dado: dado vazio");
        }
    }
}