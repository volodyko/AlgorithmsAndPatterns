package com.company.singletons;

/**
 * Created by volodyko on 05.05.16.
 */
public class LazyThreadSafeSingleton extends LazySingleton {
    private LazyThreadSafeSingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        return LazySingleton.getInstance();
    }
}
