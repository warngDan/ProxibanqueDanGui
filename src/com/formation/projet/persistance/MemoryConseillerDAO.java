package com.formation.projet.persistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.formation.projet.model.personne.Client;

/**
 * Classe r�alisant la sauvegarde des donn�es clients.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public class MemoryConseillerDAO implements ConseillerClientDAO {

	private Map<Integer, Client> DB = new HashMap<>();
	private static Integer id = 0;

	/**
	 * M�thode pour la sauvegarde du client.
	 */
	@Override
	public void save(Client client) {
		id++;
		client.setId(id);
		DB.put(client.getId(), client);
	}

	/**
	 * M�thode pour chercher un client par son identifiant unique.
	 */
	@Override
	public Client findById(int id) {
		return DB.get(id);
	}

	/**
	 * M�thode pour supprimer un client.
	 */
	@Override
	public void delete(int id) {
		DB.remove(id);
	}

	/**
	 * M�thode pour modifier un client.
	 */
	@Override
	public void update(int id) {
		// TODO
	}

	/**
	 * M�thode pour obtenir la liste des clients d'un conseiller.
	 */
	@Override
	public List<Client> findAll() {
		return new ArrayList<Client>(DB.values());
	}

}
