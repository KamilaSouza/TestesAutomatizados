package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

public class TestandoActionsSteps {

    @Quando("eu acionar o menu CustomField")
    public void euAcionarOMenuCustomField() {
        Na(TelaInicialPage.class).acessarMenuCustomField();
    }

    @Entao("o sistema apresenta a tela customField")
    public void oSistemaApresentaATelaCustomField() {
        Na(TelaInicialPage.class).acessarMenuCustomField();
        assertEquals("Defined Custom Fields", driver.findElement(By.xpath("//*[@id=\"customFieldListPane\"]/div[1]/h1")).getText());
    }
}
