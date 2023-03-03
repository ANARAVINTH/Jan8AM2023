package com.stepdefination;

import io.cucumber.java.AfterStep;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void precondition(){

        System.out.println("Executed started");

    }

    @After
    public void postCondition(){

        System.out.println("Execution Ended");

    }

    @AfterStep
    public  void step(){

    }

}
