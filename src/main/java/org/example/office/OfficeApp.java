package org.example.office;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OfficeApp {

    public static void main(String[] args) {
        Office office = new Office("Otus");
        Department listDepartment = new ListDepartment("Teachers");
        Department priorityDepartment = new PriorityDepartment("Students");
        List<Department> departments = Arrays.asList(listDepartment, priorityDepartment);
        office.setDepartments(departments);

        Tasks task1 = new Tasks("task1",1);
        Tasks task2 = new Tasks("task2",2);
        Tasks task3 = new Tasks("task3",3);
        Tasks task4 = new Tasks("task4",4);
        Tasks task5 = new Tasks("task5",5);
        Tasks task6 = new Tasks("task6",6);

        TaskManager taskManager = new TaskManager();
        taskManager.addTask(listDepartment,Arrays.asList(task1,task2,task3));
        taskManager.addTask(priorityDepartment,Arrays.asList(task4,task5,task6));

        List<Tasks> tasks = taskManager.getTask(listDepartment);
        System.out.println(tasks);

        Department userInput = new ListDepartment("Teachers");
        List<Tasks> taskForId = taskManager.getTask(userInput);
        System.out.println(taskForId);
        Tasks searchTask = new Tasks("task2",2);
        Department department = taskManager.getDepartment(searchTask);
        System.out.println(department);
    }

}
