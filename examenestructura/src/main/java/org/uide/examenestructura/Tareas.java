package org.uide.examenestructura;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase Tareas.
 */
public class Tareas {
    private Stack<Tarea> tareaStack;
    private Queue<Tarea> tareaQueue;
    private LinkedList<Tarea> tareaList;

    /**
     * Constructor de la clase Tareas.
     */
    public Tareas() {
        tareaStack = new Stack<>();
        tareaQueue = new LinkedList<>();
        tareaList = new LinkedList<>();
    }

    /**
     * Agrega una tarea a la pila.
     * 
     * @param tarea.
     * 
     * @see Tarea
     */
    public void addTareaToStack(Tarea tarea) {
        tareaStack.push(tarea);
    }

    /**
     * Agrega una tarea a la cola.
     * 
     * @param tarea.
     * 
     * @see Tarea
     */
    public void addTareaToQueue(Tarea tarea) {
        tareaQueue.add(tarea);
    }

    /**
     * Agrega una tarea a la lista.
     * 
     * @param tarea.
     * 
     * @see Tarea
     */
    public void addTareaToList(Tarea tarea) {
        tareaList.add(tarea);
    }

    /**
     * Remueve una tarea de la pila.
     * 
     * @param tareaName.
     */
    public void removeTareaFromStack(String tareaName) {
        Stack<Tarea> tempStack = new Stack<>();
        while (!tareaStack.isEmpty()) {
            Tarea tarea = tareaStack.pop();
            if (!tarea.getName().equals(tareaName)) {
                tempStack.push(tarea);
            }
        }
        while (!tempStack.isEmpty()) {
            tareaStack.push(tempStack.pop());
        }
    }

    /**
     * Remueve una tarea de la cola.
     * 
     * @param tareaName.
     */
    public void removeTareaFromQueue(String tareaName) {
        Queue<Tarea> tempQueue = new LinkedList<>();
        while (!tareaQueue.isEmpty()) {
            Tarea tarea = tareaQueue.poll();
            if (!tarea.getName().equals(tareaName)) {
                tempQueue.add(tarea);
            }
        }
        while (!tempQueue.isEmpty()) {
            tareaQueue.add(tempQueue.poll());
        }
    }

    /**
     * Remueve una tarea de la lista.
     * 
     * @param tareaName.
     */
    public void removeTareaFromList(String tareaName) {
        tareaList.removeIf(tarea -> tarea.getName().equals(tareaName));
    }

    /**
     * Retorna una pila de tareas.
     * 
     * @return List<Tarea>.
     * 
     * @see Tarea
     */
    public List<Tarea> returnStack() {
        List<Tarea> stackList = new Stack<>();
        for (Tarea tarea : tareaStack) {
            stackList.add(tarea);
        }
        return stackList;
    }

    /**
     * Retorna una cola de tareas.
     * 
     * @return List<Tarea>.
     * 
     * @see Tarea
     */
    public List<Tarea> returnQueue() {
        List<Tarea> queueList = new LinkedList<>();
        for (Tarea tarea : tareaQueue) {
            System.out.println(tarea.getName());
        }
        return queueList;
    }

    /**
     * Retorna una lista de tareas.
     * 
     * @return List<Tarea>.
     * 
     * @see Tarea
     */
    public List<Tarea> returnList() {
        List<Tarea> list = new LinkedList<>();
        for (Tarea tarea : tareaList) {
            list.add(tarea);
        }
        return list;
    }

    /**
     * Retorna todas las tareas de todos los tipos.
     * 
     * @return List<Tarea>.
     * 
     * @see Tarea
     */
    public List<Tarea> returnAll() {
        List<Tarea> list = new LinkedList<>();
        for (Tarea tarea : tareaList) {
            list.add(tarea);
        }
        for (Tarea tarea : tareaQueue) {
            list.add(tarea);
        }
        for (Tarea tarea : tareaStack) {
            list.add(tarea);
        }
        return list;
    }
}

class Tarea {
    private String name;
    private String description;

    public Tarea(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Retorna el nombre y la descripción de la tarea.
     * 
     * @return String.
     */
    @Override
    public String toString() {
        return name + ": " + description;
    }
}
