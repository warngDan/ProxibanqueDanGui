package com.formation.projet.service;

import java.util.ArrayList;
import java.util.List;

import com.formation.projet.model.compte.CompteBancaire;
import com.formation.projet.model.personne.Client;
import com.formation.projet.model.personne.ConseillerClient;
import com.formation.projet.persistance.ConseillerClientDAO;
import com.formation.projet.persistance.MemoryConseillerDAO;

/**
 * Classe permettant d'implémenter les décisions du conseiller.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */
/**
 * @author Adminl
 *
 */
/**
 * @author Adminl
 *
 */
/**
 * @author Adminl
 *
 */
public class ServiceImplementation implements ConseillerClientService, ConseillerCompteService {

	private ConseillerClientDAO dao = new MemoryConseillerDAO();
	private double plafondEntreprise = 50000.0;
	private double plafondClient = 5000.0;

	/**
	 * Méthode permettant de créer un nouveau client.
	 */
	@Override
	public void creerClient(Client client) {
		if (client != null && dao.findAll().size() < dao.maxClients) {
			dao.save(client);
		}
	}

	/**
	 * Méthode permettant d'afficher un nouveau client.
	 */
	@Override
	public Client afficherClient(int id) {
		return dao.findById(id);
	}

	/**
	 * Méthode permettant de modifier un client.
	 */
	@Override
	public void modifierClient() {
		// TODO
	}

	/**
	 * Méthode permettant de supprimer un client identifié.
	 */
	@Override
	public void supprimerClient(int id) {
		dao.delete(id);
	}

	/**
	 * Méthode permettant d'afficher tous les clients gérés par un conseiller.
	 */
	@Override
	public List<Client> gettAllClients() {
		return dao.findAll();
	}

	/**
	 *Méthode permettant d'associer un compte créé au client dépositaire.
	
	 * @param client Client associé au nouveau compte.
	 * @param compte Compte du client nouvellement créé
	 */
	@Override
	public void creerCompte(Client client, CompteBancaire compte) {

	}

	/**
	 * Affiche le compte d'un client
	 */
	@Override
	public CompteBancaire afficherCompte(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Mofier le compte d'un client
	 */
	@Override
	public void modifierCompte(int id) {
		// TODO Auto-generated method stub

	}

	
	/**
	 * Supprimer les comptes d'un client.
	 */
	@Override
	public void supprimerCompte(int id) {
		

	}

	/**
	 * Méthode permettant d'obtenir la liste des comptes associés à un client.
	 */
	@Override
	public List<CompteBancaire> getCompteByClientId(int id) {
		List<CompteBancaire> listComptes = new ArrayList<CompteBancaire>();

		listComptes.add(dao.findById(id).getCompteCourant());
		listComptes.add(dao.findById(id).getCompteEpargne());

		return listComptes;
	}

	/**
	 * Méthode permettant d'auditer la liste des clients gérés par un conseiller.
	 * 
	 * @param listClients La liste des clients gérés par le conseiller.
	 * @return Le nombre de clients étant considérés à risque.
	 */
	public int auditerClients(List<Client> listClients) {
		boolean compteDebitaire = false;
		int nombreClientRisques = 0;
		for (Client client : listClients) {
			System.out.println(client); // DEBUG

			List<CompteBancaire> listCompte = new ArrayList<>();
			if (client.estEntreprise()) {
				System.out.println(client.getCompteCourant().getSolde() < -plafondEntreprise);
				System.out.println(client.getCompteEpargne().getSolde() < -plafondEntreprise);

//				
//				compteDebitaire = ((client.getCompteCourant().getSolde() < -plafondEntreprise)
//						|| (client.getCompteEpargne().getSolde() < -plafondEntreprise));
//			} else {
//				compteDebitaire = ((client.getCompteCourant().getSolde() < -plafondClient)
//						|| (client.getCompteEpargne().getSolde() < -plafondClient));
			}

		}
		return nombreClientRisques;
	}
}
