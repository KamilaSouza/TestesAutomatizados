package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static utils.Utils.*;

public class Hooks {

    @Before ()
    public void setUp() {
        accessarSistema();

    }

    @After ()
    public void tearDown() {
        driver.quit();

    }

//    @Before(order = 2, value = "@login") // só será executado se houver a tag @login
//    public void setUp1() {
//        accessarSistema();
//
//    }


//    @After(order = 1, value = "@login")
//    public void tearDown1() {
//
//    }
//    order decrescente no after
}
