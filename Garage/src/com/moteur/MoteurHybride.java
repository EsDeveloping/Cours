package com.moteur;

public class MoteurHybride extends Moteur{

	// constructeur
	public MoteurHybride(String cylindre, double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.HYBRIDE;
	}
	
	// Methode toString
	public String toString(){
		return super.toString() + " (" + super.getPrix() + "€)";
	}
	
}
