package com.formation.projet.service;

import java.util.List;

import com.formation.projet.model.personne.Client;

/**
 * Interface destin�e aux conseillers afin de g�rer les clients.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public interface ConseillerClientService {

	public void creerClient(Client client);

	public Client afficherClient(int id);

	public void modifierClient();

	public void supprimerClient(int id);

	public List<Client> gettAllClients();

}
