package org.zach.string;

import java.util.Arrays;

public class StringTester {
    public static void main(String[] args) {
        String p ="";
        String[] shell = new String[]{"hello", p};
//        System.out.println(p);
//        System.out.println(shell.length);
//        System.out.println(Arrays.toString(shell));
//
        StringBuilder builder = new StringBuilder();
        builder.append("a").append("b");
        System.out.println(builder.toString());
        System.out.println("-------");
        builder.setLength(0);
        System.out.println(builder.toString());


    }
}
