package com.formation.projet.model.compte;

import java.time.LocalDate;

/**
 * Compte courant associé à un compte bancaire.
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public class CompteCourant extends CompteBancaire {

	private double decouvertAutorise;
	
	
	public CompteCourant() {
		super();
	}

	/**
	 * Construstor du compte courant avec une autorisation de découvert de 1000€ par défaut.
	 * 
	 * @param numeroCompte  Identifiant unique provenant de la base de donnée.
	 * @param dateOuverture Date de création du compte bancaire.
	 * @param solde         Solde du compte.
	 * 	    
	 */
	public CompteCourant(String numeroCompte, LocalDate dateOuverture, double solde) {
		super(numeroCompte, dateOuverture, solde);
		this.decouvertAutorise = 1000.0;
	}

	/**
	 * @return le montant en euros du découvert autorise.
	 */
	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	/**
	 * @param decouvertAutorise initialise le montant en euros du découvert
	 *                          autorise.
	 */
	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

}
