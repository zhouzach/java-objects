package org.zach.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadFactory;


public class MapCopy {

    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("a", 1);

        Map<String, Integer> copy = Collections.unmodifiableMap(m);
        System.out.println(copy);

        m.replace("a", 10);
        System.out.println(copy);

    }
}
