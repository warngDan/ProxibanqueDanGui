package com.formation.projet.model.personne;

/**
 * Classe abstraite regroupant les caractéristiques principale d'une personne
 * employée ou client de l'agence.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public abstract class Personne {

	protected String nom;
	protected String prenom;
	protected String adresse;
	protected String codePostal;
	protected String ville;
	protected String telephone;

	/**
	 * Constructor d'une personne
	 * 
	 * @param nom    Le nom de la personne.
	 * @param prenom Le prénom de la personne.
	 */
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Constructor
	 * 
	 * @param nom        Le nom de la personne.
	 * @param prenom     Le prénom de la personne.
	 * @param adresse    L'adresse de la personne.
	 * @param codePostal Le code postal de la personne.
	 * @param ville      La ville de la personne.
	 * @param telephone  Le numéro de téléphone de la personne.
	 */
	public Personne(String nom, String prenom, String adresse, String codePostal, String ville, String telephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
