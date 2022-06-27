package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

public class CadastrarUsuarioSteps {

    @Quando("eu acionar a aba admin")
    public void euAcionarAAbaAdmin() {
        Na(TelaInicialPage.class).acionarAbaAdmin();
    }

    @Quando("acionar o botao add")
    public void acionarOBotaoAdd() {
        Na(TelaInicialPage.class).acionarBotaoAdd();
    }

    @Quando("informar o campo employer name {string}")
    public void informarOCampoEmployerName(String employerName) {
        Na(CadastrarUsuarioPage.class).informarCampoEmployerName(employerName);
    }

    @Quando("informar o campo user name {string}")
    public void informarOCampoUserName(String userName) {
        Na(CadastrarUsuarioPage.class).informarCampoUserName(userName);
    }

    @Quando("informar o campo password {string}")
    public void informarOCampoPassword(String password) {
        Na(CadastrarUsuarioPage.class).informarCampoPassword(password);

    }

    @E("informar o campo confirmar password {string}")
    public void informarOCampoConfirmarPassword(String password) {
        Na(CadastrarUsuarioPage.class).informarCampoConfirmarPassword(password);
    }

    @E("acionar o botao salvar")
    public void acionarOBotaoSalvar() {
        Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
    }


    @Entao("o sistema cadastra o usuario {string}")
    public void oSistemaCadastraOUsuario(String userName) {
        assertTrue(driver.findElement(By.xpath("//a[text()='" + userName + "']")).isDisplayed());
    }

}



