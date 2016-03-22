package org.projet.hopital.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

public class RendezVous {
	private String date;
	private String heure;

	
	public RendezVous(String date, String heure){
		super();
		
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public void RechercherRdv(){
		
	}
	
	public void AjouterRdv(){
		
	}
	
	public int ModifierRdv( ){
		
		return 0;
	}
	
	public void SupprimerRdv(){
		
	}

}
