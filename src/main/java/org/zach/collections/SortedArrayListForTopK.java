package org.zach.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SortedArrayListForTopK {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("words.txt"));

            String line = br.readLine();
            while (line != null) {

                String[] words = line.split(" ");
                for (String word : words) {
                    if(hm.containsKey(word)) {
                        hm.put(word, hm.get(word) + 1);
                    } else hm.put(word, 1);
                }

                line = br.readLine();
            }

            List<Map.Entry<String, Integer>> list = new ArrayList<>(hm.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });

            for (int i = 0; i < 4; i++)
                System.out.println(list.get(i).getKey() + " : " + list.get(i).getValue());


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
