package edu.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void add(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void remove(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();

        for (Tarefa t : tarefas) {//Se tiver elementos repetidos so o .remove() nao identificaria
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(t);
            }
        }

        tarefas.removeAll(tarefasRemover);
    }

    public int totalTarefas() {
        return tarefas.size();
    }

    public void listaTarefas() {
        for (Tarefa t : tarefas) {
            System.out.println(String.valueOf(t));
        }
    }
}
