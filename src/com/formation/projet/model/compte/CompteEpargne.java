package com.formation.projet.model.compte;

import java.time.LocalDate;
import java.util.Date;

/**
 * Compte d'épargne associé à un compte bancaire.
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */


public class CompteEpargne extends CompteBancaire {

	/**
	 * Le taux de rémunération du compte epargne. Il est par défaut de 3 %.
	 */
	
	private double tauxRemuneration;

	
	public CompteEpargne() {
		super();
	}
	/**
	 * Constructor du compte d'epargne.
	 * 
	 * @param numeroCompte  Identifiant unique provenant de la base de donnée.
	 * @param dateOuverture Date de création du compte bancaire.
	 * @param solde         Solde du compte.
	 */

	public CompteEpargne(String numeroCompte, LocalDate dateOuverture, double solde) {
		super(numeroCompte, dateOuverture, solde);
		this.tauxRemuneration = 0.03;
	}

	/**
	 * @return le coefficient multiplicateur du taux de rémuneration.
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * @param tauxRemuneration initialise la valeur du taux de rémunération.
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * @return la valeur de l'intêret en euros.
	 */
	public double calculerInteret() {
		return getSolde() * tauxRemuneration;
	}

}
