
package com.formation.projet.presentation;

import java.time.LocalDate;
import java.util.Scanner;

import com.formation.projet.model.compte.CompteBancaire;
import com.formation.projet.model.compte.CompteCourant;
import com.formation.projet.model.compte.CompteEpargne;
import com.formation.projet.model.personne.Client;
import com.formation.projet.service.ServiceImplementation;

/**
 * Classe chargée de l'affichage de l'application.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public class Vue {

	private ServiceImplementation cs = new ServiceImplementation();
	private Scanner scanner = new Scanner(System.in);

	/**
	 * Méthode pour afficher l'entête de l'application.
	 */
	public void afficherEntete() {
		afficherMessage("---------------------------------------------------------\n"
				+ "	*****    Proxi Banque Services    *****\n"
				+ "---------------------------------------------------------\n");
	}

	/**
	 * Méthode pour afficher le menu principal de l'application.
	 * 
	 * @return le choix de l'utilisateur.
	 */
	public int afficherMenu() {
		afficherMessage("\n  ****  MENU  ****  \n\n");
		String menu = "1. Ajouter un client\n".concat("2. Afficher les informations d'un client\n")
				.concat("3. Modifier les informations client\n").concat("4. Supprimer un client\n")
				.concat("5. Faire un virement\n").concat("6. Proposer un placement financier\n")
				.concat("7. Réaliser un audit de ses clients\n").concat("0. Quitter");
		return saisirInt(menu);
	}

	/**
	 * Méthode pour la création d'un client.
	 */
	public void creerClient() {
		afficherMessage("\n  --> AJOUT CLIENT  <--\n\n");
		String nom = saisirString("Veuillez saisir le Nom : ");
		String prenom = saisirString("Veuillez saisir le Prénom : ");
		String adresse = saisirString("Veuillez saisir l'adresse: ");
		String ville = saisirString("Veuillez saisir la ville : ");
		String codePost = saisirString("Veuillez saisir le code postal : ");
		String telephone = saisirString("Veuillez saisir le télephone : ");
		boolean estEntreprise = saisirOuiNon("Est-ce une entreprise Oui/Non ? ");
	
		Client newClient = new Client(nom, prenom, adresse, codePost, ville, telephone, false, estEntreprise);

		cs.creerClient(newClient);
		creerCompte(newClient);

		System.out.println("\nLe client " + nom + " a bien été créé.");

	}

	/**
	 * M2thode poour la création des comptes bancaires des clients.
	 * 
	 * @param client Le client.
	 */
	public void creerCompte(Client client) {

		boolean choix = true;
		int nbCCP = 0;
		int nbEPG = 0;
		while (choix) {

			int choixTypeCompte = saisirInt("Choisir le type de compte :\n1. Compte courant\n2. Compte épargne\n");
			int montantDepot = 0;
			int numCompte = (int) (Math.random() * 100000);

			if (choixTypeCompte == 1) {

				if (nbCCP < 1) {
					montantDepot = saisirInt("Quelle montant voulez-vous deposer ?");
					CompteCourant ccp = new CompteCourant("CCP_".concat(Integer.toString(numCompte)), LocalDate.now(),
							Double.valueOf(montantDepot));
					client.setCompteCourant(ccp);
					System.out.println(ccp);
					nbCCP++;
				} else {
					System.out.println("Un compte courant existe déja pour ce client");
				}
			} else if (choixTypeCompte == 2) {
				if (nbEPG < 1) {
					montantDepot = saisirInt("Quelle montant voulez-vous deposer ?");
					CompteEpargne epg = new CompteEpargne("EPG_".concat(Integer.toString(numCompte)), LocalDate.now(),
							Double.valueOf(montantDepot));
					client.setCompteEpargne(epg);
					System.out.println(epg);
					nbEPG++;
				} else {
					System.out.println("Un compte épargne existe déja pour ce client");
				}
			} else {
				System.out.println("Erreur de saisie !");
			}

			choix = saisirOuiNon("\nVoulez-vous créer un autre compte Oui/Non ? ");
		}
	}

	/**
	 * Méthode de recherche d'un client par son identifiant afin de l'afficher avec
	 * ses informations.
	 * 
	 * @return l'identifiant du client.
	 */
	public int afficherClient() {
		afficherMessage("\n  --> RECHERCHE CLIENT <-- \n\n");
		int id = saisirInt("Saisir le numéro du client :");
		System.out.println(cs.afficherClient(id));
		for (CompteBancaire compte : cs.getCompteByClientId(id)) {
			System.out.println(compte);
		}

		return id;
	}

	/**
	 * Méthode pour gérer la modification client.
	 */

	public void modifierClient() {
		afficherMessage("\n  --> MODIFIER CLIENT <--  \n\n");
		int id = saisirInt("Saisir le numéro du client :");
		Client clientAModifier = cs.afficherClient(id);
		String menu = "Choisir la donnée à modifier : \n".concat("1. Le nom \n2. Le prénom\n")
				.concat("3. L'adresse\n4. La ville\n").concat("5. Le code postal\n6. Le numéro de téléphone\n");

		switch (saisirInt(menu)) {

		case 1:
			clientAModifier.setNom(saisirString("Nom : (" + clientAModifier.getNom() + ") "));
			break;
		case 2:
			clientAModifier.setPrenom(saisirString("Prénom : (" + clientAModifier.getPrenom() + ") "));
			break;
		case 3:
			clientAModifier.setAdresse(saisirString("Adresse : " + clientAModifier.getAdresse() + ") "));
			break;
		case 4:
			clientAModifier.setVille(saisirString("Ville : " + clientAModifier.getVille() + ") "));
			break;
		case 5:
			clientAModifier.setCodePostal(saisirString("Code Postal : " + clientAModifier.getCodePostal() + ") "));
			break;
		case 6:
			clientAModifier.setTelephone(saisirString("Téléphone : " + clientAModifier.getTelephone() + ") "));
			break;
		default:
			System.out.println("Erreur de saisie !");
		}

		System.out.println("Modification client effective ! \n" + clientAModifier);
	}

	/**
	 * Méthode pour supprimer un client.
	 */
	public void supprimerClient() {
		afficherMessage("\n  --> SUPPRIMER CLIENT <--  \n\n");
		int id = saisirInt("Saisir le numéro du client à supprimer : ");
		cs.supprimerClient(id);
		System.out.println("\nLe client n° " + id + " a bien été supprimé ! ");
	}

	public void effectuerVirement() {
		// TODO
	}

	public void proposerPlacement() {
		// TODO Auto-generated method stub

	}

	/**
	 * Méthode afin de réaliser l'audit des comptes clients gérés par un conseiller.
	 */
	public void auditerClients() {

		int nbClientARisque = cs.auditerClients(cs.gettAllClients());

		if (nbClientARisque > 0) {
			System.out.println("Il y a " + nbClientARisque + " clients qui ont un profil à risque.");
		} else {
			System.out.println("Il n'y pas de client à risque dans votre portefeuille.");
		}

	}

	/**
	 * Méthode afin de quitter l'application.
	 */
	public void exit() {
		System.out.println("\nFermeture de l'application");
		scanner.close();
		System.out.println("\nFIN");
	}

	/**
	 * Méthode générique d'afficahge de message.
	 * 
	 * @param message Le message à afficher.
	 */
	public void afficherMessage(String message) {
		if (!message.isEmpty()) {
			System.out.print(message);
		}
	}

	/**
	 * Méthode pour récuperer la saisie d'un entier par l'utilisateur.
	 * 
	 * @param message Message affiché à l'utilisateur.
	 * @return L'entier saisi.
	 */
	public int saisirInt(String message) {
		afficherMessage(message);
		int retourSaisie = scanner.nextInt();
		scanner.nextLine();
		return retourSaisie;
	}

	/**
	 * Méthode pour récuperer la saisie d'une chaine de caractères par
	 * l'utilisateur.
	 * 
	 * @param message Message affiché à l'utilisateur.
	 * @return Chaine de caractères saisie.
	 */
	public String saisirString(String message) {
		afficherMessage(message);
		return scanner.nextLine();
	}

	/**
	 * Méthode pour répondre à une question dont la réponse est oui ou non.
	 * 
	 * @param message Message affiché à l'utilisateur.
	 * @return Faux si non; ou Vrai si oui.
	 */
	public boolean saisirOuiNon(String message) {
		afficherMessage(message);
		boolean test = false;
		String retourSaisie = scanner.nextLine();

		if (retourSaisie.equalsIgnoreCase("OUI")) {
			test = true;
		} else if (retourSaisie.equalsIgnoreCase("NON")) {
			test = false;
		} else {
			System.out.println("Erreur de saisie, Oui ou Non attendu !");
		}
		return test;
	}

}
