package com.company.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by volodyko on 03.05.16.
 */
public class SubjectImpl implements Subject {

    private List<Observer> observerImpls = new ArrayList<>();
    private int flag;

    @Override
    public void register(ObserverImpl observerImpl) {
        observerImpls.add(observerImpl);
    }

    @Override
    public void unregister(ObserverImpl observerImpl) {
        observerImpls.remove(observerImpl);
    }

    @Override
    public void notifyObservers(int flagValue) {
        for (Observer observerImpl : observerImpls) {
            observerImpl.update(flagValue);
        }
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        notifyObservers(flag);
    }
}
