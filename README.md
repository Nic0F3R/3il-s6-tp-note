# Gestionnaire Banque - TP Noté - 3iL Java S6

- Nicolas Ferrayé


- Le 31/03/2023

# Description

Dans le cadre de mes études à la 3iL de Rodez, dans la première année du cycle Ingénieur en Alternance, il a été demandé de développer un logiciel de gestion bancaire dans le cadre du TP Noté de Java.

# Ce qui a été réalisé

**Fonctionnalités**

- **Forme générale du projet**

    - Noms des fichiers respectés
    - Présence du logo 3iL
    - Taille de la fenêtre 600x200
    - Couleur de fond respectée
    - Dossier Data

- **Architecture**

    - Classe Transaction réalisée
    - Classe Taux réalisée
    - Tests de Transaction et de Taux réalisés (100% des 25 tests sont validés)
    - Classe GestionnaireBancaire en cours de réalisation
      - Chargement du fichier de Taux
      - Sauvegarde des Transactions bancaires
      - Chargement des Transactions bancaires **(en cours)**

- **Interface**
    - GridPane en conteneur principal avec couleur de fond respectée

**Bonnes pratiques**

- Tests unitaires effectués sur les classes Transaction et Taux
- Travail réalisé en TDD
- Commits clairs et réguliers sur GitHub
- Code commenté (présence de la JavaDoc)
- Utilisation de SonarLint pour la qualité du code (40 problèmes relevés)
- Rédaction du fichier ReadMe clair et concis

# Ce qui reste à faire

- Finaliser l'interface
- Finaliser le contrôleur de l'interface
- Faire fonctionner la classe de chargement des Transactions
- Implémenter les méthodes finaliser le système bancaire et mettre à jour la variable Solde