package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CarrinhoPage;
import pageObjects.LoginPage;

public class CarrinhoSteps {

	
	@Dado("que eu esteja logado no sistema")
	public void queEuEstejaLogadoNoSistema() {
		// Na(LoginPage.class).realizarLogin();
	}

	@Quando("eu clicar no botao adicionar ao carrinho")
	public void euClicarNoBotaoAdicionarAoCarrinho() {
		  Na(CarrinhoPage.class).acionarBotaoAdicionar();
	}

	@Entao("o produto sera adicionado no carrinho")
	public void oProdutoSeraAdicionadoNoCarrinho() {
	
		 assertEquals("1", driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).getText());
	    
	}
}
 