package test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        Long start = System.currentTimeMillis();
        for (int i=0;i<5000000;i++){
            arrayList.add(i);
        }
        Long end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println("------------------------------");
        LinkedList<Integer> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i=0;i<5000000;i++){
            linkedList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println("--------------------------------------------------");
        start = System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            arrayList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println("--------------------------------------------------");
        start = System.currentTimeMillis();

                linkedList.get(10000);
                System.out.println(System.currentTimeMillis()-start);

        end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println("--------------------------------------------------");
        start = System.currentTimeMillis();
        arrayList.remove(0);
        end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println("--------------------------------------------------");
        start = System.currentTimeMillis();
        linkedList.removeLast();
        end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
