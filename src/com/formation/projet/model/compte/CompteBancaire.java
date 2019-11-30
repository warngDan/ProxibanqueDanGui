package com.formation.projet.model.compte;

import java.time.LocalDate;

/**
 * Compte bancaire associé à un client unique de la banque.
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public abstract class CompteBancaire {

	protected String numeroCompte;
	protected LocalDate dateOuverture;
	protected double solde;

	
	public CompteBancaire() {
	}
	/**
	 * Constructor du compte bancaire.
	 * 
	 * @param numeroCompte  (required) identifiant du compte.
	 * @param dateOuverture (required) date de l'ouverture du compte bancaire.
	 * @param solde         (required) solde disponible sur le compte Bancaire en
	 *                      euros.
	 */
	public CompteBancaire(String numeroCompte, LocalDate dateOuverture, double solde) {
		this.numeroCompte = numeroCompte;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
	}

	/**
	 * @return l'identifiant unique du compte.
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * @param numeroCompte unique a initialisé.
	 * 
	 */
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/**
	 * @return la date d'ouverture du compte dans la banque.
	 */
	public LocalDate getDateOuverture() {
		return dateOuverture;
	}

	/**
	 * @param dateOuverture a initialisé avec la date d'ouverture du compte en
	 *                      banque.
	 */
	public void setDateOuverture(LocalDate dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	/**
	 * @return le solde disponible sur le compte en banque en euros.
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde a initialisé avec la somme du premier depot en euros.
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Méthode pour afficher les données enregistrées pour chaque compte bancaire.
	 */
	public String toString() {
		return "[Compte n°: " + this.getNumeroCompte() + "\t" + "Solde: " + this.getSolde() + " EUR\t"
				+ "Date d'ouverture: " + this.getDateOuverture() + "]";
	}
}