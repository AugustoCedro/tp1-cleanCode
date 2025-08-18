package ex9;

public class Processador {
    public void executarTarefa(String tarefa) {
        if (!tarefa.isEmpty()) {
            System.out.println("Processando: " + tarefa);
        }
    }
}