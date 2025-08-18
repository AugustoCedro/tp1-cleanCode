package ex4;

import java.util.ArrayList;
import java.util.List;

//Os principais problemas da separação de resposabilidade é a duplicação de código, que deve ocorrer nas duas variáveis para que não ocorra um erro,
// e a complexidade e cuidado desnecessario a mais que a aplicação vai ter por não possuir uma classe que agrupe essas variaveis

public class SistemaBiblioteca {
    private List<Livro> livros;

    public SistemaBiblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo) {
        livros.add(new Livro(titulo));
    }

    public void emprestarLivro(String titulo) {
        for(Livro livro : livros){
            if(livro.getTitulo() == titulo && livro.getDisponibilidade()){
                livro.setDisponibilidade(false);
                System.out.println("Livro emprestado: " + titulo);
                return;
            }
        }
        System.out.println("Livro " + titulo + " não disponível.");
    }

    public void devolverLivro(String titulo) {
        for(Livro livro : livros){
            if(livro.getTitulo() == titulo){
                livro.setDisponibilidade(true);
                System.out.println("Livro devolvido: " + titulo);
                return;
            }
        }
        System.out.println("Livro " + titulo + " não encontrado.");
    }
}