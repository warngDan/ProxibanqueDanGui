package com.formation.projet.persistance;

import java.util.List;

import com.formation.projet.model.personne.Client;

/**
 * Interface d�di� � la sauvegarde des donn�es clients.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public interface ConseillerClientDAO {

	int maxClients = 10;

	public void save(Client client);

	public Client findById(int id);

	public void delete(int id);

	public void update(int id);

	public List<Client> findAll();

}
