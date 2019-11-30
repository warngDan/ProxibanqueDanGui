package com.formation.projet.service;


/**
 * Interface destin�e aux conseillers afin de g�rer les op�rations bancaires.
 * 
 * @author CESAIRE Daniel et ESPITIA Guillaume
 * @version 1.0
 *
 */

public interface OperationBancaire {

	public boolean crediter(double montant);
	public boolean debiter(double montant);

}
