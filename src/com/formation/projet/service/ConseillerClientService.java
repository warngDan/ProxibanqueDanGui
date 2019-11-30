package com.formation.projet.service;

import java.util.List;

import com.formation.projet.model.personne.Client;

/**
 * Interface destinée aux conseillers afin de gérer les clients.
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
