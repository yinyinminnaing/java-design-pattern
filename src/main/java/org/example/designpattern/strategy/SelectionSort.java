package org.example.designpattern.strategy;

public class SelectionSort implements SortStrategy{
    @Override
    public void sort() {
        System.out.println("This is SelectionSort Algorithm");
    }
}
