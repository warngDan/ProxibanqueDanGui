package com.formation.projet.service;


/**
 * Interface destinée aux conseillers afin de gérer les opérations bancaires.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public interface OperationBancaire {

	public boolean crediter(double montant);
	public boolean debiter(double montant);

}
