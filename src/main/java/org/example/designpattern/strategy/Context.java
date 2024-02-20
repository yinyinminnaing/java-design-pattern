package org.example.designpattern.strategy;

public class Context {
     SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy){
        this.sortStrategy=sortStrategy;
    }

    public SortStrategy getSortStrategy() {
        return sortStrategy;
    }

    public void sort(){
        this.sortStrategy.sort();
    }
}
