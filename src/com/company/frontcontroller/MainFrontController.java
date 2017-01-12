package com.company.frontcontroller;

public class MainFrontController {

    public static void main(String[] args) {
	    FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
