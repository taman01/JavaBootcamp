package org.example.lesson5;

public class QueueSimple {

    static int[] array = new int[10];
    static int head = 0;
    static int tail = -1;

    static void enqueue(int number) {
        array[tail + 1] = number;
        tail++;
    }

    static int dequeue() {
        if (head <= tail) {
            int result = array[head];
            head++;
            return result;
        } else {
            System.out.println("Очередь пуста");
            return 0;
        }
    }

    public static void main(String[] args) {
        enqueue(5);
        enqueue(3);
        enqueue(1);
        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
    }
}
