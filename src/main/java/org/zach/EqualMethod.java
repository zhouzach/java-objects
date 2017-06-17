package org.zach;

public class EqualMethod {

    public static void main(String[] args) {
        String a1 = "a";
        String a2 = "a";
        //print true
        System.out.println(a1 == a2);

        String str1 = new String("s");
        String str2 = new String("s");
        //print false
        System.out.println(str1 == str2);

        //print true
        System.out.println(str1.equals(str2));
    }
}
