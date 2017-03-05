package org.zach;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter("/Users/zach/java-objects/out.txt")
        ){
            while (in.hasNext())
                out.println(in.next().toUpperCase());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
