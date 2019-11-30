package com.formation.projet.service;

import java.util.ArrayList;
import java.util.List;

import com.formation.projet.model.compte.CompteBancaire;
import com.formation.projet.model.personne.Client;
import com.formation.projet.model.personne.ConseillerClient;
import com.formation.projet.persistance.ConseillerClientDAO;
import com.formation.projet.persistance.MemoryConseillerDAO;

/**
 * Classe permettant d'impl�menter les d�cisions du conseiller.
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
	 * M�thode permettant de cr�er un nouveau client.
	 */
	@Override
	public void creerClient(Client client) {
		if (client != null && dao.findAll().size() < dao.maxClients) {
			dao.save(client);
		}
	}

	/**
	 * M�thode permettant d'afficher un nouveau client.
	 */
	@Override
	public Client afficherClient(int id) {
		return dao.findById(id);
	}

	/**
	 * M�thode permettant de modifier un client.
	 */
	@Override
	public void modifierClient() {
		// TODO
	}

	/**
	 * M�thode permettant de supprimer un client identifi�.
	 */
	@Override
	public void supprimerClient(int id) {
		dao.delete(id);
	}

	/**
	 * M�thode permettant d'afficher tous les clients g�r�s par un conseiller.
	 */
	@Override
	public List<Client> gettAllClients() {
		return dao.findAll();
	}

	/**
	 *M�thode permettant d'associer un compte cr�� au client d�positaire.
	
	 * @param client Client associ� au nouveau compte.
	 * @param compte Compte du client nouvellement cr��
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
	 * M�thode permettant d'obtenir la liste des comptes associ�s � un client.
	 */
	@Override
	public List<CompteBancaire> getCompteByClientId(int id) {
		List<CompteBancaire> listComptes = new ArrayList<CompteBancaire>();

		listComptes.add(dao.findById(id).getCompteCourant());
		listComptes.add(dao.findById(id).getCompteEpargne());

		return listComptes;
	}

	/**
	 * M�thode permettant d'auditer la liste des clients g�r�s par un conseiller.
	 * 
	 * @param listClients La liste des clients g�r�s par le conseiller.
	 * @return Le nombre de clients �tant consid�r�s � risque.
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
