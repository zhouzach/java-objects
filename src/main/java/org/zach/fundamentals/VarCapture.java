package org.zach.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class VarCapture {

    public static void main(String args[]) {
        int num = 10;

        MyFunc mylambda = (n) -> {
            int v = num + n;

            return v;
        };

        System.out.println(mylambda.func(8));

        List<Integer> l = new ArrayList<>(4);
        l.add(1);
        l.add(2);
        l.forEach(System.out::println);
    }
}

interface MyFunc {
    int func(int n);
}
