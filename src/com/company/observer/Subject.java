package com.company.observer;

/**
 * Created by volodyko on 03.05.16.
 */
public interface Subject {
    void register(ObserverImpl observerImpl);
    void unregister(ObserverImpl observerImpl);
    void notifyObservers(int flagValue);
}
