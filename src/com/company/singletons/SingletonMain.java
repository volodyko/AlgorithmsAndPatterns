package com.company.singletons;

/**
 * Created by volodyko on 05.05.16.
 */
public class SingletonMain {

    public static void main(String[] args) {
        System.out.println("Get instance1 of  Lazy Singleton");
        LazySingleton instance1 = LazySingleton.getInstance();
        System.out.println("Get instance2 of  Lazy Singleton");
        LazySingleton instance2 = LazySingleton.getInstance();
        if (instance1 == instance2) {
            System.out.println("instance1 and instance2 are the same");
        }

        System.out.println();
        System.out.println("Get instance1 of  Lazy Thread safe Singleton");
        LazySingleton lazySafeSingleton1 = LazyThreadSafeSingleton.getInstance();
        System.out.println("Get instance2 of  Lazy Singleton");
        LazySingleton lazySafeSingleton2 = LazyThreadSafeSingleton.getInstance();
        if (lazySafeSingleton1 == lazySafeSingleton2) {
            System.out.println("lazySafeSingleton1 and lazySafeSingleton2 are the same");
        }

        System.out.println();
        System.out.println("Get instance1 of  Eager Singleton");
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        if(eagerSingleton1 == eagerSingleton2){
            System.out.println("eagerSingleton1 and eagerSingleton2 are the same");
        }

        System.out.println();
        System.out.println("Get instance1 of  regarded java standard Singleton");
        JavaSingleton javaSingleton1 = JavaSingleton.getInstance();
        JavaSingleton javaSingleton2 = JavaSingleton.getInstance();
        if(javaSingleton1 == javaSingleton2){
            System.out.println("standard1 and standard2 are the same");
        }


    }
}
