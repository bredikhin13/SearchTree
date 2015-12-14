package com.company;

/**
 * Created by User on 06.12.2015.
 */
public class SomeClass2 {
    public String name;
    public Integer val;
    public SomeClass2(String s, Integer v){
        this.name = s;
        this.val = v;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "val=" + val +
                '}';
    }
}
