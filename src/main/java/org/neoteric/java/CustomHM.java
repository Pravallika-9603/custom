package org.neoteric.java;

import static java.lang.System.exit;

public class CustomHM {

    private static final int DEFAULT_CAPACITY = 16;
    private Entry[] buckets;

    public CustomHM() {
        this.buckets = new Entry[DEFAULT_CAPACITY];
    }

    private int getBucketIndex(Object key) {
        return (key == null) ? 0 : Math.abs(key.hashCode() % buckets.length);
    }

    public void put(Object key, Object value) {
        Entry newEntry = new Entry(key, value);
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = newEntry;
        } else {
            Entry current = buckets[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newEntry;
        }

    }

    public Object get(Object key) {
        int index = getBucketIndex(key);
        Entry current = buckets[index];
        while (!current.key.equals(key) && current.next != null) {
            current = current.next;
        }
        if (current == null) {
            return "key not found";
            // return current.value;
        } else {
            return current.value;
        }

    }

    public void remove(Object key) {

        int index = getBucketIndex(key);
        Entry current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {

                buckets[index] = current.next;
                return;
            }
            current = current.next;
        }
        if (current == null) {
            System.out.println("key not fount");
        }
    }

}



