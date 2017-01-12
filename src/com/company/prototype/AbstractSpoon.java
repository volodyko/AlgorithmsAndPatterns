package com.company.prototype;

/**
 * Created by volodyko on 07.04.16.
 */
public abstract class AbstractSpoon implements Cloneable {
    String spoonName;

    public String getSpoonName() {
        return spoonName;
    }

    public void setSpoonName(String spoonName) {
        this.spoonName = spoonName;
    }

    @Override
    protected Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("AbstractSpoon is not Cloneable");
        }
        return object;
    }
}
