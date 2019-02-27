package org.zach.string;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.stream.Collectors;

public class StringBuilderObj {

    public String concatenate(List<String> list) {
        StringBuilder builder = new StringBuilder();
        if(!list.isEmpty()){
            builder.append(list.get(0));
            for(int i = 1; i < list.size(); i++){
                builder.append(",").append(list.get(i));
            }

        }
        return builder.toString();
    }

    public String concatenate4List(List<String> list){
        return list.stream().collect(Collectors.joining(":"));
    }

    public String stringJoin(List<String> list){
        return String.join(":", list);
    }

    public static void main (String[] args) {
        StringBuffer sb = new StringBuffer(100);
        sb.append("a");
        sb.append("hello");
        System.out.println(sb.toString());

        sb.insert(2, "java");
        System.out.println(sb.toString());


        StringBuilder sbd = new StringBuilder(100);
        sbd.append("a");
        sbd.append("hello");
        System.out.println(sbd.toString());

        sbd.insert(2, "java");
        System.out.println(sbd.toString());

        List<String> list = ImmutableList.of("init", "list");
        StringBuilderObj builder = new StringBuilderObj();
        String string = builder.concatenate4List(list);
        System.out.println(string);

        String str = builder.stringJoin(list);
        System.out.println(str);

    }


}
