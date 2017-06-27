package org.zach.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueObj {
    public static void main(String[] args) {
        //create big heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        pq.add(3);
        pq.add(2);
        pq.add(1);
        pq.add(6);
        pq.add(4);
        pq.add(5);

        System.out.println(pq.peek());
        for (Integer i : pq) {
            System.out.println(i);
        }

        System.out.println(pq.poll());
    }
}
