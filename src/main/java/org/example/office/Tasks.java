package org.example.office;

import java.util.Objects;

public class Tasks {

    private String nameTask;

    private int id;

    public Tasks(String nameTask, int id) {
        this.nameTask = nameTask;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "nameTask='" + nameTask + '\'' +
                ", id=" + id +
                '}';
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tasks tasks = (Tasks) o;
        return id == tasks.id && nameTask.equals(tasks.nameTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameTask, id);
    }
}
