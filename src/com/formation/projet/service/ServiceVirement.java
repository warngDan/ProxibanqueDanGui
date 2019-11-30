package com.formation.projet.service;

import com.formation.projet.model.compte.CompteBancaire;
import com.formation.projet.model.personne.ConseillerClient;

public class ServiceVirement implements OperationBancaire {
	
		private CompteBancaire compteEmeteur;
		private CompteBancaire compteBeneficiaire;
		private double montant;
		
		
		public ServiceVirement() {
			
		}
		
		public void demanderVirement(ConseillerClient conseiller) {
			//TODO
		}

		@Override
		public boolean crediter(double montant) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean debiter(double montant) {
			// TODO Auto-generated method stub
			return false;
		}

}
