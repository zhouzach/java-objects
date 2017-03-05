package org.zach.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
    }
}
