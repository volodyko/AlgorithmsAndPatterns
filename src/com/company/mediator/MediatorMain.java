package com.company.mediator;

/**
 * Created by volodyko on 10.05.16.
 */
public class MediatorMain {
    public static void main(String[] args) {
        ConcrteteMediator concrteteMediator = new ConcrteteMediator();
        Friend1 friend1 = new Friend1(concrteteMediator, "Friend 1");
        Friend2 friend2 = new Friend2(concrteteMediator, "Friend 2");
        Boss boss = new Boss(concrteteMediator, "boss");
        concrteteMediator.setFriend1(friend1);
        concrteteMediator.setFriend2(friend2);
        concrteteMediator.setBoss(boss);

        friend1.send("ashkjdhaskdhaksjhdaksjhd");
        friend2.send("12123123");
        boss.send("asd123");


    }
}
