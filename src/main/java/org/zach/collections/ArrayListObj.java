package org.zach.collections;

import java.util.*;

public class ArrayListObj {

    public static void init(){
        Collection<String> c = new ArrayList<>(10);
        c.add("hello");
        c.add("collection");
        c.add("!");

        Iterator<String> it = c.iterator();
        it.next();
        it.remove();
        it.next();
        it.remove();
        c.iterator().forEachRemaining(System.out::println);
        c.forEach(System.out::println);


        Integer[] arr = new Integer[] {1, 2};

        List<Integer> list = new ArrayList<>(5);
        list.forEach(System.out::print);
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        List<String> strings = new ArrayList<String>(Arrays.asList("foo", "bar", "baz"));
        System.out.println("strings length:" + strings.size());
        strings.add("meixi");
        System.out.println("strings length:" + strings.size());

        List<String> strList = Arrays.asList("foo", "bar", "baz");
        System.out.println("strList length:" + strList.size());
        //UnsupportedOperationException
//        strList.add("m");
        strList.get(0);
        System.out.println("strList length:" + strList.get(0));


        List<Object> objects = new ArrayList<>();
        objects.add("hello");
        objects.add(3);
        objects.forEach(System.out::println);

        List<List<Object>> lists = new ArrayList<>();
        lists.add(objects);

    }
    public static void main(String[] args) {
        modify();
    }

    public static void modify(){
        byte[] b = new byte[]{'a','a'};

        b[1]++;
        System.out.println(Arrays.toString(b));

        Integer[] num = new Integer[]{1,2};
        num[1]++;
        System.out.println(Arrays.toString(num));

    }
}
