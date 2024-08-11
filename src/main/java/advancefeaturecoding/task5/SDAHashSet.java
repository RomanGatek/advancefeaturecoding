package advancefeaturecoding.task5;

import java.util.LinkedList;


public class SDAHashSet<E> {
    private static final int INITIAL_CAPACITY = 20;
    private static final float LOAD_FACTOR = 0.75f;
    private LinkedList<E>[] table;
    private int size;

    public SDAHashSet() {
        table = (LinkedList<E>[]) new LinkedList[INITIAL_CAPACITY];
        size = 0;
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(E element) {
        return (element.hashCode() & Integer.MAX_VALUE) % table.length;

    }

    private void resize() {
        LinkedList<E>[] oldTable = table;
        table = (LinkedList<E>[]) new LinkedList[oldTable.length * 2];
        size = 0;

        for (LinkedList<E> bucket : oldTable) {
            if (bucket != null) {
                for (E element : bucket) {
                    add(element);
                }
            }
        }
    }


    public boolean add(E element) {
        if ((float) size / table.length > LOAD_FACTOR) {
            resize();
        }

        int index = hash(element);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        LinkedList<E> bucket = table[index];

        if (bucket.contains(element)) {
            return false;

        }

        bucket.add(element);
        size++;
        return true;

    }

    public boolean remove(E element) {
        int index = hash(element);
        LinkedList<E> bucket = table[index];

        if (bucket !=null && bucket.remove(element)) {
            size--;
            return true;
        }

        return false;
    }

    public boolean contains(E element) {
        int index = hash(element);
        LinkedList<E> bucket = table[index];
        return bucket !=null && bucket.contains(element);
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                table[i].clear();
            }

        }
        size = 0;
    }
}
