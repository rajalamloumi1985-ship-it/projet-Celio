package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AjoutPanier {
	@FindBy(xpath = "/html/body/main/div/section/div[2]/div/div[5]/div[2]/div/div/div[2]/form/div[3]/div[4]/div[2]/div[2]/button/span")
    public WebElement titrePanier;

    public AjoutPanier() {
        PageFactory.initElements(Config.driver, this);
    }

    public boolean verifierProduitAjouter() {
        return titrePanier.isDisplayed();
    }

	public void selectionnerTailleEtAjouter() {
		// TODO Auto-generated method stub
		
	}
}




