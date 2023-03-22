package org.example.office;

import java.util.ArrayList;
import java.util.List;

public class ListDepartment extends Department{

    private List<Tasks> tasks = new ArrayList<>();


    public ListDepartment(String nameDepartment) {
        super(nameDepartment);
    }

    @Override
    public void runTask() {

        tasks.get(0);
        tasks.remove(0);

    }
}
