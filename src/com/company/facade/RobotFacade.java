package com.company.facade;

/**
 * Created by volodyko on 09.05.16.
 */
public class RobotFacade {
    RobotColor robotColor;
    RobotBody robotBody;

    public RobotFacade() {
        robotBody = new RobotBody();
        robotColor = new RobotColor();
    }

    public void constructRobot(String color) {
        robotColor.setCcolor(color);
        robotBody.createBody();
    }
}
