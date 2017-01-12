package com.company.prototype;

/**
 * Created by volodyko on 07.04.16.
 */
public class PrototypeFactory {
    AbstractSpoon prototypeSpoon;
    AbstractFork prototypeFork;

    public PrototypeFactory(AbstractSpoon prototypeSpoon, AbstractFork prototypeFork) {
        this.prototypeSpoon = prototypeSpoon;
        this.prototypeFork = prototypeFork;
    }

    public AbstractSpoon makeSpoon(){
        return (AbstractSpoon) prototypeSpoon.clone();
    }

    public AbstractFork makeFork()  {
        return (AbstractFork) prototypeFork.clone();
    }
}
