package com.formation.projet.service;

import java.util.List;

import com.formation.projet.model.personne.Client;
import com.formation.projet.model.compte.CompteBancaire;

/**
 * Interface destinée aux conseillers afin de gérer les comptes.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public interface ConseillerCompteService {

	public void creerCompte(Client client, CompteBancaire compte);

	public CompteBancaire afficherCompte(int id);

	public void modifierCompte(int id);

	public void supprimerCompte(int id);

	public List<CompteBancaire> getCompteByClientId(int id);

}
