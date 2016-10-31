package com.moteur;

public class MoteurElectrique extends Moteur{

	// constructeur
	public MoteurElectrique(String cylindre, double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.ELECTRIQUE;
	}
	
	// Methode toString
	public String toString(){
		return super.toString() + " (" + super.getPrix() + "€)";
	}
	
}
