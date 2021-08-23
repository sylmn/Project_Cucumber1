package StepDefinitions;

import Utilities.BaseDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before // her senaryodan önce
    public void before()
    {

    }

    @After // her senaryodan sonra
    public void after()
    {
        BaseDriver.DriverQuit();
    }

}
