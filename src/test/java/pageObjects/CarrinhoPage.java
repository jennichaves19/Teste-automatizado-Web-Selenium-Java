package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarrinhoPage {
 
	
	
	@FindBy (xpath = "//button[@class='btn_primary btn_inventory']")
	private WebElement botaoAdicionar;
	
	public void acionarBotaoAdicionar() {
		botaoAdicionar.click();
	}
}
