package org.example.office;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private String nameOffice;

    @Override
    public String toString() {
        return "Office{" +
                "nameOffice='" + nameOffice + '\'' +
                ", departments=" + departments +
                '}';
    }

    private List<Department> departments = new ArrayList<>();

    public Office(String nameOffice) {
        this.nameOffice = nameOffice;
    }

    public String getNameOffice() {
        return nameOffice;
    }

    public void setNameOffice(String nameOffice) {
        this.nameOffice = nameOffice;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
