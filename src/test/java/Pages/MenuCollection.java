package Pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class MenuCollection {
	
	@FindBy(xpath = "/html/body/main/div/header/div[2]/div/div/div/div[1]/div/div[1]/nav/ul/li[4]/a/span[1]")
   List< WebElement> menus;

    @FindBy(xpath = "/html/body/main/div/header/div[2]/div/div/div/div[1]/div/div[1]/nav/ul/li[4]/ul/li/div/div/div[1]/ul[3]/li[2]/a/span")
    List< WebElement> submenus;

    
    @FindBy(xpath = "/html/body/main/div/section/div[2]/div[1]/img")
     WebElement verifpage;

public MenuCollection() {
	PageFactory.initElements(Config.driver, this);
}
	public void mousehoverMenuAndClickSubmenu(String menuTitle, String submenuTitle) {
		
		try {
			for(WebElement menu:menus) {
				
				if( menu.getText().contains(menuTitle)) {
					Actions actions= new Actions(Config.driver);
					actions.moveToElement(menu).perform();
					Thread.sleep(2000);
					for(WebElement submenu:submenus) {
						if(submenu.getText().contains(submenuTitle)) {
							submenu.click();
						}
					}
				}
				}
		}catch(Exception e) {
			//TODO: handle exception
		}
		
	}
	public void verifpage(String msg, String submenuTitle) {
	    Assert.assertTrue( Config.driver.getPageSource().contains(msg));
	}
	
	public void ClickSubmenu(String submenuTitle, String submenuTitle2) {
		for(WebElement submenu:submenus) {
			if(submenu.getText().contains(submenuTitle)) {
				submenu.click();
		
	}

		}
	
		
	
}
}