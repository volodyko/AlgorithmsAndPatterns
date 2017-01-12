package com.company.singletons;

/**
 * Created by volodyko on 05.05.16.
 */
public class JavaSingleton {

    private JavaSingleton() {
    }

    public static JavaSingleton getInstance() {
        return SingletonHelper._instance;
    }

    public static class SingletonHelper {
        private static final JavaSingleton _instance = new JavaSingleton();
    }

}
