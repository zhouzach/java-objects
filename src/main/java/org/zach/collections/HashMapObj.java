package org.zach.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapObj {
    public static void main(String[] args) {
        HashMap<String, Long> map = new HashMap<>();
        map.put("d ",3L);

        map.put("b ",6L);
        map.put("h ",6L);
        map.put("j ",5L);
        map.put("z ",5L);

        Object[] keys = map.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            System.out.print(keys[i]);
            System.out.println(map.get(keys[i]));
        }


        System.out.println("-------------");
        Iterator<Map.Entry<String, Long>> iterator = map.entrySet().iterator();
        Map.Entry<String, Long> first = iterator.next();
        iterator.forEachRemaining(stringLongEntry -> {
            System.out.print(stringLongEntry.getKey());
            System.out.println(stringLongEntry.getValue());


        });
        System.out.println("-------------");

        while (iterator.hasNext()) {
            Map.Entry<String, Long> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
