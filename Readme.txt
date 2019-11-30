	************************************
*****  	Description de l'application:   	*****
	************************************
Proxybanque est une application permettant d'aider des conseillers bancaires à gérer une liste de clients.



	************************************
***** 	Execution de l'application:    		*****
	************************************

Pré-requis:

    Installer le JDK 9 sur la machine cible.
    Téléchargé depuis: http://www.oracle.com/technetwork/java/javase/downloads/index.html
    Choisir le bon fichier en fonction de votre Système d'esploitation (Windows, MacOS ou Linux)

    Copier le fichier .jar (ProxiBanqueDG.jar) en local sur la machine
    Ouvrir un invite de commande (cmd.exe) et changer le repertoire courant sur le répertoire parent:
        Copier le path du répertoire parent contenant le fichier .jar
        Taper cd path puis pressez entrée (avec le path copié precedemment)
    	Taper java -jar ProxiBanqueSI.jar et presser "Entrée".
        La Demo Java ProxiBanqueSI s'execute sur l'invite de commandes

	************************************
*****  	Documentation:			  	*****
	************************************

Consulter la documentation JavaDoc:

    Double-cliquer sur le fichier index.html se trouvant dans le repertoire doc du repertoire parent

Consulter les diagrammes JavaDoc:
    Double-cliquer sur le fichier UML_DG_ProxibanqueDG_1.0.PNG se trouvant dans le répertoire parent pour consulter le Diagramme de Cas d'Utilisation correspondant au Service Gestion Clientele
    Double-cliquer sur le fichier UML_DG_ProxibanqueDG_UseCase_1.0 se trouvant dans le répertoire parent pour consulter le Diagramme de Cas d'Utilisation correspondant au Service Operations Bancaires

	************************************
*****  	Livrables:			  				*****
	************************************
	
Vous trouverez les elements suivants:

1) la documentation au format javadoc : "/doc".

2) les sources du projet : dans le dossier ProxiBanqueDanielGuillaume/src

3) le fichier readme.txt : ce document

4) le fichier executable : proxiBanqueDG.jar



	************************************
*****  	Fonctions:			  	*****
	************************************

Description de la Demo Java ProxiBanqueSI:

Adressé à un conseiller client:
Etat initiale : le conseiller "Bob Martin" a déjà été crée. Il est employé de la banque identifiée "PROX1" qui est géré par "Jean Dubois", gérant de l'institution.

Menu principal

    Affiche un message de bienvenue avec les options suivantes:
 
        1-Ajouter un client
        2-Afficher les informations d'un client
        3-Modifier les informations d'un client
        4-Supprimer un client
        5-Faire un virement (option pas encore développé)
        6-Proposer un placement financier (option pas encore développé)
	7-Réaliser un audit de ses clients
        0-Quitter


Option <1-Creer un client>:
	Demande au conseiller de rentrer le nom, prenom, adresse, code postal, ville et telephone du nouveau client et le rajoute à la liste de clients.
	Si la liste de clients possède déjà 10 clients, il affiche l'imposibilité de rajouter de nouveau client.
Option <2-Lire les informations d'un client>:
	Demande au conseiller de selectionner un client, puis affiche les informations complètes du client, incluant les informations des comptes du client.
Option <3-Modifier les informations d'un client>:
	Demande au conseiller de selectionner un client, puis le champ à modifier. Apres qu'un champ ait été modifié, il demande s'il y a d'autres modifications à faire sur le client avant de revenir au menu principal et afficher les nouvelles informations du client.
Option <4-Supprimer un client>:
	Demande au conseiller de selectionner un client, puis demande une confirmation avant de supprimer le client selectionne de la liste de clients du conseiller
Option <5-Faire un virement>:
Option <6-Proposer un placement financier>:
Option <7-Réaliser un audit de ses clients>:
	Permet d'obtenir le nombre de clients à risque de la liste des clients.
Option <0-Quitter>:
	Permet de quitter l'application