package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.MenuCollection;
import io.cucumber.docstring.DocString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuCollectionStepDef {
	
	
	private String submenuTitle;
	@Given("utilisateur est sur la page d'accueil de Celio")
	public void utilisateur_est_sur_la_page_d_accueil_de_celio() throws Exception {
		Config.driver=new ChromeDriver();
		Config.maximizeWindow();
		Config.driver.get(Utils.getProperty("urlMenucollection"));
		
	   	}
	@When("utilisateur survole le menu {string}")
	public void utilisateur_survole_le_menu(String submenu)  {
		
		MenuCollection collection= new MenuCollection();
		
		collection.mousehoverMenuAndClickSubmenu(submenu, submenuTitle);
	    
	}
	@When("clique sur le sous-menu {string}")
	public void clique_sur_le_sous_menu(String submenuTitle) {
		
		MenuCollection collection= new MenuCollection();
		 collection.ClickSubmenu (submenuTitle, submenuTitle);
	    
	}
	@Then("la page de la catégorie Jeans doit s'afficher correctement")
	public void la_page_de_la_catégorie_jeans_doit_s_afficher_correctement() {

	    MenuCollection collection = new MenuCollection();

	    collection.verifpage("Jeans", "Jeans");

	    Config.driver.quit();
	}



}
