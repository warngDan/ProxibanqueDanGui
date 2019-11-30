package com.formation.projet.presentation;

import java.time.LocalDate;

import com.formation.projet.model.personne.Agence;
import com.formation.projet.model.personne.ConseillerClient;
import com.formation.projet.model.personne.Gerant;

/**
 * Programme principal de l'application.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public class ProxiBanque {
	/**
	 * Méthode main de l'application.
	 * 
	 * @param args aucun parametre attentdu.
	 */
	public static void main(String[] args) {

		// initaialisation de l'Agence et de son personnel

		Gerant jean = new Gerant("DUBOIS", "Jean");
		ConseillerClient bob = new ConseillerClient("Martin", "Bob");

		jean.ajouterConseiller(bob);
		Agence proxiAgency = new Agence("PROX1", LocalDate.now(), jean);

		// initialisation de la vue

		Vue vueConseille = new Vue();

		vueConseille.afficherEntete();
		vueConseille.afficherMessage("Bienvenue Mr " + bob.getNom());
		vueConseille.afficherMessage(". Vous êtes autorisé à utiliser l'application interne.\n"
				+ "Quelle opération voulez-vous effectuer ?");

		int saisie = 0;

		do {
			saisie = vueConseille.afficherMenu();

			switch (saisie) {
			case 1:
				vueConseille.creerClient();
				break;
			case 2:
				vueConseille.afficherClient();
				break;
			case 3:
				vueConseille.modifierClient();
				break;
			case 4:
				vueConseille.supprimerClient();
				break;
			case 5:
				vueConseille.effectuerVirement();
				break;
			case 6:
				vueConseille.proposerPlacement();
				break;
			case 7:
				vueConseille.auditerClients();

				break;
			case 0:
				vueConseille.exit();
				break;
			default:
				System.out.println("Choix invalide, veuillez ressaisir votre choix !");
				break;
			}

		} while (saisie != 0);

	}
}
