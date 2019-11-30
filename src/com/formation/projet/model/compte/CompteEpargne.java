package com.formation.projet.model.compte;

import java.time.LocalDate;
import java.util.Date;

/**
 * Compte d'�pargne associ� � un compte bancaire.
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */


public class CompteEpargne extends CompteBancaire {

	/**
	 * Le taux de r�mun�ration du compte epargne. Il est par d�faut de 3 %.
	 */
	
	private double tauxRemuneration;

	
	public CompteEpargne() {
		super();
	}
	/**
	 * Constructor du compte d'epargne.
	 * 
	 * @param numeroCompte  Identifiant unique provenant de la base de donn�e.
	 * @param dateOuverture Date de cr�ation du compte bancaire.
	 * @param solde         Solde du compte.
	 */

	public CompteEpargne(String numeroCompte, LocalDate dateOuverture, double solde) {
		super(numeroCompte, dateOuverture, solde);
		this.tauxRemuneration = 0.03;
	}

	/**
	 * @return le coefficient multiplicateur du taux de r�muneration.
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * @param tauxRemuneration initialise la valeur du taux de r�mun�ration.
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * @return la valeur de l'int�ret en euros.
	 */
	public double calculerInteret() {
		return getSolde() * tauxRemuneration;
	}

}
