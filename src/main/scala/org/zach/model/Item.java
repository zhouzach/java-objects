package org.zach.model;

import java.util.Objects;

public class Item implements Comparable<Item> {
    private String description;
    private Integer partNumber;

    public Item(String aDescription, Integer aPartNumber) {
        description = aDescription;
        partNumber = aPartNumber;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public String getDescription() {
        return description;
    }

    public int hashCode() {
        Objects.equals(1,2);
        return Objects.hash(description, partNumber);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (getClass() != o.getClass()) return false;
        Item aItem = (Item) o;
        return Objects.equals(partNumber, aItem.partNumber) && description.equals(aItem.description);
    }

    @Override
    public int compareTo(Item o) {
        Integer diff = Integer.compare(partNumber, o.partNumber);
        return diff != 0 ? diff : description.compareTo(o.description);
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", partNumber=" + partNumber +
                '}';
    }
}
