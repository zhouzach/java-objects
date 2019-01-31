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
    }
}
