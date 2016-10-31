package com.moteur;

public class MoteurEssence extends Moteur{

	// constructeur
	public MoteurEssence(String cylindre, double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.ESSENCE;
	}
	
	// Methode toString
	public String toString(){
		return super.toString() + " (" + super.getPrix() + "€)";
	}
	
}
