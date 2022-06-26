package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {

    @FindBy(id = "systemUser_employeeName_empName")
    private WebElement campoEmployer;

    @FindBy(name = "systemUser[userName]")
    private WebElement campoUsername;

    @FindBy(name = "systemUser[password]")
    private WebElement campoPassword;

    @FindBy(name = "systemUser[confirmPassword]")
    private WebElement campoConfirmarPassword;

    @FindBy(name = "btnSave")
    private WebElement botaoSalvar;

    public void informarCampoEmployerName (String employerName){
   //     campoEmployer.clear();
        campoEmployer.sendKeys(employerName);

    }

    public void informarCampoUserName (String userName){
        campoUsername.sendKeys(userName);
    }

    public void informarCampoPassword (String password){
        campoPassword.sendKeys(password);
    }

    public void informarCampoConfirmarPassword (String password){
        campoConfirmarPassword.sendKeys(password);
    }

    public void acionarBotaoSalvar (){
        botaoSalvar.click();
    }
}
