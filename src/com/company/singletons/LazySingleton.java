package com.company.singletons;

/**
 * Created by volodyko on 05.05.16.
 */
public class LazySingleton {
    private static LazySingleton _instance;

    LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (_instance == null) {
            _instance = new LazySingleton();
            _instance.notifyNewCreated();
        } else {
            _instance.notifyReturned();
        }

        return _instance;
    }

    private void notifyNewCreated() {
        System.out.println("Lazy singleton created");
    }

    private void notifyReturned() {
        System.out.println("Lazy singleton returned");
    }
}
