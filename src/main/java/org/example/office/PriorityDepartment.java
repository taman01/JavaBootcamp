package org.example.office;

import java.util.PriorityQueue;

public class PriorityDepartment extends Department{

    private PriorityQueue<Tasks> queueTasks = new PriorityQueue<>();

    public PriorityDepartment(String nameDepartment) {
        super(nameDepartment);
    }

    @Override
    public void runTask() {
        queueTasks.poll();

    }
}
