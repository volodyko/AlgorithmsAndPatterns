package com.company.visitor;

/**
 * Created by volodyko on 12.04.16.
 */
public interface Visitable {
    public void accept(Visitor visitor);
}
