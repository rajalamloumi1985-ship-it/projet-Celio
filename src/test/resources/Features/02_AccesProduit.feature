# TC2 : Cliquer sur le produit spécifique
Feature: Cliquer sur le produit spécifique 
  Scenario:  Consultation de la fiche d'un jean spécifique
  Given utilisateur est sur la page de la catégorie Jeans
   When  utilisateur clique sur le produit "Jean barrel 100% coton - bleu brut"
   Then  la fiche détaillée du produit "Jean barrel 100% coton - bleu brut" s'affiche
  