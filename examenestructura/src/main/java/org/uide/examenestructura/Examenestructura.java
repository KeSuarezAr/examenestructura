package org.uide.examenestructura;

public class Examenestructura {

    public static void main(String[] args) {
        Tareas tareas = new Tareas();

        tareas.addTareaToList(new Tarea("Tarea 1", "Primera Tarea"));
        tareas.addTareaToList(new Tarea("Tarea 2", "Segunda Tarea"));
        tareas.addTareaToQueue(new Tarea("Tarea 3", "Tercera Tarea"));
        tareas.addTareaToQueue(new Tarea("Tarea 4", "Cuarta Tarea"));
        tareas.addTareaToStack(new Tarea("Tarea 5", "Quinta Tarea"));
        tareas.addTareaToStack(new Tarea("Tarea 6", "Sexta Tarea"));

        System.out.println(tareas.returnQueue());
        System.out.println(tareas.returnStack());
        System.out.println(tareas.returnList());
        System.out.println(tareas.returnAll());
    }
}