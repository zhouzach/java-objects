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

    public static void iterateByForEach(Map<String, String> map){
        map.forEach((k, v) -> {
            System.out.println(k + ":" + v);

        });
    }

    public static String mkStringByIterator(Map<String, String> map){
        StringBuilder builder = new StringBuilder();

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        Map.Entry<String, String> first = iterator.next();

        String firstData = first.getKey() + first.getValue();
        builder.append(firstData);

        iterator.forEachRemaining(entry -> {
            builder.append(" union ");
            String sql = "select t.*, '" + entry.getValue() + "' YEAR from " + entry.getKey();
            builder.append(sql);
        });

        return builder.toString();
    }


    public static String mkStringByForLoop(Map<String, String> map){
        StringBuilder builder = new StringBuilder();

        Object[] keys = map.keySet().toArray();

        String firstSql = "select t.*, '" + map.get(keys[0]) + "' YEAR from " + keys[0];
        builder.append(firstSql);

        for (int i = 1; i < keys.length; i++) {
            builder.append(" union ");

            String sql = "select t.*, '" + map.get(keys[i]) + "' FJJDM from " + keys[i];
            builder.append(sql);
        }

        return builder.toString();
    }
}
