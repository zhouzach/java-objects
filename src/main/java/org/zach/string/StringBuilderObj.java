package org.zach.string;

import java.util.List;
import java.util.stream.Collectors;

public class StringBuilderObj {

    public String concatenate(List<String> list) {
        StringBuilder builder = new StringBuilder();
        if (!list.isEmpty()) {
            builder.append(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                builder.append(",").append(list.get(i));
            }

        }
        return builder.toString();
    }

    public String concatenate4List(List<String> list) {
        return list.stream().collect(Collectors.joining(":"));
    }

    public String stringJoin(List<String> list) {
        return String.join(":", list);
    }

    public static void remove() {
        StringBuilder builder = new StringBuilder();
        builder.append("a").append("b");
        System.out.println(builder.toString());
        System.out.println("-------");
        builder.setLength(0);
        System.out.println(builder.toString());
    }

    public static void isEmpty() {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.toString().equals(""));
    }

    public static void insert(){
        StringBuffer sb = new StringBuffer(100);
        sb.append("a");
        sb.append("b");
        sb.append("hello");
        sb.append("world");
        sb.append("scala");
        System.out.println(sb.toString());
        sb.insert(4, "java");
        System.out.println(sb.toString());
    }

    public static void replaceAll(){
        StringBuilder sb = new StringBuilder();
        sb.append("we are code");
        sb.append("in china");
        String ss =sb.toString().replaceAll("are", "123"+"table");
        System.out.println(ss);
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
//        remove();
//        isEmpty();
//        insert();

        replaceAll();




//        List<String> list = ImmutableList.of("init", "list");
//        StringBuilderObj builder = new StringBuilderObj();
//        String string = builder.concatenate4List(list);
//        System.out.println(string);
//
//        String str = builder.stringJoin(list);
//        System.out.println(str);


    }


}
