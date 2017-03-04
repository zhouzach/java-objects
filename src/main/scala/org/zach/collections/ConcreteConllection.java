package org.zach.collections;

import java.util.AbstractCollection;
import java.util.Iterator;

public class ConcreteConllection extends AbstractCollection<Integer>{
    Integer len;

    @Override
    public boolean contains(Object o) {
        Iterator<Integer> it = iterator();
        if (o == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (o.equals(it.next()))
                    return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {

        return null;
    }

    @Override
    public int size() {
        return len;
    }
}


class IntIterator implements Iterator<Integer> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return null;
    }
}
