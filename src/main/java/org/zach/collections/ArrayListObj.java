package org.zach.collections;

import java.util.*;

public class ArrayListObj {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>(10);
        c.add("hello");
        c.add("collection");
        c.add("!");

        Iterator<String> it = c.iterator();
        it.next();
        it.remove();
        it.next();
        it.remove();
        c.iterator().forEachRemaining(System.out::println);
        c.forEach(System.out::println);


        Integer[] arr = new Integer[] {1, 2};

        List<Integer> list = new ArrayList<>(5);
        list.forEach(System.out::print);
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        List<String> strings = new ArrayList<String>(Arrays.asList("foo", "bar", "baz"));
        List<String> s = Arrays.asList("foo", "bar", "baz");
    }
}
