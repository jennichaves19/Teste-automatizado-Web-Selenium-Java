package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy (id = "user-name")
	private WebElement campoUserName;
	
	@FindBy (name = "password")
	private WebElement campoPassWord;
	
	@FindBy (id = "login-button")
	private WebElement botaoLogin;
	
	public void informarCampoUserName() {
		campoUserName.sendKeys("standard_user");
	}
	
	public void informarCampoPassWord() {
		campoPassWord.sendKeys("secret_sauce");
	}
	
	public void acionarBotaoLogin() {
		botaoLogin.click();
	}
	
	public void realizarLogin() {
		campoUserName.sendKeys("standard_user");
		campoPassWord.sendKeys("secret_sauce");
		botaoLogin.click();
	}
}