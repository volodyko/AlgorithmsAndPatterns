package com.company.mediator;

/**
 * Created by volodyko on 10.05.16.
 */
public class ConcrteteMediator extends Mediator {
    private Friend1 friend1;
    private Friend2 friend2;
    private Boss boss;

    public void setFriend1(Friend1 friend1) {
        this.friend1 = friend1;
    }

    public void setFriend2(Friend2 friend2) {
        this.friend2 = friend2;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    @Override
    public void send(Friend friend, String msg) {
        if (friend == friend1) {
            friend2.notify(msg);
            boss.notify(msg);
        }
        if (friend == friend2) {
            friend1.notify(msg);
            boss.notify(msg);
        }
        if (friend == boss) {
            friend1.notify(msg);
            friend2.notify(msg);
        }
    }
}
