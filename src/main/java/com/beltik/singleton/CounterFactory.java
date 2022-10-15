package com.beltik.singleton;

public class CounterFactory {

    private static Counter counter;

    public static Counter getCounter(boolean isSingletonClassNeeded) {
        if (counter == null) {
            counter = new Counter();
        }
        if (isSingletonClassNeeded) return SingletonCounter.getInstance();
        return counter;
    }
}
