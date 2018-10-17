package org.zach.fundamentals;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Comparable {

    public static void main(String[] args) {
        // BigDecimal whose compareTo method is inconsistent with equals:
        // 1.the two BigDecimal instances added to the HashSet are unequal when compared using the equals method
        // 2. however, the two BigDecimal instances added to the TreeSet are equal when compared using the compareTo method
        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("1.00");

        Set<BigDecimal> s1 = new HashSet<>(5);
        s1.add(bd1);
        s1.add(bd2);
        s1.forEach(System.out::println);

        System.out.println("-------------------");
        TreeSet s2 = new TreeSet<BigDecimal>();
        s2.add(bd1);
        s2.add(bd2);
        s2.forEach(System.out::println);

    }
}
