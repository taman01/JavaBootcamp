package org.example.lesson10;

import java.util.ArrayList;
import java.util.List;

public class SetCollection implements Set{

    private final List container = new ArrayList<>();


    @Override
    public boolean add(Object elem) {
     //   if (container.contains(elem))
        return false;
    }

    @Override
    public boolean contains(Object elem) {
        return false;
    }

    @Override
    public boolean remove(Object elem) {
        return false;
    }
}
