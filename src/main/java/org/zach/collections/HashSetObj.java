package org.zach.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetObj {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();

        try(Scanner in = new Scanner(System.in)) {
            System.out.println("please enter some words:");

            //run the program in intellij on mac, command + d to break while loop
            while (in.hasNext()) {
                words.add(in.next());
            }
        }

        words.forEach(System.out::println);
    }
}
