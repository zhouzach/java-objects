package org.zach.random;

import java.util.Random;

public class RandomObj {

    public static void main(String[] args){
        Random rand = new Random();
        boolean b = rand.nextBoolean();
        System.out.println(b);

        int i = rand.nextInt();
        int i48 = rand.nextInt(48);
        System.out.println(i);
        System.out.println(i48);
    }
}
