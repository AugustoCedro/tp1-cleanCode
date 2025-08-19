package ex3;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        try{
            if(produto.getQuantidade() <= 0){
                throw new IllegalArgumentException();
            }
            produtos.add(produto);
        }catch (Exception e){
            System.out.println("Não foi possível adicionar o produto: " + produto.getNome() + ", sua quantidade não deve ser menor ou igual a 0");
        }
    }

    public void calcularPrecoTotal() {
        double total = 0;
        for(Produto produto : produtos){
            total += (produto.getPreco() * produto.getQuantidade());
        }
        System.out.println("Total da compra: R$ " + total);
    }
}
//Variaveis que são interligadas separadas em listas diferentes, o agrupamento delas em uma classe é uma boa pratica
//Nome do Método calculatorTotal não é um método com um nome esclaredor
//Deve retornar um erro se a quantidade do produto for 0;