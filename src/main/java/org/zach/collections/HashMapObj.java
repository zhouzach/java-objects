package org.zach.collections;

import java.util.HashMap;

public class HashMapObj {
    public static void main(String[] args) {
        HashMap<String, Long> discountCountMap = new HashMap<>();
        discountCountMap.put("d",3L);
        discountCountMap.put("d",6L);

        Object[] keys = discountCountMap.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            System.out.print(keys[i]);
            System.out.println(discountCountMap.get(keys[i]));
        }
    }
}
