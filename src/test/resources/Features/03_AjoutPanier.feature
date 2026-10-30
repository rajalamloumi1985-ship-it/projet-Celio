# TC3 : Ajouter le produit au panier et vérifier
Feature: Ajouter le produit au panier et vérifier
  Scenario: Ajout du jean au panier et vérification
  Given utilisateur est sur la fiche du produit "https://celio.tn/jean-barrel-100-coton-noir-pobarrel-faded-black.html"
   When utilisateur sélectionne une taille disponible
    And clique sur le bouton "Ajouter au panier"
   Then  le produit doit être ajouté au panier et le compteur du panier doit être mis à jour