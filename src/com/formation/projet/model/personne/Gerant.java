package com.formation.projet.model.personne;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe dédié à la modélisation de gérant d'une agence.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public class Gerant extends Personne {

	private List<ConseillerClient> listConseillers = new ArrayList<>();

	/**
	 * Constructor d'un gérant.
	 * 
	 * @param nom        Le nom du gérant.
	 * @param prenom     Le prénom du gérant.
	 * @param adresse    L'adresse du gérant.
	 * @param codePostal Le code postal d'un gérant.
	 * @param ville      La ville du gérant.
	 * @param telephone  Le numéro de téléphone du gérant.
	 */
	public Gerant(String nom, String prenom, String adresse, String codePostal, String ville, String telephone) {
		super(nom, prenom, adresse, codePostal, ville, telephone);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor d'un gérant.
	 * 
	 * @param nom    Le nom du gérant.
	 * @param prenom Le prénom du gérant.
	 */
	public Gerant(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Méthode pour obtenir la liste des conseillers étant sous la responsabilité
	 * d'un gérant.
	 * 
	 * @return La liste des conseillers.
	 */
	public List<ConseillerClient> getListConseillers() {
		return listConseillers;
	}

	/**
	 * Méthode rajoutant un conseiller à la charge d'un gérant.
	 * 
	 * @param conseiller Conseiller à rajouter.
	 */
	public void ajouterConseiller(ConseillerClient conseiller) {
		listConseillers.add(conseiller);
	}

}
