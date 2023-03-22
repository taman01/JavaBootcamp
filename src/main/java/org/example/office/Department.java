package org.example.office;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Department {
    private final String nameDepartment;

    @Override
    public String toString() {
        return "Department{" +
                "nameDepartment='" + nameDepartment + '\'' +
                '}';
    }

    public Department(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public abstract void runTask();

    public String getNameDepartment() {
        return nameDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return nameDepartment.equals(that.nameDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDepartment);
    }
}
