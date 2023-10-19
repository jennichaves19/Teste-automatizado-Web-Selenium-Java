package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import pageObjects.LoginPage;
import pageObjects.LoginPage.*;

public class TesteSteps {
	
	@Dado("eu estou acessando o sistema")
	public void euEstouAcessandoOSistema() {
		acessarSistema();
	}

	@Quando("eu informar o usuario")
	public void euInformarOUsuario() {
		Na(LoginPage.class).informarCampoUserName();
	}
	
	@Quando("informar a senha")
	public void informarASenha() {
	   Na(LoginPage.class).informarCampoPassWord();
	}

	@Quando("eu clicar no botao de login")
	public void euClicarNoBotaoDeLogin() {
	   Na(LoginPage.class).acionarBotaoLogin();
	}

	@Entao("o sistema efetua o login")
	public void oSistemaEfetuaOLogin() {
	   
	       assertEquals("Products", driver.findElement(By.xpath("//div[@class='product_label']")).getText());
	}
}


	

	


