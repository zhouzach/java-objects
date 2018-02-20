package org.zach.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zach on 2018/2/13.
 */
public class ArrayObj {

    public static void main(String[] agrs) {

        Integer[] arr = new Integer[] {1, 2};

        List<Integer> list = new ArrayList<>(5);
        list.forEach(System.out::print);
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
