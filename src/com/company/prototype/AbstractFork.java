package com.company.prototype;

/**
 * Created by volodyko on 07.04.16.
 */
public abstract class AbstractFork implements Cloneable{

    String forkName;

    public String getForkName() {
        return forkName;
    }

    public void setForkName(String forkName) {
        this.forkName = forkName;
    }

    @Override
    protected Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("AbstractFork is not Cloneable");
        }
        return object;
    }
}
