package pageObjects;

import org.openqa.selenium.By;

import static utils.Utils.*;


public class LoginPage {

    public void informarCampoUsuario(String usuario) {
        driver.findElement(By.name("txtUsername")).sendKeys(usuario);

    }

    public void informarCampoSenha(String senha) {
        driver.findElement(By.name("txtPassword")).sendKeys(senha);

    }

    public void acionarBotaoLogin() {
        driver.findElement(By.name("Submit")).click();

    }


}
