package org.zach;

import org.zach.model.Item;

public class Main {
    public static void main(String[] args) {
//        Item item = new Item("red", 12);
//        System.out.println(item);

        StringBuilder sb = new StringBuilder();
        sb.append("we are code");
        sb.append("in china");
        String ss =sb.toString().replaceAll("are", "123"+"table");
        System.out.println(ss);
        System.out.println(sb.toString());

        String mon = "20190102".substring(4,6);
        System.out.println(mon);


        int i = 2 < 12 ? 2 : 12;
        System.out.println(i);
    }
}
