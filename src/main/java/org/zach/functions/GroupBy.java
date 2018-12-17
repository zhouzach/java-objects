package org.zach.functions;

import org.zach.model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupBy {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        Item item = new Item("red", 12);
        items.add(item);

        items
                .stream()
                .collect(Collectors.groupingBy(Item::getDescription))
                .forEach((key, reportList) -> {
                    ArrayList<Object> objects = new ArrayList<>();
                    Integer register = reportList.stream().map(Item::getPartNumber).mapToInt(Integer::intValue).sum();
                    objects.add(register);
                });
    }
}
