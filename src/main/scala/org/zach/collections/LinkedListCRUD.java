package org.zach.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListCRUD {

    public static void main(String[] args) {
        List<String> aList = new LinkedList<>();
        aList.add("a");
        aList.add("b");
        aList.add("c");

        List<String> bList = new LinkedList<>();
        bList.add("1");
        bList.add("2");
        bList.add("3");
        bList.add("4");
        bList.add("5");

        //merge the words from b into a
        ListIterator<String> aIter = aList.listIterator();
        Iterator<String> bIter = bList.iterator();
        while (bIter.hasNext()) {
            if(aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println("aList:");
        System.out.println(aList);
        System.out.println();
        System.out.println("bList:");
        System.out.println(bList);

        //remove every second word from b
        bIter = bList.iterator();
        while (bIter.hasNext()) {
            bIter.next();
            if (bIter.hasNext()) {
                bIter.next();
                bIter.remove();
            }
        }

        System.out.println();
        System.out.println("bList:");
        System.out.println(bList);

        //bulk operation: remove all words in b from a
        aList.removeAll(bList);

        System.out.println();
        System.out.println("aList:");
        System.out.println(aList);

    }
}
