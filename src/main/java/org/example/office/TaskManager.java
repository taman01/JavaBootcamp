package org.example.office;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager {

    Map<Department, List<Tasks>> map = new HashMap<>();

    Map<Tasks, Department> mapTasksToDepartment = new HashMap<>();

    void addTask (Department department, List<Tasks> tasks){
        for (Tasks task:tasks) {
            mapTasksToDepartment.put(task,department);
        }

        map.put(department,tasks);

    }

    public List<Tasks> getTask(Department department){


        return map.get(department);
    }

    public Department getDepartment(Tasks task){
        return mapTasksToDepartment.get(task);
    }

}
