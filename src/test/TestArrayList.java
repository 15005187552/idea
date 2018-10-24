package test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        for (int i=0;i<5;i++){
            list.add(String.valueOf(i));
        }

        List<String> subList = list.subList(1, 3);
        for (String s: subList){
            System.out.println(s);
        }
        System.out.println("------------------------------------------------");
        //sublist发生非结构性修改 ，映射到list变化
        subList.set(0,"new 0");
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("------------------------------------------------");
        //sublist发生结构性修改 ，映射到list变化
        subList.add(String.valueOf(2.5));
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("------------------------------------------------");
        //list发生非结构性修改 ，映射到sublist变化
        list.set(1,"new 1");
        for (String s: subList){
            System.out.println(s);
        }
        System.out.println("------------------------------------------------");
        //list发生结构性修改 ，映射到sublist会使得sublist出现undefine转态
        list.remove("new 1");
        //list.add(String.valueOf(5));
        for (String s: subList){
            System.out.println(s);
        }
    }
}
