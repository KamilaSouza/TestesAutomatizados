package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;


public class LoginPage {

    //Mapeando elementos

    // Por nome
    @FindBy(name = "txtUsername")
    private WebElement campoUsuario;

    @FindBy(name = "txtPassword")
    private WebElement campoSenha;

    @FindBy(name = "Submit")
    private WebElement botaoLogin;


    // Por ip
    @FindBy(id = "txtUsername")
    private WebElement campoUsuario1;

    // Por link
    @FindBy(linkText = "Forgot your password?")
    private WebElement link;

    // Por css
    @FindBy(css = "[id=txtUserName]")
    private WebElement link1;

    // Por xpath
    @FindBy(xpath = "//span[text()='( Username : Admin | Password : admin123 )']")
    private WebElement link2;


    public void informarCampoUsuario(String usuario) {
        campoUsuario.sendKeys(usuario);
    }

    public void informarCampoSenha(String senha) {
        campoSenha.sendKeys(senha);
    }

    public void acionarBotaoLogin() {
        botaoLogin.click();
    }

    public void realizarLogin(String usuario, String senha) {
        informarCampoUsuario(usuario);
        informarCampoSenha(senha);
        acionarBotaoLogin();
    }

}
