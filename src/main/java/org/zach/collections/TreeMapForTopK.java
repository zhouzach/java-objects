package org.zach.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TreeMapForTopK {

    public static class WordCount implements Comparable<WordCount> {
        private String word;
        private int count;

        public WordCount(String w, int c) {
            word = w;
            count = c;
        }

        @Override
        public int compareTo(WordCount o) {
            return o.count - this.count;
        }

        @Override
        public String toString() {
            return "WordCount{" +
                    "word='" + word + '\'' +
                    ", count=" + count +
                    '}';
        }
    }

    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();

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

            Map<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
            });
            for (Map.Entry<String, Integer> entry : hm.entrySet())
                tm.put(entry.getValue(), entry.getKey());

            int n = 1;
            for (Map.Entry<Integer, String> entry : tm.entrySet()) {
                if (n > 4) break;
                System.out.println(entry.getValue() + " : " + entry.getKey());
                n++;
            }
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
