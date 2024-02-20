package org.example;

import org.example.designpattern.strategy.Context;
import org.example.designpattern.strategy.MergeSort;

import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        // Strategy Design Pattern Use Case
        Context context=new Context();
        context.setSortStrategy(new MergeSort());
        context.sort();




    }
}
