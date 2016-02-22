package org.projet.hopital.dao;

import org.projet.hopital.entities.Client;
import org.projet.hopital.entities.Compte;
import org.projet.hopital.entities.Employe;
import org.projet.hopital.entities.Groupe;


public interface IBanqueDao {
	
	public Client addClient(Client c);//on peut mettre void mais pour recuperer le client on doit mettre Client
	public Employe addEmploye(Employe e, Long codeSup);// supérieur hiérarchique
	public Groupe addGroupe(Groupe g);
	public void addEmployeToGroupe(Long codeEmp, Long codeGr);
	public Compte addCompte(Compte cp, Long codeCli, Long codeEmpl);
	public Operation addOperation(Operation op, String codeCpte,Long codeEmp);
	

}
