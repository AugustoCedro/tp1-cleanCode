package ex2;

public class Processador {
    public void processar(String dado) {
        if(dado.isEmpty()){
            throw new IllegalArgumentException("Erro ao processar dado: dado inválido");
        }
        if(isTamanhoDadoValido(dado)){
            System.out.println("Dado válido: " + dado);
        }else{
            System.out.println("Dado muito curto;");
        }
    }

    public boolean isTamanhoDadoValido(String dado){
        return dado.length() > 10;
    }


}

//Método dificil de entender, com diversos if e else
//dado != null && !dado.isEmpty() -> ocorre uma duplicacao de verificacao de nulo
//verificao engessada, dificil de modificar