package com.formation.projet.model.personne;

import com.formation.projet.model.compte.CompteCourant;
import com.formation.projet.model.compte.CompteEpargne;

/**
 * Client ayant un compte bancaire dans l'agence.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */
public class Client extends Personne {

	private int id;

	private CompteCourant compteCourant = new CompteCourant();
	private CompteEpargne compteEpargne = new CompteEpargne();
	private boolean fortune;
	private boolean estEntreprise;

	/**
	 * Constructor du client avec des parametres.
	 * 
	 * @param nom           nom du client.
	 * @param prenom        prenom du client.
	 * @param adresse       adresse du client.
	 * @param codePostal    code postal du client.
	 * @param ville         ville du client.
	 * @param telephone     téléphone du client.
	 * @param fortune       est ce que le client est considéré comme riche ?
	 * @param estEntreprise Est ce que le client est une entreprise ?
	 */
	public Client(String nom, String prenom, String adresse, String codePostal, String ville, String telephone,
			boolean fortune, boolean estEntreprise) {
		super(nom, prenom, adresse, codePostal, ville, telephone);
		this.fortune = false;
		this.estEntreprise = false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant cCourant) {
		this.compteCourant = cCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne cEpargne) {
		this.compteEpargne = cEpargne;
	}

	/**
	 * Est ce que le client est aisé ?
	 * 
	 * @return une réponse Oui ou Non.
	 */
	public boolean isFortune() {
		return this.fortune;
	}

	public void setFortune(boolean fortune) {
		this.fortune = fortune;
	}

	/**
	 * Est ce que le client est une entreprise ?
	 * 
	 * @return une réponse Oui ou Non.
	 */
	public boolean estEntreprise() {
		return estEntreprise;
	}

	public void setEstEntreprise(boolean estEntreprise) {
		this.estEntreprise = estEntreprise;
	}

	/**
	 * Méthode permettant d'afficher les informations des clients.
	 */

	public String toString() {
		String msg = "";
		if (estEntreprise) {
			msg = "[N° Entreprise : ";
		} else {
			msg = "[N° client :";
		}
		return msg + this.id + "\t" + " NOM-Prenom : " + this.nom + " " + this.prenom + "\t" + "Adresse : "
				+ this.adresse + " " + this.codePostal + " " + this.ville + "\tTelephone : " + this.telephone + "]";
	}

	/**
	 * Méthode pour obtenir les informations d'un compte.
	 * 
	 * @return Les informations d'un compte enregistrer dans la BDD.
	 */
	public String infosComptes() {
		return "[Compte courant n°: " + this.compteCourant.getNumeroCompte() + "\t" + "Solde: "
				+ this.compteCourant.getSolde() + " EUR\t" + "Date d'ouverture: "
				+ this.compteCourant.getDateOuverture() + "\n" + "Compte epargne n°: "
				+ this.compteEpargne.getNumeroCompte() + "\t" + "Solde: " + this.compteEpargne.getSolde() + " EUR\t"
				+ "Date d'ouverture: " + this.compteEpargne.getDateOuverture() + "]";
	}

}
