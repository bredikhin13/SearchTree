package com.company;

/**
 * Created by User on 06.12.2015.
 */
public class NullComparatorException extends Exception {
    private Exception exception;
    public NullComparatorException(){};
    public NullComparatorException(Exception e){
        this.exception = e;
    }
    @Override
    public String getMessage() {
        return "Comparator is Null: "+exception.getMessage();
    }
}
