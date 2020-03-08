package org.zach.io;

public class Printf {
    public static void main(String[] args){
        printByte();

    }

    public static void printByte(){
        byte a = 'a';
        byte b = 'a';
        System.out.printf("%d,%c",a,b);
    }
}
