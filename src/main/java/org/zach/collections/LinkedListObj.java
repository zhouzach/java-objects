package org.zach.collections;

import java.util.*;

public class LinkedListObj {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        ListIterator<Integer> iter = ll.listIterator();
        System.out.println("behind: " + iter.next() + ", add 20");
        iter.add(20);
        System.out.println("iterator is current front 2");

        // remove method has to be called after next method
        System.out.println("delete: " + iter.next());
        iter.remove();
        System.out.println("iterator is current front 3");
        System.out.println("List print:");
        ll.forEach(System.out::println);
        System.out.println();

        Integer oldValue = iter.previous();
        iter.set(202);
        System.out.println("iterator is current front 202");
        System.out.println("oldValue: " + oldValue);
        System.out.println("ListIterator print:");
        iter.forEachRemaining(System.out::println);
        System.out.println();

        iter.nextIndex();

        String str = ll.toString();
        System.out.println("str: " + str);
        System.out.println("list: " + ll);

       ListIterator<Integer> iter2 = ll.listIterator();
       iter2.forEachRemaining(System.out::println);
       Integer preIdx = iter2.previousIndex();
       System.out.println("previousIndex: " + preIdx);
       Integer nextIdx = iter2.nextIndex();
       System.out.println("nextIndex: " + nextIdx);


    }
}
