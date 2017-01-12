package com.company.proxy;

/**
 * Created by volodyko on 05.05.16.
 */
public class ProxyMain {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.doSomeWork();
        proxy.doSomeWork();
    }
}
