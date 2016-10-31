package com.moteur;

public class MoteurDiesel extends Moteur{

	// constructeur
	public MoteurDiesel(String cylindre, double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.DIESEL;
	}
	
	// Methode toString
	public String toString(){
		return super.toString() + " (" + super.getPrix() + "€)";
	}
	
}
