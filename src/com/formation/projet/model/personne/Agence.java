package com.formation.projet.model.personne;

import java.time.LocalDate;

/**
 * Agence est une institution faisaint partie d'un réseau d'agence bancaire.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public class Agence {

	private String agenceId;
	private LocalDate dateCreation;
	private Gerant gerant;
	private boolean agenceFiable;

	/**
	 * Constructor par défaut.
	 */
	public Agence() {

	}

	/**
	 * Constructor pour une agence avec des paramêtres.
	 * 
	 * @param agenceId     identifiant unique de l'agence.
	 * @param dateCreation date de création de l'agence.
	 * @param gerant       personne en charge de l'institution
	 */
	public Agence(String agenceId, LocalDate dateCreation, Gerant gerant) {
		this.agenceId = agenceId;
		this.dateCreation = dateCreation;
		this.gerant = gerant;
		this.agenceFiable = true;
	}

	/**
	 * Méthode pour obtenir l'identifiant unique.
	 * 
	 * @return l'identifiant unique.
	 */
	public String getAgenceId() {
		return agenceId;
	}

	/**
	 * Méthode pour initialiser l'identifiant de l'agence.
	 * 
	 * @param agenceId Id de l'agence
	 */
	public void setAgenceId(String agenceId) {
		this.agenceId = agenceId;
	}

	public LocalDate getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public boolean isAgenceFiable() {
		return agenceFiable;
	}

	public void setAgenceFiable(boolean agenceFiable) {
		this.agenceFiable = agenceFiable;
	}

	/**
	 * Méthode permettant d'obtenir les informations sur l'agence.
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
