package javaapplication27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Task implements Comparable<Task>{
    private String popis;
    private static ArrayList<Task> tasks = new ArrayList<>();

    public Task(String popis) {
        this.popis = popis;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public static ArrayList<Task> getTasks() {
        return tasks;
    }

    public static void setTasks(ArrayList<Task> tasks) {
        Task.tasks = tasks;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.popis);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Task other = (Task) obj;
        return Objects.equals(this.popis, other.popis);
    }

    @Override
    public String toString() {
        return "Task{" + "popis=" + popis + '}';
    }

    @Override
    public int compareTo(Task o) {
        int i = this.popis.compareTo(o.getPopis());
        return i;
    }
    
    
    public static void addToList(Task task){
        Task.tasks.add(task);
    }
    
    public static void show(){
        for (Task t : Task.tasks){
            System.out.println(t);
        }
    }
    
    public static void sort(){
        Collections.sort(Task.tasks);
    }
}
