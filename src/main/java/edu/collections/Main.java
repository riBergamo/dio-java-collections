package edu.collections;

import edu.collections.list.ListaTarefa;

public class Main {
    public static void main(String[] args) {
        ListaTarefa tarefas = new ListaTarefa();

        tarefas.add("Arrumar a mesa");
        tarefas.add("Limpar quarto");
        tarefas.add("Academia");

        tarefas.listaTarefas();

        System.out.println("-----------------------");
        tarefas.remove("Arrumar a mesa");

        tarefas.listaTarefas();
        System.out.println(tarefas.totalTarefas());
    }
}
