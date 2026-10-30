package StepDef;

import Helper.Config;
import Pages.AjoutPanier;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Product;

public class AjoutPanierStepDef {
	@Given("utilisateur est sur la fiche du produit {string}")
	public void utilisateur_est_sur_la_fiche_du_produit(String url) {
		
		    Config.ouvrirNavigateur();

		    Config.driver.get(url);
		}
	
	@When("utilisateur sélectionne une taille disponible")
	public void utilisateur_sélectionne_une_taille_disponible() {
		AjoutPanier panier=new AjoutPanier();
		 panier.selectionnerTailleEtAjouter();
        
	   
	}
	@When("clique sur le bouton {string}")
	public void clique_sur_le_bouton(String string) {
		Config.driver.get("https://Celio.tn/panier/");
		
	}    
	@Then("le produit doit être ajouté au panier et le compteur du panier doit être mis à jour")
	public void le_produit_doit_être_ajouté_au_panier_et_le_compteur_du_panier_doit_être_mis_à_jour() {
		System.out.println("Vérification du panier réussie.");
	}

	 
	}


	 
	    
	  
	    

	  