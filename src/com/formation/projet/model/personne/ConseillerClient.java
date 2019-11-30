package com.formation.projet.model.personne;

import java.util.List;
import java.util.ArrayList;

/**
 * Entité de l'agence prenant en charge un nouveau client.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public class ConseillerClient extends Personne {

	List<Client> listeClients;
	/**
	 * Le nombre maximum de clients à la charge de chaque conseiller est de 10.
	 */
	int maxClients = 10;

	/**
	 * Construtor de ConseillerClient avec parametres.
	 * 
	 * @param nom    Le nom du conseiller.
	 * @param prenom Le prénom du conseiller.
	 */
	public ConseillerClient(String nom, String prenom) {
		super(nom, prenom);
		this.listeClients = new ArrayList<Client>();
	}

	public List<Client> getListeClients() {
		return this.listeClients;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}

	public int getMaxClients() {
		return maxClients;
	}

	public void setMaxClients(int maxClients) {
		this.maxClients = maxClients;
	}

	/**
	 * Méthode pour afficher les informations de chaque conseiller.
	 */

	public String toString() {

		String message = "Conseiller clientele: [" + this.nom + " " + this.prenom + "]";
		if (!listeClients.isEmpty()) {
			message = message + "\nVous avez actuellement " + listeClients.size() + " client(s):";
			for (Client currentClient : listeClients) {
				message = message + "\n" + currentClient.toString();
			}
		} else {
			message = message + "\nVous n'avez aucun client.";
		}
		return message;
	}
}
