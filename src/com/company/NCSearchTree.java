package com.company;


import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by User on 01.12.2015.
 */
public class NCSearchTree<K, V> implements Iterable<V>, Serializable {

    private Comparator<K> comparator;

    public NCSearchTree() {
    }

    public NCSearchTree(Comparator<K> cmp) {
        this.comparator = cmp;
    }


    static class Node<K, V> {
        Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }

        public K getKey() {
            return key;
        }

        K key;
        V value;
        Node left, right;
    }

    Node<K, V> root = null;

    private Integer compareKey(K o1, K o2) throws NullComparatorException {
        Comparable key1, key2;
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            key1 = (Comparable) o1;
            key2 = (Comparable) o2;
            return key1.compareTo(key2);
        } else {
            try {
                return comparator.compare(o1, o2);
            } catch (Exception e) {
                throw new NullComparatorException(e);
            }
        }
    }

    public void delete(K key){
        
    }

    public V getValue(K key) throws NullPointerException {
        Node<K, V> cur = root;//указывать <K,V> всегда!!!!!!!!!!
        try {
            while (cur != null && compareKey(cur.key, key) != 0) {
                if (compareKey(cur.key, key) > 0) {
                    cur = cur.left;
                } else {
                    cur = cur.right;
                }
            }
        } catch (NullComparatorException e) {
            System.err.println(e.getMessage());
        }
        if (cur == null) {
            throw new NullPointerException("This key is not exist");
        } else {
            return cur.value;
        }

        //return null;
    }


    public void add(K k, V v) {
        if (root == null) {
            root = new Node<>(k, v);
            return;
        }
        Node<K, V> cur = root;
        Node<K, V> prev = null;
        try {

            while (cur != null) {
                prev = cur;
                if (compareKey(cur.key, k) > 0) {
                    cur = cur.left;
                } else {
                    cur = cur.right;
                }

            }
            if (compareKey(prev.key, k) > 0) {
                prev.left = new Node<>(k, v);
            } else {
                prev.right = new Node<>(k, v);
            }
        } catch (NullComparatorException e) {
            System.err.println(e.getMessage());
        }

    }

    @Override
    public Iterator<V> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super V> action) {

    }

    @Override
    public Spliterator<V> spliterator() {
        return null;
    }
}
