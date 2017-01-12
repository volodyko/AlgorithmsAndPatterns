package com.company.facade;

/**
 * Created by volodyko on 09.05.16.
 */
public class FacadeMain {
    public static void main(String[] args) {
        RobotFacade robotFacade = new RobotFacade();
        robotFacade.constructRobot("Blue");

        RobotFacade robotFacade1 = new RobotFacade();
        robotFacade1.constructRobot("Green");
    }
}
