package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Pages.AccésProduit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccésProduitStepDef {
	
	
	
		@Given("utilisateur est sur la page de la catégorie Jeans")
		public void utilisateur_est_sur_la_page_de_la_catégorie_jeans() {
		    
		    Config.driver = new ChromeDriver(); 
		    Config.driver.manage().window().maximize();
		     
		    Config.driver.get("https://celio.tn/collection/jeans.html"); 
		}   
	
	@When("utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String Productname) throws Exception {
		AccésProduit page =new AccésProduit();
		page.clickProduit(Productname);
		
		
	}
	@Then("la fiche détaillée du produit {string} s'affiche")
	public void la_fiche_détaillée_du_produit_s_affiche(String Productname) {
		
		AccésProduit page =new AccésProduit();
		page.verifProduit(Productname);
		
	   
	}


}
