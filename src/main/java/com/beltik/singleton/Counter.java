package com.beltik.singleton;

public class Counter {
    private Integer counter = 0;

    public Integer getCount() {
        return counter;
    }

    public void iterate() {
        this.counter++;
    }
}
