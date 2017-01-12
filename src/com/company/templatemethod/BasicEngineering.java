package com.company.templatemethod;

/**
 * Created by volodyko on 05.05.16.
 */
abstract class BasicEngineering {
    public void papers() {
        math();
        softSkill();
        specialPaper();
    }

    private void math() {
        System.out.println("Mathematics");
    }

    private void softSkill() {
        System.out.println("SoftSkills");
    }

    public abstract void specialPaper();

}
