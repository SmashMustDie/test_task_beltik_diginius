package com.beltik.singleton;

public final class SingletonCounter extends Counter {

    private static SingletonCounter INSTANCE;
    private SingletonCounter() {
    }

    public static SingletonCounter getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonCounter();
        }

        return INSTANCE;
    }

}
