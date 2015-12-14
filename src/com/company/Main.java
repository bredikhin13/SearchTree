package com.company;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        NCSearchTree<Integer, String> ncSearchTree = new NCSearchTree<>();
        ncSearchTree.add(10,"b");
        ncSearchTree.add(5,"a");
        ncSearchTree.add(16,"a");
        ncSearchTree.add(8,"c");
        ncSearchTree.add(12,"a");
        ncSearchTree.add(4,"a");
        ncSearchTree.add(17,"a");
        NCSearchTree<SomeClass,String> ncSearchTree2 = new NCSearchTree<>(new Comparator<SomeClass>() {
            @Override
            public int compare(SomeClass o1, SomeClass o2) {
                if(o1.val == o2.val){
                    return 0;
                }
                if(o1.val>o2.val){
                    return 1;
                } else return -1;
            }
        }
        );
        ncSearchTree2.add(new SomeClass("a",10),"a");
        ncSearchTree2.add(new SomeClass("a",5),"a");
        ncSearchTree2.add(new SomeClass("a",16),"a");
        ncSearchTree2.add(new SomeClass("a",8),"a");
        ncSearchTree2.add(new SomeClass("a",12),"a");
        ncSearchTree2.add(new SomeClass("a",4),"a");
        ncSearchTree2.add(new SomeClass("a",17),"a");

        NCSearchTree<SomeClass2,String> ncSearchTree3 = new NCSearchTree<>();
        ncSearchTree3.add(new SomeClass2("a",1),"a");
    //    ncSearchTree3.add(new SomeClass2("a",2),"a");
        System.out.println(ncSearchTree.getValue(10));
        System.out.println(ncSearchTree.getValue(8));
        //System.out.println(ncSearchTree.getValue(14));
        System.out.println("xxx");
    }
}
