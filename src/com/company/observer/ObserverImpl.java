package com.company.observer;

/**
 * Created by volodyko on 03.05.16.
 */
public class ObserverImpl implements Observer {
    public void update(int flagValue){
        System.out.println("flag value changed " + flagValue);
    }
}
