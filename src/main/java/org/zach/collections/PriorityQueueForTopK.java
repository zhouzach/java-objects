package org.zach.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityQueueForTopK {

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

            /* PriorityQueue 是基于堆实现的优先级队列，默认是小顶堆
             * 由于WordCount的compareTo按降序排列，所以，pq是大顶堆
             */
            PriorityQueue<WordCount> pq = new PriorityQueue<>();

            for (Map.Entry<String, Integer> entry : hm.entrySet()) {
                WordCount wc = new WordCount(entry.getKey(), entry.getValue());
                pq.add(wc);
            }

            //输出频率最大的前3个单词
            for ( int i = 1; i <= 4; i++)
                System.out.println(pq.poll());

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
