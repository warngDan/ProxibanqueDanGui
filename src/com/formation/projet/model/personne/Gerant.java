package com.formation.projet.model.personne;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe d�di� � la mod�lisation de g�rant d'une agence.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public class Gerant extends Personne {

	private List<ConseillerClient> listConseillers = new ArrayList<>();

	/**
	 * Constructor d'un g�rant.
	 * 
	 * @param nom        Le nom du g�rant.
	 * @param prenom     Le pr�nom du g�rant.
	 * @param adresse    L'adresse du g�rant.
	 * @param codePostal Le code postal d'un g�rant.
	 * @param ville      La ville du g�rant.
	 * @param telephone  Le num�ro de t�l�phone du g�rant.
	 */
	public Gerant(String nom, String prenom, String adresse, String codePostal, String ville, String telephone) {
		super(nom, prenom, adresse, codePostal, ville, telephone);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor d'un g�rant.
	 * 
	 * @param nom    Le nom du g�rant.
	 * @param prenom Le pr�nom du g�rant.
	 */
	public Gerant(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}

	/**
	 * M�thode pour obtenir la liste des conseillers �tant sous la responsabilit�
	 * d'un g�rant.
	 * 
	 * @return La liste des conseillers.
	 */
	public List<ConseillerClient> getListConseillers() {
		return listConseillers;
	}

	/**
	 * M�thode rajoutant un conseiller � la charge d'un g�rant.
	 * 
	 * @param conseiller Conseiller � rajouter.
	 */
	public void ajouterConseiller(ConseillerClient conseiller) {
		listConseillers.add(conseiller);
	}

}
