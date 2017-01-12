package com.company.singletons;

/**
 * Created by volodyko on 05.05.16.
 */
public class EagerSingleton {
    private static EagerSingleton _instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return _instance;
    }
}
