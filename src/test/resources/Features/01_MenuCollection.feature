# Cas de test TT_TS_01
Feature: Survoler la collection et cliquer sur le sous-menu Jeans

Scenario:  Navigation vers le sous-menu Jeans
    Given  utilisateur est sur la page d'accueil de Celio
   When  utilisateur survole le menu "Collection"
    And clique sur le sous-menu "Jeans"
   Then la page de la catégorie Jeans doit s'afficher correctement
    
    
    
