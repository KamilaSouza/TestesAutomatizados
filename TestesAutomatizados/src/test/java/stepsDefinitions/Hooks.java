package stepsDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

import static utils.Utils.*;

public class Hooks {

    @Before (value = "@Login")
    public void funcionalidadeLogin() {
        accessarSistema();
    }

    @Before (value = "not @Login")
    public void setUp() {
        accessarSistema();
        Na(LoginPage.class).realizarLogin("Admin","admin123");
    }

    @After ()
    public void tearDown(Scenario scenario) {
        capturarTela(scenario);
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
