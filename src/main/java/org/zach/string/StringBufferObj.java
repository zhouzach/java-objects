package org.zach.string;

public class StringBufferObj {
    public static void main (String[] args) {
        StringBuffer sb = new StringBuffer(100);
        sb.append("a");
        sb.append("hello");
        System.out.println(sb.toString());

        sb.insert(2, "java");
        System.out.println(sb.toString());


        StringBuilder sbd = new StringBuilder(100);
        sbd.append("a");
        sbd.append("hello");
        System.out.println(sbd.toString());

        sbd.insert(2, "java");
        System.out.println(sbd.toString());
    }
}
