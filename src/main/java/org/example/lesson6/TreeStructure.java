package org.example.lesson6;

public class TreeStructure {

    static int[] array = new int[10];
    static int[] left = new int[10];
    static int[] right = new int[10];
    static int root = -1;

    static int index = 0;

    static void addElement (int element) {
        if (root == -1) {
            root = index;
            array[index] = element;
            left[index] = -1;
            right[index] = -1;
            index++;
        }else {
            array[index] = element;
            left[index] = -1;
            right[index] = -1;
            if (array[root] > element){
                //Элемент слева от корневого
                if(left[root] == -1){
                    left[root] = index;
                }

            }

        }


    }

}

