package Pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class AccésProduit {
	
	
	@FindBy(xpath="/html/body/main/div/section/div[3]/div[1]/div[4]/ol/li/div[2]/h5/a")
	List<WebElement> produits;
	@FindBy(xpath="//h1")
	WebElement verifArticle;
	public AccésProduit() {
		
		
		PageFactory.initElements(Config.driver, this);
	}
public void clickProduit(String nomProd) throws Exception {
	Config.attente(10);
	Thread.sleep(3000);
	try {
		for(WebElement produit:produits) {
			System.out.println(produit.getText());
			if(produit.getText().contains(nomProd)) {
				Actions actions=new Actions(Config.driver);
				actions.moveToElement(produit).perform();
				produit.click();
				((JavascriptExecutor)Config.driver).executeScript("(arguments[0],scrollIntoView( {Block:'center',inline:'nearest'});",
						produit
						);
				
	}
}
		
	}catch (Exception e) {
	//TODO:handle exception
	}
}

public void verifProduit(String Productname) {
    Assert.assertEquals(verifArticle.getText().trim(), Productname.trim());
}

    
}














