package org.example.lesson4;

public class SeaBattle {
    private static int [][] array = new int[10][10];

    public static void main(String[] args) {
        printField(array);
    }




    public static void printField(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(" " + arr[i][j] + " ");
            }

            System.out.println();
        }

    }


}
