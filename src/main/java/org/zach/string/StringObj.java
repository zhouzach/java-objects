package org.zach.string;

import java.util.Arrays;

public class StringObj {

    public static void printLength() {
        String p = "";
        String[] shell = new String[]{"hello", p};
        System.out.println(p);
        System.out.println(shell.length);
        System.out.println(Arrays.toString(shell));

    }

    public static void equals() {
        String s1 = "abc";
        System.out.println(s1 == "abc");
        System.out.println(s1.equals(new String("abc")));

        System.out.println(s1 == new String("abc"));
        System.out.println(s1.equals(new String("abc")));
    }

    public static void subString(){
        String mon = "20190102".substring(4,6);
        System.out.println(mon);

    }
    public static void main(String[] args) {

//        printLength();

//        equals();

        subString();

    }
}
