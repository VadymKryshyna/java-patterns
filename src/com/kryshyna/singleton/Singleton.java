package com.kryshyna.singleton;

/**
 * Created by vadim on 09.10.14.
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
