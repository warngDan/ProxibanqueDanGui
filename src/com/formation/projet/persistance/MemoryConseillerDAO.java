package com.formation.projet.persistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.formation.projet.model.personne.Client;

/**
 * Classe réalisant la sauvegarde des données clients.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public class MemoryConseillerDAO implements ConseillerClientDAO {

	private Map<Integer, Client> DB = new HashMap<>();
	private static Integer id = 0;

	/**
	 * Méthode pour la sauvegarde du client.
	 */
	@Override
	public void save(Client client) {
		id++;
		client.setId(id);
		DB.put(client.getId(), client);
	}

	/**
	 * Méthode pour chercher un client par son identifiant unique.
	 */
	@Override
	public Client findById(int id) {
		return DB.get(id);
	}

	/**
	 * Méthode pour supprimer un client.
	 */
	@Override
	public void delete(int id) {
		DB.remove(id);
	}

	/**
	 * Méthode pour modifier un client.
	 */
	@Override
	public void update(int id) {
		// TODO
	}

	/**
	 * Méthode pour obtenir la liste des clients d'un conseiller.
	 */
	@Override
	public List<Client> findAll() {
		return new ArrayList<Client>(DB.values());
	}

}
